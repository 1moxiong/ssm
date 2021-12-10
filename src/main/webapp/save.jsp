<%--
  Created by IntelliJ IDEA.
  User: 86151
  Date: 2021/12/7
  Time: 20:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/account/save" method="post">
        用户：<input type="text" name="name"><br>
        账户金额：<input type="text" name="money"><br>
        <input type="submit" value="保存">
    </form>
</body>
</html>
