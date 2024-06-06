<%-- 
    Document   : success
    Created on : 6 jun 2024, 3:23:56 p. m.
    Author     : yagoc
--%>

<%@page import="model.Empleado"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Datos Del registro</h1>
        <%
    Empleado empleado = (Empleado) request.getAttribute("empleado");
%>
        <table border="1">
            <tr>
                <td>Id</td>
                <td><%= empleado.getId() %></td>
            </tr>
            <tr>
                <td>Nombre</td>
                <td><%= empleado.getNombre() %></td>
            </tr>
            <tr>
                <td>Departamento</td>
                <td><%= empleado.getDepartamento() %></td>
            </tr>
            <tr>
                <td>Cantidad</td>
                <td><%= empleado.getCantidad() %></td>
            </tr>
        </table>        
        <br>
        <a href="index.html">Ir a la pagina principal</a>
    </body>
</html>
