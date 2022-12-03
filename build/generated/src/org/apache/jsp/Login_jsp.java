package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, user-scalable=no,initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<br>\n");
      out.write("<br><br><br><br><br><br><br><br><br><br><br><br><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("*{\n");
      out.write("margin: 0;\n");
      out.write("padding: 0;\n");
      out.write("font-family: sans-serif;\n");
      out.write("box-sizing: border-box;\n");
      out.write("\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("body{\n");
      out.write("\n");
      out.write("background: #DEDEDE;\n");
      out.write("display: flex;\n");
      out.write("min-height: 100vh;\n");
      out.write("\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("form {\n");
      out.write("\n");
      out.write("\tmargin: auto;\n");
      out.write("\twidth: 50%;\n");
      out.write("\tmax-width: 400px;\n");
      out.write("  background: #2ECCFA;\n");
      out.write("  padding: 30px;\n");
      out.write("  border: 1px solid rgba(0,0,0,0.2)\n");
      out.write("\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("h3 {\n");
      out.write("\n");
      out.write("\ttext-align: center;\n");
      out.write("\tmargin-bottom: 10px;\n");
      out.write("\tcolor: rgba(0,0,0,0.5);\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("input {\n");
      out.write("\n");
      out.write("\n");
      out.write("\tdisplay: block;\n");
      out.write("\tpadding: 70px;\n");
      out.write("\twidth: 100%;\n");
      out.write("\tmargin: 90px 0;\n");
      out.write("\tfont-size: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap-theme.min.css\">\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\t<body>\n");
      out.write("\n");
      out.write("\n");
      out.write("            ");

                HttpSession  sesion =request.getSession();
       int cargo=0 ;         

              
if(request.getAttribute("cargo")!=null){
    
    
    cargo=(Integer)request.getAttribute("cargo");
   
    if(cargo==1){
        
        sesion.setAttribute("usu",request.getAttribute("usu"));
        sesion.setAttribute("cargo", cargo);
        
        
        response.sendRedirect("Web_Menu_Principal.jsp");
        
    }
}
          

         



if(request.getAttribute("cargo")!=null){
    
    
    cargo=(Integer)request.getAttribute("cargo");
   
    if(cargo==2){
        
        sesion.setAttribute("usu",request.getAttribute("usu"));
        sesion.setAttribute("cargo", cargo);
        
        
        response.sendRedirect("Menu_Tecnico.jsp");
        
    }
}

                if(request.getParameter("cerrar")!=null) {
                    
                    
                    session.invalidate();
                }

                
                
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t<form action=\"ControladorUsuario\" method=\"POST\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<h3> Accede a tu cuenta &#128272 </h3>\n");
      out.write("\n");
      out.write("<input value=\"Administrador\" type=\"text\" placeholder=\"&#128272; Usuario\"   class=\"form-control\" name=\"txtusuario\">\n");
      out.write("\t\t\t<br>\n");
      out.write("                        <input value=\"123\" type=\"password\" placeholder=\"&#128272;  Contraseña\" class=\"form-control\"   name=\"txtcontra\">\n");
      out.write("\n");
      out.write("\t\t\t<br>\n");
      out.write("\n");
      out.write("                       <input  type=\"submit\" class=\"btn btn-primary\"  name=\"btnIngresar\"  value=\"Ingresar\"> \n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t</body>\n");
      out.write("\t\t</html>\n");
      out.write("\t\t\t\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
