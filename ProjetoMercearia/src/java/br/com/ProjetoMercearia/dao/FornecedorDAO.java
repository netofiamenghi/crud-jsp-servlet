package br.com.ProjetoMercearia.dao;

import br.com.ProjetoMercearia.modelo.Cliente;
import br.com.ProjetoMercearia.modelo.Fornecedor;
import br.com.ProjetoMercearia.modelo.Produto;
import br.com.ProjetoMercearia.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class FornecedorDAO implements GenericDAO{
    
    private ResultSet rs;
    private Connection conexao;
    private PreparedStatement stmt;
    
    public FornecedorDAO(){
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
            String sql = " insert into fornecedor (razaoSocial,telefone,email)"
                + "values(?,?,?)";
            Fornecedor oFornecedor = (Fornecedor) object;
            
            stmt = conexao.prepareStatement(sql);
            
            stmt.setString(1, oFornecedor.getRazaoSocial());
            stmt.setString(2, oFornecedor.getTelefone());
            stmt.setString(3, oFornecedor.getEmail());
            
            stmt.execute();
            
        }catch(Exception e){
            System.out.println("Erro ao cadastrar fornecedorDAO" + e.getMessage());
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
        List<Object> lista = new ArrayList<>();
        try{
            String sql = "select * from fornecedor";
            stmt = this.conexao.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                Fornecedor fornecedor = new Fornecedor();
                fornecedor.setCodigo(rs.getInt("codigo"));
                fornecedor.setRazaoSocial(rs.getString("razaoSocial"));
                fornecedor.setTelefone(rs.getString("telefone"));
                fornecedor.setEmail(rs.getString("email"));
                lista.add(fornecedor);
            }
        }catch(Exception e){
            System.out.println("Erro ao listar fornecedorDAO " + e.getMessage());
        }finally{
            ConnectionFactory.fecharConexao(rs, stmt, conexao);
        }
        return lista;
    }

    @Override
    public Boolean carregar(Integer id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
