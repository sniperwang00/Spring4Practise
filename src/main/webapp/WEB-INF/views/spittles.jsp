<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/25
  Time: 23:21
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spitter</title>
    <%--<link rel="stylesheet" type="text/css" href="<c:url value="resources/style.css"/>">--%>
</head>
<body>
<h1>Wlecome to Spitter</h1>

<c:forEach items="${spittleList}" var="spittle">
    <li id=""spittle_<c:out value="spittle.id"/>">


    </li>

</c:forEach>

</body>
</html>
