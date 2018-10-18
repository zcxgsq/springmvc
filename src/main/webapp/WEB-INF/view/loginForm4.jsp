<%--
  Created by IntelliJ IDEA.
  User: cqt123456789
  Date: 2018/10/18
  Time: 10:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试@ModelAttribute(value="")注释返回具体类的方法</title>
</head>
<body>
    <form action="login4" method="post">
        <table>
            <tr>
                <td><label>登录名：</label></td>
                <td><input type="text" id="loginname" name="loginname"></td>
            </tr>
            <tr>
                <td><label>密码：</label></td>
                <td><input type="password" id="password" name="password"></td>
            </tr>
            <tr>
                <td><input id="submit" type="submit" value="登录"></td>
            </tr>
        </table>
    </form>
</body>
</html>
