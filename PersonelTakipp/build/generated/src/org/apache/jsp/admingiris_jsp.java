package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admingiris_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("    body{\r\n");
      out.write("        background-color: aquamarine;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    table{\r\n");
      out.write("        margin-right: 10px;\r\n");
      out.write("        margin-left: 0px;\r\n");
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
      out.write("        font-size:30px;\r\n");
      out.write("        \r\n");
      out.write("        margin-top:10px;\r\n");
      out.write("        font-family: Ubuntu-Regular;\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("    }\r\n");
      out.write("    td{\r\n");
      out.write("        font-size:30px;\r\n");
      out.write("        text-align:center;\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    h1{\r\n");
      out.write("        text-align: center;\r\n");
      out.write("    }\r\n");
      out.write("   \r\n");
      out.write("   input{font-size:20px;}\r\n");
      out.write("    \r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<h1>Personel Takip Sistemi</h1>\r\n");
      out.write("\r\n");
      out.write("    <form  action = \"login\" method=\"get\" >\r\n");
      out.write("        <table>\r\n");
      out.write("            <tbody>\r\n");
      out.write("                <tr>\r\n");
      out.write("                  \r\n");
      out.write("                <td> Kullanici Adi : </td>\r\n");
      out.write("                    <td ><input type =\"text\" name =\"kadi\" value = \"\" size = \"30\"/></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Password : </td>\r\n");
      out.write("                    <td><input type =\"password\" name =\"password\" value = \"\" size = \"30\"/></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("\r\n");
      out.write("                <td id=\"button\">\r\n");
      out.write("                     <input type =\"reset\"  value = \"Temizle\"  name = \"clear\"/> \r\n");
      out.write("                     <input type =\"submit\" value = \"Giris\" name = \"clear\"/>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tbody>\r\n");
      out.write("        </table>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("          <br>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("        \r\n");
      out.write("    </form> \r\n");
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
