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
            window.location.href="/admin/query/order/" + $("#qName").val();
        }
    </script>
</head>

<body>
<table width="98%" border="0" align="center" cellpadding="2" cellspacing="0">
    <tr>
        <th  colspan="8" align="middle"  >实验室归属管理</th>
    </tr>
    <tr>

        <th width="81"><input type="checkbox" />选择</th>
        <th    align="center">实验室名称</th>
        <th    align="center">实验室地址</th>
        <th   align="center">实验室状态</th>
    </tr>
    <c:forEach var="list"   items="${list}">
        <tr>
            <td width="81" align="center"><input type="checkbox" name="id"  /></td>
            <td   align="center">${list.labrayName}</td>
            <td    align="center">${list.labrayAdress}</td>
            <td    align="center">${list.labrayStatus}</td>
        </tr>
    </c:forEach>
</table>
<table class="buttom" width="98%" border="0" align="center" cellpadding="2" cellspacing="0">
    <tr>
        <td  colspan="2" align="left"  >
            <script language="javascript">
                function MsgBox()
                {
                    alert("修改成功");
                }
            </script>
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
<!--
<script language="JavaScript" type="text/JavaScript">
function del()
{
	
	//判断是否选择了项
   if(getCheckBoxValues(document.forms[0].id,",",true)==""){
       alert("请选择要操作的项");
       return false;
   }
   
   if(confirm("确定要要执行此操作吗?")){
	 document.forms[0].action = "questionAction.jsp?action=del";
     return true;
   }
   else{
	 document.forms[0].action = "questionAction.jsp";
     return false;	 
   }
   return false;
}


function edit(id){
    window.location="questionAction.jsp?action=preEdit&id="+id;
}

 
</script>
-->
</body>
</html>
