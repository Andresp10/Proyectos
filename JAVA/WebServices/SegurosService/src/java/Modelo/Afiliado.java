
package Modelo;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Afiliado")
public class Afiliado {
    
    @Id
    @Column(name="idAfiliado")
    private int idAfiliado;
    
    @Column(name="Documento")
    private String Documento;
    
    @Column(name="Nombre")
    private String Nombre;
    
    @Column(name="Apellido")
    private String Apellido;
    
    @Column(name="FechaNacimiento")
    private Date FechaNacimiento;
    
    @Column(name="Genero")
    private String Genero;
    
    @Column(name="Departamento")
    private String Departamento;
    
    @Column(name="Ciudad")
    private String Ciudad;
    
    @Column(name="Direccion")
    private String Direccion;
    
    @Column(name="EstadoCivil")
    private String EstadoCivil;
    
    @Column(name="Estado")
    private String Estado;

    public Afiliado() {
    }

    public Afiliado(String Documento, String Nombre, String Apellido, Date FechaNacimiento, String Genero, String Departamento, String Ciudad, String Direccion, String EstadoCivil, String Estado) {
        this.idAfiliado = idAfiliado;
        this.Documento = Documento;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.FechaNacimiento = FechaNacimiento;
        this.Genero = Genero;
        this.Departamento = Departamento;
        this.Ciudad = Ciudad;
        this.Direccion = Direccion;
        this.EstadoCivil = EstadoCivil;
        this.Estado = Estado;
    }

    public int getIdAfiliado() {
        return idAfiliado;
    }

    public void setIdAfiliado(int idAfiliado) {
        this.idAfiliado = idAfiliado;
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

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getEstadoCivil() {
        return EstadoCivil;
    }

    public void setEstadoCivil(String EstadoCivil) {
        this.EstadoCivil = EstadoCivil;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    @Override
    public String toString(){
    
        return String.valueOf(this.idAfiliado);
    
    } 
    
}
