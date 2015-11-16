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
	
	/**
	 * 未分配角色的用户选择器
	 */
	$("#unRoleUserPicker").attr("readonly","readonly");
	$("#unRoleUserPicker").click(function(){
		window.open ('utilAction_getUnroledUserList.action','选择用户','height=400,width=800,top=0,left=0,toolbar=no,menubar=no,scrollbars=no, resizable=no,location=no, status=no');
	});
	/**
	 * 选择权限
	 */
	$("#privilegePicker").attr("readonly","readonly");
	$("#privilegePicker").click(function(){
		window.open ('utilAction_getPrivilegeList.action','选择权限','height=400,width=800,top=0,left=0,toolbar=no,menubar=no,scrollbars=no, resizable=no,location=no, status=no');
	});
	
	/**
	 * 发送ajax验证权限，如果没有权限就将链接删除
	 */
//	$("a").each(function(){
//		(function($anchorTag){
//			$.post("userAction_checkHasPrivilege",{"url":$anchorTag.attr("href")},function(data){
//				if(data==="false"){
//					$anchorTag.remove();
//				}
//			});
//		})($(this));
//	});
	
	
	
	/////////////////////////////////////
	$("#userListTable tr:gt(0)").click(function(){
		$value = $(this).find("td").eq(0).find("div").html();
		$userName = $(this).find("td").eq(1).find("div").html();
		$id = $(this).find("td").eq(0).find("div").html();
		
		if(window.opener.pickerFrom === "role"){
			var userArea = window.opener.document.getElementById("userArea");
			$(userArea).append("<span class='pickLabel'><input checked type='checkbox' name='userId' value='"+$value+"'>"+$userName+"</span>");
		}else{
			window.opener.document.getElementById("userPicker").value = $userName;
		}
		//alert(window.opener.userPickType);
		window.close();
	});
	
	
	$("#privilegeDataTable tr:gt(0)").click(function(){
		$pName = $(this).find("td").eq(2).find("div").html();
		$id = $(this).find("td").eq(0).find("div").html();
		
		if(window.opener.pickerFrom === "role"){
			var pArea = window.opener.document.getElementById("privilegeArea");
			$(pArea).append("<span class='pickLabel'><input checked type='checkbox' name='privilegeId' value='"+$id+"'>"+$pName+"</span>");
		}else{
			window.opener.document.getElementById("userPicker").value = $userName;
		}
		//alert(window.opener.userPickType);
		window.close();
	});
	
	
});
