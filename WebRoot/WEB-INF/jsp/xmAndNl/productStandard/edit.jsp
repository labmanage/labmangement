<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/js/commons.jspf" %>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>产品标准库管理</title>
</head>
<body>
 	<form action="productStandardAction_edit.action" method="POST">
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
		                			修改产品标准库
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
		    		<input type="hidden" name="id" value="<s:property value="productStandard.id"/>">
		    		<table>
		    			<tr class="STYLE21">
		    				<td>序号:</td>
		    				<td><input type="text" name="sequence" value="<s:property value="productStandard.sequence"/>" cssStyle="width: 200px;">
		    				</td>
		    			</tr>
		    			<tr class="STYLE21">
		    				<td>分类:</td>
		    				<td><input type="text" name="category" value="<s:property value="productStandard.category"/>" cssStyle="width: 200px;">
		    				</td>
		    			</tr>
		    			<tr class="STYLE21">
		    				<td>产品名称:</td>
		    				<td><input type="text" name="name" value="<s:property value="productStandard.name"/>"  cssStyle="width: 200px;"/></td>
		    			</tr>
		    			<tr class="STYLE21">
		    				<td>标准代号:</td>
		    				<td><input type="text"name="standardCode"  value="<s:property value="productStandard.standardCode"/>" cssStyle="width: 200px;"/></td>
		    			</tr>
		    			<tr class="STYLE21">
		    				<td>标准名称:</td>
		    				<td><input type="text"name="standardName" value="<s:property value="productStandard.standardName"/>"  cssStyle="width: 200px;"/></td>
		    			</tr>
		    			<tr class="STYLE21">
		    				<td>限制范围及说明:</td>
		    				<td><input type="text"name="limitAndDesc"  value="<s:property value="productStandard.limitAndDesc"/>" cssStyle="width: 200px;"/></td>
		    			</tr>
		    			<tr class="STYLE21">
		    				<td>备注:</td>
		    				<td><input type="text"name="remark"  value="<s:property value="productStandard.remark"/>" cssStyle="width: 200px;"/></td>
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