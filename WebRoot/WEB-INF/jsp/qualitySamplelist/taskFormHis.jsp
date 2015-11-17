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
<title>食品检测中心抽样单管理</title>
</head>
<body>
	<s:if test="id == 0">
		<form action="qualityAction_add.action" method="POST">
	</s:if>
	<s:else>
		<form action="qualityAction_update.action" method="POST">
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
				<td width="10%">样品名称</td>
				<td  bgcolor="#fff">
					<s:textfield id="foodPicker" type="text" style="border:none; width:100%" name="name"/>
				</td>
				<td >商标</td>
				<td  bgcolor="#fff">
					<s:textfield type="text" style="border:none; width:100%" name="brand"/>
				</td>
			</tr>
			<tr>
				<td >样品编号</td>
				<td  bgcolor="#fff">
					<s:textfield type="text" style="border:none; width:100%" name="sampleCode"/>
				</td>
				<td >抽样数量</td>
				<td  bgcolor="#fff">
					<s:textfield type="text" style="border:none; width:100%" name="sampleQuantity"/>
				</td>
			</tr>
			<tr>
				<td >抽样地点</td>
				<td  bgcolor="#fff">
					<s:textfield type="text" style="border:none; width:100%" name="place"/>
				</td>
				<td >生产日期</td>
				<td  bgcolor="#fff">
					<s:textfield type="text" style="border:none; width:100%" name="proDate"/>
				</td>
			</tr>
			<tr>
				<td >抽样基数</td>
				<td  bgcolor="#fff">
					<s:textfield type="text" style="border:none; width:100%" name="sampleBase"/>
				</td>
				<td >抽样日期</td>
				<td  bgcolor="#fff">
					<s:textfield type="text" style="border:none; width:100%" name="sampleDate"/>
				</td>
			</tr>
			<tr>
				<td >样品特性</td>
				<td  bgcolor="#fff">
					<s:textfield type="text" style="border:none; width:100%" name="feature"/>
				</td>
				<td >保存条件</td>
				<td  bgcolor="#fff">
					<s:textfield type="text" style="border:none; width:100%" name="saveCondition"/>
				</td>
			</tr>
			<tr>
				<td >抽样方式</td>
				<td colspan="3"  bgcolor="#fff">
					<s:radio name="sampleType" list="#{'总体随机':'总体随机','分层随机':'分层随机','系统随机':'系统随机','整群':'整群','分散':'分散','其他':'其他' }"/>
				</td>
				
			</tr>
			<tr>
				<td >抽样场所</td>
				<td colspan="3"  bgcolor="#fff">
				<s:radio name="samplePlace" list='#{"生产基地":"生产基地","屠宰场":"屠宰场","农贸市场":"农贸市场","批发市场":"批发市场","超市":"超市","其他":"其他" }'/>
				</td>
				
			</tr>
			<tr>
				<td >样品包装</td>
				<td  bgcolor="#fff">
					<s:radio name="samplePackage" list='#{"完好":"完好","不完好":"不完好","无":"无" }'/>
				</td>
				<td >样品名称</td>
				<td  bgcolor="#fff">
					<s:radio name="closure" list='#{"完好":"完好","不完好":"不完好","无":"无" }'/>
				</td>
			</tr>
			<tr>
				<td >检验项目</td>
				<td  bgcolor="#fff">
					<s:textfield type="text" style="border:none; width:100%" name="checkProject"/>
				</td>
				<td >执行标准</td>
				<td  bgcolor="#fff">
					<s:textfield type="text" style="border:none; width:100%" name="standard"/>
				</td>
			</tr>
			<tr>
				<td >企业名称</td>
				<td  bgcolor="#fff">
					<s:textfield type="text" style="border:none; width:100%" name="company"/>
				</td>
				<td >通讯地址</td>
				<td  bgcolor="#fff">
					<s:textfield type="text" style="border:none; width:100%" name="address"/>
				</td>
			</tr>
			<tr>
				<td >联系电话</td>
				<td  bgcolor="#fff">
					<s:textfield type="text" style="border:none; width:100%" name="mobile"/>
				</td>
				<td >邮政编码</td>
				<td  bgcolor="#fff">
					<s:textfield type="text" style="border:none; width:100%" name="postCode"/>
				</td>
			</tr>
			<tr>
				<td >企业性质</td>
				<td  bgcolor="#fff">
					<s:textfield type="text" style="border:none; width:100%" name="companyType"/>
				</td>
				<td >企业规模</td>
				<td  bgcolor="#fff">
					<s:textfield type="text" style="border:none; width:100%" name="companyRange"/>
				</td>
			</tr>
			<tr>
				<td >产品产地</td>
				<td >产品合格证或检疫证号</td>
				<td >产品认证证书编号</td>
				<td >准运证号</td>
			</tr>
			<tr>
				<td  bgcolor="#fff">
					<s:textfield type="text" style="border:none; width:100%" name="proAddress"/>
				</td>
				<td  bgcolor="#fff">
					<s:textfield type="text" style="border:none; width:100%" name="quarantineCode"/>
				</td>
				<td  bgcolor="#fff">
					<s:textfield type="text" style="border:none; width:100%" name="proSignCode"/>
				</td>
				<td  bgcolor="#fff">
					<s:textfield type="text" style="border:none; width:100%" name="permitTransCode"/>
				</td>
			</tr>
			<tr>
				<td >供货商名称及联系方式</td>
				<td colspan="3" bgcolor="#fff">
					<s:textfield type="text" style="border:none; width:100%" name="supplyNameAndContact"/>
				</td>
				
			</tr>
			<tr>
				<td colspan="4">
				<p>抽样人员仔细阅读正面文字，确认后签字：</p>
				<p>  我认真负责地填写了以上抽样单内容，承认填写的合法性，所抽样品系按照严格的抽样程序取得的，该样品具有代表性、真实性和公正性。</p>
				</td>
			</tr>
			<tr>
				<td colspan="2" bgcolor="#fff" width="30%">
					被抽样单位（盖章）<br><br>  
              	 	被抽样单位经手人 （签字） <br><br>         
                    年     月     日<br><br>  
                    (公章）
				</td>
				<td colspan='2' bgcolor="#fff"><br><br>  
					抽样单位（盖章）<br><br>  
              	 	抽样人人 （签字） <br><br>         
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
										<s:date name="dealTime" format="yyyy-MM-dd HH:mm:ss" />
									</div></td>
								<td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center">
										<s:property value="htName" />
									</div></td>
								<td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center">
										<s:property value="message" />
									</div></td>
								<td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center">
										<s:property value="userId" />
									</div></td>
								<td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center">
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
	</form>
</body>
</html>