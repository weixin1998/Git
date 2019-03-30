package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>简易留言板</title>\n");
      out.write("            </head>\n");
      out.write("    <body bgcolor=\"#E3E3E3\">\n");
      out.write("        <div style=\"text-align: center;margin: auto;poisition:absolution;left:650px;width:250px;\">\n");
      out.write("        <form action=\"mainServlet\" method=\"post\">\n");
      out.write("            <table>\n");
      out.write("                <caption>用户登录</caption>\n");
      out.write("                <tr><td>登录名:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"username\" size=\"20\"/></td>\n");
      out.write("                </tr><tr><td>密码:</td>\n");
      out.write("                    <td><input type=\"password\" name=\"pwd\" size=\"21\"/></td>  \n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            <input type=\"submit\" value=\"登陆\"/>\n");
      out.write("            <input type=\"reset\" value=\"重置\"/>\n");
      out.write("        </form>\n");
      out.write("        如果没注册单击<a href=\"register.jsp\">这里</a>注册！\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            alert(\"欢迎来到留言簿，请登录或者注册！\")\n");
      out.write("        </script>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
