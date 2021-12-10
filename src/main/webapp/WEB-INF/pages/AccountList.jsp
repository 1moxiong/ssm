<%--
  Created by IntelliJ IDEA.
  User: 86151
  Date: 2021/12/7
  Time: 20:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>列表展示</title>
</head>
<body>
<h1>展示用户金额列表</h1>
    <table border="1">
        <tr>
            <td>账户id</td>
            <td>账户name</td>
            <td>账户money</td>
        </tr>
        <c:forEach items="${accountList}" var="acc">
        <tr>
            <td>${acc.id}</td>
            <td>${acc.name}</td>
            <td>${acc.money}</td>
        </tr>
        </c:forEach>
    </table>
</body>
</html>
