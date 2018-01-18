<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Seguros XYZ</title>
        <%@include file="../Includes/ImportsCSS.jsp" %>
    </head>
    <body>
        <%@include file="../Includes/MenuIzquierdo.jsp" %>
        <section class="ContentPage full-width mCustomScrollbar _mCS_2 mCS-autoHide mCS_no_scrollbar"><div id="mCSB_2" class="mCustomScrollBox mCS-dark-thin mCSB_vertical mCSB_inside" style="max-height: none;" tabindex="0"><div id="mCSB_2_container" class="mCSB_container mCS_y_hidden mCS_no_scrollbar_y" style="position:relative; top:0; left:0;" dir="ltr">
        <%@include file="../Includes/Header.jsp" %>

        <!-- Your code here -->
        <div class="full-width">
            <div class="card-container">
                <div class="row" id="cardJugador">
                    <div class="col s6">
                        <div class="card hoverable">
                            <div class="card-image">
                                <img src="../../MaterialDark/assets/img/logo.png" class="responsive-img">
                                <span class="card-title">Clientes Registrados</span>
                                <a style="margin-top: -20px;margin-left: 15px;" href="../Afiliado/AfiliadosRegistrados.jsp" class="tooltipped btn-floating halfway-fab waves-effect waves-light green left" data-tooltip="Ver Clientes Registrados"><i class="zmdi zmdi-eye"></i></a>
                            </div>
                            <div class="card-content">
                                <div id="ju">
                                    <p>Mira a los clientes registrados junto con su informacion básica.</p>
                                </div>
                            </div>
                            <!--<div class="card-action">
                                <a class="righ" href="#">Busca</a>
                            </div>-->
                        </div>
                    </div>
                    <div class="col s6">
                        <div class="card hoverable">
                            <div class="card-image">
                                <img src="../../MaterialDark/assets/img/MaterialFontLogin.jpg" class="responsive-img">
                                <span class="card-title">Siniestros Registrados</span>
                                <a style="margin-top: -20px;margin-left: 15px;" href="../Siniestro/SiniestrosRegistrados.jsp" class="tooltipped btn-floating halfway-fab waves-effect waves-light green left" data-tooltip="Ver Siniestros Registrados"><i class="zmdi zmdi-eye"></i></a>
                            </div>
                            <div class="card-content">
                                <div id="ju">
                                    <p>Mira a los siniestros registrados junto con su informacion básica.</p>
                                </div>
                            </div>
                            <!--<div class="card-action">
                                <a class="righ" href="#">Busca</a>
                            </div>-->
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="container" style="margin-bottom: 128px;">
            <div class="row">
                <div class="col s12">
                    <div class="fixed-action-btn horizontal" style="bottom: 45px; right: 24px;">
                        <a class="btn-floating btn-large red" href="../Reportes/siniestroReport.jsp" target="_blank">
                            <i class="large zmdi zmdi-download"></i>
                        </a>
                    </div>   
                </div>
            </div>
        </div>
        <!-- Your code here -->
        
    </div><div id="mCSB_2_scrollbar_vertical" class="mCSB_scrollTools mCSB_2_scrollbar mCS-dark-thin mCSB_scrollTools_vertical" style="display: none;"><a href="#" class="mCSB_buttonUp" oncontextmenu="return false;"></a><div class="mCSB_draggerContainer"><div id="mCSB_2_dragger_vertical" class="mCSB_dragger" style="position: absolute; min-height: 30px; height: 0px; top: 0px;" oncontextmenu="return false;"><div class="mCSB_dragger_bar" style="line-height: 30px;"></div></div><div class="mCSB_draggerRail"></div></div><a href="#" class="mCSB_buttonDown" oncontextmenu="return false;"></a></div></div></section>
    <%@include file="../Includes/ImportsJS.jsp" %>
    </body>
</html>
