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
<link href="<%=request.getContextPath()%>/css/calendar-win2k-cold-1.css" type="text/css" rel="stylesheet"/>
    <script type="text/javascript" src="../../js/jquery-3.2.1.min.js"></script>
</head>

<body>
  <table width="98%" border="0" align="center" cellpadding="2" cellspacing="0">
<tr>
    <tH  colspan="4" align="middle"  ><a href="teacherinfo.jsp" target="mainFrame">新增耗材</a></tH>
  </tr>
  <tr>
    <td width="85" align="right">*耗材编号：</td>
    <td  width="169" align="left"><input type="text" name="username" id="mateNo" /></td>
     <td width="106" align="right">*耗材名称：</td>
     <td width="169" align="left"><input type="text" name="username" id="mateName"/></td>
  </tr>
  <tr>
    <td align="right" >*耗材类别：</td>
    <td align="left"><select id="mateCategory" name="sex">
	                      <option value="工具类">工具类</option>
						  <option value="机械类">机械类</option>
	                 </select>  </td>
    <td width="106" align="right" >耗材所属：</td>
    <td width="169" align="left">
    <select  id="mateOwn" name="sex">
	                      <option value="系部">A系部</option>
						  <option value="系部">B系部</option>
	                 </select></td>
  </tr>
  <tr >
    <td align="right">耗材状态：</td>
    <td align="left"><input  id="mateStatus" type="text" name="email" value="" /></td>
    <td align="right">预约人员：</td>
    <td align="left"><input id="matePeople" type="text" name="remark" value="" /></td>
  </tr>
    <tr>
    <td width="85" align="right">*耗材存放地址：</td>
    <td colspan="2" align="left"><input id="mateAddress" type="text" name="username" value="" /></td>
  </tr>
</table>
<table class="buttom" width="98%" border="0" align="center" cellpadding="2" cellspacing="0">
  <tr>
    <td  colspan="2" align="left"  >
   <input type="button" name="Submit2" value="新  增"   onclick="MsgBox()" />
   </td>
    
  </tr>
</table>
</body>
</html>
<script language="javascript">
    function MsgBox()
    {
        $.ajax({
            type:'POST',
            url:'/admin/addMaterial/submit',
            data:{
                "mateNo":$("#mateNo").val(),
                "mateName":$("#mateName").val(),
                "mateCategory":$("#mateCategory").val(),
                "mateOwn":$("#mateOwn").val(),
                "mateStatus":$("#mateStatus").val(),
                "matePeople":$("#matePeople").val(),
                "mateAddress":$("#mateAddress").val()
            },
            success:function(data){
                if(data.status == 1){
                    alert("新增成功");
                }else{
                    alert("新增失败");
                }
            },
            error:function(data){
            }
        })
    }
</script>
