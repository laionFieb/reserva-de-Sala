
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
* Classe que representa a tabela SALA
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"SALA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Sala")
@CronappTable(role=CronappTableRole.CLASS)
public class Sala implements Serializable {
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
    @CronappColumn(attributeType="STRING", label="Capacidade")
    @Column(name = "capacidade", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String capacidade;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Andar")
    @Column(name = "andar", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String andar;


    /**
    * @generated
    */
    @CronappColumn(attributeType="BOOLEAN", label="Autorizacao")
    @Column(name = "autorizacao", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean autorizacao;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_unidade", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Unidade unidade;


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
    public Sala(){
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
    public Sala setId(java.lang.String id) {
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
    public Sala setNome(java.lang.String nome) {
        this.nome = nome;
        return this;
    }
    /**
    * Obtém capacidade
    * return capacidade
    * @generated
    */
    public java.lang.String getCapacidade() {
        return this.capacidade;
    }

    /**
    * Define capacidade
    * @param capacidade capacidade
    * @generated
    */
    public Sala setCapacidade(java.lang.String capacidade) {
        this.capacidade = capacidade;
        return this;
    }
    /**
    * Obtém andar
    * return andar
    * @generated
    */
    public java.lang.String getAndar() {
        return this.andar;
    }

    /**
    * Define andar
    * @param andar andar
    * @generated
    */
    public Sala setAndar(java.lang.String andar) {
        this.andar = andar;
        return this;
    }
    /**
    * Obtém autorizacao
    * return autorizacao
    * @generated
    */
    public java.lang.Boolean getAutorizacao() {
        return this.autorizacao;
    }

    /**
    * Define autorizacao
    * @param autorizacao autorizacao
    * @generated
    */
    public Sala setAutorizacao(java.lang.Boolean autorizacao) {
        this.autorizacao = autorizacao;
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
    public Sala setUnidade(Unidade unidade) {
        this.unidade = unidade;
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
    public Sala setResponsavel_Sala(Responsavel_Sala responsavel_Sala) {
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
Sala object = (Sala)obj;
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