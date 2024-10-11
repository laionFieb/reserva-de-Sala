
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
* Classe que representa a tabela TIPO_EVENTO
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"TIPO_EVENTO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Tipo_Evento")
@CronappTable(role=CronappTableRole.CLASS)
public class Tipo_Evento implements Serializable {
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
    @CronappColumn(attributeType="BOOLEAN", label="Enviar Email")
    @Column(name = "enviar_email", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean enviar_email;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Enviar Para")
    @Column(name = "enviar_para", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String enviar_para;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_tipo_Agenda", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Tipo_Agenda tipo_Agenda;


    /**
    * Construtor
    * @generated
    */
    public Tipo_Evento(){
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
    public Tipo_Evento setId(java.lang.String id) {
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
    public Tipo_Evento setNome(java.lang.String nome) {
        this.nome = nome;
        return this;
    }
    /**
    * Obtém enviar_email
    * return enviar_email
    * @generated
    */
    public java.lang.Boolean getEnviar_email() {
        return this.enviar_email;
    }

    /**
    * Define enviar_email
    * @param enviar_email enviar_email
    * @generated
    */
    public Tipo_Evento setEnviar_email(java.lang.Boolean enviar_email) {
        this.enviar_email = enviar_email;
        return this;
    }
    /**
    * Obtém enviar_para
    * return enviar_para
    * @generated
    */
    public java.lang.String getEnviar_para() {
        return this.enviar_para;
    }

    /**
    * Define enviar_para
    * @param enviar_para enviar_para
    * @generated
    */
    public Tipo_Evento setEnviar_para(java.lang.String enviar_para) {
        this.enviar_para = enviar_para;
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
    public Tipo_Evento setTipo_Agenda(Tipo_Agenda tipo_Agenda) {
        this.tipo_Agenda = tipo_Agenda;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Tipo_Evento object = (Tipo_Evento)obj;
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