<%--
  Created by IntelliJ IDEA.
  User: cqt123456789
  Date: 2018/10/18
  Time: 10:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试@ModelAttribute的不同用法</title>
</head>
<body>
<a href="loginForm1">测试@ModelAttribute(value="")注释返回具体类的方法</a><br>
<a href="loginForm2">测试@ModelAttribute注释void返回值的方法</a><br>
<a href="loginForm3">测试@ModelAttribute注释返回具体类的方法</a><br>
<a href="loginForm4">测试@ModelAttribute和@RequestMapping同时注释一个方法</a><br>
<a href="loginForm5">@RequestMapping注释一个方法的参数</a><br>
</body>
</html>
