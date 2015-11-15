<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/js/commons.jspf"%>

<%@taglib uri="/struts-tags" prefix="s"%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="${pageContext.request.contextPath }/js/dateWidget/WdatePicker.js"></script>
<script>
	$(function(){
		$("input").attr("readonly","readonly");
	});
</script>
<title>畜牧局抽样单管理</title>
</head>
<body>
	<s:if test="id == 0">
		<form action="forestAction_add.action" method="POST">
	</s:if>
	<s:else>
		<form action="forestAction_update.action" method="POST">
	</s:else>
		<!-- <table width="100%" border="1" align="center" cellpadding="0" cellspacing="0" > -->
		<table width="100%" border="0" cellpadding="0" cellspacing="1" bgcolor="#a8c7ce" onmouseover="changeto()" onmouseout="changeback()">
			<tr>
				<td height="30" colspan="16"><table width="100%" border="0" cellspacing="0" cellpadding="0">
						<tr>
							<td height="24" bgcolor="#353c44"><table width="100%" border="0" cellspacing="0" cellpadding="0">
									<tr>
										<td><table width="100%" border="0" cellspacing="0" cellpadding="0">
												<tr>
													<td width="6%" height="19" valign="bottom"><div align="center">
															<img src="${pageContext.request.contextPath }/images/tb.gif" width="14" height="14" />
														</div></td>
													<td width="94%" valign="bottom"><span class="STYLE1"> 新增/修改抽样单申请 </span></td>
												</tr>
											</table></td>
										<td><div align="right">
												<span class="STYLE1"> </span>
											</div></td>
									</tr>
								</table></td>
						</tr>
					</table></td>
			</tr>
		<!-- <table width="100%" border="1" align="center" cellpadding="0" cellspacing="0" > -->
			<s:hidden name="id" />
			<tr>
				<td colspan="1">采样编号</td>
				<td colspan="7" bgcolor="#fff">
					<s:textfield type="text" style="border:none;" name="sampleListNum"/>
				</td>
			</tr>
			<tr>
				<td rowspan="2">任务下达单位</td>
				<td>单位名称</td>
				<td bgcolor="#fff" colspan="2"><s:textfield style="border:none; width:100%" name="taskFrom"/></td>
				<td rowspan="2" colspan="2">检测类别</td>
				<td rowspan="2" colspan="2" bgcolor="#fff">
					<s:radio name="checkType" list='#{"监督抽检":"监督抽检<br>","风险监测":"风险监测"}'/>
				</td>
			</tr>
			<tr>
				<td>通讯地址</td>
				<td bgcolor="#fff" colspan="2"><s:textfield type="text" style="border:none; width:100%" name="taskFromAddress"/></td>
			</tr>
			<tr>
				<td>检测场所</td>
				<td bgcolor="#fff" colspan="7"><s:textfield type="text" style="border:none; width:100%" name="checkPlace"/></td>
			</tr>
			<tr>
				<td>样品名称</td>
				<td bgcolor="#fff"><s:textfield id="foodPicker" type="text" style="border:none; width:100%" name="name"/></td>
				<td>品种</td>
				<td  bgcolor="#fff"><s:textfield type="text" style="border:none; width:100%" name="type"/></td>
				<td>种植面积（亩）</td>
				<td bgcolor="#fff"><s:textfield type="text" style="border:none; width:100%" name="area"/></td>
				<td>亩产量（元/千克）</td>
				<td bgcolor="#fff"><s:textfield type="text" style="border:none; width:100%" name="productive"/></td>
			</tr>
			<tr>
				<td>样品认证及商标</td>
				<td bgcolor="#fff"><s:textfield type="text" style="border:none; width:100%" name="brand"/></td>
				<td>销售单价（元/千克）</td>
				<td  bgcolor="#fff"><s:textfield type="text" style="border:none; width:100%" name="saleUnit"/></td>
				<td>采样时间</td>
				<td bgcolor="#fff"><s:textfield type="text" style="border:none; width:100%" name="sampleDate"/></td>
				<td>采样数量（千克）</td>
				<td bgcolor="#fff"><s:textfield type="text" style="border:none; width:100%" name="sampleQuantity"/></td>
			</tr>
			<tr>
				<td>采样地点</td>
				<td bgcolor="#fff" colspan='7'><s:textfield type="text" style="border:none; width:100%" name="place"/></td>
			</tr>
			<tr>
				<td>单位名称（个人）</td>
				<td bgcolor="#fff"><s:textfield type="text" style="border:none; width:100%" name="comName"/></td>
				<td>联系人</td>
				<td  bgcolor="#fff"><s:textfield type="text" style="border:none; width:100%" name="contactPeople"/></td>
				<td>通信地址</td>
				<td bgcolor="#fff"><s:textfield type="text" style="border:none; width:100%" name="address"/></td>
				<td>联系电话</td>
				<td bgcolor="#fff"><s:textfield type="text" style="border:none; width:100%" name="phone"/></td>
			</tr>
			<tr>
				<td>备注</td>
				<td bgcolor="#fff" colspan="7"><s:textfield type="text" style="border:none; width:100%" name="remark"/></td>
			</tr>
			<tr>
				<td colspan="4" bgcolor="#fff" width="30%">
					受检单位（个人）对所填内容和采样样品有效性无异议在此栏进行签字。<br><br>  
              	 	受检单位（个人） （签字/盖章） <br><br>         
                    年     月     日<br><br>  
                    (公章）
				</td>
				<td colspan='4' bgcolor="#fff"><br><br>  
					抽样人员（签名）： <br><br>                  
               		年     月     日<br><br>  
                    
				</td>
			</tr>
		</table>
		<br> <input type="button" name="button" value="返回" class="button_ok" onclick="javascript:history.go(-1);" />
				</div>
			</td>
		</tr>
	</table>
	<hr>
	<br>
	<s:if test="#commentList!=null && #commentList.size()>0">
		<table width="100%" border="0" align="center" cellpadding="0" cellspacing="0">
			<tr>
				<td height="30"><table width="100%" border="0" cellspacing="0" cellpadding="0">
						<tr>
							<td height="24" bgcolor="#353c44"><table width="100%" border="0" cellspacing="0" cellpadding="0">
									<tr>
										<td><table width="100%" border="0" cellspacing="0" cellpadding="0">
												<tr>
													<td width="6%" height="19" valign="bottom"><div align="center">
															<img src="${pageContext.request.contextPath }/images/tb.gif" width="14" height="14" />
														</div></td>
													<td width="94%" valign="bottom"><span class="STYLE1">显示请假申请的批注信息</span></td>
												</tr>
											</table></td>
										<td><div align="right">
												<span class="STYLE1"> </span>
											</div></td>
									</tr>
								</table></td>
						</tr>
					</table></td>
			</tr>
			<tr>
				<td><table width="100%" border="0" cellpadding="0" cellspacing="1" bgcolor="#a8c7ce" onmouseover="changeto()" onmouseout="changeback()">
						<tr>
							<td width="15%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center">
									<span class="STYLE10">操作时间</span>
								</div></td>
							<td width="10%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center">
									<span class="STYLE10">环节</span>
								</div></td>
							<td width="10%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center">
									<span class="STYLE10">处理方式</span>
								</div></td>
							<td width="10%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center">
									<span class="STYLE10">批注人</span>
								</div></td>
							<td width="75%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center">
									<span class="STYLE10">批注信息</span>
								</div></td>
						</tr>
						<s:iterator value="#commentList">
							<tr>
								<td height="20" bgcolor="#FFFFFF" class="STYLE6"><div align="center">
										<s:date name="time" format="yyyy-MM-dd HH:mm:ss" />
									</div></td>
								<td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center">
										<s:property value="userId" />
									</div></td>
								<td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center">
										<s:property value="fullMessage" />
									</div></td>
								<td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center">
										<s:property value="userId" />
									</div></td>
								<td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center">
										<s:property value="fullMessage" />
									</div></td>
							</tr>
						</s:iterator>


					</table></td>
			</tr>
		</table>
	</s:if>
	<s:else>
		<table width="100%" border="0" align="center" cellpadding="0" cellspacing="0">
			<tr>
				<td height="30"><table width="100%" border="0" cellspacing="0" cellpadding="0">
						<tr>
							<td height="24" bgcolor="#F7F7F7"><table width="100%" border="0" cellspacing="0" cellpadding="0">
									<tr>
										<td><table width="100%" border="0" cellspacing="0" cellpadding="0">
												<tr>
													<td width="6%" height="19" valign="bottom"><div align="center">
															<img src="${pageContext.request.contextPath }/images/tb.gif" width="14" height="14" />
														</div></td>
													<td width="94%" valign="bottom"><span><b>暂时没有批注信息</b></span></td>
												</tr>
											</table></td>
									</tr>
								</table></td>
						</tr>
					</table></td>
			</tr>
		</table>
	</s:else>
	</form>
</body>
</html>