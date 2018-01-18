package Modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Poliza")
public class Poliza {
    
    @Id
    @Column(name="idPoliza")
    private int idPoliza;
    
    @Column(name="Tipo")
    private String Tipo;
    
    @Column(name="Valor")
    private double Valor;
    
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="Afiliado")
    private Afiliado Afiliado;

    public Poliza() {
    }

    public Poliza(String Tipo, double Valor, Afiliado Afiliado) {
        this.idPoliza = idPoliza;
        this.Tipo = Tipo;
        this.Valor = Valor;
        this.Afiliado = Afiliado;
    }

    public int getIdPoliza() {
        return idPoliza;
    }

    public void setIdPoliza(int idPoliza) {
        this.idPoliza = idPoliza;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }

    public Afiliado getAfiliado() {
        return Afiliado;
    }

    public void setAfiliado(Afiliado Afiliado) {
        this.Afiliado = Afiliado;
    }
    
    
    
}
