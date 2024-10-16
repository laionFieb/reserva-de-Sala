
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
* Classe que representa a tabela EQUIPAMENTO
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"EQUIPAMENTO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Equipamento")
@CronappTable(role=CronappTableRole.CLASS)
public class Equipamento implements Serializable {
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
    @CronappColumn(attributeType="STRING", label="Enviar Email")
    @Column(name = "enviar_email", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String enviar_email;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Validar Agenda")
    @Column(name = "validar_agenda", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String validar_agenda;


    /**
    * @generated
    */
    @CronappColumn(attributeType="INTEGER", label="Quantidade")
    @Column(name = "quantidade", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer quantidade;


    /**
    * Construtor
    * @generated
    */
    public Equipamento(){
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
    public Equipamento setId(java.lang.String id) {
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
    public Equipamento setNome(java.lang.String nome) {
        this.nome = nome;
        return this;
    }
    /**
    * Obtém enviar_email
    * return enviar_email
    * @generated
    */
    public java.lang.String getEnviar_email() {
        return this.enviar_email;
    }

    /**
    * Define enviar_email
    * @param enviar_email enviar_email
    * @generated
    */
    public Equipamento setEnviar_email(java.lang.String enviar_email) {
        this.enviar_email = enviar_email;
        return this;
    }
    /**
    * Obtém validar_agenda
    * return validar_agenda
    * @generated
    */
    public java.lang.String getValidar_agenda() {
        return this.validar_agenda;
    }

    /**
    * Define validar_agenda
    * @param validar_agenda validar_agenda
    * @generated
    */
    public Equipamento setValidar_agenda(java.lang.String validar_agenda) {
        this.validar_agenda = validar_agenda;
        return this;
    }
    /**
    * Obtém quantidade
    * return quantidade
    * @generated
    */
    public java.lang.Integer getQuantidade() {
        return this.quantidade;
    }

    /**
    * Define quantidade
    * @param quantidade quantidade
    * @generated
    */
    public Equipamento setQuantidade(java.lang.Integer quantidade) {
        this.quantidade = quantidade;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Equipamento object = (Equipamento)obj;
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