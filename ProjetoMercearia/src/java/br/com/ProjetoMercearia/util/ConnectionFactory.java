
package br.com.ProjetoMercearia.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class ConnectionFactory {
    
    public static Connection conectar() throws Exception{
       
        try{
            
            Class.forName("org.postgresql.Driver");
            System.out.println("Conectou");
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/mercearia", "postgres", "postdba");
            
        }catch(Exception e){
            throw new Exception("Erro ao conectar ao banco " + e.getMessage());
        }
               
    }
    
    public static void fecharConexao(ResultSet rs, Statement stmt, Connection conn) throws Exception{

        try{
            if(rs != null){
                rs.close();
            }
            if(stmt != null){
                stmt.close();
            }
            if(conn != null){
                conn.close();
            }
            
        }catch(Exception e){
            throw new Exception("Erro ao fechar conexão: " + e.getMessage());
            
        }
            
        
    }
}
