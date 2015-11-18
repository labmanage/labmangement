<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/js/commons.jspf" %>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>检验人员信息管理</title>
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
		                <td width="94%" valign="bottom"><span class="STYLE1">用户信息列表</span></td>
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
					<a href="${pageContext.request.contextPath }/loginAction_toInputPage.action">添加检验人员</a>
				</div></td>
		  </tr>
		  <tr>
		    <td><table width="100%" border="0" cellpadding="0" cellspacing="1" bgcolor="#a8c7ce" onmouseover="changeto()"  onmouseout="changeback()">
		      <tr>
		        <td width="5%" height="20" bgcolor="d3eaef" class="STYLE6" ><div align="center"><span class="STYLE10">序号</span></div></td>
		        <td width="5%" height="20" bgcolor="d3eaef" class="STYLE6" ><div align="center"><span class="STYLE10">姓名</span></div></td>
		        <td width="5%" height="20" bgcolor="d3eaef" class="STYLE6" ><div align="center"><span class="STYLE10">性别</span></div></td>
		        <td width="5%" height="20" bgcolor="d3eaef" class="STYLE6" ><div align="center"><span class="STYLE10">年龄</span></div></td>
		        <td width="5%" height="20" bgcolor="d3eaef" class="STYLE6" ><div align="center"><span class="STYLE10">文化程度</span></div></td>
		        <td width="5%" height="20" bgcolor="d3eaef" class="STYLE6" ><div align="center"><span class="STYLE10">职称</span></div></td>
		        <td width="5%" height="20" bgcolor="d3eaef" class="STYLE6" ><div align="center"><span class="STYLE10">所学专业</span></div></td>
		        <td width="10%" height="20" bgcolor="d3eaef" class="STYLE6" ><div align="center"><span class="STYLE10">从事本技术领域年限</span></div></td>
		        <td width="10%" height="20" bgcolor="d3eaef" class="STYLE6" ><div align="center"><span class="STYLE10">现在部门岗位</span></div></td>
		        <td width="5%" height="20" bgcolor="d3eaef" class="STYLE6" ><div align="center"><span class="STYLE10">本岗位年限</span></div></td>
		        <td width="5%" height="20" bgcolor="d3eaef" class="STYLE6" ><div align="center"><span class="STYLE10">角色</span></div></td>
		        <td width="10%" height="20" bgcolor="d3eaef" class="STYLE6" ><div align="center"><span class="STYLE10">备注</span></div></td>
		        <td width="5%" height="20" bgcolor="d3eaef" class="STYLE6" ><div align="center"><span class="STYLE10">操作</span></div></td>
		      </tr>
		      <s:if test="#list!=null && #list.size()>0">
		      	<s:iterator value="#list">
		      		<tr>
				        <td height="20" bgcolor="ffffffFFF" class="STYLE6"><div align="center"><s:property value="id"/></div></td>  
				        <td height="20" bgcolor="ffffffFFF" class="STYLE19"><div align="center"><s:property value="name"/></div></td>
				        <td height="20" bgcolor="ffffffFFF" class="STYLE19"><div align="center"><s:property value="sex"/></div></td>
				        <td height="20" bgcolor="ffffffFFF" class="STYLE19"><div align="center"><s:property value="age"/></div></td>
				        <td height="20" bgcolor="ffffffFFF" class="STYLE19"><div align="center"><s:property value="education"/></div></td>
				        <td height="20" bgcolor="ffffffFFF" class="STYLE19"><div align="center"><s:property value="jobTitle"/></div></td>
				        <td height="20" bgcolor="ffffffFFF" class="STYLE19"><div align="center"><s:property value="major"/></div></td>
				        <td height="20" bgcolor="ffffffFFF" class="STYLE19"><div align="center"><s:property value="technologyYear"/></div></td>
				        <td height="20" bgcolor="ffffffFFF" class="STYLE19"><div align="center"><s:property value="departmentJobs"/></div></td>
				        <td height="20" bgcolor="ffffffFFF" class="STYLE19"><div align="center"><s:property value="jobYear"/></div></td>
				        <td height="20" bgcolor="ffffffFFF" class="STYLE19"><div align="center"><s:property value="role.name"/></div></td>
				        <td height="20" bgcolor="ffffffFFF" class="STYLE19"><div align="center"><s:property value="remark"/></div></td>
				     	<td height="20" bgcolor="ffffffFFF"><div align="center" class="STYLE21">
			        			<a href="${pageContext.request.contextPath }/loginAction_toEditPage.action?id=<s:property value="id"/>" >编辑</a>
								<a href="loginAction_delete.action?id=<s:property value="id"/>" >删除</a>
				     	</div></td>
				    </tr> 
		      	</s:iterator>
		      </s:if>
		       
		    </table></td>
		  </tr>
	</table>
</body>
</html>