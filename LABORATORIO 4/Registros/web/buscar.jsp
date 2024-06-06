<%-- 
    Document   : buscar
    Created on : 6 jun 2024, 3:42:05 p. m.
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
        <h1>Buscar Empleados</h1>
        <form action="buscar.do" method="post">
            <input type="number" name="id">
            <input type="submit" name="Buscar...">     
        </form>
        
        <% Empleado empEncontrado = (Empleado) request.getAttribute("empleado"); %>
        <% String msj = (String) request.getAttribute("mensaje"); %>
        <% if(msj != null){
            out.println(msj);
            } 
        %>
        <% if(empEncontrado != null){ %>
            <table border="1">
            <tr>
                <td>Id</td>
                <td><%= empEncontrado.getId() %></td>
            </tr>
            <tr>
                <td>Nombre</td>
                <td><%= empEncontrado.getNombre() %></td>
            </tr>
            <tr>
                <td>Departamento</td>
                <td><%= empEncontrado.getDepartamento() %></td>
            </tr>
            <tr>
                <td>Cantidad</td>
                <td><%= empEncontrado.getCantidad() %></td>
            </tr>
        </table> 
           <% }%>        
            
        <br>
        <a href="index.html">Regresar a la pagina principal</a>
        
    </body>
</html>
