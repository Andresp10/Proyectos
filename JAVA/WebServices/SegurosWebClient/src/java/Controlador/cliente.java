/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import webservices.Afiliado;
import webservices.WSSeguros_Service;

/**
 *
 * @author Andres
 */
public class cliente extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/SegurosService/WSSeguros.wsdl")
    private WSSeguros_Service service = new webservices.WSSeguros_Service();

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String url[] = request.getRequestURI().split("/");
        if (url.length >= 3) {
            switch(url[3]){
            
                case "vercliente":
                    VerCliente(request, response);
                    break;
            }
            
        }
    }
    protected void VerCliente(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
        String idAfiliado = request.getParameter("idAfiliado");
        Afiliado objAfiliado = new Afiliado();
        List<Afiliado>listaAfiliado = buscarDatosCliente(Integer.parseInt(idAfiliado));
        for (Afiliado afiliado : listaAfiliado) {
            objAfiliado.setIdAfiliado(afiliado.getIdAfiliado());
            objAfiliado.setDocumento(afiliado.getDocumento());
            objAfiliado.setNombre(afiliado.getNombre());
            objAfiliado.setApellido(afiliado.getApellido());
            objAfiliado.setCiudad(afiliado.getCiudad());
        }
        
        
        request.getSession().setAttribute("AfiliadoVisto", objAfiliado);
        response.getWriter().write("1");
        
    }
    public List<Afiliado> GetAllClientes(){
        System.out.println("GET ALL CLIENTES----><");
        List<Afiliado>listaAfiliado = consultaAll();
        for (Afiliado afiliado : listaAfiliado) {
            System.out.println(afiliado.getNombre());
        }
        return listaAfiliado;
    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private static java.util.List<webservices.Afiliado> consultaAll() {
        webservices.WSSeguros_Service service = new webservices.WSSeguros_Service();
        webservices.WSSeguros port = service.getWSSegurosPort();
        return port.consultaAll();
    }

    private java.util.List<webservices.Afiliado> buscarDatosCliente(int idAfiliado) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        webservices.WSSeguros port = service.getWSSegurosPort();
        return port.buscarDatosCliente(idAfiliado);
    }


}
