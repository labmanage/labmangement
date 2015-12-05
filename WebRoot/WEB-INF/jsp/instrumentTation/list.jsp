<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/js/commons.jspf" %>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>仪器设备管理</title>
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
		                <td width="94%" valign="bottom"><span class="STYLE1">仪器设备列表</span></td>
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
					<a href="${pageContext.request.contextPath }/instrumentTationAction_toInputPage.action">添加仪器设备</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<a href="${pageContext.request.contextPath }/instrumentTationAction_toImportPage.action">导入仪器设备</a>
				</div></td>
				
		  </tr>
		  <tr>
		    <td><table class="dataTable instruTable" width="100%" border="0" cellpadding="0" cellspacing="1" bgcolor="#a8c7ce" onmouseover="changeto()"  onmouseout="changeback()">
		      <tr>
		        <td width="5%" height="20" bgcolor="d3eaef" class="STYLE6" rowspan="2"><div align="center"><span class="STYLE10">序号</span></div></td>
		        <td width="10%" height="20" bgcolor="d3eaef" class="STYLE6" rowspan="2"><div align="center"><span class="STYLE10">仪器设备名称</span></div></td>
		        <td width="10%" height="20" bgcolor="d3eaef" class="STYLE6" rowspan="2"><div align="center"><span class="STYLE10">型号\规格</span></div></td>
		        <td width="10%" height="20" bgcolor="d3eaef" class="STYLE6" colspan="2"><div align="center"><span class="STYLE10">技术指标</span></div></td>
		        <td width="10%" height="20" bgcolor="d3eaef" class="STYLE6" rowspan="2"><div align="center"><span class="STYLE10">生产企业</span></div></td>
		        <td width="10%" height="20" bgcolor="d3eaef" class="STYLE6" rowspan="2"><div align="center"><span class="STYLE10">检定（校验单位）</span></div></td>
		        <td width="10%" height="20" bgcolor="d3eaef" class="STYLE6" colspan="3"><div align="center"><span class="STYLE10">检定（校验）日期（年/月）</span></div></td>
		        <td width="10%" height="20" bgcolor="d3eaef" class="STYLE6" rowspan="2"><div align="center"><span class="STYLE10">备注</span></div></td>
		        <td width="10%" height="20" bgcolor="d3eaef" class="STYLE6" rowspan="2"><div align="center"><span class="STYLE10">操作</span></div></td>
		      </tr>
		      <tr>
		        <td width="10%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">准确度等级</span></div></td>
		        <td width="5%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">分辨率</span></div></td>
		        <td width="5%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">时间一</span></div></td>
		        <td width="5%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">时间二</span></div></td>
		        <td width="5%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">时间三</span></div></td>
		      </tr>
		      <s:if test="#list!=null && #list.size()>0">
		      	<s:iterator value="#list" status="st">
		      		<tr>
				        <td height="20" bgcolor="ffffffFFF" class="STYLE6"><div align="center"><s:property value="#st.index+1"/></div></td>
				        <td height="20" bgcolor="ffffffFFF" class="STYLE19"><div align="center"><s:property value="yqsbmc"/></div></td>
				        <td height="20" bgcolor="ffffffFFF" class="STYLE19"><div align="center"><s:property value="xhgg"/></div></td>
				        <td height="20" bgcolor="ffffffFFF" class="STYLE19"><div align="center"><s:property value="zqddj"/></div></td>
				        <td height="20" bgcolor="ffffffFFF" class="STYLE19"><div align="center"><s:property value="fbl"/></div></td>
				        <td height="20" bgcolor="ffffffFFF" class="STYLE19"><div align="center"><s:property value="scqy"/></div></td>
				        <td height="20" bgcolor="ffffffFFF" class="STYLE19"><div align="center"><s:property value="jddw"/></div></td>
				        <td height="20" bgcolor="ffffffFFF" class="STYLE19"><div align="center"><s:property value="jdny1"/></div></td>
				        <td height="20" bgcolor="ffffffFFF" class="STYLE19"><div align="center"><s:property value="jdny2"/></div></td>
				        <td height="20" bgcolor="ffffffFFF" class="STYLE19"><div align="center"><s:property value="jdny3"/></div></td>
				        <td height="20" bgcolor="ffffffFFF" class="STYLE19"><div align="center"><s:property value="bz"/></div></td>
				     	<td height="20" bgcolor="ffffffFFF"><div align="center" class="STYLE21">
			        			<a href="${pageContext.request.contextPath }/instrumentTationAction_toEditPage.action?id=<s:property value="id"/>" >编辑</a>
								<a class="deleteBtn" href="instrumentTationAction_delete.action?id=<s:property value="id"/>" >删除</a>
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