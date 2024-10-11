
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
* Classe que representa a tabela HORARIO
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"HORARIO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Horario")
@CronappTable(role=CronappTableRole.CLASS)
public class Horario implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @CronappColumn(attributeType="STRING", label="Id", defaultValue = "UUID.randomUUID().toString().toUpperCase()")
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @Temporal(TemporalType.TIME)
    @CronappColumn(attributeType="TIME", label="Hora")
    @Column(name = "hora", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date hora;


    /**
    * Construtor
    * @generated
    */
    public Horario(){
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
    public Horario setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém hora
    * return hora
    * @generated
    */
    public java.util.Date getHora() {
        return this.hora;
    }

    /**
    * Define hora
    * @param hora hora
    * @generated
    */
    public Horario setHora(java.util.Date hora) {
        this.hora = hora;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Horario object = (Horario)obj;
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