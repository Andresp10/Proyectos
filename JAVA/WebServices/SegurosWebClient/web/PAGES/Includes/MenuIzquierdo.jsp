<%@page import="webservices.Funcionario"%>
<%

    Funcionario objFuncionario = (Funcionario) request.getSession().getAttribute("FuncionarioIngresado");
    //System.out.println(objFuncionario.getAPellido());

%>
<section class="NavLateral full-width">
    <div class="NavLateral-FontMenu full-width ShowHideMenu"></div>
    <div class="NavLateral-content full-width mCustomScrollbar _mCS_1 mCS-autoHide mCS_no_scrollbar"><div id="mCSB_1" class="mCustomScrollBox mCS-light-thin mCSB_vertical mCSB_inside" style="max-height: none;" tabindex="0"><div id="mCSB_1_container" class="mCSB_container mCS_y_hidden mCS_no_scrollbar_y" style="position:relative; top:0; left:0;" dir="ltr">
    <header class="NavLateral-title full-width center-align">
        Seguros XYZ <i class="zmdi zmdi-close NavLateral-title-btn ShowHideMenu"></i>
    </header>
    <figure class="full-width NavLateral-logo">
        <img src="../../MaterialDark/assets/img/user.png" alt="material-logo" class="responsive-img center-box mCS_img_loaded">
        <figcaption class="center-align"><%=objFuncionario.getNombre()+" " +objFuncionario.getAPellido()%></figcaption>
        <h6 class="center"><small>(<%=objFuncionario.getTipo()%>)</small></h6>
    </figure> 
    <div class="NavLateral-Nav">
        <ul class="full-width">
            <li>
                <a href="../Funcionario/IndexFuncionario.jsp" class="waves-effect waves-light"><i class="zmdi zmdi-desktop-mac zmdi-hc-fw"></i> Inicio</a>
            </li>    
        </ul>
    </div>  
</section>