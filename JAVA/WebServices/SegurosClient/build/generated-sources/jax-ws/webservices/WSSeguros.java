
package webservices;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import net.java.dev.jaxb.array.AnyTypeArray;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WSSeguros", targetNamespace = "http://WebServices/")
@XmlSeeAlso({
    net.java.dev.jaxb.array.ObjectFactory.class,
    webservices.ObjectFactory.class
})
public interface WSSeguros {


    /**
     * 
     * @param tipo
     * @param apellido
     * @param documento
     * @param usuario
     * @param contrasenia
     * @param nombre
     * @return
     *     returns int
     */
    @WebMethod(operationName = "FuncionarioCreate")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "FuncionarioCreate", targetNamespace = "http://WebServices/", className = "webservices.FuncionarioCreate")
    @ResponseWrapper(localName = "FuncionarioCreateResponse", targetNamespace = "http://WebServices/", className = "webservices.FuncionarioCreateResponse")
    @Action(input = "http://WebServices/WSSeguros/FuncionarioCreateRequest", output = "http://WebServices/WSSeguros/FuncionarioCreateResponse")
    public int funcionarioCreate(
        @WebParam(name = "Documento", targetNamespace = "")
        String documento,
        @WebParam(name = "Nombre", targetNamespace = "")
        String nombre,
        @WebParam(name = "Apellido", targetNamespace = "")
        String apellido,
        @WebParam(name = "Usuario", targetNamespace = "")
        String usuario,
        @WebParam(name = "Contrasenia", targetNamespace = "")
        String contrasenia,
        @WebParam(name = "Tipo", targetNamespace = "")
        String tipo);

    /**
     * 
     * @param usuario
     * @param contrasenia
     * @return
     *     returns java.util.List<webservices.Funcionario>
     */
    @WebMethod(operationName = "GetDatosFuncionaroi")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "GetDatosFuncionaroi", targetNamespace = "http://WebServices/", className = "webservices.GetDatosFuncionaroi")
    @ResponseWrapper(localName = "GetDatosFuncionaroiResponse", targetNamespace = "http://WebServices/", className = "webservices.GetDatosFuncionaroiResponse")
    @Action(input = "http://WebServices/WSSeguros/GetDatosFuncionaroiRequest", output = "http://WebServices/WSSeguros/GetDatosFuncionaroiResponse")
    public List<Funcionario> getDatosFuncionaroi(
        @WebParam(name = "Usuario", targetNamespace = "")
        String usuario,
        @WebParam(name = "Contrasenia", targetNamespace = "")
        String contrasenia);

    /**
     * 
     * @param idAfiliado
     * @return
     *     returns java.util.List<webservices.Afiliado>
     */
    @WebMethod(operationName = "BuscarDatosCliente")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "BuscarDatosCliente", targetNamespace = "http://WebServices/", className = "webservices.BuscarDatosCliente")
    @ResponseWrapper(localName = "BuscarDatosClienteResponse", targetNamespace = "http://WebServices/", className = "webservices.BuscarDatosClienteResponse")
    @Action(input = "http://WebServices/WSSeguros/BuscarDatosClienteRequest", output = "http://WebServices/WSSeguros/BuscarDatosClienteResponse")
    public List<Afiliado> buscarDatosCliente(
        @WebParam(name = "idAfiliado", targetNamespace = "")
        int idAfiliado);

    /**
     * 
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod(operationName = "EditarSiniestro")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "EditarSiniestro", targetNamespace = "http://WebServices/", className = "webservices.EditarSiniestro")
    @ResponseWrapper(localName = "EditarSiniestroResponse", targetNamespace = "http://WebServices/", className = "webservices.EditarSiniestroResponse")
    @Action(input = "http://WebServices/WSSeguros/EditarSiniestroRequest", output = "http://WebServices/WSSeguros/EditarSiniestroResponse")
    public int editarSiniestro(
        @WebParam(name = "arg0", targetNamespace = "")
        Siniestro arg0);

    /**
     * 
     * @param documento
     * @return
     *     returns int
     */
    @WebMethod(operationName = "ClienteBuscar")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ClienteBuscar", targetNamespace = "http://WebServices/", className = "webservices.ClienteBuscar")
    @ResponseWrapper(localName = "ClienteBuscarResponse", targetNamespace = "http://WebServices/", className = "webservices.ClienteBuscarResponse")
    @Action(input = "http://WebServices/WSSeguros/ClienteBuscarRequest", output = "http://WebServices/WSSeguros/ClienteBuscarResponse")
    public int clienteBuscar(
        @WebParam(name = "Documento", targetNamespace = "")
        String documento);

    /**
     * 
     * @param fecha
     * @param tipo
     * @param afiliado
     * @return
     *     returns int
     */
    @WebMethod(operationName = "SiniestroCreate")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "SiniestroCreate", targetNamespace = "http://WebServices/", className = "webservices.SiniestroCreate")
    @ResponseWrapper(localName = "SiniestroCreateResponse", targetNamespace = "http://WebServices/", className = "webservices.SiniestroCreateResponse")
    @Action(input = "http://WebServices/WSSeguros/SiniestroCreateRequest", output = "http://WebServices/WSSeguros/SiniestroCreateResponse")
    public int siniestroCreate(
        @WebParam(name = "Fecha", targetNamespace = "")
        String fecha,
        @WebParam(name = "Tipo", targetNamespace = "")
        String tipo,
        @WebParam(name = "Afiliado", targetNamespace = "")
        int afiliado);

    /**
     * 
     * @param idAfiliado
     * @return
     *     returns java.util.List<net.java.dev.jaxb.array.AnyTypeArray>
     */
    @WebMethod(operationName = "Consulta")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Consulta", targetNamespace = "http://WebServices/", className = "webservices.Consulta")
    @ResponseWrapper(localName = "ConsultaResponse", targetNamespace = "http://WebServices/", className = "webservices.ConsultaResponse")
    @Action(input = "http://WebServices/WSSeguros/ConsultaRequest", output = "http://WebServices/WSSeguros/ConsultaResponse")
    public List<AnyTypeArray> consulta(
        @WebParam(name = "idAfiliado", targetNamespace = "")
        int idAfiliado);

    /**
     * 
     * @return
     *     returns java.util.List<webservices.Afiliado>
     */
    @WebMethod(operationName = "ConsultaAll")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ConsultaAll", targetNamespace = "http://WebServices/", className = "webservices.ConsultaAll")
    @ResponseWrapper(localName = "ConsultaAllResponse", targetNamespace = "http://WebServices/", className = "webservices.ConsultaAllResponse")
    @Action(input = "http://WebServices/WSSeguros/ConsultaAllRequest", output = "http://WebServices/WSSeguros/ConsultaAllResponse")
    public List<Afiliado> consultaAll();

    /**
     * 
     * @param idAfiliado
     * @return
     *     returns java.util.List<webservices.Poliza>
     */
    @WebMethod(operationName = "PolizaBuscar")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "PolizaBuscar", targetNamespace = "http://WebServices/", className = "webservices.PolizaBuscar")
    @ResponseWrapper(localName = "PolizaBuscarResponse", targetNamespace = "http://WebServices/", className = "webservices.PolizaBuscarResponse")
    @Action(input = "http://WebServices/WSSeguros/PolizaBuscarRequest", output = "http://WebServices/WSSeguros/PolizaBuscarResponse")
    public List<Poliza> polizaBuscar(
        @WebParam(name = "idAfiliado", targetNamespace = "")
        int idAfiliado);

    /**
     * 
     * @param tipo
     * @param afiliado
     * @param valor
     * @return
     *     returns int
     */
    @WebMethod(operationName = "EditarPoliza")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "EditarPoliza", targetNamespace = "http://WebServices/", className = "webservices.EditarPoliza")
    @ResponseWrapper(localName = "EditarPolizaResponse", targetNamespace = "http://WebServices/", className = "webservices.EditarPolizaResponse")
    @Action(input = "http://WebServices/WSSeguros/EditarPolizaRequest", output = "http://WebServices/WSSeguros/EditarPolizaResponse")
    public int editarPoliza(
        @WebParam(name = "Tipo", targetNamespace = "")
        String tipo,
        @WebParam(name = "Valor", targetNamespace = "")
        double valor,
        @WebParam(name = "Afiliado", targetNamespace = "")
        int afiliado);

    /**
     * 
     * @param accion
     * @param estado
     * @param fechaNacimiento
     * @param ciudad
     * @param apellido
     * @param genero
     * @param direccion
     * @param documento
     * @param departamento
     * @param estadoCivil
     * @param nombre
     * @return
     *     returns int
     */
    @WebMethod(operationName = "Cliente")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Cliente", targetNamespace = "http://WebServices/", className = "webservices.Cliente")
    @ResponseWrapper(localName = "ClienteResponse", targetNamespace = "http://WebServices/", className = "webservices.ClienteResponse")
    @Action(input = "http://WebServices/WSSeguros/ClienteRequest", output = "http://WebServices/WSSeguros/ClienteResponse")
    public int cliente(
        @WebParam(name = "Accion", targetNamespace = "")
        String accion,
        @WebParam(name = "Documento", targetNamespace = "")
        String documento,
        @WebParam(name = "Nombre", targetNamespace = "")
        String nombre,
        @WebParam(name = "Apellido", targetNamespace = "")
        String apellido,
        @WebParam(name = "FechaNacimiento", targetNamespace = "")
        String fechaNacimiento,
        @WebParam(name = "Genero", targetNamespace = "")
        String genero,
        @WebParam(name = "Departamento", targetNamespace = "")
        String departamento,
        @WebParam(name = "Ciudad", targetNamespace = "")
        String ciudad,
        @WebParam(name = "Direccion", targetNamespace = "")
        String direccion,
        @WebParam(name = "EstadoCivil", targetNamespace = "")
        String estadoCivil,
        @WebParam(name = "Estado", targetNamespace = "")
        String estado);

    /**
     * 
     * @return
     *     returns java.util.List<webservices.Siniestro>
     */
    @WebMethod(operationName = "SiniestroAll")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "SiniestroAll", targetNamespace = "http://WebServices/", className = "webservices.SiniestroAll")
    @ResponseWrapper(localName = "SiniestroAllResponse", targetNamespace = "http://WebServices/", className = "webservices.SiniestroAllResponse")
    @Action(input = "http://WebServices/WSSeguros/SiniestroAllRequest", output = "http://WebServices/WSSeguros/SiniestroAllResponse")
    public List<Siniestro> siniestroAll();

    /**
     * 
     * @param idAfiliado
     * @return
     *     returns java.util.List<webservices.Siniestro>
     */
    @WebMethod(operationName = "SiniestroBuscar")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "SiniestroBuscar", targetNamespace = "http://WebServices/", className = "webservices.SiniestroBuscar")
    @ResponseWrapper(localName = "SiniestroBuscarResponse", targetNamespace = "http://WebServices/", className = "webservices.SiniestroBuscarResponse")
    @Action(input = "http://WebServices/WSSeguros/SiniestroBuscarRequest", output = "http://WebServices/WSSeguros/SiniestroBuscarResponse")
    public List<Siniestro> siniestroBuscar(
        @WebParam(name = "idAfiliado", targetNamespace = "")
        int idAfiliado);

    /**
     * 
     * @return
     *     returns java.util.List<webservices.Funcionario>
     */
    @WebMethod(operationName = "FuncionarioAll")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "FuncionarioAll", targetNamespace = "http://WebServices/", className = "webservices.FuncionarioAll")
    @ResponseWrapper(localName = "FuncionarioAllResponse", targetNamespace = "http://WebServices/", className = "webservices.FuncionarioAllResponse")
    @Action(input = "http://WebServices/WSSeguros/FuncionarioAllRequest", output = "http://WebServices/WSSeguros/FuncionarioAllResponse")
    public List<Funcionario> funcionarioAll();

    /**
     * 
     * @param usuario
     * @param contrasenia
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Login")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Login", targetNamespace = "http://WebServices/", className = "webservices.Login")
    @ResponseWrapper(localName = "LoginResponse", targetNamespace = "http://WebServices/", className = "webservices.LoginResponse")
    @Action(input = "http://WebServices/WSSeguros/LoginRequest", output = "http://WebServices/WSSeguros/LoginResponse")
    public String login(
        @WebParam(name = "Usuario", targetNamespace = "")
        String usuario,
        @WebParam(name = "Contrasenia", targetNamespace = "")
        String contrasenia);

    /**
     * 
     * @param tipo
     * @param afiliado
     * @param valor
     * @return
     *     returns int
     */
    @WebMethod(operationName = "PolizaCreate")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "PolizaCreate", targetNamespace = "http://WebServices/", className = "webservices.PolizaCreate")
    @ResponseWrapper(localName = "PolizaCreateResponse", targetNamespace = "http://WebServices/", className = "webservices.PolizaCreateResponse")
    @Action(input = "http://WebServices/WSSeguros/PolizaCreateRequest", output = "http://WebServices/WSSeguros/PolizaCreateResponse")
    public int polizaCreate(
        @WebParam(name = "Tipo", targetNamespace = "")
        String tipo,
        @WebParam(name = "Valor", targetNamespace = "")
        double valor,
        @WebParam(name = "Afiliado", targetNamespace = "")
        int afiliado);

}
