<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/js/commons.jspf"%>

<%@taglib uri="/struts-tags" prefix="s"%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="${pageContext.request.contextPath }/js/dateWidget/WdatePicker.js"></script>
<title>畜牧局抽样单管理</title>
</head>
<body>
		<form action="laboratoryManagementProcessAction_submitTask.action" method="POST">
		<!-- 任务ID -->
		<s:hidden name="taskId"></s:hidden>
		<!-- 抽样单ID -->
		<s:hidden name="id"></s:hidden>
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

			<tr>
				<td colspan="16" bgcolor="d3eaef" class="STYLE6">抽样单编号：<s:textfield name="sampleListNum" cssStyle="width: 800px;" /></td>
			</tr>
			<tr>
				<td colspan="16" bgcolor="d3eaef" class="STYLE6">任务来自：<s:textfield name="sampleListNum" value="山东畜牧局" cssStyle="width: 800px;" /></td>
			</tr>
			<tr>
				<td colspan="2">抽样地点</td>
				<td colspan="7" bgcolor="#fff">
				<s:radio name="place" list="#{'国家级标准化基地':'国家级标准化基地','省级标准化基地':'省级标准化基地','无公害畜产品基地':'无公害畜产品基地'}"/>
					其他<s:textfield type="text" style="border:none; border-bottom:1px solid black;" name="place"/>
				</td>
			</tr>
			<tr>
				<td  colspan="2">抽样地点所属环节</td>
				<td colspan="7" bgcolor="#fff">
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
				<td colspan='3' bgcolor="#fff"><s:textfield type="text" style="border:none; width:100%; height:100%;" name="mobile"/></td>
			</tr>
			<tr>
				<td colspan="2">抽样类别</td>
				<td colspan="2" bgcolor="#fff">
					<s:radio name="sampleType" list="#{'监督抽检':'监督抽检','风险监测':'风险监测'}" />
				</td>
				<td colspan='2'>食品流通许可证号/动物防疫证号</td>
				<td colspan='3' bgcolor="#fff"><s:textfield type="text" style="border:none; width:100%;" name="foodOrQuarantineNo"/></td>
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
				<td colspan="2" bgcolor="#fff" width="30%">
					抽样人及被抽样单位（人）仔细阅读下面文字，确认后签字：<br>
					我认真负责地填写（提供）了以上内容，确 认填写内容及所抽样品的真实、可靠。<br>
              	 	经办人： <br>               
               		职    务： <br>               
                   年     月     日<br>	
                   (公章）
				</td>
				<td colspan='2'>抽样单位签署</td>
				<td colspan='3' bgcolor="#fff">
					本次抽样已按要求执行完毕，样品经双方人员共同确认，并作记录如上。<br>
					抽样人： <br>                     
               		年     月     日<br>
                    (公章）
				</td>
			<tr>
							<td colspan="18" align="center">
								<table width="100%" border="0" align="center" cellpadding="0"  cellspacing="1" bgcolor="#a8c7ce">
								
									<s:if test="foodlist.size()>0"> 
										
										<tr>
											<td colspan="18"  bgcolor="d3eaef" width="100%" class="STYLE6" align="center" style="font-size: 15">检验项目列表</td>
										</tr>
										<tr>
											<td width="25%" height="20" bgcolor="d3eaef" class="STYLE6" align="center">检验产品</td>
											<td width="25%" height="20" bgcolor="d3eaef" class="STYLE6" align="center">检验参数</td>
											<td width="25%" height="20" bgcolor="d3eaef" class="STYLE6" align="center">允许变化范围</td>
											<td width="25%" height="20" bgcolor="d3eaef" class="STYLE6" align="center">检验标准</td>
										</tr>
										<s:if test="foodlist.size()>0">
											<s:iterator value="foodlist">
												<tr>
													<td height="20" bgcolor="#FFFFFF" class="STYLE6"><s:property value="productName"/> </td>
													<td height="20" bgcolor="#FFFFFF" class="STYLE6"><s:property value="paramName"/> </td>
													<td height="20" bgcolor="#FFFFFF" class="STYLE6"><s:property value="limit"/> </td>
													<td height="20" bgcolor="#FFFFFF" class="STYLE6"><s:property value="canCheckAndShouldCheck"/> </td>
												</tr>
											</s:iterator>
											
										</s:if>
										
								</s:if>
								
								<s:if test="listarray.size()>0"> 
										
										<tr>
											<td colspan="18"  bgcolor="d3eaef" width="100%" class="STYLE6" align="center" style="font-size: 15">检验项目列表</td>
										</tr>
										<tr>
											<td width="20%" height="20" bgcolor="d3eaef" class="STYLE6" align="center">检验产品</td>
											<td width="20%" height="20" bgcolor="d3eaef" class="STYLE6" align="center">检验参数</td>
											<td width="20%" height="20" bgcolor="d3eaef" class="STYLE6" align="center">允许变化范围</td>
											<td width="20%" height="20" bgcolor="d3eaef" class="STYLE6" align="center">检验结果</td>
											<td width="20%" height="20" bgcolor="d3eaef" class="STYLE6" align="center">单项结论</td>
										</tr>
										<s:if test="listarray.size()>0">
											<s:iterator value="listarray">
												<tr>
													<td height="20" bgcolor="#FFFFFF" class="STYLE6"><s:property value="productName"/> </td>
													<td height="20" bgcolor="#FFFFFF" class="STYLE6"><s:property value="paramName"/> </td>
													<td height="20" bgcolor="#FFFFFF" class="STYLE6"><s:property value="limit"/> </td>
													<td height="20" bgcolor="#FFFFFF" class="STYLE6"><s:property value="resultValue"/> </td>
													<td height="20" bgcolor="#FFFFFF" class="STYLE6"><s:property value="singleResult"/> </td>
												</tr>
											</s:iterator>
											
										</s:if>
										
								</s:if>
								
								</table>
							</td>
									
						</tr>
						<tr>
							<td colspan="18" align="center">
								<table width="100%" border="0" align="center" cellpadding="0"  cellspacing="1" bgcolor="#a8c7ce">
								
									<s:if test="workflowBean.htName == '任务接收检验'"> 
										
										<tr>
											<td colspan="18"  bgcolor="d3eaef" width="100%" class="STYLE6" align="center" style="font-size: 15">检验项目列表1</td>
										</tr>
										<tr>
											<td width="25%" height="20" bgcolor="d3eaef" class="STYLE6" align="center">检验产品</td>
											<td width="25%" height="20" bgcolor="d3eaef" class="STYLE6" align="center">检验参数</td>
											<td width="25%" height="20" bgcolor="d3eaef" class="STYLE6" align="center">允许变化范围</td>
											<td width="25%" height="20" bgcolor="d3eaef" class="STYLE6" align="center">检验标准</td>
										</tr>
										<s:if test="listarray != null && listarray.size()>0">
											<s:iterator value="listarray">
												<tr>
													<td height="20" bgcolor="#FFFFFF" class="STYLE6"><input type="text" name="productName" value=<s:property value="productName"/>> </td>
													<td height="20" bgcolor="#FFFFFF" class="STYLE6"><input type="text" name="paramName" value=<s:property value="paramName"/>> </td>
													<td height="20" bgcolor="#FFFFFF" class="STYLE6"><input type="text" name="limit" value=<s:property value="limit"/>> </td>
													<td height="20" bgcolor="#FFFFFF" class="STYLE6"><input type="text" name="canCheckAndShouldCheck" value=<s:property value="canCheckAndShouldCheck"/>></td>
												</tr>
												<tr>
													<td>检验结果</td>
													<td>
														<input type="text" name="resultValue" >
													</td>
													<td>单项结论</td>
													<td><input type="text" name="singleResult" ></td>
												</tr>
											</s:iterator>
											
										</s:if>
										
								</s:if>
								
								</table>
							</td>
									
						</tr>
						<tr>
							<td bgcolor="d3eaef" class="STYLE6">批&emsp;&emsp;注:</td>
							<td colspan="10" bgcolor="#FFFFFF" class="STYLE6"><s:textarea name="comment" cols="120" rows="5"/></td>
						</tr>
					</table>
				 		<!-- -------------------------------------------------------------------------------- -->
				 
					
				 		<!-- 使用连线的名称作为按钮 -->
				 		<s:if test="#outcomeList!=null && #outcomeList.size()>0">
				 			<s:iterator value="#outcomeList">
				 				<input type="submit"  name="outcome" value="<s:property/>" class="button_ok"/>
				 			</s:iterator>
				 		</s:if>
			 		</div>
			 	</form>
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
			                <td width="6%" height="19" valign="bottom"><div align="center"><img src="${pageContext.request.contextPath }/images/tb.gif" width="14" height="14" /></div></td>
			                <td width="94%" valign="bottom"><span class="STYLE1">显示抽样申请的批注信息</span></td>
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
			    <td><table width="100%" border="0" cellpadding="0" cellspacing="1" bgcolor="#a8c7ce" onmouseover="changeto()"  onmouseout="changeback()">
			      <tr>
			        <td width="15%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">时间</span></div></td>
			        <td width="20%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">批注人</span></div></td>
			        <td width="20%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">环节</span></div></td>
			        <td width="25%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">批注信息</span></div></td>
			        <td width="10%" height="20" bgcolor="d3eaef" class="STYLE6"><div align="center"><span class="STYLE10">子流程详细</span></div></td>
			      </tr>
			      <s:iterator value="#commentList">
			      	<tr>
				        <td height="20" bgcolor="#FFFFFF" class="STYLE6"><div align="center"><s:date name="dealTime" format="yyyy-MM-dd HH:mm:ss"/></div></td>
				        <td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center"><s:property value="dealMan"/></div></td>
				        <td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center"><s:property value="htName"/></div></td>
				        <td height="20" bgcolor="#FFFFFF" class="STYLE19"><div align="center"><s:property value="message"/></div></td>
				        <td height="20" bgcolor="#FFFFFF" class="STYLE19">
				       
				      		<s:if test="htName == '任务接收检验'"> 
			 					<a href="${pageContext.request.contextPath }/laboratoryManagementProcessAction_viewSubHisComment.action?taskId=<s:property value="taskId"/>&processInstanceId=<s:property value="processInstanceId"/>" >查看审核记录</a>
			 				</s:if>
				        
				        </td>
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
			                <td width="6%" height="19" valign="bottom"><div align="center"><img src="${pageContext.request.contextPath }/images/tb.gif" width="14" height="14" /></div></td>
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