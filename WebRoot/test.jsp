<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/js/commons.jspf" %>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
	<head>
		<title>upload files</title>
		<script>
		var pickerUtil = {};
		pickerUtil.openPickProduct = function(){
			window.open ('utilAction_getFoodList.action','选择产品','height=500,width=400,top=0,left=0,toolbar=no,menubar=no,scrollbars=no, resizable=no,location=no, status=no');
		}
		function oepnWindow(){
			var value = window.open ('testOpen.jsp','选择产品','height=100,width=400,top=0,left=0,toolbar=no,menubar=no,scrollbars=no, resizable=no,location=no, status=no');
			console.log(value.returnValue);
		}
		$(function(){
			$("#productName").click(function(){
				pickerUtil.openPickProduct();
			});
		});
		</script>
	</head>
	<body>
	<div id="test">hello world</div>
	foodName:<input type="text" readonly value="" id="productName"/>
	<button onclick="oepnWindow();">show new window</button>
</html>