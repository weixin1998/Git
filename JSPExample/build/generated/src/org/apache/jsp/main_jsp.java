package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import model.LyTable;
import db.DB;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>留言板信息</title>\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"#E3E3E3\">\n");
      out.write("        <form action=\"liuyan.jsp\" method=\"post\">\n");
      out.write("            <table border=\"1\">\n");
      out.write("                <caption>所有留言信息</caption>\n");
      out.write("                <tr><th>留言人姓名</th><th>留言时间</th>\n");
      out.write("                    <th>留言标题</th><th>留言内容</th></tr>\n");
      out.write("                ");

                ArrayList al=(ArrayList)session.getAttribute("al");
                Iterator iter=al.iterator();
                while(iter.hasNext()){
                    LyTable ly=(LyTable)iter.next();
                    
      out.write("\n");
      out.write("                <tr><td>");
      out.print(new DB().getUserName(ly.getUserId()) );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(ly.getDate().toString() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(ly.getTitle() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(ly.getContent() );
      out.write("</td></tr>\n");
      out.write("                ");

                }
                
      out.write("\n");
      out.write("            </table>\n");
      out.write("            <input type=\"submit\" value=\"留言\"/>\n");
      out.write("        </form>\n");
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
