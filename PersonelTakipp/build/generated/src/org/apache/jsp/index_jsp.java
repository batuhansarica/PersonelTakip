package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("    <title>Personel Takip Sistemi</title>\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write("    body{\r\n");
      out.write("        background-color: aquamarine;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    table{\r\n");
      out.write("        margin-right: 10px;\r\n");
      out.write("        margin-left: 100px;\r\n");
      out.write("        margin-top:10px;\r\n");
      out.write("        height : 300px;\r\n");
      out.write("        width:1350px;\r\n");
      out.write("        padding: 20px;\r\n");
      out.write("        font-family: Ubuntu-Regular;\r\n");
      out.write("        font-size:14px;\r\n");
      out.write("        transition:all 0.4s;\r\n");
      out.write("       \r\n");
      out.write("        \r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    a{\r\n");
      out.write("        width:200px;\r\n");
      out.write("        font-size:30px;\r\n");
      out.write("        margin-left:100px;\r\n");
      out.write("        margin-top:10px;\r\n");
      out.write("        font-family: Ubuntu-Regular;\r\n");
      out.write("        text-decoration: none;\r\n");
      out.write("        background-color: #9acce3;\r\n");
      out.write("        color:black;\r\n");
      out.write("       \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("    }\r\n");
      out.write("    h1{\r\n");
      out.write("        text-align:center;\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("   \r\n");
      out.write("<h1>Personel Takip Sistemi</h1>\r\n");
      out.write(" <table>        \r\n");
      out.write("<tr>\r\n");
      out.write("            \r\n");
      out.write("    <td>   \r\n");
      out.write("        <a href=\"admingiris.jsp\">Admin Giris</a>\r\n");
      out.write("            \r\n");
      out.write("        </td>\r\n");
      out.write("        <td>\r\n");
      out.write("           \r\n");
      out.write("            <a href=\"personelgiris.jsp\">Personel Giris</a>\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("   \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
