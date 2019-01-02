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
<h1>Welcome to Spittlers</h1>

<c:forEach items="${spittleList}" var="spittle">
    <li id="spittle_<c:out value="${spittle.id}"/>">
        <div class="spittleMessage">
            <c:out value="${spittle.message}" />
        </div>
        <div>
            <span class="spittleTime"><c:out value="${spittle.time}" /></span>
            <span class="spittleLocation">
                (<c:out value="${spittle.latitude}" />, <c:out value="${spittle.longtitude}"/>)
            </span>
        </div>
    </li>
</c:forEach>

</body>
</html>
