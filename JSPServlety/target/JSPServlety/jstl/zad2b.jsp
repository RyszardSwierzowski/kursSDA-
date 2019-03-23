<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%--
  Created by IntelliJ IDEA.
  User: rysza
  Date: 17.03.2019
  Time: 10:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>zad 2 odp</title>
</head>
<body>
        <c:forEach var="str" items="${listaStr}">
            <c:if test="${fn:length(str)>4}">${str}<br></c:if>
        </c:forEach>
</body>
</html>
