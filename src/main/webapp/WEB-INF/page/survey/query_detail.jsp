<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>${survey.title}预览</title>
    <link rel="stylesheet" href="../../static/lib/layui-src/css/layui.css" media="all">
    <link rel="stylesheet" href="../../static/css/question.css" media="all">
    <style>
        .bg{
            <c:if test="${survey.bgimg != null}">
                background-image: url("../../upload/${survey.bgimg}");
            </c:if>
           background-size: 100% 100%;
        }
    </style>
</head>
<body>
<div class="layuimini-container bg" style="position: absolute;bottom: 0px;top:0px;left: 0px;right:0px;margin: 0px;">
    <div class="preview" id="preview" style="overflow: auto;">
        <ul class="content">
            <c:forEach items="${survey.questions}" var="question" varStatus="status">
                <c:if test="${question.type == 1  or question.type == 2 }">
                    <div class="radioTemplate spliter" style="clear: both;">
                        <li class="using radio">
                            <input type="hidden">
                            <div class="title">
                                <div class="no_edit"><strong>${status.index+1}、${question.title}</strong></div>
                                <c:if test="${question.remark != null && question.remark != ''}">
                                    <div class="no_edit">${question.remark}</div>
                                </c:if>
                            </div>
                            <div class="options">
                                <ul>
                                    <c:forEach items="${question.options}" var="option">
                                        <li>
                                           <table>
                                               <tr>
                                                   <td>
                                                       <c:if test="${question.type == 1}"><input type="radio" name="r${question.id}"></c:if>
                                                       <c:if test="${question.type == 2}"><input type="checkbox" name="r${question.id}"></c:if>
                                                   </td>
                                                   <td width="900px">${option.opt}</td>
                                                   <td>
                                                       ${option.num}/${total}
                                                   </td>
                                               </tr>
                                           </table>
                                        </li>
                                    </c:forEach>
                                </ul>
                                <div style="clear: both;height: 300px;width: 100%;">
                                    <div style="height: 300px;width: 47%;float: left" id="container${question.id}"></div>
                                    <div style="height: 300px;width: 47%;float: right" id="containerzz${question.id}"></div>
                                </div>
                            </div>
                        </li>
                    </div>
                </c:if>
                <c:if test="${question.type == 3  or question.type == 4 }">
                    <div class="inputTemplate spliter">
                        <li class="using inputx">
                            <input type="hidden">
                            <div class="title">
                                <div class="no_edit"><strong>${status.index+1}、${question.title}</strong></div>
                                <c:if test="${question.remark != null && question.remark != ''}">
                                    <div class="no_edit">${question.remark}</div>
                                </c:if>
                            </div>
                            <div>
                            <c:if test="${question.type == 3 }">
                                <c:forEach items="${question.answerTxts}" var="txt" varStatus="status">
                                      ${status.index+1}.${txt.result}<br>
                                </c:forEach>
                            </c:if>
                               <c:if test="${question.type == 4 }">
                                   <c:forEach items="${question.answerTxts}" var="txt" varStatus="status">
                                       ${status.index+1}.${txt.result}<br>
                                   </c:forEach>
                               </c:if>
                            </div>
                        </li>
                    </div>
                </c:if>
            </c:forEach>
        </ul>
    </div>
</div>



<script src="../../static/lib/layui-src/layui.js" charset="utf-8"></script>
<script src="../../static/js/lay-config.js" charset="utf-8"></script>
<script>
    layui.use(['jquery','layer','echarts'],function () {
        let $ = layui.jquery, layer = layui.layer,echarts = layui.echarts;

        <c:forEach items="${survey.questions}" var="question" varStatus="status">
        <c:if test="${question.type == 1 || question.type == 2}">
        var dom = document.getElementById("container${question.id}");
        var myChart = echarts.init(dom);
        var option;
        option = {
            tooltip: {trigger: 'item'},
            legend: {top: '5%', left: 'center'},
            series: [
                {
                    name: '显示比例',
                    type: 'pie',
                    radius: ['40%', '70%'],
                    avoidLabelOverlap: false,
                    itemStyle: {borderRadius: 10, borderColor: '#fff', borderWidth: 2},
                    label: {show: false, position: 'center'},
                    data: [
                        <c:forEach items="${question.options}" var="option" varStatus="status">
                        {value: ${option.num}, name: '选项${status.index+1}'},
                        </c:forEach>
                    ]
                }
            ]
        };

        if (option && typeof option === 'object') {
            myChart.setOption(option);
        }


        var dom2 = document.getElementById("containerzz${question.id}");
        var myChart2 = echarts.init(dom2);
        var option2;
        option2 = {
            xAxis: {
                type: 'category',
                data: [
                    <c:forEach items="${question.options}" var="option" varStatus="status">
                    '选项${status.index+1}',
                    </c:forEach>
                ]
            },
            yAxis: {
                type: 'value'
            },
            series: [{
                data: [
                    <c:forEach items="${question.options}" var="option">
                    ${option.num},
                    </c:forEach>
                ],
                type: 'bar',
                showBackground: true,
                backgroundStyle: {
                    color: 'rgba(180, 180, 180, 0.2)'
                }
            }]
        };

        if (option2 && typeof option2 === 'object') {
            myChart2.setOption(option2);
        }
        </c:if>
        </c:forEach>


    });
</script>
</body>
</html>