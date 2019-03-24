<%--
  Created by IntelliJ IDEA.
  User: rysza
  Date: 24.03.2019
  Time: 15:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Magazyn</title>
    <link rel="stylesheet" href="/css/admin/magazyn.css" type="text/css">
</head>
<body>
<nav>
    <jsp:include page="navBar.jsp"/>
</nav>
<table>
    <div>
       <div class="table">
           <span>Produkty w magazynie</span>
           <div >
               <div class="header2">Lp.</div>
               <div class="header2">Produkt</div>
               <div class="header2">Typ</div>
               <div class="header2">Cena</div>
               <div class="header2">Ilość</div>
               <div class="header2">Edytuj</div>

           </div>
           <div class="row">
               <div>

               </div>
           </div>
       </div>
    </div>
</table>
</body>
</html>
