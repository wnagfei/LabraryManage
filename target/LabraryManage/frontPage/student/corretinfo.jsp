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
        function query(){
            window.location.href="/student/query/public/" + $("#qId").val();
        }
    </script>
</head>

<body>
<table width="800" border="0" align="center" cellpadding="2" cellspacing="0">
<tr>
    <th  colspan="5"  >查看公告</th>
  </tr>
  <tr>
    <td  colspan="5" align="left"  > 查询ID：
      <input  type="text" id="qId" name="qName"  />
      <input type="button" onclick="query()" value="查询 " /></td>
  </tr>
  <tr>
  <th>编号</th>
    <th>公告名称</th>
    <th>公告内容</th>
    <th>公告状态</th>
  </tr>
<c:forEach var="list"   items="${list}">
   <tr>
    <td  align="center">${list.id}</td>
    <td  align="center">${list.publicName}</td>
    <td   align="center">${list.publicContent}</td>
    <td  align="center">发布中</td>
  </tr>
</c:forEach>
  <tr>
     <td colspan="5">
         <a href="">首页</a> 
     
	  <a href=" ">上一页</a> 
	  
	   <a href="">下一页</a>
	
	    <a href="">尾页</a>
	    总共1页&nbsp;当前是1页&nbsp;&nbsp;每页显示 10条
      </td>
  </tr>
</table>
</body>
</html>
