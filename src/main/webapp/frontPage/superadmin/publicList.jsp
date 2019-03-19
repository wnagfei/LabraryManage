<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>实验室管理系统</title>
    <link  rel="stylesheet" type="text/css" href="../../css/page.css" />
    <script type="text/javascript" src="../../js/jquery-3.2.1.min.js"></script>
    <script>
        function query() {
            window.location.href="/teacher/public/query/" + $("#qName").val();
        }
    </script>
</head>

<body>
<table width="98%" border="0" align="center" cellpadding="2" cellspacing="0">
    <tr>
        <th  colspan="4" align="middle"  >实验室管理</th>
    </tr>
    <tr>
        <td  colspan="4" align="left"  >查询名称：
            <input  type="text" name="qName" id="qName"  />
            <input type="button" value="查询" onclick="query()"/></td>
    </tr>
    <tr>

        <th width="51">选择

        <th   width="262" align="center">公告名称</th>
        <th   width="101" align="center">发布内容</th>
        <th width="312"   align="center">操作</th>
    </tr>
    <c:forEach var="list"   items="${list}">
        <tr>
            <td width="51" align="center"><input type="checkbox" name="id" id="id" value="${list.id}" /></td>
            <td   width="262" align="center">${list.publicName}</td>
            <td  width="101" align="center">${list.publicContent}</td>
            <td align="left"><a href="/teacher/corret_task/${list.id}">编辑</a>&nbsp;&nbsp;&nbsp;&nbsp; <a id="delete" href="/teacher/public/delete/${list.id}">删除</a></td>
        </tr>
    </c:forEach>
</table>
<table class="buttom" width="98%" border="0" align="center" cellpadding="2" cellspacing="0">
    <tr>
        <td  colspan="2" align="left"  >
            <a href="/admin/addPublic">
                <input type="button" name="Submit2" value="新 增"  />
            </a>
        </td>
        <td>
            <a href="">首页</a>

            <a href="../admin/ ">上一页</a>

            <a href="">下一页</a>

            <a href="">尾页</a>
            总共1页&nbsp;当前是1页&nbsp;&nbsp;每页显示 10条
        </td>

    </tr>
</table>
</body>
</html>
