<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/js/commons.jspf" %>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>子任务历史</title>
</head>
<body>
 	<table width="100%" border="0" align="center" cellpadding="0" cellspacing="0">
		  <tr>
		    <td height="30"><table width="100%" border="0" cellspacing="0" cellpadding="0">
		      <tr>
		        <td height="24" bgcolor="#353c44"><table width="100%" border="0" cellspacing="0" cellpadding="0">
		          <tr>
		            <td><table width="100%" border="0" cellspacing="0" cellpadding="0">
		              <tr>
		                <td width="6%" height="19" valign="bottom"><div align="center"><img src="${pageContext.request.contextPath }/images/tb.gif" width="14" height="14" /></div></td>
		                <td width="94%" valign="bottom"><span class="STYLE1">子任务历史</span></td>
		              </tr>
		            </table></td>
		            <td><div align="right"><span class="STYLE1">
		              </span></div></td>
		          </tr>
		        </table></td>
		      </tr>
		    </table></td>
		  </tr>
		  <tr>
		    <td><table width="100%" border="0" cellpadding="0" cellspacing="1" bgcolor="#a8c7ce" onmouseover="changeto()"  onmouseout="changeback()">
		      <tr>
		        <td width="5%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">编号</span></div></td>
		        <td width="10%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">产品名称</span></div></td>
		        <td width="5%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">参数名称</span></div></td>
		        <td width="15%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">检验人员</span></div></td>
		        <td width="20%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">检验结果</span></div></td>
		        <td width="15%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">检验时间</span></div></td>
		        <td width="5%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">单项结论</span></div></td>
	      		<tr>
			        <td height="20" bgcolor="#FFFFFF" class="STYLE6"><div align="center"><s:property value="id"/></div></td>
			        <td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center"><s:property value="chanpinMc"/></div></td>
			        <td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center"><s:property value="canshuMc"/></div></td>
			        <td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center"><s:property value="checkMan"/></div></td>
			        <td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center"><s:property value="checkResult"/></div></td>
			        <td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center"><s:property value="checkTime"/></div></td>
			        <td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center"><s:property value="resultValue"/></div></td>
		       </tr>
		    </table></td>
		  </tr>
	</table>
</body>
</html>