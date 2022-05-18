<%-- 
    Document   : cadastrar-fornecedor
    Created on : 31/03/2022, 19:04:01
    Author     : Aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro de Fornecedor</title>
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
        <h1>Cadastro de Fornecedor</h1>
        
        <form method="POST" action="CadastrarFornecedor">
           <!-- Código
            <input type="number" name="codigo"/><br>-->
            Razão Social
            <input type="text" name="razaoSocial"/><br>
            Email
            <input type="text" name="email"/><br>
            Telefone
            <input type="text" name="telefone"/><br>
            <input type="submit"/>
            
        </form>
        <br>
        
        <h4>Fornecedor ${fornecedor.razaoSocial} cadastrado com sucesso!</h4>
        </div>
    </center>    
    </body>
</html>
