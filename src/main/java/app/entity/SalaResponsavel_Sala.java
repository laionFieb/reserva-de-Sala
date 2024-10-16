
package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.swagger.CronappSwagger;



import cronapp.framework.core.persistence.*;

/**
* Classe que representa a tabela SALARESPONSAVEL_SALA
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"SALARESPONSAVEL_SALA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.SalaResponsavel_Sala")
@CronappTable(role=CronappTableRole.ASSOCIATION_CLASS)
public class SalaResponsavel_Sala implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @CronappColumn(attributeType="STRING", label="Id")
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_sala", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Sala sala;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_responsavel_Sala", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Responsavel_Sala responsavel_Sala;


    /**
    * Construtor
    * @generated
    */
    public SalaResponsavel_Sala(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    public java.lang.String getId() {
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public SalaResponsavel_Sala setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém sala
    * return sala
    * @generated
    */
    public Sala getSala() {
        return this.sala;
    }

    /**
    * Define sala
    * @param sala sala
    * @generated
    */
    public SalaResponsavel_Sala setSala(Sala sala) {
        this.sala = sala;
        return this;
    }
    /**
    * Obtém responsavel_Sala
    * return responsavel_Sala
    * @generated
    */
    public Responsavel_Sala getResponsavel_Sala() {
        return this.responsavel_Sala;
    }

    /**
    * Define responsavel_Sala
    * @param responsavel_Sala responsavel_Sala
    * @generated
    */
    public SalaResponsavel_Sala setResponsavel_Sala(Responsavel_Sala responsavel_Sala) {
        this.responsavel_Sala = responsavel_Sala;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
SalaResponsavel_Sala object = (SalaResponsavel_Sala)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}