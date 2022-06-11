package br.com.ProjetoMercearia.dao;

import br.com.ProjetoMercearia.modelo.Produto;
import br.com.ProjetoMercearia.modelo.Usuario;
import br.com.ProjetoMercearia.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsuarioDAO implements GenericDAO {

    private ResultSet rs;
    private Connection conexao;
    private PreparedStatement stmt;

    public UsuarioDAO() {
        try {
            conexao = ConnectionFactory.conectar();
        } catch (Exception e) {
            System.out.println("Erro ao conectar ao BD: " + e.getMessage());
        }
    }

    @Override
    public Boolean cadastrar(Object object) throws Exception {

        Boolean retorno = true;

        try {
            String sql = "insert into usuario (nome,senha,data_nascimento,data_cadastro) values(?,?,?,?)";
            Usuario usuario = (Usuario) object;

            stmt = conexao.prepareStatement(sql);

            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getSenha());
            stmt.setDate(3, java.sql.Date.valueOf(usuario.getDataNascimento()));
            stmt.setDate(4, java.sql.Date.valueOf(usuario.getDataCadastro()));

            stmt.execute();

        } catch (Exception e) {
            System.out.println("Erro ao cadastrar usuarioDAO" + e.getMessage());
            retorno = false;
        } finally {
            ConnectionFactory.fecharConexao(rs, stmt, conexao);
        }
        return retorno;
    }

    @Override
    public Boolean excluir(Object object) throws Exception {
        Boolean retorno = true;
        try {
            String sql = "delete from usuario where codigo = ?";
            Usuario usuario = (Usuario) object;
            stmt = this.conexao.prepareStatement(sql);
            stmt.setInt(1, usuario.getCodigo());

            stmt.execute();

        } catch (Exception e) {
            retorno = false;
            System.out.println("Erro ao excluir usuarioDAO " + e.getMessage());
        } finally {
            ConnectionFactory.fecharConexao(rs, stmt, conexao);
        }
        return retorno;
    }

    @Override
    public Boolean alterar(Object object) throws Exception {
        Boolean retorno = true;

        try {
            String sql = "update usuario set nome=?,senha=?,data_nascimento=? where codigo=?";
            Usuario usuario = (Usuario) object;

            stmt = conexao.prepareStatement(sql);
            
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getSenha());
            stmt.setDate(3, java.sql.Date.valueOf(usuario.getDataNascimento()));
            stmt.setInt(4, usuario.getCodigo());

            stmt.execute();

        } catch (Exception e) {
            System.out.println("Erro ao alterar usuarioDAO" + e.getMessage());
            retorno = false;
        } finally {
            ConnectionFactory.fecharConexao(rs, stmt, conexao);
        }
        return retorno;
    }

    @Override
    public List<Object> listar() throws Exception {
        List<Object> lista = new ArrayList<>();
        try {
            String sql = "select * from usuario";
            stmt = this.conexao.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setCodigo(rs.getInt("codigo"));
                usuario.setNome(rs.getString("nome"));
                usuario.setDataNascimento(rs.getDate("data_nascimento").toLocalDate());
                usuario.setDataCadastro(rs.getDate("data_cadastro").toLocalDate());
                lista.add(usuario);
            }
        } catch (Exception e) {
            System.out.println("Erro ao listar produtoDAO " + e.getMessage());
        } finally {
            ConnectionFactory.fecharConexao(rs, stmt, conexao);
        }
        return lista;
    }

    @Override
    public Object carregar(Integer id) throws Exception {
        Usuario usuario = new Usuario();
        try{
            String sql = "select * from usuario where codigo = ?";
            stmt = this.conexao.prepareStatement(sql);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            rs.next();
            usuario.setCodigo(rs.getInt("codigo"));
            usuario.setNome(rs.getString("nome"));
            usuario.setSenha(rs.getString("senha"));
            usuario.setDataNascimento(rs.getDate("data_nascimento").toLocalDate());
            
        }catch(Exception e){
            System.out.println("Erro ao carregar usuarioDAO " + e.getMessage());
        }finally{
            ConnectionFactory.fecharConexao(rs, stmt, conexao);
        }
        return usuario; 
    }
}