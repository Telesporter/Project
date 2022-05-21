package Zebra.z_webfront.jsonServlet;

import Zebra.z_webfront.model.Message;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/4/7
 * Time: 9:10
 * Description: No Description
 */
@WebServlet("/message-list-json")
public class MessageListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setCharacterEncoding("utf-8");
        resp.setContentType("application/json");


        List<Message> messageList = getMessageList();
        String jsonString = serialize(messageList);
        PrintWriter writer = resp.getWriter();
        writer.println(jsonString);
    }
    private String serialize (List<Message> messageList){
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.writeValueAsString(messageList);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            throw new RuntimeException("json序列化失败："+e);
        }
    }

    private <T> T deserialize(InputStream inputStream,Class<T> clazz){
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(inputStream, clazz);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("json反序列化失败：");
        }
    }

    private List<Message> getMessageList() {
        List<Message> messageList = new ArrayList<>();
        Message message = new Message();
        message.id = 1;
        message.who = "Zebra";
        message.when = "2022-04-07";
        message.what = "amazing";
        messageList.add(message);
        return messageList;
    }
}
