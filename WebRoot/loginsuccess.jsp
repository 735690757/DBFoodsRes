<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'loginsuccess.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
    	.re{
    	color: green;
    	}
    	div{
    	width: 200px;
    	height: 200px;
    	margin:0 auto;
    	}
    </style>

  </head>
  
  <body>
    	<div>
    		&nbsp;&nbsp;&nbsp;&nbsp;<p class="re">登陆成功</p> 
    		欢迎用户：<% out.write(request.getParameter("username"));%>登录<br>
    	<a href="website.html">点击回跳</a>
    	</div>
    	
  </body>
</html>
