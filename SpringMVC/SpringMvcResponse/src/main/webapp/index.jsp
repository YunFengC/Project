<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/16 0016
  Time: 14:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<html>
<head>
    <script src="js/jquery-1.11.3.min.js"></script>
    <title>Title</title>
    <script>
        function fun() {
            $.ajax({
                url:"User/testAjax",
                contentType:"application/json;charset=UTF-8",
                data:'{"name":"张三", "age":"12"}',
                type:"POST",
                dataType:"json",
                success:function(data){
                    console.log(data);
                    alert(data.name)
                    alert(data.age)
                    alert(data.date)
                }
            })
        }
    
    
    </script>
</head>
    <body>
        <a href="/User/testString">testString</a><br>
        <a href="/User/testVoid">testVoid</a><br>
<%--        <form action="/User/testModelAndView">
            姓名：<input type="text" name="Name"><br>
            年龄：<input type="text" name="Age"><br>
            生日：<input type="date" name="date"><br>
            <input type="submit" value="提交">
        </form>--%>
        <button id="btn1" onclick="fun()">点击</button>
</body>
</html>
