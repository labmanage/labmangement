<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/js/commons.jspf" %>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>非食品类参数限值及设备表</title>
</head>
<body>
 	<form action="nonFoodParametersEquipmentAction_edit.action" method="POST">
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
		                			修改非食品类参数限值及设备
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
		    		<input type="hidden" name="id" value="<s:property value="nonFoodParametersEquipment.id"/>">
		    		<table>
		    			<tr class="STYLE21">
		    				<td>xuhao:</td>
		    				<td><input type="text" name="xuhao" value="<s:property value="nonFoodParametersEquipment.xuhao"/>" cssStyle="width: 200px;">
		    				</td>
		    			</tr>
		    			<tr class="STYLE21">
		    				<td>产品名称:</td>
		    				<td><input type="text" name="chanpinMc" value="<s:property value="nonFoodParametersEquipment.chanpinMc"/>" cssStyle="width: 200px;">
		    				</td>
		    			</tr>
		    			<tr class="STYLE21">
		    				<td>参数名称:</td>
		    				<td><input type="text" name="canshuMc" value="<s:property value="nonFoodParametersEquipment.canshuMc"/>"  cssStyle="width: 200px;"/></td>
		    			</tr>
		    			<tr class="STYLE21">
		    				<td>允许变化范围:</td>
		    				<td><input type="text"name="yxbhfw"  value="<s:property value="nonFoodParametersEquipment.yxbhfw"/>" cssStyle="width: 200px;"/></td>
		    			</tr>
		    			<tr class="STYLE21">
		    				<td>检验仪器设备名称:</td>
		    				<td><input type="text"name="jyyqsbMc" value="<s:property value="nonFoodParametersEquipment.jyyqsbMc"/>"  cssStyle="width: 200px;"/></td>
		    			</tr>
		    			<tr class="STYLE21">
		    				<td>量程:</td>
		    				<td><input type="text"name="lc"  value="<s:property value="nonFoodParametersEquipment.lc"/>" cssStyle="width: 200px;"/></td>
		    			</tr>
		    			<tr class="STYLE21">
		    				<td>准确度等级:</td>
		    				<td><input type="text"name="zhuqueDj"  value="<s:property value="nonFoodParametersEquipment.zhuqueDj"/>" cssStyle="width: 200px;"/></td>
		    			</tr>
		    			<tr class="STYLE21">
		    				<td>分辨力:</td>
		    				<td><input type="text"name="fbl"  value="<s:property value="nonFoodParametersEquipment.fbl"/>" cssStyle="width: 200px;"/></td>
		    			</tr>
		    			<tr class="STYLE21">
		    				<td>比率:</td>
		    				<td><input type="text"name="bilv"  value="<s:property value="nonFoodParametersEquipment.bilv"/>" cssStyle="width: 200px;"/></td>
		    			</tr>
		    			<tr class="STYLE21">
		    				<td>备注:</td>
		    				<td><input type="text"name="bz"  value="<s:property value="nonFoodParametersEquipment.bz"/>" cssStyle="width: 200px;"/></td>
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