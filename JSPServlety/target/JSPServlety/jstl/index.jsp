<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Arrays" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%--
  Created by IntelliJ IDEA.
  User: rysza
  Date: 17.03.2019
  Time: 09:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index JSTL</title>
</head>
<body>



<b><p>forEach na zakresie</p></b>
<c:forEach var="i" begin="1" end="10">
    <p>Liczba ${i}</p>
</c:forEach>

<%
    List<Integer> lista = Arrays.asList(1500, 3000, 10100, 50, 400);    // lista musi być atrybutem request
    request.setAttribute("lista", lista);
%>
<b><p>forEach na liscie</p></b>
<c:forEach var="liczba" items="${lista}">
    <%--${liczba}<br>--%>
    <c:if test="${liczba > 1000}">
        ${liczba}<br>
    </c:if>
</c:forEach>

<b><p>forEach na switch</p></b>
<c:forEach var="liczba" items="${lista}">
    <c:choose>
        <c:when test="${liczba>500 and liczba<2000}">Bardzo malo <br></c:when>
        <c:when test="${liczba>2000 and liczba<10000}">Średnio <br></c:when>
        <c:when test="${liczba>10000 }">Dużo <br></c:when>
        <c:otherwise>${liczba} jest nieobslugiwana<br></c:otherwise>
    </c:choose>
</c:forEach>
<br>
<b>Rozmiar tablicy: ${fn:length(lista)}</b>

</body>
</html>
