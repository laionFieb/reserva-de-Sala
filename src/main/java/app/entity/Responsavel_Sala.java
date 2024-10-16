
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
* Classe que representa a tabela RESPONSAVEL_SALA
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"RESPONSAVEL_SALA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Responsavel_Sala")
@CronappTable(role=CronappTableRole.CLASS)
public class Responsavel_Sala implements Serializable {
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
    @CronappColumn(attributeType="STRING", label="Nome Responsavel")
    @Column(name = "nome_responsavel", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String nome_responsavel;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Email")
    @Column(name = "email", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String email;


    /**
    * Construtor
    * @generated
    */
    public Responsavel_Sala(){
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
    public Responsavel_Sala setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém nome_responsavel
    * return nome_responsavel
    * @generated
    */
    public java.lang.String getNome_responsavel() {
        return this.nome_responsavel;
    }

    /**
    * Define nome_responsavel
    * @param nome_responsavel nome_responsavel
    * @generated
    */
    public Responsavel_Sala setNome_responsavel(java.lang.String nome_responsavel) {
        this.nome_responsavel = nome_responsavel;
        return this;
    }
    /**
    * Obtém email
    * return email
    * @generated
    */
    public java.lang.String getEmail() {
        return this.email;
    }

    /**
    * Define email
    * @param email email
    * @generated
    */
    public Responsavel_Sala setEmail(java.lang.String email) {
        this.email = email;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Responsavel_Sala object = (Responsavel_Sala)obj;
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