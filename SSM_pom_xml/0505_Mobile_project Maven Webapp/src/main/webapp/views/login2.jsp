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
				<span class="c-gap-right">手机号码:${mobileinfotable.mobileNumber}</span>
				<span class="c-gap-right">${mobileinfotable.mobileArea}</span>
				<span>${mobileinfotable.mobileType}</span>
			</p>
			
		
		
		
	</body>
</html>
