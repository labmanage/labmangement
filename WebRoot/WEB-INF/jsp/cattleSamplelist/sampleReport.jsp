<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/js/commons.jspf" %>
<%@taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>抽样报告</title>
</head>
<body>
 	<table width="100%" border="0" align="center" cellpadding="0" cellspacing="0">
		  
		  <tr>
		  	<td>
		  		<form action="laboratoryManagementProcessAction_submitTask.action" method="POST">
			  			<!-- 任务ID -->
			  			<s:hidden name="taskId"></s:hidden>
			  			<!-- 抽样单ID -->
			  			<s:hidden name="id"></s:hidden>
				 		<!-- ----------------------------------------------------------------------------------- -->
			
					<table width="100%" border="0" cellpadding="0" cellspacing="1" bgcolor="#a8c7ce">
						  <col width="231" />
						  <col width="72" span="5" />
						  <tr height="18">
						    <td height="18" width="231"  height="25" bgcolor="d3eaef" class="STYLE6">食品名称</td>
						    <td width="72" bgcolor="ffffffFFF" class="STYLE6" bgcolor="ffffffFFF" class="STYLE6"> <s:property value="sampleName" /> </td>
						    <td width="72" >商标</td>
						    <td width="72" bgcolor="ffffffFFF" class="STYLE6" bgcolor="ffffffFFF" class="STYLE6"> <s:property value="goodsMark" />  </td>
						    <td width="72"  bgcolor="d3eaef" class="STYLE6">规格型号</td>
						    <td width="72" bgcolor="ffffffFFF" class="STYLE6"> <s:property value="model" /> </td>
						  </tr>
						  <tr height="18">
						    <td height="18" bgcolor="d3eaef" class="STYLE6">生产/加工/购进日期/食品批号</td>
						    <td colspan="3" bgcolor="ffffffFFF" class="STYLE6" bgcolor="ffffffFFF" class="STYLE6"> <s:property value="produceDate" />  </td>
						    <td  bgcolor="d3eaef" class="STYLE6">质量等级</td>
						    <td bgcolor="ffffffFFF" class="STYLE6"> <s:property value="qualityGrade" />  </td>
						  </tr>
						  <tr height="18">
						    <td height="18" bgcolor="d3eaef" class="STYLE6">被抽检单位名称</td>
						    <td colspan="3" bgcolor="ffffffFFF" class="STYLE6" bgcolor="ffffffFFF" class="STYLE6"> <s:property value="companyName" />  </td>
						    <td bgcolor="d3eaef" class="STYLE6">联系电话</td>
						    <td bgcolor="ffffffFFF" class="STYLE6"> <s:property value="telnumber" />  </td>
						  </tr>
						  <tr height="18">
						    <td height="18" bgcolor="d3eaef" class="STYLE6">标示生产者名称</td>
						    <td colspan="3" bgcolor="ffffffFFF" class="STYLE6" bgcolor="ffffffFFF" class="STYLE6"> <s:property value="producerName" /></td>
						    <td bgcolor="d3eaef" class="STYLE6">联系电话</td>
						    <td bgcolor="ffffffFFF" class="STYLE6" bgcolor="ffffffFFF" class="STYLE6"> <s:property value="producerTel" /></td>
						  </tr>
						  <tr height="18">
						    <td height="18" bgcolor="d3eaef" class="STYLE6">任务来源</td>
						    <td colspan="3" bgcolor="ffffffFFF" class="STYLE6"> <s:property value="taskFrom" />  </td>
						    <td bgcolor="d3eaef" class="STYLE6">抽样人员</td>
						    <td bgcolor="ffffffFFF" class="STYLE6"> <s:property value="" />  </td>
						  </tr>
						  <tr height="18">
						    <td height="18" bgcolor="d3eaef" class="STYLE6">抽样日期</td>
						    <td bgcolor="ffffffFFF" class="STYLE6"> <s:property value="" />  </td>
						    <td colspan="2" bgcolor="d3eaef" class="STYLE6">样品到达日期</td>
						    <td colspan="2" bgcolor="ffffffFFF" class="STYLE6"> <s:property value="" />  </td>
						  </tr>
						  <tr height="18">
						    <td height="18" bgcolor="d3eaef" class="STYLE6">样品数量</td>
						    <td bgcolor="ffffffFFF" class="STYLE6"> <s:property value="sampleQulity" />  </td>
						    <td colspan="2" bgcolor="d3eaef" class="STYLE6">抽样基数</td>
						    <td colspan="2" bgcolor="ffffffFFF" class="STYLE6"> <s:property value="sampleBase" />  </td>
						  </tr>
						  <tr height="18">
						    <td height="18" bgcolor="d3eaef" class="STYLE6">抽样单编号</td>
						    <td bgcolor="ffffffFFF" class="STYLE6"> <s:property value="sampleListNum" />  </td>
						    <td colspan="2" bgcolor="d3eaef" class="STYLE6">检查封样人员</td>
						    <td colspan="2" bgcolor="ffffffFFF" class="STYLE6"> <s:property value="" />  </td>
						  </tr>
						  <tr height="18">
						    <td height="18" bgcolor="d3eaef" class="STYLE6">抽样地点</td>
						    <td bgcolor="ffffffFFF" class="STYLE6"> <s:property value="productionLink" />  </td>
						    <td colspan="2" bgcolor="d3eaef" class="STYLE6">封样状态</td>
						    <td colspan="2" bgcolor="ffffffFFF" class="STYLE6"> <s:property value="sampleShape" />  </td>
						  </tr>
						  <tr height="18">
						    <td height="18" bgcolor="d3eaef" class="STYLE6">检验项目</td>
						    <td colspan="5" bgcolor="ffffffFFF" class="STYLE6"> <s:property value="" />  </td>
						  </tr>
						  <tr height="18">
						    <td height="18" bgcolor="d3eaef" class="STYLE6">检验依据</td>
						    <td colspan="5" bgcolor="ffffffFFF" class="STYLE6"> <s:property value="checkbase" />  </td>
						  </tr>
						  <tr height="18">
						    <td height="18" bgcolor="d3eaef" class="STYLE6">检验结论</td>
						    <td colspan="5" bgcolor="ffffffFFF" class="STYLE6"> <s:property value="singleResult" />  </td>
						  </tr>
						  <tr height="18">
						    <td height="18" bgcolor="d3eaef" class="STYLE6">备注</td>
						    <td colspan="5" bgcolor="ffffffFFF" class="STYLE6"> <s:property value="" />  </td>
						  </tr>
						  <tr height="18">
						    <td height="18" bgcolor="d3eaef" class="STYLE6">批准：</td>
						    <td bgcolor="ffffffFFF" class="STYLE6">  </td>
						    <td bgcolor="d3eaef" class="STYLE6">审核：</td>
						    <td bgcolor="ffffffFFF" class="STYLE6">  </td>
						    <td bgcolor="d3eaef" class="STYLE6">主签：</td>
						    <td bgcolor="ffffffFFF" class="STYLE6">  </td>
						  </tr>
						  <tr height="18">
						    <td height="18" bgcolor="d3eaef" class="STYLE6">检验项目</td>
						    <td bgcolor="d3eaef" class="STYLE6">单位</td>
						    <td bgcolor="d3eaef" class="STYLE6">标准值</td>
						    <td bgcolor="d3eaef" class="STYLE6">检验值</td>
						    <td bgcolor="d3eaef" class="STYLE6">单项结论</td>
						    <td bgcolor="ffffffFFF" class="STYLE6">  </td>
						  </tr>
						  <tr height="18">
						    <td height="18" bgcolor="ffffffFFF" class="STYLE6">  </td>
						    <td bgcolor="ffffffFFF" class="STYLE6">  <s:property value="canshuMc" /> </td>
						    <td bgcolor="ffffffFFF" class="STYLE6">  <s:property value="unit" /> </td>
						    <td bgcolor="ffffffFFF" class="STYLE6">  <s:property value="biaozhunDh" /> </td>
						    <td bgcolor="ffffffFFF" class="STYLE6">  <s:property value="resultValue" /> </td>
						    <td bgcolor="ffffffFFF" class="STYLE6">  <s:property value="singleResult" /> </td>
						  </tr>
					</table>
				</form>
				</td>
				</tr>
				</table>
</body>
</html>