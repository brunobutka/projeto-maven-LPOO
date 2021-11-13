
package br.edu.ifsul.cc.lpoo.cs.test;

import br.edu.ifsul.cc.lpoo.cs.model.dao.PersistenciaJPA;
import org.junit.Test;

/**
 *
 * @author telmo
 */
public class TestPersistenciaJPA {
    
    @Test
    public void testConexaoGeracaoTabelas(){
        
        PersistenciaJPA persistencia = new PersistenciaJPA();
        if(persistencia.conexaoAberta()){
            System.out.println("abriu a conexao com o BD via JPA");
            
            persistencia.fecharConexao();
            
        }else{
            System.out.println("Noa abriu a conexao com o BD via JPA");
        }
        
    }
    
}
