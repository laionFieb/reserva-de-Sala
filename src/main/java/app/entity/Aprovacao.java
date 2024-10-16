
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
* Classe que representa a tabela APROVACAO
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"APROVACAO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Aprovacao")
@CronappTable(role=CronappTableRole.ASSOCIATION_CLASS)
public class Aprovacao implements Serializable {
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
    @ManyToOne
    @JoinColumn(name="fk_reserva", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Reserva reserva;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @CronappColumn(attributeType="DATETIME", label="Data  Aprovacao")
    @Column(name = "data_Aprovacao", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date data_Aprovacao;


    /**
    * @generated
    */
    @CronappColumn(attributeType="INTEGER", label="Status")
    @Column(name = "status", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer status;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Motivo Reprovacao")
    @Column(name = "motivo_reprovacao", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String motivo_reprovacao;


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
    public Aprovacao(){
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
    public Aprovacao setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém reserva
    * return reserva
    * @generated
    */
    public Reserva getReserva() {
        return this.reserva;
    }

    /**
    * Define reserva
    * @param reserva reserva
    * @generated
    */
    public Aprovacao setReserva(Reserva reserva) {
        this.reserva = reserva;
        return this;
    }
    /**
    * Obtém data_Aprovacao
    * return data_Aprovacao
    * @generated
    */
    public java.util.Date getData_Aprovacao() {
        return this.data_Aprovacao;
    }

    /**
    * Define data_Aprovacao
    * @param data_Aprovacao data_Aprovacao
    * @generated
    */
    public Aprovacao setData_Aprovacao(java.util.Date data_Aprovacao) {
        this.data_Aprovacao = data_Aprovacao;
        return this;
    }
    /**
    * Obtém status
    * return status
    * @generated
    */
    public java.lang.Integer getStatus() {
        return this.status;
    }

    /**
    * Define status
    * @param status status
    * @generated
    */
    public Aprovacao setStatus(java.lang.Integer status) {
        this.status = status;
        return this;
    }
    /**
    * Obtém motivo_reprovacao
    * return motivo_reprovacao
    * @generated
    */
    public java.lang.String getMotivo_reprovacao() {
        return this.motivo_reprovacao;
    }

    /**
    * Define motivo_reprovacao
    * @param motivo_reprovacao motivo_reprovacao
    * @generated
    */
    public Aprovacao setMotivo_reprovacao(java.lang.String motivo_reprovacao) {
        this.motivo_reprovacao = motivo_reprovacao;
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
    public Aprovacao setResponsavel_Sala(Responsavel_Sala responsavel_Sala) {
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
Aprovacao object = (Aprovacao)obj;
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