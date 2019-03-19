<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title></title>
<link  rel="stylesheet" type="text/css" href="../css/page.css" />
  <script type="text/javascript" src="../../js/jquery-3.2.1.min.js"></script>
</head>

<body>
  <table width="300" border="0" align="center" cellpadding="2" cellspacing="0">
  <tr>
    <th colspan="2" align="center">密码修改</th>
  </tr>
  <tr>
    <td width="73" align="right">用户名：</td>
    <td width="218"><input name="text" type="usernmae" id="username"  ></td>
  </tr>
    <tr>
    <td align="right">旧密码：</td>
    <td><input name="password" type="password" id="password1"  ></td>
  </tr>
  <tr>
    <td align="right">新密码：</td>
    <td><input name="password" type="password" id="password2"  ></td>
  </tr>
   <tr>
    <td align="right">确认密码：</td>
    <td><input name="confirmPwd" type="password" id="password3" ></td>
  </tr>
  <tr>
    <td colspan="2" align="center"><input name="BtnSave" type="button" id="BtnSave" onClick="check()" value="　保存　">
      &nbsp;&nbsp;&nbsp;&nbsp;
      <input name="Submit2" type="reset" value="重 置" /></td>
  </tr>
</table>

</body>
</html>

<script>
    function check()
    {
        $.ajax({
            type:'POST',
            url:'/admin/password/submit',
            data:{
                "username":$("#username").val(),
                "password1":$("#password1").val(),
                "password2":$("#password2").val(),
                "password3":$("#password3").val()
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

