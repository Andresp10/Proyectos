package Modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Funcionario")
public class Funcionario {
    
    @Id
    @Column(name="idFuncionario")
    private int idFuncionario;
    
    @Column(name="Documento")
    private String Documento;
    
    @Column(name="Nombre")
    private String Nombre;
    
    @Column(name="APellido")
    private String APellido;
    
    @Column(name="Usuario")
    private String Usuario;
    
    @Column(name="Contrasenia")
    private String Contrasenia;
    
    @Column(name="Tipo")
    private String Tipo;

    public Funcionario() {
    }

    public Funcionario(String Documento, String Nombre, String APellido, String Usuario, String Contrasenia, String Tipo) {
        this.Documento = Documento;
        this.Nombre = Nombre;
        this.APellido = APellido;
        this.Usuario = Usuario;
        this.Contrasenia = Contrasenia;
        this.Tipo = Tipo;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getDocumento() {
        return Documento;
    }

    public void setDocumento(String Documento) {
        this.Documento = Documento;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getAPellido() {
        return APellido;
    }

    public void setAPellido(String APellido) {
        this.APellido = APellido;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContrasenia() {
        return Contrasenia;
    }

    public void setContrasenia(String Contrasenia) {
        this.Contrasenia = Contrasenia;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    
    
}
