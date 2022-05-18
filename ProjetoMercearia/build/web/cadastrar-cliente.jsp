<%-- 
    Document   : cadastrarcliente
    Created on : 30 de mar de 2022, 20:33:30
    Author     : Aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>Cadastro de Cliente</title>
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
        <h1>Cadastrar Cliente</h1>
        
        <form method="POST" action="CadastrarCliente">
            
            <label>Nome</label> 
            <input type="text" name="nome"/><br>
            <label>  Telefone </label>
            <input type="text" name="telefone"/><br>
            <label> Email </label>
            <input type="text" name="email"/><br><br>
            <input type="submit"/>
        </form>
        <br>
        <h4>Cliente ${cliente.nome} cadastrado com sucesso!</h4>
        </div>
        
    </center>   
                
        
    </body>
</html>
