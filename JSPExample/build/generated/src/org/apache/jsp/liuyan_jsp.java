package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class liuyan_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>留言板</title>\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"#E3E3E3\">\n");
      out.write("    <center>\n");
      out.write("        <form action=\"addServlet\" method=\"post\">\n");
      out.write("            <table border=\"1\">\n");
      out.write("                <caption>填写留言信息</caption>\n");
      out.write("                <tr><td>留言标题</td>\n");
      out.write("                    <td><input type=\"text\" name=\"title\"/></td></tr>\n");
      out.write("                <tr><td>留言内容</td>\n");
      out.write("                    <td><textarea name=\"content\" rows=\"5\" cols=\"35\"></textarea></td>\n");
      out.write("</tr>\n");
      out.write("            </table>\n");
      out.write("           <input type=\"submit\" value=\"提交\"/>\n");
      out.write("            <input type=\"reset\" value=\"重置\"/>\n");
      out.write("        </form>\n");
      out.write("    </center>\n");
      out.write("           </body>\n");
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
