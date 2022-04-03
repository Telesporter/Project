package Zebra.z_webfront;

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
 * Date: 2022/4/3
 * Time: 11:26
 * Description: No Description
 */
@WebServlet("/old")
public class home extends HttpServlet {
    //private static int count;  //统计网站被访问的次数，静态的肯定可以
    private int count;  //这里使用非静态的方式也可以进行，因为tomcat中每个servlet只会生成一个对象

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        count++;
        req.setCharacterEncoding("UTF-8");
        //设置响应体的编码
        resp.setCharacterEncoding("UTF-8");
        //设置响应体的数据类型（浏览器要采取什么方式执行）
        resp.setContentType("text/html");
        String name = req.getParameter("name");

        PrintWriter pw = resp.getWriter();
        String template = "<!DOCTYPE>\n" +
                "<head>\n" +
                "\t<meta charset = \"UTF-8\">\n" +
                "\t<link rel = \"stylesheet\" href = \"css/my.css\">\n" +
                "\n" +
                "\t<title>随便弄个网站</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "\t<h1>Teleporter</h1>\n" +
                "\t<div class = \"first\">\n" +
                "\t\t<oi>\n" +
                "\t\t\t<li class = \"first\"><a href = \"https://www.qq.com\" target =\"blank\">:name:点这里，去腾讯官网</a></li><br>\n" +
                "\t\t\t<li class = \"first\"><a href = \"https://weibo.com\" target =\"blank\">:name:点这里，去微博</a></li><br>\n" +
                "\t\t\t<li class = \"first\"><a href = \"https://www.taobao.com/\" target =\"blank\">:name:点这里，逛淘宝</a></li><br>\n" +
                "\t\t\t<li class = \"first\"><a href = \"https://v.qq.com/\" target =\"blank\">:name:点这里，看腾讯视频</a></li>\n" +
                "\t\t</oi>\n" +
                "\t</div>\n" +
                "\t<div class = \"zero\">访问次数：:count:</div>\n" +
                "<body/>";
        String content = template.replace(":name:", name)
                .replace(":count:", String.valueOf(count));
        pw.println(content);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
