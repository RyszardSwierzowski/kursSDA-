<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>


<body>

<form:form action="/zatwierdz" method="post" modelAttribute="user">
    <form:label path="id">id : </form:label>
    <form:input path="id"/>

    <form:label path="imie">imie : </form:label>
    <form:input path="imie"/>

    <form:label path="nrTelefonu">nr : </form:label>
    <form:input path="nrTelefonu"/>

    <input type="submit" value="Zatwierdź formularz">

</form:form>


</body>

</html>