
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
* Classe que representa a tabela UNIDADE
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"UNIDADE\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Unidade")
@CronappTable(role=CronappTableRole.CLASS)
public class Unidade implements Serializable {
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
    @CronappColumn(attributeType="STRING", label="Unidade")
    @Column(name = "unidade", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String unidade;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Bairro")
    @Column(name = "bairro", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String bairro;


    /**
    * Construtor
    * @generated
    */
    public Unidade(){
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
    public Unidade setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém unidade
    * return unidade
    * @generated
    */
    public java.lang.String getUnidade() {
        return this.unidade;
    }

    /**
    * Define unidade
    * @param unidade unidade
    * @generated
    */
    public Unidade setUnidade(java.lang.String unidade) {
        this.unidade = unidade;
        return this;
    }
    /**
    * Obtém bairro
    * return bairro
    * @generated
    */
    public java.lang.String getBairro() {
        return this.bairro;
    }

    /**
    * Define bairro
    * @param bairro bairro
    * @generated
    */
    public Unidade setBairro(java.lang.String bairro) {
        this.bairro = bairro;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Unidade object = (Unidade)obj;
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