<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/16 0016
  Time: 22:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="User/fileupload" method="post" enctype="multipart/form-data">
        选择文件：<input type="file" name="upload"><br>
        <input type="submit" value="点击上传">
    </form>

    <form action="User/fileupload2" method="post" enctype="multipart/form-data">
        选择文件：<input type="file" name="upload"><br>
        <input type="submit" value="点击上传">
    </form>
</body>
</html>
