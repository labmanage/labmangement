<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/js/commons.jspf" %>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>公告管理</title>
</head>
<body>
	<div style="width: 80%; margin:0 auto;">
		<div style="text-align:center; margin-top:20px"><h1><s:property value="title"/></h1></div>
		<div style="width:100%; text-align:center; color:#ccc">
			发布人：<s:property value="publisher.name"/> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			发布时间：<s:date name="createTime" format="yyyy-MM-dd HH:mm:ss"/>
		</div>
		<hr/>
		<div><s:property escape="false" value="content"/></div>
	</div>
</body>
</html>