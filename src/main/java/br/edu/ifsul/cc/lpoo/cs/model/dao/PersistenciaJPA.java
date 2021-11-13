
package br.edu.ifsul.cc.lpoo.cs.model.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author telmo
 */
public class PersistenciaJPA implements InterfacePersistencia {
    
    public EntityManagerFactory factory;    //fabrica de gerenciadores de entidades
    public EntityManager entity;            //gerenciador de entidades JPA
    
    public PersistenciaJPA(){
        
        //parametro: é o nome da unidade de persistencia (Persistence Unit)
        factory = Persistence.createEntityManagerFactory("pu_db_cs");
        entity = factory.createEntityManager();
    }


    @Override
    public Boolean conexaoAberta() {
        
        return entity.isOpen();   
    }

    @Override
    public void fecharConexao() {
        
        entity.close();        
    }
    
}
