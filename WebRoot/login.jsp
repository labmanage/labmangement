<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
	<title>登录页面</title>
	<%@ include file="/js/commons.jspf" %>
	<link href="${basePath}/css/public.css" rel="stylesheet" type="text/css" />
	<script type="text/javascript" src="js/jquery.js"></script>
	<script type="text/javascript">
		if(parent != window){
			parent.location.href = window.location.href;
		}
		function func_login(){
			var nameobj = document.getElementById("userId").value;
			var pwdobj = document.getElementById("password").value;
			var name1 = document.loginform.name;
			var pwd2 = document.loginform.password;
			
			if(nameobj == "" || nameobj == null){
				alert("账号为空，请重新输入！");
				name1.focus();
		        return;
			}
			
			if(pwdobj == "" || pwdobj == null){
				alert("密码为空，请重新输入！");
				pwd2.focus();
		        return;
			}
			
			document.forms[0].submit();
		}
		
		$(document).ready(function(){  		      
		    //回车后登录  
		    document.onkeydown = function(e){   
		        var ev = document.all ? window.event : e;   
		        if(ev.keyCode==13) {   
		        	func_login();  
		        }   
		    };  
		});
	</script>
</head>
<body style="text-align:center;">
	<!-- <form action="loginAction_login.action" method="post" name="loginform" onkeypress="javascript:CheckKeyCode();"> -->
	<form action="loginAction_login.action" method="post" name="loginform" >
		<table width="100%"  height="100%" border="0" cellspacing="0" cellpadding="0">
		  <tr>
		    <td bgcolor="#1075b1">&nbsp;</td>
		  </tr>
		  <tr>
		    <td height="608" background="${basePath}/images/login_03.gif"><table width="847" border="0" align="center" cellpadding="0" cellspacing="0">
		      <tr>
		        <td height="250" background="${basePath}/images/login_045.gif">&nbsp;</td>
		      </tr>
		      <tr>
		        <td height="e"><table width="100%" border="0" cellspacing="0" cellpadding="0">
		          <tr>
		            <td width="381" height="84" background="${basePath}/images/login_06.gif">&nbsp;</td>
		            <td width="600" valign="middle" background="${basePath}/images/login_07.gif"><table width="100%" border="0" cellspacing="0" cellpadding="0">
		              <tr> 
		                <td width="55" height="24" valign="bottom"><div align="right"><span class="STYLE3">账号:</span></div>
		                </td>
		                  <td width="55" height="24" valign="bottom">
		                  <div align="right">
			                  <span class="STYLE3"> 
			                  	<input type="text" id="userId" name="userId" >
			                  </span>
		                  </div>
		                </td>
		                <td width="55" height="24" valign="bottom"><div align="right"><span class="STYLE3">密码:</span></div></td>
		                <td width="55" height="24" valign="bottom"><div align="right"><span class="STYLE3"> 	
		                <input type="password" id="password" name="password" ></span></div>
		                </td>
		              </tr>
		         
		            </table></td>
		            <td width="26"><img src="${basePath}/images/login_08.gif" width="26" height="84"></td>
		            <td width="67" background="${basePath}/images/login_09.gif">
		            <table width="100%" border="0" cellspacing="0" cellpadding="0">
	              		<tr>
	               			<td height="25"><div align="center" style="cursor:hand" onclick="func_login()"><img src="${basePath}/images/dl.gif" width="57" height="20"></div></td>
	              		</tr>
			            </table>
            		</td>
		            <td width="211" background="${basePath}/images/login_10.gif">&nbsp;</td>
		          </tr>
		        </table></td>
		      </tr>
		      <tr>
		        <td height="206" background="${basePath}/images/login_11.gif">&nbsp;</td>
		      </tr>
		    </table></td>
		  </tr>
		  <tr>
		    <td bgcolor="#152753">&nbsp;</td>
		  </tr>
		</table>
	</form>
	<script type="text/javascript">
		document.getElementById("name").focus();
	</script>
</body>
</html>