<%-- 
    Document   : listar-produto
    Created on : 19/05/2022, 19:19:03
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
        <h1>Lista de Produtos</h1>
        <h3>${msg}</h3>
        <table border="1">
            <tr> 
                <td>Código</td> 
                <td>Nome</td> 
                <td>Qtd Estoque</td> 
                <td>Valor</td> 
                <td></td>
                <td></td>
            </tr>

            
            <c:forEach items="${produtos}" var="produto">
                <tr> 
                    <td> ${produto.codigo}  </td>    
                    <td>${produto.nome}</td> 
                    <td>${produto.qtdEstoque}</td> 
                    <td>${produto.valor}</td>
                    <td><a href="ExcluirProduto?codigo=${produto.codigo}">Excluir</a></td>
                    <td><a href="CarregarProduto?codigo=${produto.codigo}">Carregar</a></td>
                </tr>
                
            </c:forEach>   
        </table>
                <a href="index.jsp">Menu Principal</a>
    </body>
</html>
