<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/4/24
  Time: 22:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>所有学生</title>
</head>
<body>
<%--添加学生的表单（属性名和参数名保持一致）--%>
<h2>增</h2>
<form action="/student/add" method="post">
    姓名：<input name="name"><br/>
    性别：<input name="sex"><br/>
    住址：<input name="address"><br/>
    <input type="submit" value="添加"><br/>
</form>
<%--删除学生的表单--%>
<h2>删</h2>
<form action="/student/delete" method="post">
    删除学生id:<input name="id"><br/>
    <input type="submit" value="删除"><br/>
</form>
<%--修改学生信息的表单--%>
<h2>改</h2>
<form action="/student/update" method="post">
    请输入修改学生的id：<input name="id"><br/>
    修改姓名：<input name="name"><br/>
    修改性别：<input name="sex"><br/>
    修改住址：<input name="address"><br/>
    <input type="submit" value="修改"><br/>
</form>
<%--查询学生信息--%>
<h2>查</h2>
<form action="/student/select" method="post">
    根据id查询学生：<input name="id"><br/>
    <input type="submit" value="查询"><br/>
    <table>
        <tr>
            <td>${requestScope.stu.name}</td>
            <td>${requestScope.stu.sex}</td>
            <td>${requestScope.stu.address}</td>
        </tr>
    </table>
</form>
<%--展示学生的表单--%>
<table width="500" border="1" align="center">
    <tr>
        <th>学号</th>
        <th>姓名</th>
        <th>性别</th>
        <th>住址</th>
    </tr>
    <c:forEach items="${requestScope.allStudents}" var="student">
        <tr>
            <td>${student.id}</td>
            <td>${student.name}</td>
            <td>${student.sex}</td>
            <td>${student.address}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
