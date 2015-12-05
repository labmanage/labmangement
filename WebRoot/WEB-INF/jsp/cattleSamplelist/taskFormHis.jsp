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
		<form action="cattleAction_add.action" method="POST">
	</s:if>
	<s:else>
		<form action="cattleAction_update.action" method="POST">
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

			<s:hidden name="id" />
			<tr>
				<td colspan="16" bgcolor="d3eaef" class="STYLE6">抽样单编号：<s:textfield name="sampleListNum" cssStyle="width: 800px;" /></td>
			</tr>
			<tr>
				<td colspan="16" bgcolor="d3eaef" class="STYLE6">任务来自：<s:textfield name="sampleListNum" value="山东畜牧局" cssStyle="width: 800px;" /></td>
			</tr>
			<tr>
				<td colspan="2">抽样地点</td>
				<td colspan="7" bgcolor="ffffff">
				<s:radio name="place" list="#{'国家级标准化基地':'国家级标准化基地','省级标准化基地':'省级标准化基地','无公害畜产品基地':'无公害畜产品基地'}"/>
					其他<s:textfield type="text" style="border:none; border-bottom:1px solid black;" name="place"/>
				</td>
			</tr>
			<tr>
				<td  colspan="2">抽样地点所属环节</td>
				<td colspan="7" bgcolor="ffffff">
					<s:radio name="link" list="#{'生产基地':'生产基地','屠宰场':'屠宰场','农贸市场':'农贸市场','批发市场':'批发市场','超市':'超市' }"/>
					其他<s:textfield type="text" style="border:none; border-bottom:1px solid black;" name="link"/>
				</td>
			</tr>
			<tr>
				<td colspan="2">受检单位名称</td>
				<td colspan="7">
					<s:textfield type="text" style="border:none; width:100%;" name="company"/>
				</td>
			</tr>
			<tr>
				<td colspan="2">详细地址</td>
				<td colspan="7">
					<s:textfield type="text" style="border:none; width:100%;" name="address"/>
				</td>
			</tr>
			<tr>
				<td colspan="2">法人代表</td>
				<td colspan="2">
					<s:textfield type="text" style="border:none; width:100%;" name="legalEntity"/>
				</td>
				<td colspan='2'>联系电话</td>
				<td colspan='3' bgcolor="ffffff"><s:textfield type="text" style="border:none; width:100%; height:100%;" name="mobile"/></td>
			</tr>
			<tr>
				<td colspan="2">抽样类别</td>
				<td colspan="2" bgcolor="ffffff">
					<s:radio name="sampleType" list="#{'监督抽检':'监督抽检','风险监测':'风险监测'}" />
				</td>
				<td colspan='2'>食品流通许可证号/动物防疫证号</td>
				<td colspan='3' bgcolor="ffffff"><s:textfield type="text" style="border:none; width:100%;" name="foodOrQuarantineNo"/></td>
			</tr>
			<tr>
				<td colspan="2">样品名称</td>
				<td colspan="7">
					<s:textfield id="foodPicker" type="text" style="border:none; width:100%;" name="name"/>
				</td>
			</tr>
			<tr>
				<td colspan="2">生产单位</td>
				<td colspan="7">
					<s:textfield type="text" style="border:none; width:100%;" name="proCompany"/>
				</td>
			</tr>
			<tr>
				<td colspan="2">生产单位地址</td>
				<td colspan="7">
					<s:textfield type="text" style="border:none; width:100%;" name="proComAddress"/>
				</td>
			</tr>
			<tr>
				<td colspan="2">动物防疫证号</td>
				<td colspan="2">
					<s:textfield type="text" style="border:none; width:100%;" name="foodOrquarantineNo"/>
				</td>
				<td colspan='2'>生产日期</td>
				<td colspan='3'><s:textfield type="text" style="border:none; width:100%;" name="proDate"/></td>
			</tr>
			<tr>
				<td colspan="2">抽样数量</td>
				<td colspan="2">
					<s:textfield type="text" style="border:none; width:100%;" name="sampleCount"/>
				</td>
				<td colspan='2'>抽样基数</td>
				<td colspan='3'><s:textfield type="text" style="border:none; width:100%;" name="sampleBase"/></td>
			</tr>
			<tr>
				<td colspan="2" width="100px;">受检单位签署</td>
				<td colspan="2" bgcolor="ffffff" width="30%">
					抽样人及被抽样单位（人）仔细阅读下面文字，确认后签字：<br>
					我认真负责地填写（提供）了以上内容，确 认填写内容及所抽样品的真实、可靠。<br>
              	 	经办人： <br>               
               		职    务： <br>               
                   年     月     日<br>	
                   (公章）
				</td>
				<td colspan='2'>抽样单位签署</td>
				<td colspan='3' bgcolor="ffffff">
					本次抽样已按要求执行完毕，样品经双方人员共同确认，并作记录如上。<br>
					抽样人： <br>                     
               		年     月     日<br>
                    (公章）
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
				<td><table class="dataTable" width="100%" border="0" cellpadding="0" cellspacing="1" bgcolor="#a8c7ce" onmouseover="changeto()" onmouseout="changeback()">
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
								<td height="20" bgcolor="ffffffFFF" class="STYLE6"><div align="center">
										<s:date name="dealTime" format="yyyy-MM-dd HH:mm:ss" />
									</div></td>
								<td height="20" bgcolor="ffffffFFF" class="STYLE19"><div align="center">
										<s:property value="htName" />
									</div></td>
								<td height="20" bgcolor="ffffffFFF" class="STYLE19"><div align="center">
										<s:property value="message" />
									</div></td>
								<td height="20" bgcolor="ffffffFFF" class="STYLE19"><div align="center">
										<s:property value="userId" />
									</div></td>
								<td height="20" bgcolor="ffffffFFF" class="STYLE19"><div align="center">
										<s:property value="message" />
									</div></td>
							</tr>
						</s:iterator>
						

					</table></td>
			</tr>
		</table>
		<%@ include file="/js/page.jspf"%>
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