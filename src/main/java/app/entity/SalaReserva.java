
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
* Classe que representa a tabela SALARESERVA
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"SALARESERVA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.SalaReserva")
@CronappTable(role=CronappTableRole.ASSOCIATION_CLASS)
public class SalaReserva implements Serializable {
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
    @JoinColumn(name="fk_sala", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Sala sala;


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
    public SalaReserva(){
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
    public SalaReserva setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém sala
    * return sala
    * @generated
    */
    public Sala getSala() {
        return this.sala;
    }

    /**
    * Define sala
    * @param sala sala
    * @generated
    */
    public SalaReserva setSala(Sala sala) {
        this.sala = sala;
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
    public SalaReserva setReserva(Reserva reserva) {
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
SalaReserva object = (SalaReserva)obj;
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