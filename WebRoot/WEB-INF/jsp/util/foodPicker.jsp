<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/js/commons.jspf" %>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>食品类参数表</title>
<script>
$(function(){
	$("#foodParamAndEquipmentTable tr:gt(0)").click(function(){
		$productName = $(this).find("td").eq(1).find("div").html();
		window.opener.document.getElementById("foodPicker").value = $productName;
		window.close();
	});
});
	
</script>
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
		                <td width="94%" valign="bottom"><span class="STYLE1">食品类参数列表</span></td>
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
		    <td><table id="foodParamAndEquipmentTable" width="100%" border="0" cellpadding="0" cellspacing="1" bgcolor="#a8c7ce" onmouseover="changeto()"  onmouseout="changeback()">
		      <tr>
		        <td width="5%" height="20" bgcolor="d3eaef" class="STYLE6" ><div align="center"><span class="STYLE10">序号</span></div></td>
		        <td width="5%" height="20" bgcolor="d3eaef" class="STYLE6" ><div align="center"><span class="STYLE10">产品名称</span></div></td>
		        <td width="5%" height="20" bgcolor="d3eaef" class="STYLE6" ><div align="center"><span class="STYLE10">参数名称</span></div></td>
		        <td width="10%" height="20" bgcolor="d3eaef" class="STYLE6" ><div align="center"><span class="STYLE10">允许变化范围</span></div></td>
		        <td width="10%" height="20" bgcolor="d3eaef" class="STYLE6" ><div align="center"><span class="STYLE10">检验仪器设备名称</span></div></td>
		        <td width="5%" height="20" bgcolor="d3eaef" class="STYLE6" ><div align="center"><span class="STYLE10">分辨力</span></div></td>
		        <td width="5%" height="20" bgcolor="d3eaef" class="STYLE6" ><div align="center"><span class="STYLE10">量程</span></div></td>
		        <td width="5%" height="20" bgcolor="d3eaef" class="STYLE6" ><div align="center"><span class="STYLE10">准确度</span></div></td>
		        <td width="10%" height="20" bgcolor="d3eaef" class="STYLE6" ><div align="center"><span class="STYLE10">按标准能检项目/按标准应检项目</span></div></td>
		        <td width="10%" height="20" bgcolor="d3eaef" class="STYLE6" ><div align="center"><span class="STYLE10">比率</span></div></td>
		        <td width="10%" height="20" bgcolor="d3eaef" class="STYLE6" ><div align="center"><span class="STYLE10">备注</span></div></td>
		      </tr>
		      <s:if test="#list!=null && #list.size()>0">
		      	<s:iterator value="#list">
		      		<tr>
				        <td height="20" bgcolor="#FFFFFF" class="STYLE6"><div align="center"><s:property value="sequence"/></div></td>  
				        <td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center"><s:property value="foodName"/></div></td>
				        <td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center"><s:property value="paramName"/></div></td>
				        <td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center"><s:property value="limit"/></div></td>
				        <td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center"><s:property value="equipment"/></div></td>
				        <td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center"><s:property value="resolution"/></div></td>
				        <td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center"><s:property value="range"/></div></td>
				        <td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center"><s:property value="accuracy"/></div></td>
				        <td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center"><s:property value="canCheckAndShouldCheck"/></div></td>
				        <td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center"><s:property value="rate"/></div></td>
				        <td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center"><s:property value="remark"/></div></td>
				    </tr> 
		      	</s:iterator>
		      </s:if>
		       
		    </table>
		  </tr>
	</table>
</body>
</html>