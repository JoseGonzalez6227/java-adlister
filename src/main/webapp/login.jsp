<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: aimbotic
  Date: 2019-08-21
  Time: 14:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<jsp:include page="partials/header.jsp">
    <jsp:param name="title" value="Please Log In"/>
</jsp:include>
    <title>Title</title>
</head>
<body>
<%@ include file="/partials/navbar.jsp"%>

<div  class="container">
<h1>Please Log in</h1>
<form action="/login" method="post">

    <label for="username">username:</label>
    <input type="text" id="username" name="username">

    <label for="password">password:</label>
    <input type="password" id="password" name="password"
           minlength="5" required>

    <input type="submit" value="Sign in">

</form>
</div>

<%--JSTL--%>
<%--<c:if test="${param.username == 'admin'}">--%>
<%--    <c:if test="${param.password == 'password'}">--%>
<%--        <%response.sendRedirect("http://localhost:8080/profile.jsp");%>--%>
<%--    </c:if>--%>
<%--</c:if>--%>

<%--JAVA--%>
<%--<%--%>
<%--    if (request.getMethod().equalsIgnoreCase("post"));--%>

<%--    String username = request.getParameter("username");--%>
<%--    String password = request.getParameter("password");--%>

<%--    if(username.equalsIgnoreCase("admin") && password.equals("password")){--%>
<%--        response.sendRedirect("/profile.jsp");--%>
<%--    }--%>
<%--%>--%>
</body>
</html>
