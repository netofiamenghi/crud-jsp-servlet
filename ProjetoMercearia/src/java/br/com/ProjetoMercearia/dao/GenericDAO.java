
package br.com.ProjetoMercearia.dao;

import java.util.List;

public interface GenericDAO {
    
    public Boolean cadastrar(Object object) throws Exception;
    
    public Boolean excluir(Object object) throws Exception;
     
    public Boolean alterar(Object object) throws Exception;
    
    public List<Object> listar() throws Exception;
      
    public Boolean carregar(Integer id) throws Exception;
            
    
}
