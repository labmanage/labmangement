$(function(){
	/**
	 * 抽样产品选择器
	 */
	$("#foodPicker").attr("readonly","readonly");
	$("#foodPicker").click(function(){
		window.open ('utilAction_getFoodList.action','选择产品','height=400,width=800,top=0,left=0,toolbar=no,menubar=no,location=no, status=no');
	});
	/**
	 * 用户选择器
	 */
	$("#userPicker").attr("readonly","readonly");
	$("#userPicker").click(function(){
		window.open ('utilAction_getUserList.action','选择用户','height=400,width=800,top=0,left=0,toolbar=no,menubar=no,location=no, status=no');
	});
	
	/**
	 * 未分配角色的用户选择器
	 */
	$("#unRoleUserPicker").attr("readonly","readonly");
	$("#unRoleUserPicker").click(function(){
		window.open ('utilAction_getUnroledUserList.action','选择用户','height=400,width=800,top=0,left=0,toolbar=no,menubar=no,location=no, status=no');
	});
	/**
	 * 选择权限
	 */
	$("#privilegePicker").attr("readonly","readonly");
	$("#privilegePicker").click(function(){
		window.open ('utilAction_getPrivilegeList.action','选择权限','height=400,width=800,top=0,left=0,toolbar=no,menubar=no,location=no, status=no');
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
	$(".deleteBtn").click(function(e){
		var deleteFlag = window.confirm("删除后不可恢复!确定要删除吗？");
		if(!deleteFlag){
			return false;
		}
	});
	
	//分页
	if($("#pageButtons").length > 0){
		var $itemCountEle = $("#itemCount");
		var	$pageCountEle = $("#pageCount");
		var	$itemCountPerPage = $("#itemCountPerPage");
		var $currentPageEle = $("#currentPage");
		var $dataTable = $(".dataTable");
		var $itemTotal= $dataTable.find("tr:gt(0)").length;
		var $gotoPage = $("#gotoPage");
		var $pageSize = 10;
		var $currentPage = 1;
		var $end = $pageSize;
		$itemCountEle.text($itemTotal);
		$pageCountEle.text(Math.ceil($itemTotal/$pageSize));
		$currentPageEle.text($currentPage);
		showPageData($currentPage,$pageSize);
		initGotoSelect();
		$itemCountPerPage.live("change",function(){
			$pageSize = $(this).val();
			showPageData(1,$pageSize);
			$pageCountEle.text(Math.ceil($itemTotal/$pageSize));
			$currentPage = 1;
			$currentPageEle.text($currentPage);
			initGotoSelect();
		});
		$gotoPage.live("change",function(){
			$currentPage = $(this).val();
			showPageData($currentPage,$pageSize);
		});
		function initGotoSelect(){
			var pageCount = Math.ceil($itemTotal/$pageSize);
			$gotoPage.html("");
			for(var i = 0 ; i < pageCount; i++){
				$gotoPage.append("<option>"+(i+1)+"</option>");
			}
		}
		function showPageData(currentPage,pageCount){
			var begin = (currentPage - 1) * pageCount;
			var end = currentPage * pageCount + 1;
			if($dataTable.hasClass("instruTable")){
				begin ++;
				end ++;
				$dataTable.find("tr:gt(1)").hide();
			}else{
				$dataTable.find("tr:gt(0)").hide();
			}
			$dataTable.find("tr").each(function(index,ele){
				if(index !== 0){
					if(index > begin && index < end){
						$(ele).show();
					}
				}
			});
		}
		function nextPage(){
			if($currentPage < Math.ceil($itemTotal/$pageSize)){
				$currentPage ++;
				showPageData($currentPage,$pageSize);
				$currentPageEle.text($currentPage);
				$gotoPage.val($currentPage);
			}
		}
		function prePage(){
			if($currentPage > 1){
				$currentPage --;
				showPageData($currentPage,$pageSize);
				$currentPageEle.text($currentPage);
				$gotoPage.val($currentPage);
			}
		}
		$(".prePageBtn").click(function(){
			prePage();
		});
		$(".nextPageBtn").click(function(){
			nextPage();
		});
	}
	
});
