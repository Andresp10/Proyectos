/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.WebServiceRef;
import webservices.Afiliado;
import webservices.Funcionario;
import webservices.WSSeguros_Service;

/**
 *
 * @author Andres
 */
public class funcionario extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/SegurosService/WSSeguros.wsdl")
    private WSSeguros_Service service;

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
                case "iniciarsesion":
                    IniciarSesion(request, response);
                    break;
                case "cerrarsesion":
                    CerrarSesion(request, response);
                    break;
            }
        }
        
    }
    protected void IniciarSesion(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String usuario = request.getParameter("Usuario");
        String Contrasenia = request.getParameter("Contrasenia");
        
        String result = login(usuario, Contrasenia);
        String status[] = result.split("/");
        if (status[1].equals("true")) {
            List<Funcionario>listaFuncionario = getDatosFuncionaroi(usuario, Contrasenia);
            for (Funcionario funcionario : listaFuncionario) {
                
                Funcionario objFuncionario = new Funcionario();
                objFuncionario.setIdFuncionario(funcionario.getIdFuncionario());
                objFuncionario.setDocumento(funcionario.getDocumento());
                objFuncionario.setNombre(funcionario.getNombre());
                objFuncionario.setAPellido(funcionario.getAPellido());
                objFuncionario.setUsuario(funcionario.getUsuario());
                objFuncionario.setTipo(funcionario.getTipo());
                
                request.getSession().setAttribute("FuncionarioIngresado", objFuncionario);
                response.getWriter().write("1");
            }
            
        }else{
            response.getWriter().write("2");
        }
    }
    protected void CerrarSesion(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession logout = request.getSession();
        logout.removeAttribute("FuncionarioIngresado");
        logout.invalidate();
        response.getWriter().write("1");
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

    private String login(java.lang.String usuario, java.lang.String contrasenia) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        webservices.WSSeguros port = service.getWSSegurosPort();
        return port.login(usuario, contrasenia);
    }

    private java.util.List<webservices.Funcionario> getDatosFuncionaroi(java.lang.String usuario, java.lang.String contrasenia) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        webservices.WSSeguros port = service.getWSSegurosPort();
        return port.getDatosFuncionaroi(usuario, contrasenia);
    }
    
}
