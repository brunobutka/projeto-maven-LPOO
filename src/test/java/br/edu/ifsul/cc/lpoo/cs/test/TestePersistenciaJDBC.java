
package br.edu.ifsul.cc.lpoo.cs.test;

import br.edu.ifsul.cc.lpoo.cs.model.Patente;
import br.edu.ifsul.cc.lpoo.cs.model.dao.PersistenciaJDBC;
import java.util.List;
import org.junit.Test;

/**
 *
 * @author bruno
 */
public class TestePersistenciaJDBC {
    
    // atividade assíncrona: 02/12/2021  implementar o test para a recuperacao de registro em tb_patente.
    //@Test
    public void testListPersistenciaPatente() throws Exception {
        
        PersistenciaJDBC persistencia = new PersistenciaJDBC();
        if(persistencia.conexaoAberta()){
            
            List<Patente> lista = persistencia.listPatentes();
            
            if(!lista.isEmpty()){
            
                for(Patente p : lista){

                    System.out.println("Nome: "+p.getNome()+" Cor: "+p.getCor());
                    persistencia.remover(p);
                }
            }else{
                
                System.out.println("Não encontrou a patente");
                
                Patente pat = new Patente();
                pat.setNome("Fulano");
                pat.setCor("nenhum");                                                
                persistencia.persist(pat); //insert na tabela.                
                System.out.println("Cadastrou a patente "+pat.getId());
                
                
                pat = new Patente();//reset com a nova instancia que é gerada aqui.
                pat.setNome("Ciclano");
                pat.setCor("Vermelho");
                
                persistencia.persist(pat); //insert na tabela.
                System.out.println("Cadastrou a patente "+pat.getId());
                
            }
            
            persistencia.fecharConexao();
        }else{
            System.out.println("Nao abriu a conexao com o BD via JDBC");
        }
    }
    
    @Test
    public void testPersistenciaPatente() throws Exception {
        
        PersistenciaJDBC persistencia = new PersistenciaJDBC();
        if(persistencia.conexaoAberta()){
            System.out.println("abriu a conexao com o BD via JDBC");                        
            
            //casting (modelo o objet retornado pelo find em Patente)            
            Patente pat = (Patente) persistencia.find(Patente.class, 1);
            
            if(pat == null){
                
                System.out.println("Não encontrou a patente");
                
                /*pat = new Patente();                
                pat.setNome("Beltrano");
                pat.setCor("Azul");
                
                System.out.println("Patente : "+pat.getId());                                
                
                persistencia.persist(pat); //insert na tabela.
                
                System.out.println("Cadastrou a patente: "+pat.getId());*/                                
                
            }else{
                
                System.out.println("Encontrou a patente: "+pat.getId() + " | " + pat.getCor() + " | " + pat.getNome());
                
                /*pat.setCor("Amarelo");
                persistencia.persist(pat);//upate.
                
                System.out.println("Alterou a patente: "+pat.getId());*/
                
                //persistencia.remover(pat);
                //System.out.println("Removeu a patente: "+pat.getId());
            }                        
            
            persistencia.fecharConexao();
        }else{
            System.out.println("Nao abriu a conexao com o BD via JDBC");
        }
        
    }
        
}
