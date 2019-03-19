<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>注册成功</title>
<link  rel="stylesheet" type="text/css" href="../css/page.css" />
</head>

<body>

<form name="" action="register" method="post" onsubmit="return checkForm();">
  <label>注册成功！请点击</label>
  <a href="/">登 录</a></td>

</form>

<!--

<script language="javascript">

   function checkForm(){
       if(document.forms[0].username.value==""){
	       alert("用户名不能为空");
		   return false;
	   }
	   
	    if(document.forms[0].name.value==""){
	       alert("姓名不能为空");
		   return false;
	   }
	   
	    if(document.forms[0].pwd.value==""){
	       alert("密码不能为空");
		   return false;
	   }
	   
	    if(document.forms[0].pwd.value!=document.forms[0].repwd.value){
            alert("两次密码输入不一致");
            return false;
        }
	
	return true;
	   
   }
</script>
-->
</body>
</html>
