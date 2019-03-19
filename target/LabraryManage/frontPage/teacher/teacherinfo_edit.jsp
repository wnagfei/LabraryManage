<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title></title>
<link  rel="stylesheet" type="text/css" href="../../css/page.css" />
<link href="<%=request.getContextPath()%>/css/calendar-win2k-cold-1.css" type="text/css" rel="stylesheet"/>
    <script type="text/javascript" src="../../js/jquery-3.2.1.min.js"></script>
</head>

<body>
  <table width="98%" border="0" align="center" cellpadding="2" cellspacing="0">
<tr>
    <tH  colspan="4" align="middle"  ><a href="../teacher/teacherinfo_edit" target="mainFrame">教师资料修改</a></tH>
  </tr>
  <tr>
    <td width="98" align="right">*姓名：</td>
    <td width="292" align="left"><input type="text" id="userName" name="username" value="" /></td>
    <td width="94" align="right">*班级：</td>
    <td width="299" align="left"><input type="text" id="className" name="name" value="" /></td>
  </tr>
  <tr>
    <td align="right" >*角色：</td>
    <td align="left"><select  id="role" name="sex">
	                      <option value="老师">老师</option>
						  <option value="学生">学生</option>
	                 </select>  </td>
    <td align="right" >性别：</td>
    <td align="left">
    <select  id="sex" name="sex">
	                      <option value="男">男</option>
						  <option value="女">女</option>
	                 </select></td>
  </tr>
  <tr >
    <td align="right">系别：</td>
    <td align="left"><input id="department" type="text" name="email" value="" /></td>
    <td align="right">职称：</td>
    <td align="left"><input id="title" type="text" name="remark" value="" /></td>
  </tr>
<table class="buttom" width="98%" border="0" align="center" cellpadding="2" cellspacing="0">
  <tr>
    <td  colspan="2" align="left"  >
   <input type="button" name="Submit2" value="保  存" onclick="msgbox()" /> </td>
  </tr>
</table>
</body>
</html>

<script>
    function msgbox()
    {
        $.ajax({
            type:'POST',
            url:'/teacher/teacherinfo_edit/submit',
            data:{
                "userName":$("#userName").val(),
                "className":$("#className").val(),
                "role":$("#role").val(),
                "sex":$("#sex").val(),
                "department":$("#department").val(),
                "title":$("#title").val()
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
