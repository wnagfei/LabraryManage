<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>发布公告</title>
<link  rel="stylesheet" type="text/css" href="../../css/page.css" />
    <script type="text/javascript" src="../../js/jquery-3.2.1.min.js"></script>
</head>

<body>
  <table width="98%" border="0" align="center" cellpadding="2" cellspacing="0">
    <tr>
      <th colspan="2">发布公告</th>
    </tr>
    <tr>
      <td width="150" align="right">公告名称：</td>
      <td align="left">
      <input name="qName" id="qName" type="text" name="Submit2" />      </td>
    </tr>
     <tr>
      <td  align="right">公告内容：</td>
      <td align="left">
      <textarea id="qInfo" name='Submit2'></textarea>      </td>
    </tr>
	<tr>
      <td align="right">公告开始时间：</td>
      <td  align="left"><input type="datetime" id='startTime' name='Submit2' /></td>
</tr>
	<tr>
      <td align="right">公告失效时间：</td>
      <td  align="left"><input type="datetime" id='endTime' name='Submit2' /></td>
</tr>

    <tr>
      <td colspan="2"><input type="submit" name="Submit" value="保 存"  onclick="MsgBox()"/>
	  &nbsp; &nbsp; &nbsp; &nbsp;
      <input type="reset" name="Submit2" value="重 置" /></td>
    </tr>
  </table>
</body>
</html>
<script>
    function MsgBox(){
        $.ajax({
            type:'POST',
            url:'/teacher/republic_task/submit',
            data:{
                "qName":$("#qName").val(),
                "qInfo":$("#qInfo").val(),
                "startTime":$("#startTime").val(),
                "endTime":$("#endTime").val()
            },
            success:function(data){
                if(data.status == 1){
                    alert("发布成功");
                }else{
                    alert("发布失败");
                }
            },
            error:function(data){
            }
        })
    }
</script>

