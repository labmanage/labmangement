<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/js/commons.jspf" %>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>食品类参数表</title>
</head>
<body>
 	<form action="foodParametersAction_save.action" method="POST">
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
		                			新增食品类参数
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
		    	<!--<s:hidden name="user.id"></s:hidden>-->
		    		<table>
		    			<tr class="STYLE21">
		    				<td>项目产品序号:</td>
		    				<td><input name="projectSeq" cssStyle="width: 200px;"/></td>
		    			</tr>
		    			<tr class="STYLE21">
		    				<td>产品名称:</td>
		    				<td><input name="productName" cssStyle="width: 200px;"/></td>
		    			</tr>
		    			<tr class="STYLE21">
		    				<td>参数序号:</td>
		    				<td><input name="paramSeq" cssStyle="width: 200px;"/></td>
		    			</tr>
		    			<tr class="STYLE21">
		    				<td>项目（参数）名称:</td>
		    				<td><s:textfield name="projectName" cssStyle="width: 200px;"/></td>
		    			</tr>
		    			<tr class="STYLE21">
		    				<td>标准代号:</td>
		    				<td><s:textfield name="standardCode" cssStyle="width: 200px;"/></td>
		    			</tr>
		    			<tr class="STYLE21">
		    				<td>标准名称:</td>
		    				<td><s:textfield name="standardName" cssStyle="width: 200px;"/></td>
		    			</tr>
		    			<tr class="STYLE21">
		    				<td>限制范围及说明:</td>
		    				<td><s:textfield name="limitAndDesc" cssStyle="width: 200px;"/></td>
		    			</tr>
		    			<tr class="STYLE21">
		    				<td>备注:</td>
		    				<td><s:textfield name="remark	" cssStyle="width: 200px;"/></td>
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