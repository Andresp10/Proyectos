/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebServices;

import Controlador.AfiliadoController;
import Controlador.FuncionarioController;
import Controlador.PolizaController;
import Controlador.SiniestroController;
import Modelo.Afiliado;
import Modelo.Funcionario;
import Modelo.Poliza;
import Modelo.Siniestro;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Andres
 */
@WebService(serviceName = "WSSeguros")
public class WSSeguros {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Cliente")
    public int Cliente(@WebParam(name = "Accion") String Accion, @WebParam(name = "Documento") String Documento, @WebParam(name = "Nombre") String Nomre, @WebParam(name = "Apellido") String Apellido, @WebParam(name = "FechaNacimiento") String FechaNacimiento, @WebParam(name = "Genero") String Genero, @WebParam(name = "Departamento") String Departamento, @WebParam(name = "Ciudad") String Ciudad, @WebParam(name = "Direccion") String Direccion, @WebParam(name = "EstadoCivil") String EstadoCivil, @WebParam(name = "Estado") String Estado) {
        
        try {
            int result = 0;
            
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-mm-dd");
            Date fecha = formato.parse(FechaNacimiento);
            Afiliado objAfiliado = new Afiliado(Documento, Nomre, Apellido, fecha, Genero, Departamento, Ciudad, Direccion, EstadoCivil, Estado);
            AfiliadoController objAfiliadoController = new AfiliadoController();
            if (Accion.equals("Crear")) {
                
                result = objAfiliadoController.RegistroAfiliado(objAfiliado);
            }else{
                String action[] = Accion.split("/");
                int idAfiliado = objAfiliadoController.BuscarIdAfiliado(action[1]);
                objAfiliado.setIdAfiliado(idAfiliado);
                result = objAfiliadoController.EditarAfiliado(objAfiliado);
            }
            
            return result;
        } catch (ParseException ex) {
            Logger.getLogger(WSSeguros.class.getName()).log(Level.SEVERE, null, ex);
            return 500;
        }
        
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Login")
    public String Login(@WebParam(name = "Usuario") String Usuario, @WebParam(name = "Contrasenia") String Contrasenia) {
        
        Funcionario objFuncionario = new Funcionario();
        objFuncionario.setUsuario(Usuario);
        objFuncionario.setContrasenia(Contrasenia);
        
        FuncionarioController objFuncionarioController = new FuncionarioController();
        String result = objFuncionarioController.Login(objFuncionario);
        
        return result;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Consulta")
    public List<Object[]> Consulta(@WebParam(name = "idAfiliado") int idAfiliado) {
        
        AfiliadoController objAfiliadoController = new AfiliadoController();
        List<Object[]>listaAfiliado = objAfiliadoController.VerPerfilAfiliado(idAfiliado);
        
        return listaAfiliado;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ConsultaAll")
    public List<Afiliado> ConsultaAll() {
        AfiliadoController objAfiliadoController = new AfiliadoController();
        List<Afiliado>listaAfiliado = objAfiliadoController.GetAllAfiliados();
        return listaAfiliado;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "FuncionarioCreate")
    public int FuncionarioCreate(@WebParam(name = "Documento") String Documento, @WebParam(name = "Nombre") String Nombre, @WebParam(name = "Apellido") String Apellido, @WebParam(name = "Usuario") String Usuario, @WebParam(name = "Contrasenia") String Contrasenia, @WebParam(name = "Tipo") String Tipo) {
        
        Funcionario objFuncionario = new Funcionario(Documento, Nombre, Apellido, Usuario, Contrasenia, Tipo);
        FuncionarioController objFuncionarioController = new FuncionarioController();
        int result = objFuncionarioController.RegistroFuncionario(objFuncionario);
        
        return result;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "PolizaCreate")
    public int PolizaCreate(@WebParam(name = "Tipo") String Tipo, @WebParam(name = "Valor") double Valor, @WebParam(name = "Afiliado") int Afiliado) {
        Afiliado objAfiliado = new Afiliado();
        objAfiliado.setIdAfiliado(Afiliado);
        Poliza objPoliza = new Poliza(Tipo, Valor, objAfiliado);
        PolizaController objPolizaController = new PolizaController();
        int result = objPolizaController.RegistroPoliza(objPoliza);
        
        return result;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "SiniestroCreate")
    public int SiniestroCreate(@WebParam(name = "Fecha") String Fecha, @WebParam(name = "Tipo") String Tipo, @WebParam(name = "Afiliado") int Afiliado) {
        
        try {
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-mm-dd");
            Date fecha = formato.parse(Fecha);
            Afiliado objAfiliado = new Afiliado();
            objAfiliado.setIdAfiliado(Afiliado);
            Siniestro objSiniestro = new Siniestro(Afiliado, fecha, Tipo, objAfiliado);
            
            SiniestroController objSiniestroController = new SiniestroController();
            int result = objSiniestroController.RegistroSiniestro(objSiniestro);
            return result;
        } catch (ParseException ex) {
            Logger.getLogger(WSSeguros.class.getName()).log(Level.SEVERE, null, ex);
            return 500;
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "FuncionarioAll")
    public List<Funcionario> FuncionarioAll() {
        FuncionarioController objFuncionarioController = new FuncionarioController();
        List<Funcionario>listaFunacionario = objFuncionarioController.GetAllFuncionario();
        return listaFunacionario;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ClienteBuscar")
    public int ClienteBuscar(@WebParam(name = "Documento") String Documento) {
        //TODO write your implementation code here:
        AfiliadoController objAfiliadoController = new AfiliadoController();
        int result = objAfiliadoController.BuscarIdAfiliado(Documento);
        return result;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "PolizaBuscar")
    public List<Poliza> PolizaBuscar(@WebParam(name = "idAfiliado") int idAfiliado) {
        //TODO write your implementation code here:
        PolizaController objPolizaController = new PolizaController();
        List<Poliza>listaPoliza = objPolizaController.BuscarPoliza(idAfiliado);
        return listaPoliza;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "SiniestroBuscar")
    public List<Siniestro> SiniestroBuscar(@WebParam(name = "idAfiliado") int idAfiliado) {
        //TODO write your implementation code here:
        SiniestroController objSiniestroController = new SiniestroController();
        List<Siniestro>listasiniestro = objSiniestroController.BuscarSiniestro(idAfiliado);
        return listasiniestro;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "BuscarDatosCliente")
    public List<Afiliado> BuscarDatosCliente(@WebParam(name = "idAfiliado") int idAfiliado) {
        //TODO write your implementation code here:
        AfiliadoController objAfiliadoController = new AfiliadoController();
        List<Afiliado>listaAfiliado = objAfiliadoController.buscarDatosAfiliado(idAfiliado);
        return listaAfiliado;
    }

    /**
     * Web service operation
     * @return 
     */
    @WebMethod(operationName = "SiniestroAll")
    public List<Siniestro> SiniestroAll() {
        //TODO write your implementation code here:
        SiniestroController objSiniestroController = new SiniestroController();
        List<Siniestro>listaSiniestro = objSiniestroController.SiniestroAll();
        for (Siniestro siniestro : listaSiniestro) {
            System.out.println(siniestro.getAfiliado());
        }
        return listaSiniestro;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "EditarSiniestro")
    public int EditarSiniestro(Siniestro objsiniestro) {
        //TODO write your implementation code here:
        SiniestroController objsiniestroController = new SiniestroController();
        int result = objsiniestroController.SiniestroEditar(objsiniestro);
        return result;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "EditarPoliza")
    public int EditarPoliza(@WebParam(name = "Tipo") String Tipo, @WebParam(name = "Valor") double Valor, @WebParam(name = "Afiliado") int Afiliado) {
        //TODO write your implementation code here:
        Afiliado objAfiliado = new Afiliado();
        objAfiliado.setIdAfiliado(Afiliado);
        Poliza objPoliza = new Poliza(Tipo, Valor, objAfiliado);
        PolizaController objPolizaController = new PolizaController();
        int result = objPolizaController.PolizaEditar(objPoliza);
        return result;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "GetDatosFuncionaroi")
    public List<Funcionario> GetDatosFuncionaroi(@WebParam(name = "Usuario") String Usuario, @WebParam(name = "Contrasenia") String Contrasenia) {
        //TODO write your implementation code here:
        FuncionarioController objFuncionarioController = new FuncionarioController();
        List<Funcionario> listaFuncionario = objFuncionarioController.getDatosFuncionario(Usuario, Contrasenia);
        return listaFuncionario;
    }
}
