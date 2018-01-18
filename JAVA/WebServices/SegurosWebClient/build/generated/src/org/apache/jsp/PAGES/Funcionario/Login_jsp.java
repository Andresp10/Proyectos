package org.apache.jsp.PAGES.Funcionario;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/PAGES/Funcionario/../Includes/ImportsCSS.jsp");
    _jspx_dependants.add("/PAGES/Funcionario/../Includes/ImportsJS.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Seguros XYZ</title>\n");
      out.write("        ");
      out.write("<link rel=\"icon\" type=\"image/png\" sizes=\"96x96\" href=\"../../GaiaTemplate/assets/img/Soccer Ball_100px.png\">\n");
      out.write("\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\n");
      out.write("\t\n");
      out.write("<!-- Normalize CSS -->\n");
      out.write("   <link rel=\"stylesheet\" href=\"/SegurosWebClient/MaterialDark/css/normalize.css\">\n");
      out.write("\n");
      out.write("<!-- Materialize CSS -->\n");
      out.write("   <link rel=\"stylesheet\" href=\"/SegurosWebClient/MaterialDark/css/materialize.min.css\">\n");
      out.write("\n");
      out.write("<!-- Material Design Iconic Font CSS -->\n");
      out.write("   <link rel=\"stylesheet\" href=\"/SegurosWebClient/MaterialDark/css/material-design-iconic-font.min.css\">\n");
      out.write("\n");
      out.write("<!-- Malihu jQuery custom content scroller CSS -->\n");
      out.write("   <link rel=\"stylesheet\" href=\"/SegurosWebClient/MaterialDark/css/jquery.mCustomScrollbar.css\">\n");
      out.write("\n");
      out.write("<!-- Sweet Alert CSS -->\n");
      out.write("<link rel=\"stylesheet\" href=\"/SegurosWebClient/MaterialDark/css/sweetalert.css\">\n");
      out.write("\n");
      out.write("<!-- MaterialDark CSS -->\n");
      out.write("<link rel=\"stylesheet\" href=\"/SegurosWebClient/MaterialDark/css/style.css\">\n");
      out.write("\n");
      out.write("<!-- Base CSS -->\n");
      out.write("<link rel=\"stylesheet\" href=\"/SegurosWebClient/MaterialDark/css/base.css\">\n");
      out.write("\n");
      out.write("<!-- sass Modal -->\n");
      out.write("<link rel=\"stylesheet\" href=\"/SegurosWebClient/MaterialDark/sass/components/_modal.scss\">  \n");
      out.write("\n");
      out.write("<!-- sass datepicker -->\n");
      out.write("<link rel=\"stylesheet\" href=\"/SegurosWebClient/MaterialDark/sass/components/date_picker/_default.date.scss\">\n");
      out.write("<link rel=\"stylesheet\" href=\"/SegurosWebClient/MaterialDark/sass/components/date_picker/_default.scss\"> \n");
      out.write("<link rel=\"stylesheet\" href=\"/SegurosWebClient/MaterialDark/sass/components/date_picker/_default.time.scss\"> ");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            .error{\n");
      out.write("                \n");
      out.write("                font-size: 14px;\n");
      out.write("                color: red;\n");
      out.write("                  \n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"font-cover\" id=\"login\">\n");
      out.write("        <div class=\"container-login center-align\">\n");
      out.write("            <div style=\"margin:15px 0;\">\n");
      out.write("                <i class=\"zmdi zmdi-account-circle zmdi-hc-5x\"></i>\n");
      out.write("                <p>Inicia sesión con tu cuenta</p>   \n");
      out.write("            </div>\n");
      out.write("            <form action=\"\" id=\"frmLogin\" name=\"frmLogin\">\n");
      out.write("                <div class=\"input-field\">\n");
      out.write("                    <input id=\"Usuario\" name=\"Usuario\" type=\"text\" class=\"validate\">\n");
      out.write("                    <label for=\"UserName\" class=\"\"><i class=\"zmdi zmdi-account\"></i>&nbsp; Usuario</label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"input-field col s12\">\n");
      out.write("                    <input id=\"Contrasenia\" name=\"Contrasenia\" type=\"password\" class=\"validate\">\n");
      out.write("                    <label for=\"Password\" class=\"\"><i class=\"zmdi zmdi-lock\"></i>&nbsp; Contraseña</label>\n");
      out.write("                </div>\n");
      out.write("                <button class=\"waves-effect waves-teal btn-flat\">Ingresar &nbsp; <i class=\"zmdi zmdi-mail-send\"></i></button>\n");
      out.write("            </form>\n");
      out.write("            <div class=\"divider\" style=\"margin: 20px 0;\"></div>\n");
      out.write("        </div>\n");
      out.write("        ");
      out.write("<!-- jQuery -->\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js\"></script>\n");
      out.write("<script>window.jQuery || document.write('<script src=\"/SegurosWebClient/MaterialDark/js/jquery-2.2.0.min.js\"><\\/script>')</script>\n");
      out.write("\n");
      out.write("<!-- Sweet Alert JS -->\n");
      out.write("<script src=\"/SegurosWebClient/MaterialDark/js/sweetalert.min.js\"></script>\n");
      out.write("\n");
      out.write(" <!-- Materialize JS -->\n");
      out.write("<script src=\"/SegurosWebClient/MaterialDark/js/materialize.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Malihu jQuery custom content scroller JS -->\n");
      out.write("<script src=\"/SegurosWebClient/MaterialDark/js/jquery.mCustomScrollbar.concat.min.js\"></script>\n");
      out.write("    \n");
      out.write("\n");
      out.write("<!-- modal -->\n");
      out.write("<script src=\"/SegurosWebClient/MaterialDark/js/modal.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- datepicker -->\n");
      out.write("<script src=\"/SegurosWebClient/MaterialDark/js/date_picker/picker.date.js\"></script>\n");
      out.write("<script src=\"/SegurosWebClient/MaterialDark/js/date_picker/picker.js\"></script>\n");
      out.write("<script src=\"/SegurosWebClient/MaterialDark/js/date_picker/picker.time.js\"></script>\n");
      out.write("\n");
      out.write("<!-- VALIDATE JS -->\n");
      out.write("<script src=\"/SegurosWebClient/MaterialDark/js/jquery.validate.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- MaterialDark JS -->\n");
      out.write("<script src=\"/SegurosWebClient/MaterialDark/js/main.js\"></script>");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
