<%-- 
    Document   : cadastrar-produto
    Created on : 24/03/2022, 19:54:07
    Author     : Aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro de Produto</title>
        <style>
            div{
                background-color: aqua;
                width: 200px;
                text-align: center;
            }
            img{
                width: 50px;
                height: 50px;
            }
        </style>
    </head>
    <body>
        <a href="index.jsp">
            <img src="imagens/seta.png"/>
        </a>
    <center>
        <div>
            <h1>Cadastro de Produto</h1>

            <form method="POST" action="CadastrarProduto">

                Nome<input value="${produto.nome}" type="text" name="nome"/><br>
                Valor <input value="${produto.valor}" type="number" name="valor"/><br>
                Quantidade Estoque <input value="${produto.qtdEstoque}" type="number" name="qtdEstoque"/><br><br>
                <input type="submit"/>

            </form>
            <br>
            <h4>Produto ${produto.nome} cadastrado com sucesso!</h4>
        </div>
    </center>        
</body>
</html>
