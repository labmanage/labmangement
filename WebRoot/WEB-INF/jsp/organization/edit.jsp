<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/js/commons.jspf" %>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>流程群组管理</title>
</head>
<body>
 	<form action="labGroupUserRuleAction_edit.action" method="POST">
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
		                			修改流程角色
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
		    		<input type="hidden" name="id" value="<s:property value="labGroupUser.id"/>">
		    		<table>
		    			<tr class="STYLE21">
		    				<td>流程模板名称:</td>
		    				<td><input type="text" name="processDefinitionName" value="<s:property value="labGroupUser.processDefinitionName"/>" cssStyle="width: 200px;">
		    				</td>
		    			</tr>
		    			<tr class="STYLE21">
		    				<td>流程实例编号:</td>
		    				<td><input type="text" name="processDefinitionId" value="<s:property value="labGroupUser.processDefinitionId"/>"  cssStyle="width: 200px;"/></td>
		    			</tr>
		    			<tr class="STYLE21">
		    				<td>流程环节名称:</td>
		    				<td><input type="text"name="taskName"  value=<s:property value="labGroupUser.taskName"/> cssStyle="width: 200px;"/></td>
		    			</tr>
		    			<tr class="STYLE21">
		    				<td>人员所属班组:</td>
		    				<td><input type="text"name="groupName" value=<s:property value="labGroupUser.groupName"/>  cssStyle="width: 200px;"/></td>
		    			</tr>
		    			<tr class="STYLE21">
		    				<td>人    员   名  称:</td>
		    				<td><input type="text"name="userName"  value=<s:property value="labGroupUser.userName"/> cssStyle="width: 200px;"/></td>
		    			</tr>
		    			<tr class="STYLE21">
		    				<td>备&emsp;&emsp;&emsp;&emsp;注:</td>
		    				<td>
		    					<textarea name="remark" cols="50" rows="5" value=<s:property value="labGroupUser.remark"/> ></textarea>
		    				</td>
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