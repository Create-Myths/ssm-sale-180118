<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/18
  Time: 21:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table border="1" cellspacing="0" cellpadding="0">
    <tr>
        <td>id</td>
        <td>销售员</td>
    </tr>

    <c:forEach items="${salesList}" var="sales">
    <tr>
        <td>${sales.id}</td>
        <td>${sales.name}</td>
    </tr>
    </c:forEach>
</table>
</body>
</html>
