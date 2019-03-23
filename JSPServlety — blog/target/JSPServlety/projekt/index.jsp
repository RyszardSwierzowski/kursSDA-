<%@ page import="java.util.List" %>
<%@ page import="pl.swierzowski.model.Post" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
        <head>
            <title>Blog</title>
        </head>

<!--               HEAD / BODY -->

        <body style="background-color: lightgray; alignment: center">


        <ul id="nav-bar">
            <li><a href="/home">Dashboard</a></li>
            <li><a href="/projekt/addPost.jsp">Dodaj Post</a></li>
        </ul>

        <section>
            <header>Blog posts</header>
            <c:forEach var="post" items="${posts}">
                <article style="background-color: silver; margin-top: 25px; width: 500px">
                    <header style="font-weight: bold">
                        ${post.getTitle()}
                    </header>
                    created at: ${post.getCreatedAt()}
                    <p>
                            ${post.getContent()}
                    </p>
                    <hr>
                </article>
            </c:forEach>
</section>

        <%--<%--%>
            <%--List<Post> allPosts = (List<Post>) request.getAttribute("allPosts");--%>
            <%--for(Post post :allPosts){--%>
                <%--%>--%>
                    <%--<div style=";background-color: silver;width: 450px;margin-top: 25px">--%>
                        <%--<h2><%=post.getTitle()%></h2>--%>
                        <%--<h4><%=post.getCreatedAt()%></h4>--%>
                        <%--<h3><%=post.getContent()%></h3>--%>
                    <%--</div>--%>
                <%--<%--%>
            <%--}--%>
        <%--%>--%>


        </body>

</html>
