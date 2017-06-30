<%--
  Created by IntelliJ IDEA.
  User: JINYUAN
  Date: 2017/6/29
  Time: 14:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="login.do" method="post">
    用户名<input type="text" name="userEmail"/><br/>
    密码<input type="text" name="userPassword"/><br/>
    真实姓名<input type="text" name="userName"/><br/>
    性别<input type="text" name="userSex"/><br/>
    身份证号<input type="text" name="userNumber"/><br/>
    手机号<input type="text" name="userPhone"/><br/>
    <input type="submit" value="提交">
</form>
</body>
</html>
