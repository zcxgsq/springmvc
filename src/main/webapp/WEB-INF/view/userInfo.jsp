<%--
  Created by IntelliJ IDEA.
  User: cqt123456789
  Date: 2018/11/7
  Time: 15:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件下载</title>
</head>
<body>
    <h3>文件下载</h3>
    <a href="/v0.1/downLoad?filename=${requestScope.user.image.originalFilename}">
        ${requestScope.user.image.originalFilename}
    </a>
</body>
</html>
