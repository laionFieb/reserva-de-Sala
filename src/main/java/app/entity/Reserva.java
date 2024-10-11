
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
* Classe que representa a tabela RESERVA
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"RESERVA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Reserva")
@CronappTable(role=CronappTableRole.CLASS)
public class Reserva implements Serializable {
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
    @CronappColumn(attributeType="STRING", label="Nome Evento")
    @Column(name = "nomeEvento", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String nomeEvento;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @CronappColumn(attributeType="DATETIME", label="Data Inicio")
    @Column(name = "dataInicio", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date dataInicio;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @CronappColumn(attributeType="DATETIME", label="Data Fim")
    @Column(name = "dataFim", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date dataFim;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIME)
    @CronappColumn(attributeType="TIME", label="Hora Inicio")
    @Column(name = "horaInicio", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date horaInicio;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIME)
    @CronappColumn(attributeType="TIME", label="Hora Fim")
    @Column(name = "horaFim", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date horaFim;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Promotor Evento")
    @Column(name = "promotorEvento", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String promotorEvento;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Responsavel Evento")
    @Column(name = "responsavelEvento", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String responsavelEvento;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Email Responsavel Evento")
    @Column(name = "emailResponsavelEvento", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String emailResponsavelEvento;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Empresa Responsavel Evento")
    @Column(name = "empresaResponsavelEvento", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String empresaResponsavelEvento;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Telefone Responsavel Evento", mask="(00) 00000-0000;0")
    @Column(name = "telefoneResponsavelEvento", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String telefoneResponsavelEvento;


    /**
    * @generated
    */
    @CronappColumn(attributeType="INTEGER", label="Quantidade Participantes")
    @Column(name = "quantidadeParticipantes", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer quantidadeParticipantes;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Descricao")
    @Column(name = "descricao", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String descricao;


    /**
    * @generated
    */
    @CronappColumn(attributeType="BOOLEAN", label="Mesa Diretiva")
    @Column(name = "mesaDiretiva", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean mesaDiretiva;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Responsavel Servico")
    @Column(name = "responsavelServico", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String responsavelServico;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_user", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private User user;


    /**
    * @generated
    */
    @CronappColumn(attributeType="BOOLEAN", label="Dia Todo")
    @Column(name = "dia_todo", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean dia_todo;


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
    @JoinColumn(name="fk_sala", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Sala sala;


    /**
    * Construtor
    * @generated
    */
    public Reserva(){
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
    public Reserva setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém nomeEvento
    * return nomeEvento
    * @generated
    */
    public java.lang.String getNomeEvento() {
        return this.nomeEvento;
    }

    /**
    * Define nomeEvento
    * @param nomeEvento nomeEvento
    * @generated
    */
    public Reserva setNomeEvento(java.lang.String nomeEvento) {
        this.nomeEvento = nomeEvento;
        return this;
    }
    /**
    * Obtém dataInicio
    * return dataInicio
    * @generated
    */
    public java.util.Date getDataInicio() {
        return this.dataInicio;
    }

    /**
    * Define dataInicio
    * @param dataInicio dataInicio
    * @generated
    */
    public Reserva setDataInicio(java.util.Date dataInicio) {
        this.dataInicio = dataInicio;
        return this;
    }
    /**
    * Obtém dataFim
    * return dataFim
    * @generated
    */
    public java.util.Date getDataFim() {
        return this.dataFim;
    }

    /**
    * Define dataFim
    * @param dataFim dataFim
    * @generated
    */
    public Reserva setDataFim(java.util.Date dataFim) {
        this.dataFim = dataFim;
        return this;
    }
    /**
    * Obtém horaInicio
    * return horaInicio
    * @generated
    */
    public java.util.Date getHoraInicio() {
        return this.horaInicio;
    }

    /**
    * Define horaInicio
    * @param horaInicio horaInicio
    * @generated
    */
    public Reserva setHoraInicio(java.util.Date horaInicio) {
        this.horaInicio = horaInicio;
        return this;
    }
    /**
    * Obtém horaFim
    * return horaFim
    * @generated
    */
    public java.util.Date getHoraFim() {
        return this.horaFim;
    }

    /**
    * Define horaFim
    * @param horaFim horaFim
    * @generated
    */
    public Reserva setHoraFim(java.util.Date horaFim) {
        this.horaFim = horaFim;
        return this;
    }
    /**
    * Obtém promotorEvento
    * return promotorEvento
    * @generated
    */
    public java.lang.String getPromotorEvento() {
        return this.promotorEvento;
    }

    /**
    * Define promotorEvento
    * @param promotorEvento promotorEvento
    * @generated
    */
    public Reserva setPromotorEvento(java.lang.String promotorEvento) {
        this.promotorEvento = promotorEvento;
        return this;
    }
    /**
    * Obtém responsavelEvento
    * return responsavelEvento
    * @generated
    */
    public java.lang.String getResponsavelEvento() {
        return this.responsavelEvento;
    }

    /**
    * Define responsavelEvento
    * @param responsavelEvento responsavelEvento
    * @generated
    */
    public Reserva setResponsavelEvento(java.lang.String responsavelEvento) {
        this.responsavelEvento = responsavelEvento;
        return this;
    }
    /**
    * Obtém emailResponsavelEvento
    * return emailResponsavelEvento
    * @generated
    */
    public java.lang.String getEmailResponsavelEvento() {
        return this.emailResponsavelEvento;
    }

    /**
    * Define emailResponsavelEvento
    * @param emailResponsavelEvento emailResponsavelEvento
    * @generated
    */
    public Reserva setEmailResponsavelEvento(java.lang.String emailResponsavelEvento) {
        this.emailResponsavelEvento = emailResponsavelEvento;
        return this;
    }
    /**
    * Obtém empresaResponsavelEvento
    * return empresaResponsavelEvento
    * @generated
    */
    public java.lang.String getEmpresaResponsavelEvento() {
        return this.empresaResponsavelEvento;
    }

    /**
    * Define empresaResponsavelEvento
    * @param empresaResponsavelEvento empresaResponsavelEvento
    * @generated
    */
    public Reserva setEmpresaResponsavelEvento(java.lang.String empresaResponsavelEvento) {
        this.empresaResponsavelEvento = empresaResponsavelEvento;
        return this;
    }
    /**
    * Obtém telefoneResponsavelEvento
    * return telefoneResponsavelEvento
    * @generated
    */
    public java.lang.String getTelefoneResponsavelEvento() {
        return this.telefoneResponsavelEvento;
    }

    /**
    * Define telefoneResponsavelEvento
    * @param telefoneResponsavelEvento telefoneResponsavelEvento
    * @generated
    */
    public Reserva setTelefoneResponsavelEvento(java.lang.String telefoneResponsavelEvento) {
        this.telefoneResponsavelEvento = telefoneResponsavelEvento;
        return this;
    }
    /**
    * Obtém quantidadeParticipantes
    * return quantidadeParticipantes
    * @generated
    */
    public java.lang.Integer getQuantidadeParticipantes() {
        return this.quantidadeParticipantes;
    }

    /**
    * Define quantidadeParticipantes
    * @param quantidadeParticipantes quantidadeParticipantes
    * @generated
    */
    public Reserva setQuantidadeParticipantes(java.lang.Integer quantidadeParticipantes) {
        this.quantidadeParticipantes = quantidadeParticipantes;
        return this;
    }
    /**
    * Obtém descricao
    * return descricao
    * @generated
    */
    public java.lang.String getDescricao() {
        return this.descricao;
    }

    /**
    * Define descricao
    * @param descricao descricao
    * @generated
    */
    public Reserva setDescricao(java.lang.String descricao) {
        this.descricao = descricao;
        return this;
    }
    /**
    * Obtém mesaDiretiva
    * return mesaDiretiva
    * @generated
    */
    public java.lang.Boolean getMesaDiretiva() {
        return this.mesaDiretiva;
    }

    /**
    * Define mesaDiretiva
    * @param mesaDiretiva mesaDiretiva
    * @generated
    */
    public Reserva setMesaDiretiva(java.lang.Boolean mesaDiretiva) {
        this.mesaDiretiva = mesaDiretiva;
        return this;
    }
    /**
    * Obtém responsavelServico
    * return responsavelServico
    * @generated
    */
    public java.lang.String getResponsavelServico() {
        return this.responsavelServico;
    }

    /**
    * Define responsavelServico
    * @param responsavelServico responsavelServico
    * @generated
    */
    public Reserva setResponsavelServico(java.lang.String responsavelServico) {
        this.responsavelServico = responsavelServico;
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
    public Reserva setUser(User user) {
        this.user = user;
        return this;
    }
    /**
    * Obtém dia_todo
    * return dia_todo
    * @generated
    */
    public java.lang.Boolean getDia_todo() {
        return this.dia_todo;
    }

    /**
    * Define dia_todo
    * @param dia_todo dia_todo
    * @generated
    */
    public Reserva setDia_todo(java.lang.Boolean dia_todo) {
        this.dia_todo = dia_todo;
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
    public Reserva setUnidade(Unidade unidade) {
        this.unidade = unidade;
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
    public Reserva setSala(Sala sala) {
        this.sala = sala;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Reserva object = (Reserva)obj;
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