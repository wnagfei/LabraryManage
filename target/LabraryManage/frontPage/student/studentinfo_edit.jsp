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
  </tr>
  <tr>
    <td width="99" align="right">*姓名：</td>
    <td colspan="2" width="259" align="left"><input type="text" id="username" name="username" value="" /></td>
  </tr>
  <tr>
    <td align="right" >*角色：</td>
    <td align="left"><select id="role" name="sex">
	              
						  <option value="学生">学生</option>
                          <option value="老师">老师</option>
	                 </select>  </td>
    <td width="78" align="right" >性别：</td>
    <td width="176" align="left">
    <select  id="sex" name="sex">
	                      <option value="男">男</option>
						  <option value="女">女</option>
	                 </select></td>
  </tr>
  <tr >
    <td align="right">系部：</td>
    <td align="left"><input type="text" id="department" name="email" value="" /></td>
    <td align="right">班级：</td>
    <td align="left"><input type="text" id="classname" name="remark" value="" /></td>
  </tr>
</table>
<table class="buttom" width="98%" border="0" align="center" cellpadding="2" cellspacing="0">
  <tr>
    <td  colspan="2" align="left"  >
   <input type="submit" name="Submit2" value="修  改"   onclick="MsgBox()" />
   </td>
    
  </tr>
</table>
</body>
</html>

<script>
    function MsgBox() {
        $.ajax({
            type:'POST',
            url:'/student/studentinfo_edit/submit',
            data:{
                "username":$("#username").val(),
                "sex":$("#sex").val(),
                "role":$("#role").val(),
                "classname":$("#classname").val(),
                "department":$("#department").val()
            },
            success:function(data){
                if(data.status == 1){
                    alert("修改成功");
                }else{
                    alert("修改失败");
                }
            },
            error:function(data){
            }
        })
    }
</script>
