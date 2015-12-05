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
<title>无公害抽样单管理</title>
</head>
<body>
	<s:if test="id == 0">
		<form action="pollutionFreeAction_add.action" method="POST">
	</s:if>
	<s:else>
		<form action="pollutionFreeAction_update.action" method="POST">
	</s:else>




		<!-- <table width="100%" border="1" align="center" cellpadding="0" cellspacing="0" > -->
		<table width="100%" border="1" cellpadding="0" cellspacing="0" bgcolor="#a8c7ce" onmouseover="changeto()" onmouseout="changeback()">
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
													<td width="94%" valign="bottom" colspan="5"><span class="STYLE1"> 新增/修改抽样单申请 </span></td>
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
				<td colspan="2">产品名称</td>
				<td  bgcolor="ffffff">
					<s:textfield id="foodPicker" type="text" style="border:none; width:100%" name="name"/>
				</td>
				<td colspan="2">产品编号</td>
				<td  bgcolor="ffffff">
					<s:textfield type="text" style="border:none; width:100%" name="code"/>
				</td>
			</tr>
			<tr>
				<td colspan="2">产品执行标准</td>
				<td  bgcolor="ffffff">
					<s:textfield type="text" style="border:none; width:100%" name="standard"/>
				</td>
				<td colspan="2">包装形式</td>
				<td  bgcolor="ffffff">
					<s:textfield type="text" style="border:none; width:100%" name="spackage"/>
				</td>
			</tr>
			<tr>
				<td colspan="2">产品收获（出厂）日期</td>
				<td  bgcolor="ffffff">
					<s:textfield type="text" style="border:none; width:100%" name="proDate"/>
				</td>
				<td colspan="2">产品保存要求</td>
				<td  bgcolor="ffffff">
					<s:radio name="saveCondition" list='#{"常温":"常温","冷冻":"冷冻","冷藏":"冷藏" }'/>
				</td>
				
			</tr>
			<tr>
				<td rowspan="6" style="" width="20px">抽样单位</td>
				<td width="40px">名称</td>
				<td  bgcolor="ffffff" colspan="4">
					<s:textfield type="text" style="border:none; width:100%" name="comName"/>
				</td>
			</tr>
			<tr>
				<td >通讯地址</td>
				<td  bgcolor="ffffff">
					<s:textfield type="text" style="border:none; width:100%" name="comAddress"/>
				</td>
				<td colspan="2">电话</td>
				<td  bgcolor="ffffff">
					<s:textfield type="text" style="border:none; width:100%" name="comPhone"/>
				</td>
			</tr>
			<tr>
				<td >邮政编码</td>
				<td  bgcolor="ffffff">
					<s:textfield type="text" style="border:none; width:100%" name="comPostCode"/>
				</td>
				<td colspan="2">传真</td>
				<td  bgcolor="ffffff">
					<s:textfield type="text" style="border:none; width:100%" name="comFax"/>
				</td>
			</tr>
			<tr>
				<td >抽样日期</td>
				<td  bgcolor="ffffff">
					<s:textfield type="text" style="border:none; width:100%" name="sampleDate"/>
				</td>
				<td colspan="2">抽样地点</td>
				<td  bgcolor="ffffff">
					<s:textfield type="text" style="border:none; width:100%" name="place"/>
				</td>
			</tr>
			<tr>
				<td >抽样方法</td>
				<td  bgcolor="ffffff">
					<s:textfield type="text" style="border:none; width:100%" name="method"/>
				</td>
				<td colspan="2">采样部位</td>
				<td  bgcolor="ffffff">
					<s:textfield type="text" style="border:none; width:100%" name="part"/>
				</td>
			</tr>
			<tr>
				<td >样品数量</td>
				<td  bgcolor="ffffff">
					<s:textfield type="text" style="border:none; width:100%" name="quantity"/>
				</td>
				<td colspan="2">抽样基数</td>
				<td  bgcolor="ffffff">
					<s:textfield type="text" style="border:none; width:100%" name="sampleBase"/>
				</td>
			</tr>
			<tr>
				<td rowspan="3" width="20px">被抽检单位</td>
				<td >名称</td>
				<td  bgcolor="ffffff">
					<s:textfield type="text" style="border:none; width:100%" name="bcomName"/>
				</td>
				<td colspan="2">电话</td>
				<td  bgcolor="ffffff">
					<s:textfield type="text" style="border:none; width:100%" name="bcomPhone"/>
				</td>
				
			</tr>
			<tr>
				<td >通讯地址</td>
				<td  bgcolor="ffffff" colspan="4">
					<s:textfield type="text" style="border:none; width:100%" name="bcomAddress"/>
				</td>
				
			</tr>
			<tr>
				<td >邮政编码</td>
				<td  bgcolor="ffffff">
					<s:textfield type="text" style="border:none; width:100%" name="bpostCode"/>
				</td>
				<td colspan="2">传真</td>
				<td  bgcolor="ffffff">
					<s:textfield type="text" style="border:none; width:100%" name="bcomFax"/>
				</td>
			</tr>
			
			<tr>
				<td  width="20px">受检单位签署</td>
				<td colspan="2" bgcolor="ffffff">
					被抽样单位（盖章）<br><br>  
              	 	被抽样单位经手人 （签字） <br><br>         
                    年     月     日<br><br>  
                    (公章）
				</td>
				<td width="20px">抽样单位签署</td>
				<td colspan='2' bgcolor="ffffff"><br><br>  
					抽样单位（盖章）<br><br>  
              	 	抽样人人 （签字） <br><br>         
                    年     月     日<br><br>   
                    
				</td>
			</tr>
			<tr>
				<td rowspan="3" width="20px">检测机构填写</td>
				<td colspan="1" bgcolor="ffffff"  width="40px">受理/收样人</td>
				<td  bgcolor="ffffff" colspan="">
					<s:textfield type="text" style="border:none; width:100%" name="receiveUser"/>
				</td>
				<td colspan="1" bgcolor="ffffff" colspan="2">受理/收样人</td>
				<td  bgcolor="ffffff" colspan="2"> 
					<s:textfield type="text" style="border:none; width:100%" name="sendUser"/>
				</td>
			</tr>
			<tr>
				<td colspan="1" bgcolor="ffffff"  width="40px">收样日期</td>
				<td  bgcolor="ffffff" colspan="">
					<s:textfield type="text" style="border:none; width:100%" name="receiveDate"/>
				</td>
				<td colspan="1" bgcolor="ffffff" colspan="2">送样日期</td>
				<td  bgcolor="ffffff" colspan="2">
					<s:textfield type="text" style="border:none; width:100%" name="sendDate"/>
				</td>
			</tr>
			<tr>
				<td colspan="1" bgcolor="ffffff"  width="40px">样品交接时的状况</td>
				<td  bgcolor="ffffff" colspan="4">
					<s:textarea type="text" style="border:none; width:100%" name="sampleSituation"/>
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