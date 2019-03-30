
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.*;
import java.util.*;
import java.sql.Date;
import db.DB;

public class addServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("UTF-8");
        request.setCharacterEncoding("UTF-8");
        String title=request.getParameter("title");
        String content=request.getParameter("content");
        User user=(User)request.getSession().getAttribute("user");
        LyTable ly=new LyTable();
        ly.setUserId(user.getId());
        ly.setDate(new Date(System.currentTimeMillis()));
        ly.setTitle(title);
        ly.setContent(content);
        if(new DB().addInfo(ly)){
            response.sendRedirect("success.jsp");
        }
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{
        doGet(request,response);
    }
}