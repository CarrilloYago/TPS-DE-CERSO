<%-- 
    Document   : registrar.jsp
    Created on : 30 may 2024, 8:40:05 p. m.
    Author     : yagoc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Registrar</h1>
        <form action="registrar.do" method="post">
            <input type="number" name="id">ID<br>
            <input type="type" name="nombre">NOMBRE<br>
            <input type="type" name="departamento">DEPARTEMENTO<br>
            <input type="number" name="cantidad">CANTIDAD<br>
            <input type="submit" value="Registrar...">REGISTRAR<br>
            
            
        </form>
        <br>
        <a href="index.html">Ir a la pagina principal</a>
    </body>
</html>
