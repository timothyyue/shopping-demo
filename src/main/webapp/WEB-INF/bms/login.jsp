<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>dfs user management login</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
</head>
<body>
<form action="/dfs-user/admin/login.do" method="post">
    <lable>用戶名:</lable>
    <input type="text" name="username">
    <lable>密码:</lable>
    <input type="password" name="password">
    <input type="submit" name="submit">
</form>
</body>
</html>