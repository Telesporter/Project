package Zebra.z_webfront.Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/4/5
 * Time: 19:10
 * Description: No Description
 */

@WebServlet("/front")
public class frontServlet extends HttpServlet {
    static int count = 0;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        count++;
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html");

        String template = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>首页</title>\n" +
                "    <script src=\"jsLearn/jquery-3.6.0.min.js\"></script>\n" +
                "    <script src = \"AjaxLearn/CountViewTimes/front.js\"></script>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <p id = \"content\">::count::</p>\n" +
                "</body>\n" +
                "</html>";
        String content = template.replace("::count::", String.valueOf(count));
        PrintWriter printWriter = resp.getWriter();
        printWriter.println(content);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
