<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: rysza
  Date: 17.03.2019
  Time: 10:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>zadania</title>
</head>
<body style="background-color: #a1a9b0">
<%----%>
<%--            ZADANIE 1       --%>
<%----%>
<b><p>zadanie 1</p></b>
<c:forEach var="i" begin="0" end="300">
    <c:if test="${i%2==0}">
        ${i},
    </c:if>
</c:forEach>
<%----%>
<%--            ZADANIE 2       --%>
<%----%>
<b><p>zadanie 2</p></b>

<form action="/string" method="post">
    <input type="submit" value="generuj losowe stringi">
</form>
<%----%>
<%--            ZADANIE 3       --%>
<%----%>
<b><p>zadanie 3</p></b>
<c:set var="dataValue" value="<%=new java.util.Date()%>"></c:set>
<fmt:formatDate value="${dataValue}" pattern="HH:mm"></fmt:formatDate><br>
<fmt:formatDate value="${dataValue}" pattern="MM/dd/yyyy"></fmt:formatDate><br>
<fmt:formatDate value="${dataValue}" pattern="MM/dd/yyyy HH:mm"></fmt:formatDate><br>
<%--<c:out value="${dataValue}"></c:out>--%>
<%----%>
<%--            ZADANIE 4        --%>
<%----%>
<b><p>zadanie 4</p></b>
<%--<c:set value="0" var="wynik" scope="session"/>--%>
<%--<c:if test="${sessionScope.containsKey(wynik)}">--%>
    <%--&lt;%&ndash;<c:set value="0" var="wynik" scope="session"/>&ndash;%&gt;--%>
    <%--<:c:out>Dodaje wynik</:c:out>--%>
<%--</c:if>--%>

<%--Wynik=--%>

<%--<form action="" method="post">--%>

<%--</form>--%>


</body>
</html>
