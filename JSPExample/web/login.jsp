<%-- 
    Document   : login
    Created on : 2018-5-8, 20:28:31
    Author     : bell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>简易留言板</title>
            </head>
    <body bgcolor="#E3E3E3">
        <div style="text-align: center;margin: auto;poisition:absolution;left:650px;width:250px;">
        <form action="mainServlet" method="post">
            <table>
                <caption>用户登录</caption>
                <tr><td>登录名:</td>
                    <td><input type="text" name="username" size="20"/></td>
                </tr><tr><td>密码:</td>
                    <td><input type="password" name="pwd" size="21"/></td>  
                </tr>
            </table>
            <input type="submit" value="登陆"/>
            <input type="reset" value="重置"/>
        </form>
        如果没注册单击<a href="register.jsp">这里</a>注册！
        <script type="text/javascript">
            alert("欢迎来到留言簿，请登录或者注册！")
        </script>
        </div>
    </body>
</html>

