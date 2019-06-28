<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/15 0015
  Time: 14:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<meta charset="UTF-8">
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="/Anno/testRequestParam?name=张三">testRequestParam</a><br>

    <form action="/Anno/testRequestBody" method="post">
        用户姓名：<input type="text" name="Username"><br>
        用户年龄：<input type="text" name="PassWord"><br>
        <input type="submit" value="提交">
    </form>

    <a href="/Anno/testPathVariable/张三">testPathVariable</a><br>

    <a href="/Anno/testRequestHeader?id=张三">testRequestHeader</a><br>

    <a href="/Anno/testCookieValue?id=张三">testCookieValue</a><br>

    <form action="/Anno/testModelAttribute" method="post">
        用户姓名：<input type="text" name="Name"><br>
        用户年龄：<input type="text" name="Age"><br>
        <input type="submit" value="提交">
    </form>

    <a href="/Anno/testSessionAttributes">testPathVariable</a><br>

</body>
</html>
