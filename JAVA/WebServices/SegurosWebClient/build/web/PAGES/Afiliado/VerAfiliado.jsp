<%@page import="Controlador.poliza"%>
<%@page import="webservices.Siniestro"%>
<%@page import="java.util.List"%>
<%@page import="Controlador.siniestro"%>
<%@page import="webservices.Poliza"%>
<%@page import="webservices.Afiliado"%>
<%
    String antecedentes = "";
    poliza objPoliza = new poliza();
    siniestro objSiniestro = new siniestro();
    
    Afiliado objAfiliado = (Afiliado) request.getSession().getAttribute("AfiliadoVisto");
    List<Poliza>listaPoliza = objPoliza.BuscarPoliza(objAfiliado.getIdAfiliado());
    List<Siniestro>listaSiniestro = objSiniestro.listaSiniestro(objAfiliado.getIdAfiliado());
    if (listaSiniestro.size() > 0) {
        antecedentes = "Si";
    }else{
        antecedentes = "No";
    }
   
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ver Afiliado</title>
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
                    <h3 class="center-align">Clientes Registrados</h3>
                    <h5>Documento:</h5>
                    <p><%=objAfiliado.getDocumento()%></p>
                    <h5>Nombre:</h5>
                    <p><%=objAfiliado.getNombre()+" "+objAfiliado.getApellido()%></p>
                    <h5>Ciudad:</h5>
                    <p><%=objAfiliado.getCiudad()%></p>
                    <%
                        for(Poliza poliza : listaPoliza){%>
                        <h5>Tipo de poliza:</h5>
                        <p><%=poliza.getTipo()%></p>
                        <h5>Valor de la poliza:</h5>
                        <p><%=poliza.getValor()%></p>
                    <%}%>
                    <h5>Antecedente en siniestro:</h5>
                    <p><%=antecedentes%></p>
                </div>
            </div>
        </div>
        
        <!-- Your code here -->
        
        </div><div id="mCSB_2_scrollbar_vertical" class="mCSB_scrollTools mCSB_2_scrollbar mCS-dark-thin mCSB_scrollTools_vertical" style="display: none;"><a href="#" class="mCSB_buttonUp" oncontextmenu="return false;"></a><div class="mCSB_draggerContainer"><div id="mCSB_2_dragger_vertical" class="mCSB_dragger" style="position: absolute; min-height: 30px; height: 0px; top: 0px;" oncontextmenu="return false;"><div class="mCSB_dragger_bar" style="line-height: 30px;"></div></div><div class="mCSB_draggerRail"></div></div><a href="#" class="mCSB_buttonDown" oncontextmenu="return false;"></a></div></div></section>
        <%@include file="../Includes/ImportsJS.jsp" %>
    </body>
</html>
