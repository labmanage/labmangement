<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/js/commons.jspf" %>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>公告管理</title>
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
		                <td width="94%" valign="bottom"><span class="STYLE1">公告列表</span></td>
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
		    <form action="noteAction_query.action" method="post">
		    <table class="" width="100%" border="0" cellpadding="0" cellspacing="1" bgcolor="#a8c7ce" onmouseover="changeto()"  onmouseout="changeback()">
		      <tr>
		        <td width="10%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">标题</span></div></td>
		        <td width="40%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="left"><span class="STYLE10"><s:textfield name="title" /></span></div></td>
		        <td width="10%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">编辑时间</span></div></td>
		        <td width="40%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="left"><span class="STYLE10">
		        	从：<s:textfield onClick="new WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',readOnly:true})" name="startTime"><s:param name="value" ><s:date name="startTime" format="yyyy-MM-dd HH:mm:ss" /></s:param></s:textfield>
		        	至：<s:textfield onClick="new WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',readOnly:true})" name="endTime"><s:param name="value" ><s:date name="endTime" format="yyyy-MM-dd HH:mm:ss" /></s:param></s:textfield>
		        </span></div></td>
		      </tr>

			
			<tr>
		        <td width="10%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">状态</span></div></td>
		        <td width="40%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="left"><span class="STYLE10"><s:select name="status" list="#{-1:"所有",0:"非发布",1:"发布" }" /></span></div></td>
		        <td width="10%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">是否过期</span></div></td>
		        <td width="40%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="left"><span class="STYLE10">
		        	<s:select name="isExpired" list="#{-1:"所有",0:"未过期",1:"过期" }" />
		        </span></div></td>
		      </tr>
		      <tr>
		      	<td colspan="4" height="20" bgcolor="ffffff" class="STYLE6">
		      	<input type="submit" class="button_ok" value="查询"/>
		      	<input class="button_ok" type="reset" value="重置" />
		      	<button class="button_ok" onclick="location.href='${pageContext.request.contextPath }/noteAction_toAdd.action'; return false;">添加公告</button>
		      	</td>
		      </tr>
			
		       
		    </table>
		    </form>
		    </td>
		  </tr>
		  <tr>
		    <td><table class="dataTable" width="100%" border="0" cellpadding="0" cellspacing="1" bgcolor="#a8c7ce" onmouseover="changeto()"  onmouseout="changeback()">
		      <tr>
		        <td width="5%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">编号</span></div></td>
		        <td width="20%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">标题</span></div></td>
		        <td width="20%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">编辑时间</span></div></td>
		        <td width="10%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">上传者</span></div></td>
		        <td width="10%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">状态</span></div></td>
		        <td width="20%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">过期时间</span></div></td>
		        <td width="20%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">操作</span></div></td>
		      </tr>
		      <s:if test="#list!=null && #list.size()>0">
		      	<s:iterator value="#list" status="st">
		      		<tr>
				        <td height="20" bgcolor="ffffffFFF" class="STYLE6"><div align="center"><s:property value="#st.index+1"/></div></td>
				        <td height="20" bgcolor="ffffffFFF" class="STYLE19"><div align="center"><s:property value="title"/></div></td>
				        <td height="20" bgcolor="ffffffFFF" class="STYLE19"><div align="center"><s:date name="createTime" format="yyyy-MM-dd HH:mm:ss"/></div></td>
				        <td height="20" bgcolor="ffffffFFF" class="STYLE19"><div align="center"><s:property value="publisher.name"/></div></td>
				        <td height="20" bgcolor="ffffffFFF" class="STYLE19"><div align="center"><s:if test="status==0">未发布</s:if><s:if test="status==1">发布</s:if></div></td>
				        <td height="20" bgcolor="ffffffFFF" class="STYLE19"><div align="center"><s:date name="expireTime" format="yyyy-MM-dd HH:mm:ss"/></div></td>
				         <td height="20" bgcolor="ffffffFFF" class="STYLE19">
				        	<div align="center">
								<a class="deleteBtn"  href="noteAction_delete.action?id=<s:property value="id"/>" >删除</a>
								<a href="noteAction_toEdit.action?id=<s:property value="id"/>" >编辑</a>
								<a href="noteAction_preView.action?id=<s:property value="id"/>" >查看</a>
			            	</div>
			            </td>
				        </td>
				    </tr> 
		      	</s:iterator>
		      </s:if>
		       
		    </table></td>
		  </tr>
	</table>
		<%@ include file="/js/page.jspf" %>
		<script src="${pageContext.request.contextPath }/js/My97DatePickerBeta/My97DatePicker/WdatePicker.js"></script>
</body>
</html>