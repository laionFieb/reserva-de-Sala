
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
* Classe que representa a tabela SERVICORESERVA
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"SERVICORESERVA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.ServicoReserva")
@CronappTable(role=CronappTableRole.ASSOCIATION_CLASS)
public class ServicoReserva implements Serializable {
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
    @JoinColumn(name="fk_servico", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Servico servico;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_reserva", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Reserva reserva;


    /**
    * Construtor
    * @generated
    */
    public ServicoReserva(){
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
    public ServicoReserva setId(java.lang.String id) {
        this.id = id;
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
    public ServicoReserva setServico(Servico servico) {
        this.servico = servico;
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
    public ServicoReserva setReserva(Reserva reserva) {
        this.reserva = reserva;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
ServicoReserva object = (ServicoReserva)obj;
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