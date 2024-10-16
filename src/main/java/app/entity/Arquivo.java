
package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.swagger.CronappSwagger;
    import cronapi.CronapiByteHeaderSignature;



import cronapp.framework.core.persistence.*;

/**
* Classe que representa a tabela ARQUIVO
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"ARQUIVO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Arquivo")
@CronappTable(role=CronappTableRole.CLASS)
public class Arquivo implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @CronappColumn(attributeType="STRING", label="Id Arquivo", defaultValue = "UUID.randomUUID().toString().toUpperCase()")
    @Column(name = "idArquivo", nullable = false, insertable=true, updatable=true)
        private java.lang.String idArquivo = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @CronappColumn(attributeType="FILE_DATABASE", label="Arquivo")
    @Column(name = "arquivo", nullable = true, unique = false, insertable=true, updatable=true)
    @CronapiByteHeaderSignature
        
        private byte[] arquivo;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Info Arquivo")
    @Column(name = "infoArquivo", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String infoArquivo;


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
    public Arquivo(){
    }

    /**
    * Obtém idArquivo
    * return idArquivo
    * @generated
    */
    public java.lang.String getIdArquivo() {
        return this.idArquivo;
    }

    /**
    * Define idArquivo
    * @param idArquivo idArquivo
    * @generated
    */
    public Arquivo setIdArquivo(java.lang.String idArquivo) {
        this.idArquivo = idArquivo;
        return this;
    }
    /**
    * Obtém arquivo
    * return arquivo
    * @generated
    */
    public byte[] getArquivo() {
        return this.arquivo;
    }

    /**
    * Define arquivo
    * @param arquivo arquivo
    * @generated
    */
    public Arquivo setArquivo(byte[] arquivo) {
        this.arquivo = arquivo;
        return this;
    }
    /**
    * Obtém infoArquivo
    * return infoArquivo
    * @generated
    */
    public java.lang.String getInfoArquivo() {
        return this.infoArquivo;
    }

    /**
    * Define infoArquivo
    * @param infoArquivo infoArquivo
    * @generated
    */
    public Arquivo setInfoArquivo(java.lang.String infoArquivo) {
        this.infoArquivo = infoArquivo;
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
    public Arquivo setReserva(Reserva reserva) {
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
Arquivo object = (Arquivo)obj;
        if (idArquivo != null ? !idArquivo.equals(object.idArquivo) : object.idArquivo != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((idArquivo == null) ? 0 : idArquivo.hashCode());
        return result;
    }

}