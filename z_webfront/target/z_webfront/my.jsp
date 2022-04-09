<%--
  Created by IntelliJ IDEA.
  User: 13498
  Date: 2022/4/3
  Time: 15:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String name = request.getParameter("name");
%>
<!DOCTYPE>
<head>
    <meta charset = "UTF-8">
    <link rel = "stylesheet" href = "css/my.css">

    <title>随便弄个网站</title>
</head>
<body>
<h1>Teleporter</h1>
<div id = "first">
    <oi>
        <li id = "first"><a href = "https://www.qq.com" target ="blank"><%=name%>点这里，去腾讯官网</a></li><br>
        <li id = "first"><a href = "https://weibo.com" target ="blank"><%=name%>点这里，去微博</a></li><br>
        <li id = "first"><a href = "https://www.taobao.com/" target ="blank"><%=name%>点这里，逛淘宝</a></li><br>
        <li id = "first"><a href = "https://v.qq.com/" target ="blank"><%=name%>点这里，看腾讯视频</a></li>
    </oi>
</div>

<body/>