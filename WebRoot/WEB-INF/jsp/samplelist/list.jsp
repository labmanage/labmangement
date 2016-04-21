<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/js/commons.jspf" %>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>抽样单管理</title>
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
		                <td width="94%" valign="bottom"><span class="STYLE1">抽样单流程列表</span></td>
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
					<a href="${pageContext.request.contextPath }/sampleListAction_input.action">添加抽样单申请</a>
				</div></td>
		  </tr> 
		  <tr>
		    <td><table class="dataTable" width="100%" border="0" cellpadding="0" cellspacing="1" bgcolor="#a8c7ce" onmouseover="changeto()"  onmouseout="changeback()">
		      <tr>
		        <td width="5%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">编号</span></div></td>
		        <td width="10%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">申请人</span></div></td>
		        <td width="5%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">被抽检单位名称</span></div></td>
		        <td width="15%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">被抽检法人代表</span></div></td>
		        <td width="20%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">抽样单位名称</span></div></td>
		        <td width="15%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">抽样单位联系人</span></div></td>
		        <td width="5%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">抽样单状态</span></div></td>
		        <td width="25%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">操作</span></div></td>
		      </tr>
		      <s:if test="#list!=null && #list.size()>0">
		      	<s:iterator value="#list">
		      		<tr>
				        <td height="20" bgcolor="ffffffFFF" class="STYLE6"><div align="center"><s:property value="id"/></div></td>
				        <td height="20" bgcolor="ffffffFFF" class="STYLE19"><div align="center"><s:property value="userName"/></div></td>
				        <td height="20" bgcolor="ffffffFFF" class="STYLE19"><div align="center"><s:property value="companyName"/></div></td>
				        <td height="20" bgcolor="ffffffFFF" class="STYLE19"><div align="center"><s:property value="lawerMan"/></div></td>
				        <td height="20" bgcolor="ffffffFFF" class="STYLE19"><div align="center"><s:property value="sampleCompanyName"/></div></td>
				        <td height="20" bgcolor="ffffffFFF" class="STYLE19"><div align="center"><s:property value="sampleCompanyContacter"/></div></td>
				         <td height="20" bgcolor="ffffffFFF" class="STYLE19">
				        	<div align="center">
				        		<s:if test="state==0">
				        			初始录入
				        		</s:if>
				 				<s:elseif test="state==1">
				 					审核中
				 				</s:elseif>
				 				<s:else>
				 					审核完成
				 				</s:else>
			            	</div>
			            </td>
				        <td height="20" bgcolor="ffffffFFF"><div align="center" class="STYLE21">
				        	<s:if test="state==0">
			        			<a href="${pageContext.request.contextPath }/sampleListAction_input.action?id=<s:property value="id"/>" >修改</a>
								<a class="deleteBtn"  href="sampleListAction_delete.action?id=<s:property value="id"/>" >删除</a>
								<a href="${pageContext.request.contextPath }/laboratoryManagementProcessAction_startProcess.action?id=<s:property value="id"/>" >申请抽样检查</a>
			        		</s:if>
			 				<s:elseif test="state==1">
			 					<a href="${pageContext.request.contextPath }/laboratoryManagementProcessAction_viewHisComment.action?id=<s:property value="id"/>" >查看审核记录</a>
			 				</s:elseif>
			 				<s:else>
			 					<a class="deleteBtn"  href="sampleListAction_delete.action?id=<s:property value="id"/>" >删除</a>
			 					<a href="${pageContext.request.contextPath }/laboratoryManagementProcessAction_viewHisComment.action?id=<s:property value="id"/>&processType=0" >查看审核记录</a>
			 					<a href="${pageContext.request.contextPath }/reportExportAction.action?id=<s:property value="id"/>&processType=0" >导出报告</a>
			 				</s:else>
				        	
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