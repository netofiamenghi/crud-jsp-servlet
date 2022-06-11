<%-- 
    Document   : cadastrar-usuario
    Created on : 11/06/2022, 00:26:20
    Author     : Neto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Cadastro de Usuário</h1>
        <form action="CadastrarUsuario">
            <input type="hidden" name="codigo" value="${usuario.codigo}"/>
            Nome<input value="${usuario.nome}" type="text" name="nome"/><br>
            Senha<input value="${usuario.senha}" type="password" name="senha"/><br>
            Data Nascimento<input value="${usuario.dataNascimento}" type="date" name="dataNascimento"/><br>
            <input type="submit"/>
        </form>
        ${msg}
                <a href="index.jsp">Menu Principal</a>
    </body>
</html>
