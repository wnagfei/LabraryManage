<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>学生作业管理系统</title>
<link  rel="stylesheet" type="text/css" href="../../css/page.css" />

</head>

<body >
<table width="144" border="0" cellpadding="2" cellspacing="0">
  <tr>
    <th width="139" align="center">预约管理</th>
  </tr>
      <td align="center"><a href="orderList" target="rightFrame">预约记录</a></td>
  </tr>
  <tr>
    <td align="center"><a href="orderLabray" target="rightFrame">预约实验室</a></td>
  </tr>
    <tr>
   <tr>
    <td align="center"><a href="orderMaterial" target="rightFrame">预约耗材</a></td>
  </tr>
    <tr>
        <td align="center"><a href="/teacher/deleteMaterial" target="rightFrame">报废耗材</a></td>
    </tr>
    <th width="139" align="center">实验室管理</th>
    <tr>
        <td align="center"><a href="/teacher/labrayList" target="rightFrame">实验室归属</a></td>
    </tr>
   <tr>
    <th width="139" align="center">公告管理</th>
  </tr>
      <tr>
    <td align="center"><a href="corretinfo" target="rightFrame">查看公告</a></td>
  </tr>
   <tr>
    <th width="139" align="center">用户管理</th>
  </tr>
  <tr>
    <td align="center"><a href="studentinfo_edit" target="rightFrame">学生信息修改</a></td>
  </tr>
  <tr>
    <td align="center"><a href="/student/password" target="rightFrame">密码修改</a></td>
  </tr>
   <tr>
    <td align="center"><a href="/" target="_top">退出</a></td>
  </tr>
</table>
</body>
</html>
