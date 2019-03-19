<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>学生登录</title>
<link  rel="stylesheet" type="text/css" href="../css/page.css" />
<script type="text/javascript" src="../js/jquery-3.2.1.min.js"></script>
</head>

<body>

<br />
<br />
<br />
<br />
<br />
<table width="300" border="0" align="center" cellpadding="2" cellspacing="0">
  <tr>
    <th colspan="2" align="center">登 录 </th>
  </tr>
  <tr>
    <td align="right" >*角色：</td>
    <td align="left"><select  id="flag" name="flag">
                           <option value="管理员">管理员</option>
	                      <option value="学生">学生</option>
						  <option value="老师">老师</option>
	                 </select>  </td>
                     
     </tr>
  <tr>
    <td width="73" align="right">用户名：</td>
    <td width="218"><input type="text" id="username" name="username" /></td>
  </tr>
  <tr>
    <td align="right">密码：</td>
    <td><input type="password" name="password"  id="password" size="22" maxlength="16"/></td>
  </tr>
  <tr>
    <td colspan="2" align="center">
    <input onclick="check();" type="button" name="Submit" id="submit" value="登 录" />
      &nbsp;&nbsp;&nbsp;&nbsp;
      <input name="Submit2" type="reset" value="重 置" />
	   &nbsp;&nbsp;&nbsp;&nbsp;
      <a href="/register">注&nbsp;册</a></td>
  </tr>
</table>
</body>
</html>

<script>
    function check(){
        if(document.getElementById("username").value==""|| document.getElementById("password").value==""){
            alert("请输入用户名密码");
            return false;
        }
        $.ajax({
            type:'POST',
            url:'/login/submit',
            data:{
                "username":$("#username").val(),
                "password":$("#password").val(),
                "flag":$("#flag").val()
            },
            success:function(data){
                if(data.status == '1'){
                    alert("登录成功");
                    if(data.flag == '学生'){
                        setTimeout('window.location.href="/student"', 500);
                    }else if(data.flag =='老师'){
                        setTimeout('window.location.href="/teacher"', 500);
                    }else{
                        setTimeout('window.location.href="/admin"', 500);
                    }
                }else{
                    alert("账号/密码错误");
                }
            },
            error:function(data){
            }
        })
    }
</script>
