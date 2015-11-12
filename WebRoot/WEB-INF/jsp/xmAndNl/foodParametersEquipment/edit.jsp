<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/js/commons.jspf" %>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>食品类参数限值及设备表</title>
</head>
<body>
 	<form action="foodParametersEquipmentAction_edit.action" method="POST">
 		<table width="100%" border="0" align="center" cellpadding="0" cellspacing="0">
		  <tr>
		    <td height="30"><table width="100%" border="0" cellspacing="0" cellpadding="0">
		      <tr>
		        <td height="24" bgcolor="#353c44"><table width="100%" border="0" cellspacing="0" cellpadding="0">
		          <tr>
		            <td><table width="100%" border="0" cellspacing="0" cellpadding="0">
		              <tr>
		                <td width="6%" height="19" valign="bottom"><div align="center"><img src="${pageContext.request.contextPath }/images/tb.gif" width="14" height="14" /></div></td>
		                <td width="94%" valign="bottom">
		                	<span class="STYLE1">
		                			修改食品类参数限值及设备
		                	</span>
		                	</td>
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
		    <td>
		    	<div align="left" class="STYLE21">
		    		<input type="hidden" name="id" value="<s:property value="foodParametersEquipment.id"/>">
		    		<table>
		    		<tr class="STYLE21">
		    				<td>序号:</td>
		    				<td><input type="text" name="sequence" value="<s:property value="foodParametersEquipment.sequence"/>" cssStyle="width: 200px;">
		    				</td>
		    			</tr>
		    			<tr class="STYLE21">
		    				<td>产品名称:</td>
		    				<td><input type="text" name="foodName" value="<s:property value="foodParametersEquipment.foodName"/>" cssStyle="width: 200px;">
		    				</td>
		    			</tr>
		    			<tr class="STYLE21">
		    				<td>参数名称:</td>
		    				<td><input type="text" name="paramName" value="<s:property value="foodParametersEquipment.paramName"/>"  cssStyle="width: 200px;"/></td>
		    			</tr>
		    			<tr class="STYLE21">
		    				<td>允许变化范围:</td>
		    				<td><input type="text"name="limit"  value="<s:property value="foodParametersEquipment.limit"/>" cssStyle="width: 200px;"/></td>
		    			</tr>
		    			<tr class="STYLE21">
		    				<td>检验仪器设备名称:</td>
		    				<td><input type="text"name="equipment" value="<s:property value="foodParametersEquipment.equipment"/>"  cssStyle="width: 200px;"/></td>
		    			</tr>
		    			<tr class="STYLE21">
		    				<td>分辨力:</td>
		    				<td><input type="text"name="resolution"  value="<s:property value="foodParametersEquipment.resolution"/>" cssStyle="width: 200px;"/></td>
		    			</tr>
		    			<tr class="STYLE21">
		    				<td>量程:</td>
		    				<td><input type="text"name="range"  value="<s:property value="foodParametersEquipment.range"/>" cssStyle="width: 200px;"/></td>
		    			</tr>
		    			<tr class="STYLE21">
		    				<td>准确度:</td>
		    				<td><input type="text"name="accuracy"  value="<s:property value="foodParametersEquipment.accuracy"/>" cssStyle="width: 200px;"/></td>
		    			</tr>
		    			<tr class="STYLE21">
		    				<td>按标准能检项目/按标准应检项目:</td>
		    				<td><input type="text"name="canCheckAndShouldCheck"  value="<s:property value="foodParametersEquipment.canCheckAndShouldCheck"/>" cssStyle="width: 200px;"/></td>
		    			</tr>
		    			<tr class="STYLE21">
		    				<td>比率:</td>
		    				<td><input type="text"name="rate"  value="<s:property value="foodParametersEquipment.rate"/>" cssStyle="width: 200px;"/></td>
		    			</tr>
		    			<tr class="STYLE21">
		    				<td>备注:</td>
		    				<td><input type="text"name="remark"  value="<s:property value="foodParametersEquipment.remark"/>" cssStyle="width: 200px;"/></td>
		    			</tr>			
		    			<tr class="STYLE21">
		    				<td colspan="2"><input type="submit" value="提交" />
		    				</td>
		    			</tr>
		    		</table> 
				</div>
		    </td>
		  </tr>
	</table>
	 	
	</form>
</body>
</html>