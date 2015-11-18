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
		<!-- <table width="100%" border="1" align="center" cellpadding="0" cellspacing="0" > -->
			<tr>
				<td colspan="1">采样编号</td>
				<td colspan="7" bgcolor="ffffff">
					<s:textfield type="text" style="border:none;" name="sampleListNum"/>
				</td>
			</tr>
			<tr>
				<td rowspan="2">任务下达单位</td>
				<td>单位名称</td>
				<td bgcolor="ffffff" colspan="2"><s:textfield style="border:none; width:100%" name="taskFrom"/></td>
				<td rowspan="2" colspan="2">检测类别</td>
				<td rowspan="2" colspan="2" bgcolor="ffffff">
					<s:radio name="checkType" list='#{"监督抽检":"监督抽检<br>","风险监测":"风险监测"}'/>
				</td>
			</tr>
			<tr>
				<td>通讯地址</td>
				<td bgcolor="ffffff" colspan="2"><s:textfield type="text" style="border:none; width:100%" name="taskFromAddress"/></td>
			</tr>
			<tr>
				<td>检测场所</td>
				<td bgcolor="ffffff" colspan="7"><s:textfield type="text" style="border:none; width:100%" name="checkPlace"/></td>
			</tr>
			<tr>
				<td>样品名称</td>
				<td bgcolor="ffffff"><s:textfield id="foodPicker" type="text" style="border:none; width:100%" name="name"/></td>
				<td>品种</td>
				<td  bgcolor="ffffff"><s:textfield type="text" style="border:none; width:100%" name="type"/></td>
				<td>种植面积（亩）</td>
				<td bgcolor="ffffff"><s:textfield type="text" style="border:none; width:100%" name="area"/></td>
				<td>亩产量（元/千克）</td>
				<td bgcolor="ffffff"><s:textfield type="text" style="border:none; width:100%" name="productive"/></td>
			</tr>
			<tr>
				<td>样品认证及商标</td>
				<td bgcolor="ffffff"><s:textfield type="text" style="border:none; width:100%" name="brand"/></td>
				<td>销售单价（元/千克）</td>
				<td  bgcolor="ffffff"><s:textfield type="text" style="border:none; width:100%" name="saleUnit"/></td>
				<td>采样时间</td>
				<td bgcolor="ffffff"><s:textfield type="text" style="border:none; width:100%" name="sampleDate"/></td>
				<td>采样数量（千克）</td>
				<td bgcolor="ffffff"><s:textfield type="text" style="border:none; width:100%" name="sampleQuantity"/></td>
			</tr>
			<tr>
				<td>采样地点</td>
				<td bgcolor="ffffff" colspan='7'><s:textfield type="text" style="border:none; width:100%" name="place"/></td>
			</tr>
			<tr>
				<td>单位名称（个人）</td>
				<td bgcolor="ffffff"><s:textfield type="text" style="border:none; width:100%" name="comName"/></td>
				<td>联系人</td>
				<td  bgcolor="ffffff"><s:textfield type="text" style="border:none; width:100%" name="contactPeople"/></td>
				<td>通信地址</td>
				<td bgcolor="ffffff"><s:textfield type="text" style="border:none; width:100%" name="address"/></td>
				<td>联系电话</td>
				<td bgcolor="ffffff"><s:textfield type="text" style="border:none; width:100%" name="phone"/></td>
			</tr>
			<tr>
				<td>备注</td>
				<td bgcolor="ffffff" colspan="7"><s:textfield type="text" style="border:none; width:100%" name="remark"/></td>
			</tr>
			<tr>
				<td colspan="4" bgcolor="ffffff" width="30%">
					受检单位（个人）对所填内容和采样样品有效性无异议在此栏进行签字。<br><br>  
              	 	受检单位（个人） （签字/盖章） <br><br>         
                    年     月     日<br><br>  
                    (公章）
				</td>
				<td colspan='4' bgcolor="ffffff"><br><br>  
					抽样人员（签名）： <br><br>                  
               		年     月     日<br><br>  
                    
				</td>
			</tr>
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
													<td height="20" bgcolor="ffffffFFF" class="STYLE6"><s:property value="productName"/> </td>
													<td height="20" bgcolor="ffffffFFF" class="STYLE6"><s:property value="paramName"/> </td>
													<td height="20" bgcolor="ffffffFFF" class="STYLE6"><s:property value="limit"/> </td>
													<td height="20" bgcolor="ffffffFFF" class="STYLE6"><s:property value="canCheckAndShouldCheck"/> </td>
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
													<td height="20" bgcolor="ffffffFFF" class="STYLE6"><s:property value="productName"/> </td>
													<td height="20" bgcolor="ffffffFFF" class="STYLE6"><s:property value="paramName"/> </td>
													<td height="20" bgcolor="ffffffFFF" class="STYLE6"><s:property value="limit"/> </td>
													<td height="20" bgcolor="ffffffFFF" class="STYLE6"><s:property value="resultValue"/> </td>
													<td height="20" bgcolor="ffffffFFF" class="STYLE6"><s:property value="singleResult"/> </td>
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
													<td height="20" bgcolor="ffffffFFF" class="STYLE6"><input type="text" name="productName" value=<s:property value="productName"/>> </td>
													<td height="20" bgcolor="ffffffFFF" class="STYLE6"><input type="text" name="paramName" value=<s:property value="paramName"/>> </td>
													<td height="20" bgcolor="ffffffFFF" class="STYLE6"><input type="text" name="limit" value=<s:property value="limit"/>> </td>
													<td height="20" bgcolor="ffffffFFF" class="STYLE6"><input type="text" name="canCheckAndShouldCheck" value=<s:property value="canCheckAndShouldCheck"/>></td>
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
							<td colspan="10" bgcolor="ffffffFFF" class="STYLE6"><s:textarea name="comment" cols="120" rows="5"/></td>
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
				        <td height="20" bgcolor="ffffffFFF" class="STYLE6"><div align="center"><s:date name="dealTime" format="yyyy-MM-dd HH:mm:ss"/></div></td>
				        <td height="20" bgcolor="ffffffFFF" class="STYLE19"><div align="center"><s:property value="dealMan"/></div></td>
				        <td height="20" bgcolor="ffffffFFF" class="STYLE19"><div align="center"><s:property value="htName"/></div></td>
				        <td height="20" bgcolor="ffffffFFF" class="STYLE19"><div align="center"><s:property value="message"/></div></td>
				        <td height="20" bgcolor="ffffffFFF" class="STYLE19">
				       
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