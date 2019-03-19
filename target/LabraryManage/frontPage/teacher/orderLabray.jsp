<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>实验室管理系统</title>
<link  rel="stylesheet" type="text/css" href="../css/page.css" />
    <script type="text/javascript" src="../../js/jquery-3.2.1.min.js"></script>
</head>

<body>
  <table width="98%" border="0" align="center" cellpadding="2" cellspacing="0">
    <tr>
      <th colspan="2">预约实验室</th>
    </tr>
    <tr>
      <td width="150" align="right">预约实验室：</td>
      <td align="left">
     <select id="qname" name="sex">
	                      <option value="实验室A">实验室A</option>
						  <option value="实验室B">实验室B</option>
                          <option value="实验室C">实验室C</option>
	                 </select>  </td>
    </tr>
     <tr>
      <td  align="right">预约用途：</td>
      <td align="left">
      <textarea id="qinfo" name='infot'></textarea>      </td>
    </tr>
	<tr>
      <td align="right">预约开始时间：</td>
      <td  align="left"><input type="datetime" id='starttime' name='starttime' /></td>
</tr>
	<tr>
      <td align="right">预约归还日期时间：</td>
      <td  align="left"><input type="datetime" id='endtime' name='starttime' /></td>
</tr>

    <tr>
      <td colspan="2"><input type="submit" name="Submit" value="预  约"  onclick="MsgBox()"/>
	  &nbsp; &nbsp; &nbsp; &nbsp;
      <input type="reset" name="Submit2" value="重 置" /></td>
    </tr>
  </table>
</body>
</html>
<script language="javascript">
    function MsgBox()
    {
        $.ajax({
            type:'POST',
            url:'/teacher/orderLabray/submit',
            data:{
                "qName":$("#qname").val(),
                "qInfo":$("#qinfo").val(),
                "startTime":$("#starttime").val(),
                "endTime":$("#endtime").val()
            },
            success:function(data){
                if(data.status == 1){
                    alert("预约成功");
                }else{
                    alert("预约失败");
                }
            },
            error:function(data){
            }
        })
    }
</script>
