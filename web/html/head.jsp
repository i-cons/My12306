<%--
  Created by IntelliJ IDEA.
  User: JINYUAN
  Date: 2017/7/3
  Time: 13:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>head</title>
    <link rel="stylesheet" type="text/css" href="../css/bootstrap.css"/>
    <link rel="stylesheet" type="text/css" href="../css/bootstrap-theme.css"/>
    <style type="text/css">
        #header_left{
            height: 120px;
            width: 45%;
            background-image: url(../img/top_img.gif);
            background-size: auto 100%;
            background-repeat: no-repeat;
            float: left;
        }
        #header_right{
            height: 120px;
            width: 55%;
            background-image: url(../img/ny_top_img_bg.gif);
            background-size: auto 100%;
            float: left;
        }

        .location{
            background-color: #BCE8F1;
            padding-left: 8%;
            padding-bottom: 15px;
        }
    </style>
</head>


<body>
<div id="header">
    <div id="header_left"></div>
    <div id="header_right"></div>
</div>
<div class="container-fluid location">
    当前位置：注册信息
    <div> ${currentUser.userName}</div>
</div>
</body>
</html>
