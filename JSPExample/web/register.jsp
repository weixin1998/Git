<%-- 
    Document   : register
    Created on : 2018-5-3, 15:50:53
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>简易留言板</title>
    </head>
    <body bgcolor="#E3E3E3">
        <form action="registerServlet" method="post">
            <table>
                <caption>用户注册</caption>
                <tr><td>登录名：</td>
                    <td><input type="text" name="username"/></td>
                </tr><tr><td>密码：</td>
                    <td><input type="password" name="pwd"/></td></tr>
            </table>
             <input type="submit" value="注册"/>
            <input type="reset" value="重置"/>
        </form>
                     </body>
                     </html>
