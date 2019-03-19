<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>新增实验室</title>
<link  rel="stylesheet" type="text/css" href="../../css/page.css" />
  <script type="text/javascript" src="../../js/jquery-3.2.1.min.js"></script>
</head>

<body>
<form name="" action="" method="post">

  <table width="98%" border="0" align="center" cellpadding="2" cellspacing="0">
    <tr>
      <th colspan="2">新增实验室</th>
    </tr>
        <tr>
      <td width="150" align="right">实验室名称：</td>
      <td align="left">
      <input name="qName" type="text" id="qName" />      </td>
    </tr>
        <tr>
      <td width="150" align="right">实验室地址：</td>
      <td align="left">
      <input name="qName" type="text" id="qInfo" />      </td>
    </tr>
        <tr>
      <td width="150" align="right">实验室说明：</td>
      <td align="left">
      <input name="qName" type="text" id="qContent" />      </td>
    </tr>
        <tr>
      <td width="150" align="right">实验室状态：</td>
      <td align="left">
      <input name="qName" type="text" id="qStatus" />      </td>
    </tr>

    <tr>
      <td colspan="2"><input type="button" name="Submit" value="保 存"  onclick="MsgBox()"/>
	  &nbsp; &nbsp; &nbsp; &nbsp;
      <input type="reset" name="Submit2" value="重 置" /></td>
    </tr>
  </table>
</form>

</body>
</html>
<script language="javascript">
    function MsgBox()
    {
        $.ajax({
            type:'POST',
            url:'/admin/addLabray/submit',
            data:{
                "qName":$("#qName").val(),
                "qInfo":$("#qInfo").val(),
                "qContent":$("#qContent").val(),
                "qStatus":$("#qStatus").val()
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
