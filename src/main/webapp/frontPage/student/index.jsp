<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>实验室管理系统</title>

<frameset rows="80,*" cols="*" frameborder="no" border="0" framespacing="0">
  <frame src="/top" name="topFrame" scrolling="No" noresize="noresize" id="topFrame" title="topFrame" />
  <frameset cols="155,*" frameborder="no" border="0" framespacing="0">
    <frame src="student/left" name="leftFrame" scrolling="No" noresize="noresize" id="leftFrame" title="leftFrame" />
     <frame src="student/orderList" name="rightFrame" scrolling="No" noresize="noresize" id="rightFrame" title="rightFrame" />
    <!--
    <frame src="../user/testAction.jsp?action=query" name="mainFrame" id="mainFrame" title="mainFrame" />
  <frame src="UntitledFrame-10"></frameset>
   -->
</html>
