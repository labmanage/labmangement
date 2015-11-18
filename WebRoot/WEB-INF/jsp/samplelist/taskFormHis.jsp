<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/js/commons.jspf"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>请假任务办理</title>
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
												<td width="6%" height="19" valign="bottom"><div align="center">
														<img src="${pageContext.request.contextPath }/images/tb.gif" width="14" height="14" />
													</div></td>
												<td width="94%" valign="bottom"><span class="STYLE1">抽样单申请的任务办理</span></td>
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
			<td>
				<div align="left" class="STYLE21">
					<table width="100%" border="0" cellpadding="0" cellspacing="1" bgcolor="#a8c7ce">
						<tr>
							<td height="25" bgcolor="d3eaef" class="STYLE6">抽样单编号：</td>
							<td width="311" colspan="15" bgcolor="ffffffFFF" class="STYLE6"><p align="left">
									<s:property value="sampleListNum" />
								</p></td>
						</tr>
						<tr>
							<td height="25" width="151" colspan="2" bgcolor="d3eaef" class="STYLE6"><p align="center">任务来源</p></td>
							<td width="311" colspan="7" bgcolor="ffffffFFF" class="STYLE6"><p align="left">山东省食品药品监督管理局</p></td>
							<td width="81" colspan="3" bgcolor="d3eaef" class="STYLE6"><p align="center">区域类型</p></td>
							<td width="164" colspan="4" bgcolor="ffffffFFF" class="STYLE6"><p align="center">
									<s:radio list="#{'0':'城市','1':'乡村','2':'景点'}" name="regionType" />
								</p></td>
						</tr>
						<tr>
							<td width="79" rowspan="4" bgcolor="d3eaef" class="STYLE6"><p align="center">被抽样单位信息</p></td>
							<td height="25" width="73" bgcolor="d3eaef" class="STYLE6"><p align="center">单位名称</p></td>
							<td width="556" colspan="14" bgcolor="ffffffFFF" class="STYLE6"><s:property value="companyName" /></td>
						</tr>
						<tr>
							<td height="25" width="73" bgcolor="d3eaef" class="STYLE6"><p align="center">单位地址</p></td>
							<td width="556" colspan="14" bgcolor="ffffffFFF" class="STYLE6"><s:property value="companyAddress" /></td>
						</tr>
						<tr>
							<td height="25" width="73" valign="middle" bgcolor="d3eaef" class="STYLE6"><p>法人代表</p></td>
							<td width="71" colspan="2" valign="middle" bgcolor="ffffffFFF" class="STYLE6"><p>
									<s:property value="lawerMan" />
								</p></td>
							<td width="85" colspan="3" valign="middle" bgcolor="d3eaef" class="STYLE6"><p align="center">年销售额(万元)</p></td>
							<td width="162" colspan="3" valign="middle" bgcolor="ffffffFFF" class="STYLE6"><p align="left">
									<s:property value="yearSales" />
								</p></td>
							<td width="85" colspan="3" valign="middle" bgcolor="d3eaef" class="STYLE6"><p align="center">营业执照号</p></td>
							<td width="160" colspan="3" valign="middle" bgcolor="ffffffFFF" class="STYLE6"><p>
									<s:property value="businessLicenseNumber" />
								</p></td>
						</tr>
						<tr>
							<td height="25" width="73" valign="middle" bgcolor="d3eaef" class="STYLE6"><p>联系人</p></td>
							<td width="71" colspan="2" valign="middle" bgcolor="ffffffFFF" class="STYLE6"><p>
									<s:property value="contactPerson" />
								</p></td>
							<td width="78" colspan="3" valign="middle" bgcolor="d3eaef" class="STYLE6"><p align="center">电    话</p></td>
							<td width="103" valign="middle" bgcolor="ffffffFFF" class="STYLE6"><p>
									<s:property value="telnumber" />
								</p></td>
							<td width="59" colspan="2" valign="middle" bgcolor="d3eaef" class="STYLE6"><p align="center">传  真</p></td>
							<td width="85" colspan="3" valign="middle" bgcolor="ffffffFFF" class="STYLE6"><p>
									<s:property value="fax" />
								</p></td>
							<td width="43" valign="middle" bgcolor="d3eaef" class="STYLE6"><p align="center">邮编</p></td>
							<td width="117" colspan="2" valign="middle" bgcolor="ffffffFFF" class="STYLE6"><p>
									<s:property value="zipcode" />
								</p></td>
						</tr>
						<tr>
							<td width="79" bgcolor="d3eaef" class="STYLE6"><p align="center">抽样地点</p></td>
							<td width="680" colspan="15" valign="middle" bgcolor="ffffffFFF" class="STYLE6"><p>
									生产环节：
									<s:radio list="#{'0':'原辅料库','1':'生产线','2':'半成品库','3':'待检区','4':'成品库'}" name="productionLink" />
									<br /> 流通环节：
									<s:radio list="#{'0':'超市商店','1':'小食品店','2':'成品库'}" name="circulationLink" />
									<br /> 餐饮环节：
									<s:radio list="#{'0':'餐馆','1':'食堂','2':'小吃店','3':'快餐店','4':'饮品店','5':'旅游景区','6':'集体用餐配送单位','7':'中央厨房','8':'其他'}" name="diningLink" />
									<br />
								</p></td>
						</tr>
						<tr>
							<td width="79" rowspan="11" bgcolor="d3eaef" class="STYLE6"><p align="center">样品信息</p></td>
							<td height="25" width="184" colspan="4" bgcolor="d3eaef" class="STYLE6"><p align="center">样品来源</p></td>
							<td width="444" colspan="11" bgcolor="ffffffFFF" class="STYLE6"><p align="left">
									<s:radio list="#{'0':'加工/自制','1':'委托生产','2':'外购','3':'其他'}" name="sampleSource" />
								</p></td>
						</tr>
						<tr>
							<td height="25" width="184" colspan="4" bgcolor="d3eaef" class="STYLE6"><p align="center">样品属性</p></td>
							<td width="444" colspan="11" bgcolor="ffffffFFF" class="STYLE6"><p align="left">
									<s:radio list="#{'0':'普通食品','1':'特殊膳食食品','2':'节令食品','3':'重大活动保障食品'}" name="sampleAttribute" />
								</p></td>
						</tr>
						<tr>
							<td height="25" width="184" colspan="4" bgcolor="d3eaef" class="STYLE6"><p align="center">样品类型</p></td>
							<td width="550" colspan="11" bgcolor="ffffffFFF" class="STYLE6"><p align="left">
									<s:radio list="#{'0':'食用农产品','1':'工业加工食品','2':'餐饮加工食品','3':'食品添加剂','4':'食品相关产品','5':'其他'}" name="sampleType" />
								</p></td>
						</tr>
						<tr>
							<td height="25" width="184" colspan="4" bgcolor="d3eaef" class="STYLE6"><p align="center">样品名称</p></td>
							<td width="200" colspan="5" bgcolor="ffffffFFF" class="STYLE6"><p align="left">
									<s:property value="sampleName" />
								</p></td>
							<td width="76" bgcolor="d3eaef" class="STYLE6"><p align="center">商标</p></td>
							<td width="169" colspan="5" bgcolor="ffffffFFF" class="STYLE6"><p align="left">
									<s:property value="goodsMark" />
								</p></td>
						</tr>
						<tr>
							<td height="25" width="184" colspan="4" bgcolor="d3eaef" class="STYLE6"><p align="center">□生产/□加工/□购进日期</p></td>
							<td width="200" colspan="5" bgcolor="ffffffFFF" class="STYLE6"><p align="left">
									<s:property value="produceDate" />
								</p></td>
							<td width="76" bgcolor="d3eaef" class="STYLE6"><p align="center">规格型号</p></td>
							<td width="169" colspan="5" bgcolor="ffffffFFF" class="STYLE6"><p align="left">
									<s:property value="model" />
								</p></td>
						</tr>
						<tr>
							<td height="25" width="184" colspan="4" bgcolor="d3eaef" class="STYLE6"><p align="center">样品批号</p></td>
							<td width="200" colspan="5" bgcolor="ffffffFFF" class="STYLE6"><p align="left">
									<s:property value="sampleNum" />
								</p></td>
							<td width="76" bgcolor="d3eaef" class="STYLE6"><p align="center">保质期</p></td>
							<!-- safe_life -->
							<td width="169" colspan="5" bgcolor="ffffffFFF" class="STYLE6"><p align="left">
									<s:property value="safeLife" />
								</p></td>
						</tr>
						<tr>
							<td height="25" width="184" colspan="4" bgcolor="d3eaef" class="STYLE6"><p align="center">执行标准/技术文件</p></td>
							<td width="200" colspan="5" bgcolor="ffffffFFF" class="STYLE6"><p align="left">
									<s:property value="oprativeStandard" />
								</p></td>
							<td width="76" bgcolor="d3eaef" class="STYLE6"><p align="center">质量等级</p></td>
							<td width="169" colspan="5" bgcolor="ffffffFFF" class="STYLE6"><p align="left">
									<s:property value="qualityGrade" />
								</p></td>
						</tr>
						<tr>
							<td height="25" width="184" colspan="4" bgcolor="d3eaef" class="STYLE6"><p align="center">生产许可证编号</p></td>
							<td width="140" colspan="3" bgcolor="ffffffFFF" class="STYLE6"><p align="left">
									<s:property value="produceCode" />
								</p></td>
							<td width="59" colspan="2" bgcolor="d3eaef" class="STYLE6"><p align="center">单价</p></td>
							<td width="76" bgcolor="ffffffFFF" class="STYLE6"><p align="left">
									<s:property value="unitPrice" />
								</p></td>
							<td width="80" colspan="4" bgcolor="d3eaef" class="STYLE6"><p align="center">是否出口</p></td>
							<td width="89" bgcolor="ffffffFFF" class="STYLE6"><p align="center">
									<s:radio list="#{'0':'是','1':'否'}" name="isExports" />
								</p></td>
						</tr>
						<tr>
							<td height="25" width="184" colspan="4" bgcolor="d3eaef" class="STYLE6"><p align="center">抽样基数/批量</p></td>
							<td width="140" colspan="3" bgcolor="ffffffFFF" class="STYLE6"><p align="left">
									<s:property value="sampleBase" />
								</p></td>
							<td width="59" colspan="2" bgcolor="d3eaef" class="STYLE6"><p align="center">抽样数量</p></td>
							<td width="76" bgcolor="ffffffFFF" class="STYLE6"><p align="left">
									<s:property value="sampleQulity" />
								</p></td>
							<td width="80" colspan="4" bgcolor="d3eaef" class="STYLE6"><p align="center">备样数量</p></td>
							<td width="89" bgcolor="ffffffFFF" class="STYLE6"><p align="left">
									<s:property value="samplePrepareQulity" />
								</p></td>
						</tr>
						<tr>
							<td height="25" width="184" colspan="4" bgcolor="d3eaef" class="STYLE6" bgcolor="d3eaef" class="STYLE6"><p align="center">进货量（流通环节）</p></td>
							<td width="200" colspan="5" bgcolor="ffffffFFF" class="STYLE6"><p align="left">
									<s:property value="inComeQulity" />
								</p></td>
							<td width="155" colspan="5" bgcolor="d3eaef" class="STYLE6"><p align="center">库存量（流通环节）</p></td>
							<td width="89" bgcolor="ffffffFFF" class="STYLE6"><p align="left">
									<s:property value="beHaveQulity" />
								</p></td>
						</tr>
						<tr>
							<td height="25" width="184" colspan="4" bgcolor="d3eaef" class="STYLE6"><p align="center">样品形态</p></td>
							<td width="250" colspan="5" bgcolor="ffffffFFF" class="STYLE6"><p align="left">
									<s:radio list="#{'0':'固体','1':'半固体','2':'液体','3':'气体'}" name="sampleShape" />
								</p></td>
							<td width="76" bgcolor="d3eaef" class="STYLE6"><p align="center">包装分类</p></td>
							<td width="169" colspan="5" bgcolor="ffffffFFF" class="STYLE6"><p align="left">
									<s:radio list="#{'0':'散装','1':'预包装'}" name="pakageType" />
								</p></td>
						</tr>
						<tr>
							<td width="79" rowspan="3" bgcolor="d3eaef" class="STYLE6"><p align="center">（标示）生产者信息</p></td>
							<td height="25" width="184" colspan="4" bgcolor="d3eaef" class="STYLE6"><p align="center">生产者名称</p></td>
							<td width="444" colspan="11" bgcolor="ffffffFFF" class="STYLE6"><p align="left">
									<s:property value="producerName" />
								</p></td>
						</tr>
						<tr>
							<td height="25" width="184" colspan="4" bgcolor="d3eaef" class="STYLE6"><p align="center">生产者地址</p></td>
							<td width="444" colspan="11" bgcolor="ffffffFFF" class="STYLE6"><p align="left">
									<s:property value="producerAddress" />
								</p></td>
						</tr>
						<tr>
							<td height="25" width="184" colspan="4" bgcolor="d3eaef" class="STYLE6"><p align="center">生产者联系人</p></td>
							<td width="140" colspan="3" bgcolor="ffffffFFF" class="STYLE6"><p align="left">
									<s:property value="producerContacter" />
								</p></td>
							<td width="135" colspan="3" bgcolor="d3eaef" class="STYLE6"><p align="center">联系电话</p></td>
							<td width="169" colspan="5" valign="middle" bgcolor="ffffffFFF" class="STYLE6"><p align="left">
									<s:property value="producerTel" />
								</p></td>
						</tr>
						<tr>
							<td width="79" rowspan="2" valign="middle" bgcolor="d3eaef" class="STYLE6"><p align="center">抽样时样品的储存条件</p></td>
							<td width="325" colspan="7" rowspan="2" bgcolor="ffffffFFF" class="STYLE6"><s:radio list="#{'0':'常温','1':'冷藏','2':'冷冻','3':'避光','4':'密闭','5':'其他'}" name="sampleStatus" /></td>
							<!-- send_dead_line -->
							<td height="25" width="135" colspan="3" bgcolor="d3eaef" class="STYLE6"><p align="center">寄、送样品截止日期</p></td>
							<td width="169" colspan="5" valign="middle" bgcolor="ffffffFFF" class="STYLE6"><p align="left">
									<s:property value="sendDeadline" />
								</p></td>
						</tr>
						<tr>
							<td height="25" width="135" colspan="3" bgcolor="d3eaef" class="STYLE6"><p align="center">寄送样品地址</p></td>
							<td width="169" colspan="5" valign="middle" bgcolor="ffffffFFF" class="STYLE6"><p align="left">
									<s:property value="sampleSendAddress" />
								</p></td>
						</tr>
						<tr>
							<td width="79" valign="middle" bgcolor="d3eaef" class="STYLE6"><p align="center">
									抽样样品 <br /> 包装
								</p></td>
							<td width="325" colspan="7" bgcolor="ffffffFFF" class="STYLE6"><s:radio list="#{'0':'玻璃瓶','1':'玻璃瓶','2':'塑料袋','3':'无菌袋','4':'其他'}" name="samplePakage" /></td>
							<td width="135" colspan="3" bgcolor="d3eaef" class="STYLE6"><p align="center">抽样方式</p></td>
							<td width="169" colspan="5" bgcolor="ffffffFFF" class="STYLE6"><p align="left">
									<s:radio list="#{'0':'无菌抽样','1':'非无菌抽样'}" name="sampleMethod" />
								</p></td>
						</tr>
						<tr>
							<td width="79" rowspan="2" valign="middle" bgcolor="d3eaef" class="STYLE6"><p align="center">抽样单位信息</p></td>
							<td height="25" width="73" valign="middle" bgcolor="d3eaef" class="STYLE6"><p align="center">单位名称</p></td>
							<td width="300" colspan="6" valign="middle" bgcolor="ffffffFFF" class="STYLE6"><p align="left">
									<s:property value="sampleCompanyName" />
								</p></td>
							<td width="59" valign="middle" bgcolor="d3eaef" class="STYLE6"><p align="center">地址</p></td>
							<td width="300" colspan="7" valign="middle" bgcolor="ffffffFFF" class="STYLE6"><p align="left">
									<s:property value="sampleCompanyAddress" />
								</p></td>
						</tr>
						<tr>
							<td height="25" width="73" valign="middle" bgcolor="d3eaef" class="STYLE6"><p align="center">联系人</p></td>
							<td width="61" valign="middle" bgcolor="ffffffFFF" class="STYLE6"><p align="left">
									<s:property value="sampleCompanyContacter" />
								</p></td>
							<td width="66" colspan="3" valign="middle" bgcolor="d3eaef" class="STYLE6"><p align="center">电话</p></td>
							<td width="125" colspan="2" valign="middle" bgcolor="ffffffFFF" class="STYLE6"><p align="left">
									<s:property value="sampleCompanyTel" />
								</p></td>
							<td width="59" valign="middle" bgcolor="d3eaef" class="STYLE6"><p align="center">传真</p></td>
							<td width="76" colspan="2" valign="middle" bgcolor="ffffffFFF" class="STYLE6"><p align="left">
									<s:property value="sampleCompanyfax" />
								</p></td>
							<td width="52" colspan="3" valign="middle" bgcolor="d3eaef" class="STYLE6"><p align="center">邮编</p></td>
							<td width="117" colspan="2" valign="middle" bgcolor="ffffffFFF" class="STYLE6"><p align="left">
									<s:property value="sampleCompanycode" />
								</p></td>
						</tr>
						<tr>
							<td height="25" width="79" valign="middle" bgcolor="d3eaef" class="STYLE6"><p align="left">备注</p></td>
							<td width="500" colspan="15" valign="middle" bgcolor="ffffffFFF" class="STYLE6"><p>
									<s:property value="remarks" />
								</p></td>
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

</body>
</html>