<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/js/commons.jspf" %>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新增公告</title>
</head>
<body>
	<form action="noteAction_add.action" method="post">
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
													<td width="94%" valign="bottom"><span class="STYLE1"> 新增公告 </span></td>
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
				<td colspan="16" bgcolor="d3eaef" class="STYLE6">标题：<s:textfield name="title" cssStyle="width: 800px;" /></td>
			</tr>
			<tr>
				<td colspan="16" bgcolor="d3eaef" class="STYLE6">状态：<s:select name="status" list="#{0:"非发布",1:"发布" }" /></td>
			</tr>
			<tr>
				<td colspan="16" bgcolor="d3eaef" class="STYLE6">失效时间：<input  onClick="new WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',readOnly:true})"  type="text" name="expireTime" value="" cssStyle="width: 800px;" /></td>
			</tr>
			<tr>
				<td colspan="16" bgcolor="d3eaef" class="STYLE6">内容：
					<textarea id="editor1" name="content" width="100%" row="10"></textarea>
				</td>
			</tr>
			<tr class="STYLE21">
		    			<td colspan="2"><input type="submit" value="提交" class="button_ok"/></td>
		    		  </tr>
				    </table>
		</table>
	 	
	</form>
	<iframe style="display:none" id="hiddenFrame" name="ifm" src="form2.jsp"></iframe>
	<script language="javascript" src="${basePath}/js/jquery.js"></script>
	<script src="${basePath}js/ckeditor/ckeditor.js"></script>
	<script src="${pageContext.request.contextPath }/js/My97DatePickerBeta/My97DatePicker/WdatePicker.js"></script>
	<script>
		CKEDITOR.replace('editor1');
	
	
	    if($("#upload_img").length === 0 ){
	        setTimeout(function(){
	            $(".cke_button__image").one('click',function(){
	                htmlText = '<a class="cke_dialog_ui_button cke_dialog_ui_button_ok" id="pickImgBtn" type="button">选择图片</a>';
	                setTimeout(function(){
	                    $(".cke_dialog_ui_hbox_first:eq(0)").append(htmlText);
	                    $("#pickImgBtn").live('click',function(){
	                        $("#hiddenFrame").contents().find("#imgFile").click();
	                    });
	                },100);
	            });
	        },1000);
	    }
	
		$(function(){
		    var  ifm = $("#hiddenFrame");
		});
	</script>
	
	
</body>
</html>