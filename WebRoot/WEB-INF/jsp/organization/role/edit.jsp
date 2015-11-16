<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/js/commons.jspf" %>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>角色管理</title>
<script>
	window.pickerFrom = "role";
	$(".pickLabel input").live("click",function(){
		if(!$(this).attr("checked")){
			$(this).parent().remove();
		}
	});
</script>
</head>
<body>
 	<form action="roleAction_update.action" method="POST">
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
		                			修改角色
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
		    		<input type="hidden" name="id" value="<s:property value="id"/>">
		    		<table>
		    			<tr class="STYLE21">
		    				<td>序号:</td>
		    				<td><s:textfield  name="seq"  cssStyle="width: 200px;"></s:textfield>
		    				</td>
		    			</tr>
		    			<tr class="STYLE21">
		    				<td>名称:</td>
		    				<td><s:textfield  name="name"  cssStyle="width: 200px;"></s:textfield>
		    				</td>
		    			</tr>
		    			<tr class="STYLE21">
		    				<td>说明:</td>
		    				<td><s:textfield name="remark"  cssStyle="width: 200px;"></s:textfield></td>
		    			</tr>
		    		
		    			<tr>
		    				<td class="STYLE21">添加用户</td>
		    				<td><input type="input" id="unRoleUserPicker" value="点击添加用户" readonly/></td>
		    			</tr>
		    			<tr>
		    				<td class="STYLE21">用户:</td>
		    				<td id="userArea">
		    					<s:if test="users!=null && users.size()>0">
							      	<s:iterator value="users">
							      	<span class="pickLabel">
							      		<input checked type='checkbox' name='userId' value='<s:property value="id"/>'><s:property value="name"/></span>
							      	</span>
							      	</s:iterator>
						      	</s:if>
		    				</td>
		    			</tr>
		    			
		    			<tr>
		    				<td class="STYLE21">添加权限</td>
		    				<td><input type="input" id="privilegePicker" value="点击添加权限" readonly/></td>
		    			</tr>
		    			<tr>
		    				<td class="STYLE21">权限:</td>
		    				<td id="privilegeArea">
			    				<s:if test="privileges!=null && privileges.size()>0">
							      	<s:iterator value="privileges">
							      	<span class="pickLabel">
							      		<input checked type='checkbox' name='privilegeId' value='<s:property value="id"/>'><s:property value="name"/></span>
							      	</span>
							      	</s:iterator>
						      	</s:if>
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