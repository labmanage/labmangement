$(function(){
	$("#foodPicker").attr("readonly","readonly");
	$("#foodPicker").click(function(){
		window.open ('utilAction_getFoodList.action','选择产品','height=400,width=800,top=0,left=0,toolbar=no,menubar=no,scrollbars=no, resizable=no,location=no, status=no');
	});
});
