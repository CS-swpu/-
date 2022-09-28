<%@ page language="java"  pageEncoding="UTF-8"%>
<%@ page contentType="application/msexcel" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%response.setHeader("Content-disposition","attachment; filename=survey.xls");%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <td>序号</td>
        <td>题目</td>
        <td>选项</td>
        <td>数量</td>
    </tr>
    <c:forEach items="${list}" var="hm" varStatus="c">
    <tr>
        <td>${c.index+1}</td>
        <td>${hm.title}</td>
        <td>${hm.opt}</td>
        <td>${hm.cnt}</td>
    </tr>
    </c:forEach>
</table>
</body>
</html>
