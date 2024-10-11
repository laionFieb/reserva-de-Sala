
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
* Classe que representa a tabela TIPO_AGENDASERVICO
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"TIPO_AGENDASERVICO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Tipo_AgendaServico")
@CronappTable(role=CronappTableRole.ASSOCIATION_CLASS)
public class Tipo_AgendaServico implements Serializable {
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
    @JoinColumn(name="fk_tipo_Agenda", nullable = true, referencedColumnName = "id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = "TIPO_AGENDASERVICO_FK_TIPO_AGENDA_TIPO_AGENDA_ID", foreignKeyDefinition = "FOREIGN KEY (fk_tipo_Agenda) REFERENCES TIPO_AGENDA (id) ON DELETE CASCADE"))
        
        private Tipo_Agenda tipo_Agenda;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_servico", nullable = true, referencedColumnName = "id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = "TIPO_AGENDASERVICO_FK_SERVICO_SERVICO_ID", foreignKeyDefinition = "FOREIGN KEY (fk_servico) REFERENCES SERVICO (id) ON DELETE CASCADE"))
        
        private Servico servico;


    /**
    * Construtor
    * @generated
    */
    public Tipo_AgendaServico(){
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
    public Tipo_AgendaServico setId(java.lang.String id) {
        this.id = id;
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
    public Tipo_AgendaServico setTipo_Agenda(Tipo_Agenda tipo_Agenda) {
        this.tipo_Agenda = tipo_Agenda;
        return this;
    }
    /**
    * Obtém servico
    * return servico
    * @generated
    */
    public Servico getServico() {
        return this.servico;
    }

    /**
    * Define servico
    * @param servico servico
    * @generated
    */
    public Tipo_AgendaServico setServico(Servico servico) {
        this.servico = servico;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Tipo_AgendaServico object = (Tipo_AgendaServico)obj;
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