$(function(){
	/**
	 * 抽样产品选择器
	 */
	$("#foodPicker").attr("readonly","readonly");
	$("#foodPicker").click(function(){
		window.open ('utilAction_getFoodList.action','选择产品','height=400,width=800,top=0,left=0,toolbar=no,menubar=no,scrollbars=no, resizable=no,location=no, status=no');
	});
	/**
	 * 用户选择器
	 */
	$("#userPicker").attr("readonly","readonly");
	$("#userPicker").click(function(){
		window.open ('utilAction_getUserList.action','选择用户','height=400,width=800,top=0,left=0,toolbar=no,menubar=no,scrollbars=no, resizable=no,location=no, status=no');
	});
	
	$("#privilegePicker").attr("readonly","readonly");
	$("#privilegePicker").click(function(){
		window.open ('utilAction_getUserList.action','选择用户','height=400,width=800,top=0,left=0,toolbar=no,menubar=no,scrollbars=no, resizable=no,location=no, status=no');
	});
	
	/**
	 * 发送ajax验证权限，如果没有权限就将链接删除
	 */
	$("a").each(function(){
		(function($anchorTag){
			$.post("userAction_checkHasPrivilege",{"url":$anchorTag.attr("href")},function(data){
				if(data==="false"){
					$anchorTag.remove();
				}
			});
		})($(this));
	});
	
	
	
	
});
