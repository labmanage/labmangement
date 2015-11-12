<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/js/commons.jspf" %>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>仪器设备管理</title>
</head>
<body>
 	<form action="instrumentTationAction_edit.action" method="POST">
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
		                			修改仪器设备
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
		    		<input type="hidden" name="id" value="<s:property value="instrumentTation.id"/>">
		    		<table>
		    			<tr class="STYLE21">
		    				<td>仪器设备名称:</td>
		    				<td><input type="text" name="yqsbmc" value="<s:property value="instrumentTation.yqsbmc"/>" cssStyle="width: 200px;">
		    				</td>
		    			</tr>
		    			<tr class="STYLE21">
		    				<td>型号\规格:</td>
		    				<td><input type="text" name="xhgg" value="<s:property value="instrumentTation.xhgg"/>"  cssStyle="width: 200px;"/></td>
		    			</tr>
		    			<tr class="STYLE21">
		    				<td>准确度等级:</td>
		    				<td><input type="text"name="zqddj"  value="<s:property value="instrumentTation.zqddj"/> cssStyle="width: 200px;"/></td>
		    			</tr>
		    			<tr class="STYLE21">
		    				<td>分辨率:</td>
		    				<td><input type="text"name="fbl" value="<s:property value="instrumentTation.fbl"/>"  cssStyle="width: 200px;"/></td>
		    			</tr>
		    			<tr class="STYLE21">
		    				<td>生产企业:</td>
		    				<td><input type="text"name="scqy"  value="<s:property value="instrumentTation.scqy"/>" cssStyle="width: 200px;"/></td>
		    			</tr>
		    			<tr class="STYLE21">
		    				<td>检定（校验单位）:</td>
		    				<td><input type="text"name="jddw"  value="<s:property value="instrumentTation.jddw"/>" cssStyle="width: 200px;"/></td>
		    			</tr>
		    			<tr class="STYLE21">
		    				<td>时间一:</td>
		    				<td><input type="text"name="jdny1"  value="<s:property value="instrumentTation.jdny1"/>" cssStyle="width: 200px;"/></td>
		    			</tr>
		    			<tr class="STYLE21">
		    				<td>时间二:</td>
		    				<td><input type="text"name="jdny2"  value="<s:property value="instrumentTation.jdny2"/>" cssStyle="width: 200px;"/></td>
		    			</tr>
		    			<tr class="STYLE21">
		    				<td>时间三:</td>
		    				<td><input type="text"name="jdny3"  value="<s:property value="instrumentTation.jdny3"/>" cssStyle="width: 200px;"/></td>
		    			</tr>
		    			<tr class="STYLE21">
		    				<td>备注:</td>
		    				<td><input type="text"name="bz"  value="<s:property value="instrumentTation.bz"/>" cssStyle="width: 200px;"/></td>
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