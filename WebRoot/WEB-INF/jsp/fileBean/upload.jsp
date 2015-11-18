<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/js/commons.jspf" %>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>食品类参数表</title>
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
		                <td width="94%" valign="bottom"><span class="STYLE1">上传参数</span></td>
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
				</div></td>
		  </tr>
		  <tr>
		    <td>
		    	<form action="fileBeanAction_upload" enctype="multipart/form-data" method="post">
				    <table width="400px" border="0" cellpadding="0" cellspacing="1" bgcolor="#a8c7ce" onmouseover="changeto()"  onmouseout="changeback()">
				      <tr>
				       <td width="50%" height="20" bgcolor="d3eaef" class="STYLE6" ><div align="center"><span class="STYLE10">选择文件</span></div></td>
				        <td width="50%" height="20" bgcolor="d3eaef" class="STYLE6" >
				        	<input name="file" type="file">
				        </td>
				      </tr>
				      <tr>
				       <td width="50%" height="20" bgcolor="d3eaef" class="STYLE6" ><div align="center"><span class="STYLE10">备注</span></div></td>
				        <td width="50%" height="20" bgcolor="d3eaef" class="STYLE6" >
				        	<textarea name="remark"></textarea>
				        </td>
				      </tr>
				      <tr class="STYLE21">
		    			<td colspan="2"><input type="submit" value="提交" class="button_ok"/></td>
		    		  </tr>
				    </table>
				 </form>
		    </td>
		  </tr>
	</table>
</body>
</html>