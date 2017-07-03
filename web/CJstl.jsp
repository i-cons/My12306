<%--
  Created by IntelliJ IDEA.
  User: JINYUAN
  Date: 2017/7/3
  Time: 14:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%--<% session.setAttribute("attr",1);--%>
    %>
    <c:if test="${attr==1}">
        如果test中的表达式为true,则执行标签体中的内容
    </c:if>
    <c:if test="${attr!=1}">
        jstl(jsp standard tag lib)中的c标签库中的if没有else,需要自己再次写if
    </c:if>
    <c:if test="${attr}!=0">
        如果test中的表达式为true,则执行标签体中的内容
    </c:if>
    <table border="1" >
        <tr>
            <td>
                用户名称
            </td>
            <td>
                用户值
            </td>
        </tr>
        <c:forEach items="${attr2}" var ="tmp">
            <tr>
                <td>
                    ${tmp.userName}
                </td>
                <td>
                    ${tmp.userPassword}
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
