<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/14 0014
  Time: 18:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>入门案例</h3>
    <a href="/User/hello">入门案例</a>
    <h3>入门案例</h3>
    <a href="/User/RequestMappingTest">RequestMappingTest</a>
    <h3>入门案例</h3>
    <a href="User/paramTest?username=张三&password=123">参数绑定</a>
    <h3>入门案例</h3>
    <form action="/User/paramTest2" method="post">
        用户：<input type="text" name="UserName"><br>
        密码：<input type="text" name="PassWord"><br>
        金额：<input type="text" name="Money"><br>
        姓名：<input type="text" name="user.Name"><br>
        年龄：<input type="text" name="user.Age"><br>
        <input type="submit" value="提交">
    </form>
    <h3>入门案例</h3>
    <form action="/User/paramTest3" method="post">
        用户：<input type="text" name="UserName"><br>
        密码：<input type="text" name="PassWord"><br>
        金额：<input type="text" name="Money"><br>
        姓名：<input type="text" name="user.Name"><br>
        年龄：<input type="text" name="user.Age"><br>

        用户姓名：<input type="text" name="list[0].Name"><br>
        用户年龄：<input type="text" name="list[0].Age"><br>

        用户姓名：<input type="text" name="map['ONE'].Name"><br>
        用户年龄：<input type="text" name="map['ONE'].Age"><br>
        <input type="submit" value="提交">
    </form>

    <h3>入门案例</h3>
    <form action="/User/StringToDate" method="post">
        用户姓名：<input type="text" name="Name"><br>
        用户年龄：<input type="text" name="Age"><br>
        用户生日：<input type="text" name="Date"><br>
        <input type="submit" value="提交">
    </form>
</body>
</html>