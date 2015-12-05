<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/js/commons.jspf" %>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>非食品类参数限值及设备表</title>
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
		                <td width="94%" valign="bottom"><span class="STYLE1">非食品类参数限值及设备列表</span></td>
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
		        <td height="20" bgcolor="ffffffFFF" class="STYLE10" colspan="8"><div align="left">
					<a href="${pageContext.request.contextPath }/nonFoodParametersEquipmentAction_toInputPage.action">添加非食品类参数限值及设备</a>
				</div></td>
		  </tr>
		  <tr>
		    <td><table class="dataTable" width="100%" border="0" cellpadding="0" cellspacing="1" bgcolor="#a8c7ce" onmouseover="changeto()"  onmouseout="changeback()">
		      <tr>
		        <td width="5%" height="20" bgcolor="d3eaef" class="STYLE6" ><div align="center"><span class="STYLE10">序号</span></div></td>
		        <td width="10%" height="20" bgcolor="d3eaef" class="STYLE6" ><div align="center"><span class="STYLE10">产品名称</span></div></td>
		        <td width="10%" height="20" bgcolor="d3eaef" class="STYLE6" ><div align="center"><span class="STYLE10">参数名称</span></div></td>
		        <td width="10%" height="20" bgcolor="d3eaef" class="STYLE6" ><div align="center"><span class="STYLE10">允许变化范围</span></div></td>
		        <td width="10%" height="20" bgcolor="d3eaef" class="STYLE6" ><div align="center"><span class="STYLE10">检验仪器设备名称</span></div></td>
		        <td width="10%" height="20" bgcolor="d3eaef" class="STYLE6" ><div align="center"><span class="STYLE10">量程</span></div></td>
		        <td width="10%" height="20" bgcolor="d3eaef" class="STYLE6" ><div align="center"><span class="STYLE10">准确度等级</span></div></td>
		        <td width="10%" height="20" bgcolor="d3eaef" class="STYLE6" ><div align="center"><span class="STYLE10">分辨力</span></div></td>
		        <td width="10%" height="20" bgcolor="d3eaef" class="STYLE6" ><div align="center"><span class="STYLE10">比率</span></div></td>
		        <td width="10%" height="20" bgcolor="d3eaef" class="STYLE6" ><div align="center"><span class="STYLE10">备注</span></div></td>
		        <td width="10%" height="20" bgcolor="d3eaef" class="STYLE6" ><div align="center"><span class="STYLE10">操作</span></div></td>
		      </tr>
		      <s:if test="#list!=null && #list.size()>0">
		      	<s:iterator value="#list" status="st">
		      		<tr>
				        <td height="20" bgcolor="ffffffFFF" class="STYLE6"><div align="center"><s:property value="#st.index+1"/></div></td>  
				        <td height="20" bgcolor="ffffffFFF" class="STYLE19"><div align="center"><s:property value="productName"/></div></td>
				        <td height="20" bgcolor="ffffffFFF" class="STYLE19"><div align="center"><s:property value="paramName"/></div></td>
				        <td height="20" bgcolor="ffffffFFF" class="STYLE19"><div align="center"><s:property value="limit"/></div></td>
				        <td height="20" bgcolor="ffffffFFF" class="STYLE19"><div align="center"><s:property value="equipment"/></div></td>
				        <td height="20" bgcolor="ffffffFFF" class="STYLE19"><div align="center"><s:property value="range"/></div></td>
				        <td height="20" bgcolor="ffffffFFF" class="STYLE19"><div align="center"><s:property value="curracyLevel"/></div></td>
				        <td height="20" bgcolor="ffffffFFF" class="STYLE19"><div align="center"><s:property value="resolution"/></div></td>
				        <td height="20" bgcolor="ffffffFFF" class="STYLE19"><div align="center"><s:property value="rate"/></div></td>
				        <td height="20" bgcolor="ffffffFFF" class="STYLE19"><div align="center"><s:property value="remark"/></div></td>
				     	<td height="20" bgcolor="ffffffFFF"><div align="center" class="STYLE21">
			        			<a href="${pageContext.request.contextPath }/nonFoodParametersEquipmentAction_toEditPage.action?id=<s:property value="id"/>" >编辑</a>
								<a class="deleteBtn"  href="nonFoodParametersEquipmentAction_delete.action?id=<s:property value="id"/>" >删除</a>
				     	</div></td>
				    </tr> 
		      	</s:iterator>
		      </s:if>
		       
		    </table></td>
		  </tr>
	</table>
	<%@ include file="/js/page.jspf" %>
</body>
</html>