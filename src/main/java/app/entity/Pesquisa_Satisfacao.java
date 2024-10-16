
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
* Classe que representa a tabela PESQUISA_SATISFACAO
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"PESQUISA_SATISFACAO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Pesquisa_Satisfacao")
@CronappTable(role=CronappTableRole.CLASS)
public class Pesquisa_Satisfacao implements Serializable {
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
    @CronappColumn(attributeType="STRING", label="Classificar Servico")
    @Column(name = "classificar_servico", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String classificar_servico;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Classificar Equipamento")
    @Column(name = "classificar_equipamento", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String classificar_equipamento;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Classificar Infra")
    @Column(name = "classificar_infra", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String classificar_infra;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Classificar Geral")
    @Column(name = "classificar_geral", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String classificar_geral;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Sugestao")
    @Column(name = "sugestao", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String sugestao;


    /**
    * @generated
    */
    @OneToOne
    @JoinColumn(name="fk_reserva", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Reserva reserva;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_user", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private User user;


    /**
    * Construtor
    * @generated
    */
    public Pesquisa_Satisfacao(){
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
    public Pesquisa_Satisfacao setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém classificar_servico
    * return classificar_servico
    * @generated
    */
    public java.lang.String getClassificar_servico() {
        return this.classificar_servico;
    }

    /**
    * Define classificar_servico
    * @param classificar_servico classificar_servico
    * @generated
    */
    public Pesquisa_Satisfacao setClassificar_servico(java.lang.String classificar_servico) {
        this.classificar_servico = classificar_servico;
        return this;
    }
    /**
    * Obtém classificar_equipamento
    * return classificar_equipamento
    * @generated
    */
    public java.lang.String getClassificar_equipamento() {
        return this.classificar_equipamento;
    }

    /**
    * Define classificar_equipamento
    * @param classificar_equipamento classificar_equipamento
    * @generated
    */
    public Pesquisa_Satisfacao setClassificar_equipamento(java.lang.String classificar_equipamento) {
        this.classificar_equipamento = classificar_equipamento;
        return this;
    }
    /**
    * Obtém classificar_infra
    * return classificar_infra
    * @generated
    */
    public java.lang.String getClassificar_infra() {
        return this.classificar_infra;
    }

    /**
    * Define classificar_infra
    * @param classificar_infra classificar_infra
    * @generated
    */
    public Pesquisa_Satisfacao setClassificar_infra(java.lang.String classificar_infra) {
        this.classificar_infra = classificar_infra;
        return this;
    }
    /**
    * Obtém classificar_geral
    * return classificar_geral
    * @generated
    */
    public java.lang.String getClassificar_geral() {
        return this.classificar_geral;
    }

    /**
    * Define classificar_geral
    * @param classificar_geral classificar_geral
    * @generated
    */
    public Pesquisa_Satisfacao setClassificar_geral(java.lang.String classificar_geral) {
        this.classificar_geral = classificar_geral;
        return this;
    }
    /**
    * Obtém sugestao
    * return sugestao
    * @generated
    */
    public java.lang.String getSugestao() {
        return this.sugestao;
    }

    /**
    * Define sugestao
    * @param sugestao sugestao
    * @generated
    */
    public Pesquisa_Satisfacao setSugestao(java.lang.String sugestao) {
        this.sugestao = sugestao;
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
    public Pesquisa_Satisfacao setReserva(Reserva reserva) {
        this.reserva = reserva;
        return this;
    }
    /**
    * Obtém user
    * return user
    * @generated
    */
    public User getUser() {
        return this.user;
    }

    /**
    * Define user
    * @param user user
    * @generated
    */
    public Pesquisa_Satisfacao setUser(User user) {
        this.user = user;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Pesquisa_Satisfacao object = (Pesquisa_Satisfacao)obj;
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