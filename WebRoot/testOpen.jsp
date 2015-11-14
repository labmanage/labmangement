<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
	<head>
		<title>upload files</title>
		<script>
		function closeWindow(){
			window.opener.document.querySelector("#test").innerHTML = "wociao!";
			window.returnValue = "hhe";
			window.close();
		}
		</script>
	</head>
	<body>
	<button onclick="closeWindow();">close</button>
</html>