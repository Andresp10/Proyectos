<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.*"%>
<%@page import="java.io.*"%>

<%@page import="net.sf.jasperreports.engine.*"%>
<%@page import="net.sf.jasperreports.view.JasperViewer"%>

<%@page import="javax.servlet.ServletResponse"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        Connection conexion = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/segurosxyz","root","");
            
        }catch(Exception ex){
            out.print(ex);
        }
        File reportFile = new File(application.getRealPath("/PAGES/Reportes/SiniestrosReport.jasper"));
        
        Map<String, Object> parameter = new HashMap<String, Object>();
        
        byte[] bytes = JasperRunManager.runReportToPdf(reportFile.getPath(), parameter, conexion);
        
        response.setContentType("application/pdf");
        response.setContentLength(bytes.length);
        ServletOutputStream outputStream = response.getOutputStream();
        outputStream.write(bytes,0,bytes.length);
        
        outputStream.flush();
        outputStream.close();
        
        %>
    </body>
</html>
