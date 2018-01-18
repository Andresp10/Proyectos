
package webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservices package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BuscarDatosCliente_QNAME = new QName("http://WebServices/", "BuscarDatosCliente");
    private final static QName _BuscarDatosClienteResponse_QNAME = new QName("http://WebServices/", "BuscarDatosClienteResponse");
    private final static QName _Cliente_QNAME = new QName("http://WebServices/", "Cliente");
    private final static QName _ClienteBuscar_QNAME = new QName("http://WebServices/", "ClienteBuscar");
    private final static QName _ClienteBuscarResponse_QNAME = new QName("http://WebServices/", "ClienteBuscarResponse");
    private final static QName _ClienteResponse_QNAME = new QName("http://WebServices/", "ClienteResponse");
    private final static QName _Consulta_QNAME = new QName("http://WebServices/", "Consulta");
    private final static QName _ConsultaAll_QNAME = new QName("http://WebServices/", "ConsultaAll");
    private final static QName _ConsultaAllResponse_QNAME = new QName("http://WebServices/", "ConsultaAllResponse");
    private final static QName _ConsultaResponse_QNAME = new QName("http://WebServices/", "ConsultaResponse");
    private final static QName _EditarPoliza_QNAME = new QName("http://WebServices/", "EditarPoliza");
    private final static QName _EditarPolizaResponse_QNAME = new QName("http://WebServices/", "EditarPolizaResponse");
    private final static QName _EditarSiniestro_QNAME = new QName("http://WebServices/", "EditarSiniestro");
    private final static QName _EditarSiniestroResponse_QNAME = new QName("http://WebServices/", "EditarSiniestroResponse");
    private final static QName _FuncionarioAll_QNAME = new QName("http://WebServices/", "FuncionarioAll");
    private final static QName _FuncionarioAllResponse_QNAME = new QName("http://WebServices/", "FuncionarioAllResponse");
    private final static QName _FuncionarioCreate_QNAME = new QName("http://WebServices/", "FuncionarioCreate");
    private final static QName _FuncionarioCreateResponse_QNAME = new QName("http://WebServices/", "FuncionarioCreateResponse");
    private final static QName _GetDatosFuncionaroi_QNAME = new QName("http://WebServices/", "GetDatosFuncionaroi");
    private final static QName _GetDatosFuncionaroiResponse_QNAME = new QName("http://WebServices/", "GetDatosFuncionaroiResponse");
    private final static QName _Login_QNAME = new QName("http://WebServices/", "Login");
    private final static QName _LoginResponse_QNAME = new QName("http://WebServices/", "LoginResponse");
    private final static QName _PolizaBuscar_QNAME = new QName("http://WebServices/", "PolizaBuscar");
    private final static QName _PolizaBuscarResponse_QNAME = new QName("http://WebServices/", "PolizaBuscarResponse");
    private final static QName _PolizaCreate_QNAME = new QName("http://WebServices/", "PolizaCreate");
    private final static QName _PolizaCreateResponse_QNAME = new QName("http://WebServices/", "PolizaCreateResponse");
    private final static QName _SiniestroAll_QNAME = new QName("http://WebServices/", "SiniestroAll");
    private final static QName _SiniestroAllResponse_QNAME = new QName("http://WebServices/", "SiniestroAllResponse");
    private final static QName _SiniestroBuscar_QNAME = new QName("http://WebServices/", "SiniestroBuscar");
    private final static QName _SiniestroBuscarResponse_QNAME = new QName("http://WebServices/", "SiniestroBuscarResponse");
    private final static QName _SiniestroCreate_QNAME = new QName("http://WebServices/", "SiniestroCreate");
    private final static QName _SiniestroCreateResponse_QNAME = new QName("http://WebServices/", "SiniestroCreateResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuscarDatosCliente }
     * 
     */
    public BuscarDatosCliente createBuscarDatosCliente() {
        return new BuscarDatosCliente();
    }

    /**
     * Create an instance of {@link BuscarDatosClienteResponse }
     * 
     */
    public BuscarDatosClienteResponse createBuscarDatosClienteResponse() {
        return new BuscarDatosClienteResponse();
    }

    /**
     * Create an instance of {@link Cliente }
     * 
     */
    public Cliente createCliente() {
        return new Cliente();
    }

    /**
     * Create an instance of {@link ClienteBuscar }
     * 
     */
    public ClienteBuscar createClienteBuscar() {
        return new ClienteBuscar();
    }

    /**
     * Create an instance of {@link ClienteBuscarResponse }
     * 
     */
    public ClienteBuscarResponse createClienteBuscarResponse() {
        return new ClienteBuscarResponse();
    }

    /**
     * Create an instance of {@link ClienteResponse }
     * 
     */
    public ClienteResponse createClienteResponse() {
        return new ClienteResponse();
    }

    /**
     * Create an instance of {@link Consulta }
     * 
     */
    public Consulta createConsulta() {
        return new Consulta();
    }

    /**
     * Create an instance of {@link ConsultaAll }
     * 
     */
    public ConsultaAll createConsultaAll() {
        return new ConsultaAll();
    }

    /**
     * Create an instance of {@link ConsultaAllResponse }
     * 
     */
    public ConsultaAllResponse createConsultaAllResponse() {
        return new ConsultaAllResponse();
    }

    /**
     * Create an instance of {@link ConsultaResponse }
     * 
     */
    public ConsultaResponse createConsultaResponse() {
        return new ConsultaResponse();
    }

    /**
     * Create an instance of {@link EditarPoliza }
     * 
     */
    public EditarPoliza createEditarPoliza() {
        return new EditarPoliza();
    }

    /**
     * Create an instance of {@link EditarPolizaResponse }
     * 
     */
    public EditarPolizaResponse createEditarPolizaResponse() {
        return new EditarPolizaResponse();
    }

    /**
     * Create an instance of {@link EditarSiniestro }
     * 
     */
    public EditarSiniestro createEditarSiniestro() {
        return new EditarSiniestro();
    }

    /**
     * Create an instance of {@link EditarSiniestroResponse }
     * 
     */
    public EditarSiniestroResponse createEditarSiniestroResponse() {
        return new EditarSiniestroResponse();
    }

    /**
     * Create an instance of {@link FuncionarioAll }
     * 
     */
    public FuncionarioAll createFuncionarioAll() {
        return new FuncionarioAll();
    }

    /**
     * Create an instance of {@link FuncionarioAllResponse }
     * 
     */
    public FuncionarioAllResponse createFuncionarioAllResponse() {
        return new FuncionarioAllResponse();
    }

    /**
     * Create an instance of {@link FuncionarioCreate }
     * 
     */
    public FuncionarioCreate createFuncionarioCreate() {
        return new FuncionarioCreate();
    }

    /**
     * Create an instance of {@link FuncionarioCreateResponse }
     * 
     */
    public FuncionarioCreateResponse createFuncionarioCreateResponse() {
        return new FuncionarioCreateResponse();
    }

    /**
     * Create an instance of {@link GetDatosFuncionaroi }
     * 
     */
    public GetDatosFuncionaroi createGetDatosFuncionaroi() {
        return new GetDatosFuncionaroi();
    }

    /**
     * Create an instance of {@link GetDatosFuncionaroiResponse }
     * 
     */
    public GetDatosFuncionaroiResponse createGetDatosFuncionaroiResponse() {
        return new GetDatosFuncionaroiResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link PolizaBuscar }
     * 
     */
    public PolizaBuscar createPolizaBuscar() {
        return new PolizaBuscar();
    }

    /**
     * Create an instance of {@link PolizaBuscarResponse }
     * 
     */
    public PolizaBuscarResponse createPolizaBuscarResponse() {
        return new PolizaBuscarResponse();
    }

    /**
     * Create an instance of {@link PolizaCreate }
     * 
     */
    public PolizaCreate createPolizaCreate() {
        return new PolizaCreate();
    }

    /**
     * Create an instance of {@link PolizaCreateResponse }
     * 
     */
    public PolizaCreateResponse createPolizaCreateResponse() {
        return new PolizaCreateResponse();
    }

    /**
     * Create an instance of {@link SiniestroAll }
     * 
     */
    public SiniestroAll createSiniestroAll() {
        return new SiniestroAll();
    }

    /**
     * Create an instance of {@link SiniestroAllResponse }
     * 
     */
    public SiniestroAllResponse createSiniestroAllResponse() {
        return new SiniestroAllResponse();
    }

    /**
     * Create an instance of {@link SiniestroBuscar }
     * 
     */
    public SiniestroBuscar createSiniestroBuscar() {
        return new SiniestroBuscar();
    }

    /**
     * Create an instance of {@link SiniestroBuscarResponse }
     * 
     */
    public SiniestroBuscarResponse createSiniestroBuscarResponse() {
        return new SiniestroBuscarResponse();
    }

    /**
     * Create an instance of {@link SiniestroCreate }
     * 
     */
    public SiniestroCreate createSiniestroCreate() {
        return new SiniestroCreate();
    }

    /**
     * Create an instance of {@link SiniestroCreateResponse }
     * 
     */
    public SiniestroCreateResponse createSiniestroCreateResponse() {
        return new SiniestroCreateResponse();
    }

    /**
     * Create an instance of {@link Siniestro }
     * 
     */
    public Siniestro createSiniestro() {
        return new Siniestro();
    }

    /**
     * Create an instance of {@link Afiliado }
     * 
     */
    public Afiliado createAfiliado() {
        return new Afiliado();
    }

    /**
     * Create an instance of {@link Funcionario }
     * 
     */
    public Funcionario createFuncionario() {
        return new Funcionario();
    }

    /**
     * Create an instance of {@link Poliza }
     * 
     */
    public Poliza createPoliza() {
        return new Poliza();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarDatosCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "BuscarDatosCliente")
    public JAXBElement<BuscarDatosCliente> createBuscarDatosCliente(BuscarDatosCliente value) {
        return new JAXBElement<BuscarDatosCliente>(_BuscarDatosCliente_QNAME, BuscarDatosCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarDatosClienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "BuscarDatosClienteResponse")
    public JAXBElement<BuscarDatosClienteResponse> createBuscarDatosClienteResponse(BuscarDatosClienteResponse value) {
        return new JAXBElement<BuscarDatosClienteResponse>(_BuscarDatosClienteResponse_QNAME, BuscarDatosClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "Cliente")
    public JAXBElement<Cliente> createCliente(Cliente value) {
        return new JAXBElement<Cliente>(_Cliente_QNAME, Cliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClienteBuscar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "ClienteBuscar")
    public JAXBElement<ClienteBuscar> createClienteBuscar(ClienteBuscar value) {
        return new JAXBElement<ClienteBuscar>(_ClienteBuscar_QNAME, ClienteBuscar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClienteBuscarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "ClienteBuscarResponse")
    public JAXBElement<ClienteBuscarResponse> createClienteBuscarResponse(ClienteBuscarResponse value) {
        return new JAXBElement<ClienteBuscarResponse>(_ClienteBuscarResponse_QNAME, ClienteBuscarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "ClienteResponse")
    public JAXBElement<ClienteResponse> createClienteResponse(ClienteResponse value) {
        return new JAXBElement<ClienteResponse>(_ClienteResponse_QNAME, ClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Consulta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "Consulta")
    public JAXBElement<Consulta> createConsulta(Consulta value) {
        return new JAXBElement<Consulta>(_Consulta_QNAME, Consulta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "ConsultaAll")
    public JAXBElement<ConsultaAll> createConsultaAll(ConsultaAll value) {
        return new JAXBElement<ConsultaAll>(_ConsultaAll_QNAME, ConsultaAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "ConsultaAllResponse")
    public JAXBElement<ConsultaAllResponse> createConsultaAllResponse(ConsultaAllResponse value) {
        return new JAXBElement<ConsultaAllResponse>(_ConsultaAllResponse_QNAME, ConsultaAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "ConsultaResponse")
    public JAXBElement<ConsultaResponse> createConsultaResponse(ConsultaResponse value) {
        return new JAXBElement<ConsultaResponse>(_ConsultaResponse_QNAME, ConsultaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditarPoliza }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "EditarPoliza")
    public JAXBElement<EditarPoliza> createEditarPoliza(EditarPoliza value) {
        return new JAXBElement<EditarPoliza>(_EditarPoliza_QNAME, EditarPoliza.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditarPolizaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "EditarPolizaResponse")
    public JAXBElement<EditarPolizaResponse> createEditarPolizaResponse(EditarPolizaResponse value) {
        return new JAXBElement<EditarPolizaResponse>(_EditarPolizaResponse_QNAME, EditarPolizaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditarSiniestro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "EditarSiniestro")
    public JAXBElement<EditarSiniestro> createEditarSiniestro(EditarSiniestro value) {
        return new JAXBElement<EditarSiniestro>(_EditarSiniestro_QNAME, EditarSiniestro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditarSiniestroResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "EditarSiniestroResponse")
    public JAXBElement<EditarSiniestroResponse> createEditarSiniestroResponse(EditarSiniestroResponse value) {
        return new JAXBElement<EditarSiniestroResponse>(_EditarSiniestroResponse_QNAME, EditarSiniestroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FuncionarioAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "FuncionarioAll")
    public JAXBElement<FuncionarioAll> createFuncionarioAll(FuncionarioAll value) {
        return new JAXBElement<FuncionarioAll>(_FuncionarioAll_QNAME, FuncionarioAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FuncionarioAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "FuncionarioAllResponse")
    public JAXBElement<FuncionarioAllResponse> createFuncionarioAllResponse(FuncionarioAllResponse value) {
        return new JAXBElement<FuncionarioAllResponse>(_FuncionarioAllResponse_QNAME, FuncionarioAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FuncionarioCreate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "FuncionarioCreate")
    public JAXBElement<FuncionarioCreate> createFuncionarioCreate(FuncionarioCreate value) {
        return new JAXBElement<FuncionarioCreate>(_FuncionarioCreate_QNAME, FuncionarioCreate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FuncionarioCreateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "FuncionarioCreateResponse")
    public JAXBElement<FuncionarioCreateResponse> createFuncionarioCreateResponse(FuncionarioCreateResponse value) {
        return new JAXBElement<FuncionarioCreateResponse>(_FuncionarioCreateResponse_QNAME, FuncionarioCreateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDatosFuncionaroi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "GetDatosFuncionaroi")
    public JAXBElement<GetDatosFuncionaroi> createGetDatosFuncionaroi(GetDatosFuncionaroi value) {
        return new JAXBElement<GetDatosFuncionaroi>(_GetDatosFuncionaroi_QNAME, GetDatosFuncionaroi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDatosFuncionaroiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "GetDatosFuncionaroiResponse")
    public JAXBElement<GetDatosFuncionaroiResponse> createGetDatosFuncionaroiResponse(GetDatosFuncionaroiResponse value) {
        return new JAXBElement<GetDatosFuncionaroiResponse>(_GetDatosFuncionaroiResponse_QNAME, GetDatosFuncionaroiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "Login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "LoginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PolizaBuscar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "PolizaBuscar")
    public JAXBElement<PolizaBuscar> createPolizaBuscar(PolizaBuscar value) {
        return new JAXBElement<PolizaBuscar>(_PolizaBuscar_QNAME, PolizaBuscar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PolizaBuscarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "PolizaBuscarResponse")
    public JAXBElement<PolizaBuscarResponse> createPolizaBuscarResponse(PolizaBuscarResponse value) {
        return new JAXBElement<PolizaBuscarResponse>(_PolizaBuscarResponse_QNAME, PolizaBuscarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PolizaCreate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "PolizaCreate")
    public JAXBElement<PolizaCreate> createPolizaCreate(PolizaCreate value) {
        return new JAXBElement<PolizaCreate>(_PolizaCreate_QNAME, PolizaCreate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PolizaCreateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "PolizaCreateResponse")
    public JAXBElement<PolizaCreateResponse> createPolizaCreateResponse(PolizaCreateResponse value) {
        return new JAXBElement<PolizaCreateResponse>(_PolizaCreateResponse_QNAME, PolizaCreateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SiniestroAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "SiniestroAll")
    public JAXBElement<SiniestroAll> createSiniestroAll(SiniestroAll value) {
        return new JAXBElement<SiniestroAll>(_SiniestroAll_QNAME, SiniestroAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SiniestroAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "SiniestroAllResponse")
    public JAXBElement<SiniestroAllResponse> createSiniestroAllResponse(SiniestroAllResponse value) {
        return new JAXBElement<SiniestroAllResponse>(_SiniestroAllResponse_QNAME, SiniestroAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SiniestroBuscar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "SiniestroBuscar")
    public JAXBElement<SiniestroBuscar> createSiniestroBuscar(SiniestroBuscar value) {
        return new JAXBElement<SiniestroBuscar>(_SiniestroBuscar_QNAME, SiniestroBuscar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SiniestroBuscarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "SiniestroBuscarResponse")
    public JAXBElement<SiniestroBuscarResponse> createSiniestroBuscarResponse(SiniestroBuscarResponse value) {
        return new JAXBElement<SiniestroBuscarResponse>(_SiniestroBuscarResponse_QNAME, SiniestroBuscarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SiniestroCreate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "SiniestroCreate")
    public JAXBElement<SiniestroCreate> createSiniestroCreate(SiniestroCreate value) {
        return new JAXBElement<SiniestroCreate>(_SiniestroCreate_QNAME, SiniestroCreate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SiniestroCreateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "SiniestroCreateResponse")
    public JAXBElement<SiniestroCreateResponse> createSiniestroCreateResponse(SiniestroCreateResponse value) {
        return new JAXBElement<SiniestroCreateResponse>(_SiniestroCreateResponse_QNAME, SiniestroCreateResponse.class, null, value);
    }

}
