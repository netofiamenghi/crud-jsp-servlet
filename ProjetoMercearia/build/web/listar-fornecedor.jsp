<%-- 
    Document   : listar-fornecedor
    Created on : 19/05/2022, 19:28:33
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
        <h1>Lista de Fornecedores</h1>
        
        <table border="1">
            <tr> 
                <td>Código</td> 
                <td>Razão Social</td> 
                <td>Telefone</td> 
                <td>E-mail</td> 
            </tr>

            
            <c:forEach items="${fornecedores}" var="fornecedor">
                <tr> 
                    <td> ${fornecedor.codigo}  </td>    
                    <td>${fornecedor.razaoSocial}</td> 
                    <td>${fornecedor.telefone}</td> 
                    <td>${fornecedor.email}</td>
                </tr>
                
            </c:forEach>   
        </table>
                <a href="index.jsp">Menu Principal</a>
    </body>
</html>
