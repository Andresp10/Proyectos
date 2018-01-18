<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Seguros XYZ</title>
        <%@include file="../Includes/ImportsCSS.jsp" %>
        <style>
            .error{
                
                font-size: 14px;
                color: red;
                  
            }
        </style>
    </head>
    <body class="font-cover" id="login">
        <div class="container-login center-align">
            <div style="margin:15px 0;">
                <i class="zmdi zmdi-account-circle zmdi-hc-5x"></i>
                <p>Inicia sesión con tu cuenta</p>   
            </div>
            <form action="" id="frmLogin" name="frmLogin">
                <div class="input-field">
                    <input id="Usuario" name="Usuario" type="text" class="validate">
                    <label for="UserName" class=""><i class="zmdi zmdi-account"></i>&nbsp; Usuario</label>
                </div>
                <div class="input-field col s12">
                    <input id="Contrasenia" name="Contrasenia" type="password" class="validate">
                    <label for="Password" class=""><i class="zmdi zmdi-lock"></i>&nbsp; Contraseña</label>
                </div>
                <button class="waves-effect waves-teal btn-flat">Ingresar &nbsp; <i class="zmdi zmdi-mail-send"></i></button>
            </form>
            <div class="divider" style="margin: 20px 0;"></div>
        </div>
        <%@include file="../Includes/ImportsJS.jsp" %>
    </body>
</html>
