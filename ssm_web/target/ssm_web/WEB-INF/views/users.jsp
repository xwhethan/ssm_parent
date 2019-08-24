<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/28
  Time: 16:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>UserINFO</title>
</head>
<body>
<table border="1">
    <tr>
        <td>ID</td>
        <td>用户名</td>
        <td>姓名</td>
        <td>年龄</td>
        <td>生日</td>
        <td>创建日期</td>
        <td>更新日期</td>
    </tr>
    <tr>
        <td>${user.id}</td>
        <td>${user.userName}</td>
        <td>${user.name}</td>
        <td>${user.age}</td>
        <td>  <fmt:formatDate value="${user.birthday}"  pattern="yyyy-MM-dd" /> </td>
        <td>${user.created}</td>
        <td>${user.updated}</td>
    </tr>

</table>
</body>
</html>
