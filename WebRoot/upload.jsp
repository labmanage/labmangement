<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
	<head>
		<title>upload files</title>
	</head>
	<body>
		<form action="projectAndAbilityAction" enctype="multipart/form-data" method="post">
			<input name="file" type="file">
			<input type="submit" value="upload">
		</form>
	</body>
</html>