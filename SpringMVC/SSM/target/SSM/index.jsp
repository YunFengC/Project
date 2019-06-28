<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/18 0018
  Time: 11:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="/Account/findAll">点击查询信息</a>
    <form action="/Account/save"  method="post" >
        姓名：<input type="text" name="name"><br>
        金额：<input type="text" name="money"><br>
        <input type="submit" value="提交"><br>
    </form><br>
    <form action="/Account/delete"  method="post" >
        ID：<input type="text" name="id"><br>
        <input type="submit" value="删除">
    </form>
</body>
</html>
