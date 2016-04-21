<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ include file="/js/commons.jspf" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>banner</title>
</head>
<body>
<table width="100%" border="0" cellspacing="0" cellpadding="0">
    <tr style="background:gray">
      <td width="6%" height="19" valign="bottom"><div align="center"><img src="${basePath}/images/tb.gif" width="14" height="14" /></div></td>
      <td width="94%" valign="bottom"><span class="STYLE1">公告列表</span></td>
    </tr>
</table>
<table class="dataTable" width="100%" border="0" cellpadding="0" cellspacing="1" bgcolor="#a8c7ce" onmouseover="changeto()"  onmouseout="changeback()">
   <tr>
     <td width="70%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">标题</span></div></td>
     <td width="20%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">编辑时间</span></div></td>
     <td width="10%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">上传者</span></div></td>
   </tr>
   <s:if test="#noteList!=null && #noteList.size()>0">
   	<s:iterator value="#noteList" status="st">
   		<tr>
       <td height="20" bgcolor="ffffffFFF" class="STYLE19"><div style="margin-left:20px" align="left"><a href="noteAction_preView.action?id=<s:property value="id"/>"><s:property value="title"/></a></div></td>
       <td height="20" bgcolor="ffffffFFF" class="STYLE19"><div align="center"><s:date name="createTime" format="yyyy-MM-dd HH:mm:ss"/></div></td>
       <td height="20" bgcolor="ffffffFFF" class="STYLE19"><div align="center"><s:property value="publisher.name"/></div></td>
       </td>
   </tr> 
   	</s:iterator>
   </s:if>
    
 </table>
 
 <br><br><br><br><br><br><br><br><br>
<div align="left"><span class="STYLE6">
	<table width="100%" border="0" cellspacing="0" cellpadding="0">
    <tr style="background:gray">
      <td width="6%" height="19" valign="bottom"><div align="center"><img src="${basePath}/images/tb.gif" width="14" height="14" /></div></td>
      <td width="94%" valign="bottom"><span class="STYLE1">功能说明</span></td>
    </tr>
</table>
    1，业务管理。<br />
    2，流程管理。<br />
    3，人员管理。<br />
    4，系统管理。<br />
</span></div>
</body>
</html>