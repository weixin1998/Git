

<%@page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="model.LyTable"%>
<%@page import="db.DB"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>留言板信息</title>
    </head>
    <body bgcolor="#E3E3E3">
        <form action="liuyan.jsp" method="post">
            <table border="1">
                <caption>所有留言信息</caption>
                <tr><th>留言人姓名</th><th>留言时间</th>
                    <th>留言标题</th><th>留言内容</th></tr>
                <%
                ArrayList al=(ArrayList)session.getAttribute("al");
                Iterator iter=al.iterator();
                while(iter.hasNext()){
                    LyTable ly=(LyTable)iter.next();
                    %>
                <tr><td><%=new DB().getUserName(ly.getUserId()) %></td>
                    <td><%=ly.getDate().toString() %></td>
                    <td><%=ly.getTitle() %></td>
                    <td><%=ly.getContent() %></td></tr>
                <%
                }
                %>
            </table>
            <input type="submit" value="留言"/>
        </form>
           </body>
</html>
