<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Blog</title>
</head>


<body>

<ul id="nav-bar">
    <li><a href="/dashboard.jsp">Dashboard</a></li>
    <li><a href="/addPost.jsp">Dodaj Post</a></li>
</ul>

<section>
    <header>Blog posts</header>
    <c:forEach var="post" items="$post"
</section>

</body>

</html>
