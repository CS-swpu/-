<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>调查问卷系统</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta http-equiv="Access-Control-Allow-Origin" content="*">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="format-detection" content="telephone=no">
    <link rel="icon" href="images/favicon.ico">
    <link rel="stylesheet" href="static/lib/layui-src/css/layui.css" media="all">
    <link rel="stylesheet" href="static/css/layuimini.css?v=2.0.4.2" media="all">
    <link rel="stylesheet" href="static/css/themes/default.css" media="all">
    <link rel="stylesheet" href="static/lib/font-awesome-4.7.0/css/font-awesome.min.css" media="all">
    <!--[if lt IE 9]>
    <script src="static/js/html5.min.js"></script>
    <script src="static/js/respond.min.js"></script>
    <![endif]-->
    <style>
        .module {
            background-color: #ffffff;
            width: 1000px;
            border-radius: 5px;
            height: 700px;
            margin: auto;
            margin-top: 20px;
            padding: 20px;
        }
        .module ul{
            list-style: none;
        }
        .module ul li{
            height: 36px;
            line-height: 36px;
            font-size: 14px;
        }
        .module ul li{
            height: 40px;
            line-height: 40px;
            font-size: 16px;
            border-bottom: 1px dotted #cccccc;
        }
        .module ul li a{
           color: #00a2d4;

        }
        .module ul li span{
            float: right;
            color: #999999;
            font-size: 12px;
            padding: 0px 10px;
        }
    </style>
</head>
<body style="background-color: #f0f0f0;">
<c:if test="${type !=1 }">
<ul class="layui-nav" style="background-color: #00a397;">
    <li class="layui-nav-item"><a href="">调查问卷系统</a></li>
    <li class="layui-nav-item layui-this"><a href="hot">热门问卷</a></li>
    <li class="layui-nav-item"><a href="new">最新问卷</a></li>
    <li class="layui-nav-item" style="float: right;"><a href="login">登录/注册</a></li>
</ul>
</c:if>

<div class="module">
    <ul>
        <c:forEach items="${list}" var="survey">
            <li>
                <div class="layui-row">
                    <div class="layui-col-md9">
                        <a href="${survey.url}" target="_blank">${survey.title}</a>
                    </div>
                    <div class="layui-col-md3">
                        <sapn class="date" style="font-size: 14px;">
                        <fmt:formatDate value="${survey.startTime}" pattern="yyyy-MM-dd"></fmt:formatDate>
                            至
                        <fmt:formatDate value="${survey.endTime}" pattern="yyyy-MM-dd"></fmt:formatDate>
                        </sapn>
                    </div>
                </div>
            </li>
        </c:forEach>
    </ul>
</div>


</body>
</html>