<%-- 
    Document   : lista
    Created on : 6 jun 2024, 4:11:05 p. m.
    Author     : yagoc
--%>

<%@page import="java.util.List"%>
<%@page import="model.Empleado"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% List<Empleado> empleados= (List<Empleado>) request.getAttribute("lista");%>
        <% String msj = (String) request.getAttribute("mensaje");%>
        <% if(msj != null){
            out.println(msj);
            } 
        %>
        
        <table border="1">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Nombre</th>
                    <th>Departamento</th>
                    <th>Cantidad</th>
                </tr>
            </thead>
            <tbody>
                <% for (Empleado e : empleados){ %>
                <tr>
                    <td><%= e.getId()%></td>
                    <td><%= e.getNombre()%></td>
                    <td><%= e.getDepartamento()%></td>
                    <td><%= e.getCantidad()%></td>
                </tr>
                <%}%>
                
            </tbody>
        </table>
            <br>
                <a href="index.html">Regresar a la pagina principal</a>
</html>
