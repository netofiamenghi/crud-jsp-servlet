
package br.com.ProjetoMercearia.dao;

import br.com.ProjetoMercearia.modelo.Cliente;
import br.com.ProjetoMercearia.modelo.Produto;
import br.com.ProjetoMercearia.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author Neto
 */
public class ClienteDAO implements GenericDAO{
    
    private ResultSet rs;
    private Connection conexao;
    private PreparedStatement stmt;
    
    public ClienteDAO(){
        try{
            conexao = ConnectionFactory.conectar();
        }catch(Exception e){
            System.out.println("Erro ao conectar ao BD: " + e.getMessage());
        }
    }

    @Override
    public Boolean cadastrar(Object object) throws Exception {
        Boolean retorno = true;
        
        try{
            String sql = " insert into cliente (nome,telefone,email)"
                + "values(?,?,?)";
            Cliente oCliente = (Cliente) object;
            
            stmt = conexao.prepareStatement(sql);
            
            stmt.setString(1, oCliente.getNome());
            stmt.setString(2, oCliente.getTelefone());
            stmt.setString(3, oCliente.getEmail());
            
            stmt.execute();
            
        }catch(Exception e){
            System.out.println("Erro ao cadastrar clienteDAO" + e.getMessage());
            retorno = false;
        }finally{
            ConnectionFactory.fecharConexao(rs, stmt, conexao);
        }
        return retorno;
    }

    @Override
    public Boolean excluir(Object object) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean alterar(Object object) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> listar() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean carregar(Integer id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
