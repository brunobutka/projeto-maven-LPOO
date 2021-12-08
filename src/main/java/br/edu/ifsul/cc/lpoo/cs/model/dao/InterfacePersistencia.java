
package br.edu.ifsul.cc.lpoo.cs.model.dao;

import br.edu.ifsul.cc.lpoo.cs.model.Endereco;
import br.edu.ifsul.cc.lpoo.cs.model.Patente;
import java.util.List;

/**
 *
 * @author bruno
 */
public interface InterfacePersistencia {
            
    public Boolean conexaoAberta();
    
    public void fecharConexao();
    
    public Object find(Class c, Object id) throws Exception;//select.
    
    public void persist(Object o) throws Exception;//insert ou update.
    
    public void remover(Object o) throws Exception;//delete.
    
    public List<Endereco> listEnderecos();
    
    public List<Patente> listPatentes();
        
}
