<%--
  Created by IntelliJ IDEA.
  User: MiaoJinlong
  Date: 2018/5/31
  Time: 14:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
%>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="<%=basePath%>/user/login.do">
    <table>
        <tr>
            <td><input type = "text" name = "email"/></td>
            <td><input type = "text" name = "pswd"/></td>
        </tr>
        <tr>
            <td><input type = "submit" value = "登录"/></td>
        </tr>
    </table>
</form>
</body>
</html>
