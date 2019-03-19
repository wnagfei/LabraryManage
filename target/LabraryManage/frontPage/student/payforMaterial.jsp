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
    <script type="text/javascript" src="../../js/jquery-3.2.1.min.js"></script>
</head>

<body>
<form name="" action="" method="post">

    <table width="98%" border="0" align="center" cellpadding="2" cellspacing="0">
        <tr>
            <th colspan="2">预约赔偿</th>
        </tr>
        <tr>
            <td width="150" align="right">预约名称：</td>
            <td align="left">
                <input type="text" id="qName" value="${info.materialNo}"/>
            </td>
        </tr>
        <tr>
            <td  align="right">赔偿原因：</td>
            <td align="left">
                <textarea name='infot' id="qInfo"></textarea>      </td>
        </tr>
        <tr>
            <td align="right">赔偿金额：</td>
            <td  align="left"><input  id="qMoney" type="text" name="qName"  /></td>
        </tr>
        <tr>
            <td align="right">赔偿人：</td>
            <td  align="left"><input  id="qPeople" type="text" name="qName"  /></td>
        </tr>

        <tr>
            <td colspan="2"><input type="button" name="Submit" value="提 交"  onclick="MsgBox()"/>
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
            url:'/student/payforMaterial/submit',
            data:{
                "qName":$("#qName").val(),
                "qInfo":$("#qInfo").val(),
                "qPeople":$("#qPeople").val(),
                "qMoney":$("#qMoney").val()
            },
            success:function(data){
                if(data.status == 1){
                    alert("提交成功");
                }else{
                    alert("提交失败");
                }
            },
            error:function(data){
            }
        })
    }
</script>

