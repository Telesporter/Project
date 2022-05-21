package Zebra.z_webfront.jsonServlet;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/4/7
 * Time: 10:39
 * Description: No Description
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(65+'L'-'A');
    }
    private <T> T deserialize(InputStream inputStream, Class<T> clazz){
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(inputStream, clazz);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("json反序列化失败："+e);
        }
    }
}
