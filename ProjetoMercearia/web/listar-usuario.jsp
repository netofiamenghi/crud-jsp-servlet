<%-- 
    Document   : listar-usuario
    Created on : 11/06/2022, 00:56:08
    Author     : Neto
--%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lista de Usuário</h1>
        <h3>${msg}</h3>
        <table border="1">
            <tr> 
                <td>Código</td> 
                <td>Nome</td> 
                <td>Data Nascimento</td> 
                <td>Data Cadastro</td> 
                <td></td>
                <td></td>
            </tr>
            ${msg}
            <c:forEach items="${usuarios}" var="usuario">
                <tr> 
                    <td> ${usuario.codigo}  </td>    
                    <td>${usuario.nome}</td> 
                    <td>
                        <fmt:parseDate value="${usuario.dataNascimento}" pattern="yyyy-MM-dd" var="parsedDate1" type="both" />
                        <fmt:formatDate pattern="dd/MM/yyyy" value="${ parsedDate1 }" />
                    </td>
                    <td>
                        <fmt:parseDate value="${usuario.dataCadastro}" pattern="yyyy-MM-dd" var="parsedDate2" type="both" />
                        <fmt:formatDate pattern="dd/MM/yyyy" value="${ parsedDate2 }" />
                    </td>
                    <td><a href="ExcluirUsuario?codigo=${usuario.codigo}">Excluir</a></td>
                    <td><a href="CarregarUsuario?codigo=${usuario.codigo}">Carregar</a></td>
                </tr>

            </c:forEach>   
        </table>
                    <a href="index.jsp">Menu Principal</a>
    </body>
</html>
