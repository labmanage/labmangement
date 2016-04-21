<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%><%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
	request.setAttribute("basePath",  basePath);
%>

<script language="javascript" src="${basePath}js/jquery.js"></script>

<body>
    <form id="form1" action="uploadAction" method="post" enctype="multipart/form-data">
            <input type="file" id="imgFile" name="file"/>
            <input type="hidden" name="uploadedImg" value="1"/>
            <input type="submit" value="submit"/>
    </form>

<script>
    $(function(){
        $("#imgFile").bind("change",function(){
            $("#form1").submit();
        });
        if(location.search){
            var url = location.search.split("=")[1];
            var urlInput = $(window.parent.document).find(".cke_dialog_ui_hbox_first:eq(0)").find(".cke_dialog_ui_input_text");
            urlInput.val(url);
            urlInput.change();
        }
    });
</script>
</body>
</html>