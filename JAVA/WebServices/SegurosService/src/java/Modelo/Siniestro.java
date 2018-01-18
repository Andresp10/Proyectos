package Modelo;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Siniestro")
public class Siniestro {
    
    @Id
    @Column(name="idSiniestro")
    private int idSiniestro;
    
    @Column(name="Fecha")
    private Date Fecha;
    
    @Column(name="Tipo")
    private String Tipo;
    
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="Afiliado")
    private Afiliado Afiliado;

    public Siniestro() {
    }

    public Siniestro(int idSiniestro, Date Fecha, String Tipo, Afiliado Afiliado) {
        this.idSiniestro = idSiniestro;
        this.Fecha = Fecha;
        this.Tipo = Tipo;
        this.Afiliado = Afiliado;
    }

    public int getIdSiniestro() {
        return idSiniestro;
    }

    public void setIdSiniestro(int idSiniestro) {
        this.idSiniestro = idSiniestro;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public Afiliado getAfiliado() {
        return Afiliado;
    }

    public void setAfiliado(Afiliado Afiliado) {
        this.Afiliado = Afiliado;
    }
    @Override
    public String toString(){
    
        return String.valueOf(this.idSiniestro);
    
    }
    
}
