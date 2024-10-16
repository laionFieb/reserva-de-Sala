
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
* Classe que representa a tabela UNIDADETIPO_AGENDA
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"UNIDADETIPO_AGENDA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.UnidadeTipo_Agenda")
@CronappTable(role=CronappTableRole.ASSOCIATION_CLASS)
public class UnidadeTipo_Agenda implements Serializable {
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
    @JoinColumn(name="fk_unidade", nullable = true, referencedColumnName = "id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = "UNIDADETIPO_AGENDA_FK_UNIDADE_UNIDADE_ID", foreignKeyDefinition = "FOREIGN KEY (fk_unidade) REFERENCES UNIDADE (id) ON DELETE CASCADE"))
        
        private Unidade unidade;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_tipo_Agenda", nullable = true, referencedColumnName = "id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = "UNIDADETIPO_AGENDA_FK_TIPO_AGENDA_TIPO_AGENDA_ID", foreignKeyDefinition = "FOREIGN KEY (fk_tipo_Agenda) REFERENCES TIPO_AGENDA (id) ON DELETE CASCADE"))
        
        private Tipo_Agenda tipo_Agenda;


    /**
    * Construtor
    * @generated
    */
    public UnidadeTipo_Agenda(){
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
    public UnidadeTipo_Agenda setId(java.lang.String id) {
        this.id = id;
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
    public UnidadeTipo_Agenda setUnidade(Unidade unidade) {
        this.unidade = unidade;
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
    public UnidadeTipo_Agenda setTipo_Agenda(Tipo_Agenda tipo_Agenda) {
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
UnidadeTipo_Agenda object = (UnidadeTipo_Agenda)obj;
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