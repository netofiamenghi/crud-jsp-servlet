<%-- 
    Document   : listar-cliente
    Created on : 18/05/2022, 19:25:06
    Author     : Neto
--%>



<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lista de Clientes</h1>
        <table border="1">
            <tr> 
                <td>Código</td> 
                <td>Nome</td> 
                <td>Telefone</td> 
                <td>E-mail</td> 
            </tr>
            <c:forEach items="${clientes}" var="cliente">
                <tr> 
                    <td> ${cliente.codigo}  </td>    
                    <td>${cliente.nome}</td> 
                    <td>${cliente.telefone}</td> 
                    <td>${cliente.email}</td>
                </tr>
            </c:forEach>   
        </table>
                <a href="index.jsp">Menu Principal</a>
    </body>
</html>
