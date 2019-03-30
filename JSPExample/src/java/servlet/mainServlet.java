
package servlet;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.User;
import db.DB;
import java.io.PrintWriter;
public class mainServlet extends HttpServlet {
 public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String username=request.getParameter("username");
       String pwd=request.getParameter("pwd");
       DB db=new DB();
       HttpSession session=request.getSession();
       User user=(User)session.getAttribute("user");
       if(user==null){
           user=db.checkUser(username,pwd);
       }
       session.setAttribute("user", user);
       if(user!=null){
           ArrayList al=db.findLyInfo();
           session.setAttribute("al",al);
           response.sendRedirect("main.jsp");
       }else{
           response.sendRedirect("login.jsp");
       }       
       
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
   