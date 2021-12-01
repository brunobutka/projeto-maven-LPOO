/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.cs.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

/**
 *
 * @author bruno
 */
@Entity()
@Table(name = "tb_resulado")
@DiscriminatorValue("R")
public class Resultado implements Serializable{
    
    @EmbeddedId
    private ResultadoID id;        
    
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Status status;
    
    public Resultado(){
        
    }

    /**
     * @return the id
     */
    public ResultadoID getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(ResultadoID id) {
        this.id = id;
    }

    /**
     * @return the status
     */
    public Status getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(Status status) {
        this.status = status;
    }
    
    
    
}
