
package br.edu.ifsul.cc.lpoo.cs.model.dao;

/**
 *
 * @author telmo Junior
 */
public interface InterfacePersistencia {
    
    public Boolean conexaoAberta();
    
    public void fecharConexao();
    
}
