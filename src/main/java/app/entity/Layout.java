
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
* Classe que representa a tabela LAYOUT
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"LAYOUT\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Layout")
@CronappTable(role=CronappTableRole.ASSOCIATION_CLASS)
public class Layout implements Serializable {
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
    @CronappColumn(attributeType="STRING", label="Nome")
    @Column(name = "nome", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String nome;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_tipo_Agenda", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Tipo_Agenda tipo_Agenda;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_unidade", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Unidade unidade;


    /**
    * Construtor
    * @generated
    */
    public Layout(){
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
    public Layout setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém nome
    * return nome
    * @generated
    */
    public java.lang.String getNome() {
        return this.nome;
    }

    /**
    * Define nome
    * @param nome nome
    * @generated
    */
    public Layout setNome(java.lang.String nome) {
        this.nome = nome;
        return this;
    }
    /**
    * Obtém tipo_Agenda
    * return tipo_Agenda
    * @generated
    */
    public Tipo_Agenda getTipo_Agenda() {
        return this.tipo_Agenda;
    }

    /**
    * Define tipo_Agenda
    * @param tipo_Agenda tipo_Agenda
    * @generated
    */
    public Layout setTipo_Agenda(Tipo_Agenda tipo_Agenda) {
        this.tipo_Agenda = tipo_Agenda;
        return this;
    }
    /**
    * Obtém unidade
    * return unidade
    * @generated
    */
    public Unidade getUnidade() {
        return this.unidade;
    }

    /**
    * Define unidade
    * @param unidade unidade
    * @generated
    */
    public Layout setUnidade(Unidade unidade) {
        this.unidade = unidade;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Layout object = (Layout)obj;
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