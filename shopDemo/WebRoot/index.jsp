<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
  <!-- 数据测试，二级查询都来源于上级 -->
  	List返回数据<br>
   <a href="${pageContext.request.contextPath}/user/selAll.do">代理商查询全部</a><br>
    <a href="${pageContext.request.contextPath}/user/selOne.do">代理商一级查询</a><br>
     <a href="${pageContext.request.contextPath}/user/selTwo.do">代理商二级查询</a><br>
     <a href="${pageContext.request.contextPath}/user/userlogin.do">登录测试</a><br>
      <a href="${pageContext.request.contextPath}/code/selCodePage.do?pageIndex=1">商户分页测试</a><br>
       <a href="${pageContext.request.contextPath}/rank/selPage.do?pageIndex=1">付款分页测试</a><br>
     <hr>
     Map返回Json数据<br>
      <a href="${pageContext.request.contextPath}/code/selAll.do">商户查询全部</a><br>
        Map返回Json数据<br>
      <a href="${pageContext.request.contextPath}/rank/selAll.do">流水连接查询</a><br>
      
  </body>
</html>
