<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title></title>
<link  rel="stylesheet" type="text/css" href="../css/page.css" />
<script type="text/javascript" src="../js/jquery-3.2.1.min.js"></script>
</head>

<body>

<table width="800"  border="0" align="center" cellpadding="2" cellspacing="0">
  <tr align="right">
    <th colspan="4" align="center">用户注册</th>
  </tr>
  <tr>
    <td width="98" align="right">*姓名：</td>
    <td width="292" align="left"><input type="text" id="username" name="username" value="" /></td>
    <td width="94" align="right">*班级：</td>
    <td width="299" align="left"><input type="text" id="classname" name="classname" value="" /></td>
  </tr>
  <tr>
    <td align="right">*密码：</td>
    <td align="left"><input type="password" id="password1" name="password" value="" size="22" maxlength="16" /></td>
    <td align="right">*重复密码：</td>
    <td align="left"><input name="password2" id="password2" type="password" size="22" maxlength="16" /></td>
  </tr>
  <tr>
    <td align="right" >*角色：</td>
    <td align="left"><select  id="role" name="sex">
	                      <option value="老师">老师</option>
						  <option value="学生">学生</option>
	                 </select>  </td>
    <td align="right" >性别：</td>
    <td align="left"><select id="sex" name="sex">
	                      <option value="男">男</option>
						  <option value="女">女</option>
	                 </select> </td>
  </tr>
  <tr >
    <td align="right">系别：</td>
    <td align="left"><input id="department" type="text" name="email" value="" /></td>
    <td align="right">职称：</td>
    <td align="left"><input id="title" type="text" name="remark" value="" /></td>
  </tr>   
  </tr>
   <tr align="right">
    <td colspan="4" align="center"><input type="submit" onclick="checkForm()" value="提 交"/></a>&nbsp;&nbsp;&nbsp;&nbsp;
      <input type="reset" value="重 置"/> &nbsp;&nbsp;&nbsp;&nbsp;<a href="/">登 录</a></td>
  </tr>
</table>

<script>

   function checkForm(){
       if($("#username").val() == '' || $("#password1").val() == '' ||$("#password2").val() == ''){
	       alert("用户名或密码不能为空");
		   return false;
	   }
	    if($("#classname").val() == ''){
	       alert("班级不能为空");
		   return false;
	   }
	    if($("#department").val() == ''){
	       alert("系别不能为空");
		   return false;
	   }
       if($("#title").val() == ''){
           alert("职称不能为空");
           return false;
       }
	    if($("#password1").val() != $("#password2").val()){
            alert("两次密码输入不一致");
            return false;
        }
       $.ajax({
           type:'POST',
           url:'/register/submit',
           data:{
               "username":$("#username").val(),
               "password1":$("#password1").val(),
               "password2":$("#password2").val(),
               "classname":$("#classname").val(),
               "role":$("#role").val(),
               "sex":$("#sex").val(),
               "department":$("#department").val(),
               "title":$("#title").val(),
           },
           success:function(data){
               if(data.status == 1){
                   alert("注册成功");
                   setTimeout('window.location.href="/register_success"', 500);
               }else{
                   alert("注册失败");
               }
           },
           error:function(data){
           }
       })
   }
</script>

</body>
</html>
