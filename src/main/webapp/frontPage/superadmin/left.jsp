<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>实验室管理系统</title>
<link  rel="stylesheet" type="text/css" href="../../css/page.css" />

</head>
 
<body>
<table width="144" border="0" cellpadding="4" cellspacing="0">
 <tr>
    <th class="menu_title" width="139" align="center">实验室管理</th>
  </tr>
  <tr>
    <td align="center"><a href="addLabray" target="mainFrame">新建实验室</a></td>
  </tr>
  <tr>
    <td align="center"><a href="labrayList" target="mainFrame">实验室列表</a></td>
  </tr>
   <tr>
    <th class="menu_title" width="139" align="center">耗材管理</th>
  </tr>
  <tr>
    <td align="center"><a href="addMaterial" target="mainFrame">新建耗材</a></td>
  </tr>
  <tr>
    <td align="center"><a href="MaterialList" target="mainFrame">修改耗材</a></td>
  </tr>
    <tr>
    <td align="center"><a href="payforMaterial" target="mainFrame">赔偿耗材</a></td>
  </tr>
     <tr>
    <td align="center"><a href="repairMaterial" target="mainFrame">报修耗材</a></td>
  </tr>
 <tr>
    <th class="menu_title" width="139" align="center">公告管理</th>
  </tr>
  <tr>
    <td align="center"><a href="addPublic" target="mainFrame">发布公告</a></td>
  </tr>
  <tr>
    <td align="center"><a href="task_list" target="mainFrame">修改公告</a></td>
  </tr>
   <tr>
    <th class="menu_title" width="139" align="center">用户管理</th>
  </tr>
  <tr>
    <td align="center"><a href="addUserinfo" target="mainFrame">新增用户信息</a></td>
  </tr>
  <tr>
    <td align="center"><a href="userinfoList" target="mainFrame">修改用户信息</a></td>
  </tr>

    <th class="menu_title" width="139" align="center">系统管理</th>
  </tr>
  <tr>
    <td align="center"><a href="password" target="mainFrame">密码修改</a></td>
  </tr>
   <tr>
    <td align="center"><a href="/" target="_top">退出</a></td>
  </tr>
</table>
</body>
</html>
