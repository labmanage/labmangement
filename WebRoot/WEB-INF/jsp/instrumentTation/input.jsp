<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/js/commons.jspf" %>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>仪器设备管理</title>
</head>
<body>
 	<form action="instrumentTationAction_save.action" method="POST">
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
		                			新增仪器设备
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
		    	<!--  	<s:hidden name="id"></s:hidden>
		    		<s:hidden name="user.id"></s:hidden>-->
		    		<table>
		    			
		    			<tr class="STYLE21">
		    				<td>仪器设备名称:</td>
		    				<td><input name="yqsbmc" cssStyle="width: 200px;"/></td>
		    			</tr>
		    			<tr class="STYLE21">
		    				<td>型号\规格:</td>
		    				<td><input name="xhgg"  cssStyle="width: 200px;"/></td>
		    			</tr>
		    			<tr class="STYLE21">
		    				<td>准确度等级:</td>
		    				<td><s:textfield name="zqddj" cssStyle="width: 200px;"/></td>
		    			</tr>
		    			<tr class="STYLE21">
		    				<td>分辨率:</td>
		    				<td><s:textfield name="fbl" cssStyle="width: 200px;"/></td>
		    			</tr>
		    			<tr class="STYLE21">
		    				<td>生产企业:</td>
		    				<td><s:textfield name="scqy" cssStyle="width: 200px;"/></td>
		    			</tr>
		    			<tr class="STYLE21">
		    				<td>检定（校验单位）:</td>
		    				<td><s:textfield name="jddw" cssStyle="width: 200px;"/></td>
		    			</tr>
		    			<tr class="STYLE21">
		    				<td>时间一:</td>
		    				<td><s:textfield name="jdny1" cssStyle="width: 200px;"/></td>
		    			</tr>
		    			<tr class="STYLE21">
		    				<td>时间二:</td>
		    				<td><s:textfield name="jdny2" cssStyle="width: 200px;"/></td>
		    			</tr>
		    			<tr class="STYLE21">
		    				<td>时间三:</td>
		    				<td><s:textfield name="jdny3" cssStyle="width: 200px;"/></td>
		    			</tr>
		    			<tr class="STYLE21">
		    				<td>备注:</td>
		    				<td><s:textarea name="bz" cssStyle="width: 200px;"/></td>
		    			</tr>
		    			<tr class="STYLE21">
		    				<td colspan="2"><input type="submit" value="提交" class="button_ok"/></td>
		    			</tr>
		    		</table>
			 		<br/>
			 		<br/>
			 		
			 		
				</div>
		    </td>
		  </tr>
	</table>
	 	
	</form>
</body>
</html>