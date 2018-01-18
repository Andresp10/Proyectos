<%@page import="Modelo.Persona"%>
<%

    Persona objPersonaa = (Persona) request.getSession().getAttribute("UsuarioIngresado");
    
%>
<section class="NavLateral full-width">
    <div class="NavLateral-FontMenu full-width ShowHideMenu"></div>
    <div class="NavLateral-content full-width mCustomScrollbar _mCS_1 mCS-autoHide mCS_no_scrollbar"><div id="mCSB_1" class="mCustomScrollBox mCS-light-thin mCSB_vertical mCSB_inside" style="max-height: none;" tabindex="0"><div id="mCSB_1_container" class="mCSB_container mCS_y_hidden mCS_no_scrollbar_y" style="position:relative; top:0; left:0;" dir="ltr">
                <a href="/FutPlay/PAGES/Propietario/indexPropietario.jsp"><header class="NavLateral-title full-width center-align">
                FutPlay <i class="zmdi zmdi-close NavLateral-title-btn ShowHideMenu"></i>
            </header>
        </a>
        <a href="#modalAvatar"><figure class="full-width NavLateral-logo">
            <img src="/FutPlay/MaterialDark/assets/img/<%=objPersonaa.getAvatar()%>" alt="material-logo" class="responsive-img center-box mCS_img_loaded">
            <figcaption class="center-align"><%= objPersonaa.getNombres() %></figcaption>
        </figure></a> 
        <div class="NavLateral-Nav">
            <ul class="full-width">
                <li>
                    <a href="#" class="waves-effect waves-light"><i class="zmdi zmdi-account zmdi-hc-fw"></i>Mi perfil</a>
                </li>
                <li class="NavLateralDivider"></li>
                <li>
                    <a href="#" class="waves-effect waves-light"><i class="zmdi zmdi-settings zmdi-hc-fw"></i>Configuracion</a>
                </li>
                <li class="NavLateralDivider"></li>
                <li>
                    <a href="#" class="waves-effect waves-light"><i class="zmdi zmdi-help zmdi-hc-fw"></i>Ayuda</a>
                </li>
                <li class="NavLateralDivider"></li>
                <li>
                    <a href="#" class="waves-effect waves-light btn-ExitSystem"><i class="zmdi zmdi-close zmdi-hc-fw"></i>Cerrar Sesion</a>
                </li>
                
            </ul>
        </div>  
    </div><div id="mCSB_1_scrollbar_vertical" class="mCSB_scrollTools mCSB_1_scrollbar mCS-light-thin mCSB_scrollTools_vertical" style="display: none;"><a href="#" class="mCSB_buttonUp" oncontextmenu="return false;"></a><div class="mCSB_draggerContainer"><div id="mCSB_1_dragger_vertical" class="mCSB_dragger" style="position: absolute; min-height: 30px; height: 0px; top: 0px;" oncontextmenu="return false;"><div class="mCSB_dragger_bar" style="line-height: 30px;"></div></div><div class="mCSB_draggerRail"></div></div><a href="#" class="mCSB_buttonDown" oncontextmenu="return false;"></a></div></div></div>
</section>
<!-- Modal Structure -->
<div id="modalAvatar" class="modal">
    <div class="modal-content">
        <h4 class="center" style="margin-bottom: 0">Selecciona tu avatar</h4>
        <div class="carousel" style="height: 350px;padding-bottom: 20px;">
            <a class="carousel-item" href="#"><img src="/FutPlay/MaterialDark/assets/img/av.jpg"></a>
            <a class="carousel-item" href="#"><img src="/FutPlay/MaterialDark/assets/img/av1.jpg"></a>
            <a class="carousel-item" href="#"><img src="/FutPlay/MaterialDark/assets/img/av2.jpg"></a>
            <a class="carousel-item" href="#"><img src="/FutPlay/MaterialDark/assets/img/av3.png"></a>
            <a class="carousel-item" href="#"><img src="/FutPlay/MaterialDark/assets/img/av4.jpg"></a>
            <a class="carousel-item" href="#"><img src="/FutPlay/MaterialDark/assets/img/av5.jpg"></a>
        </div>
    </div>
    
</div>