<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>修改公告</title>
<link  rel="stylesheet" type="text/css" href="../../css/page.css" />
    <script type="text/javascript" src="../../js/jquery-3.2.1.min.js"></script>
</head>

<body>
<form name="" action="" method="post">

  <table width="98%" border="0" align="center" cellpadding="2" cellspacing="0">
    <tr>
      <th colspan="2">修改公告</th>
    </tr>
    <tr>
      <td width="150" align="right">公告名称：</td>
      <td align="left">
      <input name="qName" type="text" id="qName"  value="${info.publicName}"/>      </td>
    </tr>
     
	<tr>
      <td align="right">公告内容：</td>
      <td  align="left"><input type="text" name='corret' value="${info.publicContent}"></input></td>
</tr>
<tr>
      <td align="right">公告开始时间：</td>
      <td  align="left"><input type="datetime" id='starttime' name='starttime' value="<fmt:formatDate value="${info.publicStartTime}" pattern="yyyy-MM-dd"/>"/></td>
</tr>
	<tr>
      <td align="right">公告失效时间：</td>
      <td  align="left"><input type="datetime" id='starttime' name='starttime' value="<fmt:formatDate value="${info.publicEndTime}" pattern="yyyy-MM-dd"/>"/></td>
</tr>
    <tr>
      <td colspan="2"><input type="submit" name="Submit" value="提  交"  onclick="MsgBox()"/>
	  &nbsp; &nbsp; &nbsp; &nbsp;
           <script language="javascript">
      function MsgBox()
      {
        alert("修改成功");
      }
    </script>
      <input type="reset" name="Submit2" value="重 置" /></td>
    </tr>
  </table>
</form>
</body>
</html>
