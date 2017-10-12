<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html lang="zh-CN">
	<head>
		<base href="<%=basePath%>">
		<title></title>
		<meta charset="utf-8">
	</head>
	<body>
	        <p class="op-phoneajax-answer-font">
				<span class="c-gap-right"></span>
				<span class="c-gap-right"></span>
				<span</span>
			</p>
			
		<form action="selectNumber">
		<input type="text" name="mobileNumber" placeholder="请输入电话号码">
		<input type="submit" value="查询">
		</form>
		
		
		
		
	</body>
</html>
