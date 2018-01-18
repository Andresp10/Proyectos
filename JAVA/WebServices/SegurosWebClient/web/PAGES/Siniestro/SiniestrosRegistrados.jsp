<%@page import="webservices.Siniestro"%>
<%@page import="Controlador.siniestro"%>
<%@page import="webservices.Afiliado"%>
<%@page import="java.util.List"%>
<%@page import="Controlador.cliente"%>
<%



%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Siniestros registrados</title>
        <%@include file="../Includes/ImportsCSS.jsp" %>
    </head>
    <body>
        <%@include file="../Includes/MenuIzquierdo.jsp" %>
        <section class="ContentPage full-width mCustomScrollbar _mCS_2 mCS-autoHide mCS_no_scrollbar"><div id="mCSB_2" class="mCustomScrollBox mCS-dark-thin mCSB_vertical mCSB_inside" style="max-height: none;" tabindex="0"><div id="mCSB_2_container" class="mCSB_container mCS_y_hidden mCS_no_scrollbar_y" style="position:relative; top:0; left:0;" dir="ltr">
        <%@include file="../Includes/Header.jsp" %>
        
        <!-- Your code here -->
        <div>
            <div class="container">
                <div class="row">
                    <h3 class="center-align">Siniestros Registrados</h3>
                    <div class="col s12">
                        <table class="highlight">
                            <thead>
                                <tr>
                                    <th class="center-align">Fecha siniestro</th>
                                    <th class="center-align">Cidiudad afiliado</th>
                                    <th class="center-align">Nombre afiliado</th>
                                    <th class="center-align">Consultar</th>
                                </tr>
                            </thead>
                            <tbody>
                                <%
                                    String fecha[];
                                    cliente objCliente = new cliente();
                                    siniestro objSiniestro = new siniestro();
                                    List<Afiliado>listaAfiliado = objCliente.GetAllClientes();
                                    for(Afiliado afiliado : listaAfiliado){
                                        List<Siniestro>listaSiniestro = objSiniestro.listaSiniestro(afiliado.getIdAfiliado());
                                        if (listaSiniestro.size() > 0) {
                                            for(Siniestro siniestro : listaSiniestro){
                                            fecha = String.valueOf(siniestro.getFecha()).split("T");
                                            %>
                                            
                                            <tr>
                                                <td class="center-align"><%=fecha[0]%></td>
                                                <td class="center-align"><%=afiliado.getCiudad()%></td>
                                                <td class="center-align"><%=afiliado.getNombre()+" "+afiliado.getApellido()%></td>
                                                <td class="center-align"><button class="waves-effect waves-light btn verSiniestro" value="<%=afiliado.getIdAfiliado()%>">Ver</button></td>
                                            </tr>
                                                
                                            <%}
                                            
                                        }
                                    }
                                %>
                                
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    

        <!-- Your code here -->
        
        </div><div id="mCSB_2_scrollbar_vertical" class="mCSB_scrollTools mCSB_2_scrollbar mCS-dark-thin mCSB_scrollTools_vertical" style="display: none;"><a href="#" class="mCSB_buttonUp" oncontextmenu="return false;"></a><div class="mCSB_draggerContainer"><div id="mCSB_2_dragger_vertical" class="mCSB_dragger" style="position: absolute; min-height: 30px; height: 0px; top: 0px;" oncontextmenu="return false;"><div class="mCSB_dragger_bar" style="line-height: 30px;"></div></div><div class="mCSB_draggerRail"></div></div><a href="#" class="mCSB_buttonDown" oncontextmenu="return false;"></a></div></div></section>
        <%@include file="../Includes/ImportsJS.jsp" %>
    </body>
</html>
