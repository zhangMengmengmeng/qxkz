<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title></title>
		<link href="css/main.css" rel="stylesheet" type="text/css" />
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		
		<link href="css/main.css" rel="stylesheet" type="text/css" />
        <script type="text/javascript" src="js/jQuery.js"></script>
		<script type="text/javascript" src="js/fun.base.js"></script>
		<script type="text/javascript" src="js/script.js"></script>
        
		<script language="javascript">
		var basePath = "<%=basePath%>";
		function check1()
		{                                                                                         
		     if(document.ThisForm.userName.value=="")
			 {
			 	alert("请输入用户名");
				document.ThisForm.userName.focus();
				return false;
			 }
			 if(document.ThisForm.userPw.value=="")
			 {
			 	alert("请输入密码");
				document.ThisForm.userPw.focus();
				return false;
			 }
			  

			 
			 $.ajax({
		            //几个参数需要注意一下
		                type: "POST",//方法类型
		                data : {
							username : document.ThisForm.userName.value,
							password : document.ThisForm.userPw.value,
						},
		                dataType: "json",//预期服务器返回的数据类型
		                url: "<%=basePath%>" + "ajaxLogin" ,//url
		                success: function (data) {
		                    console.log(data);//打印服务端返回的数据(调试用)
		                    if (data.msg == 'account_error') {
								alert("用户名错误");
							} else if (data.msg == 'password_error') {
								alert("密码错误"); 
								rcode_flag = true;
							} else if (data.msg == 'randomcode_error') {
								$("#errorspan")
										.html(
												"<font color='red'> 验证码错误！</font>");
								rcode_flag = true;
							} else if (data.msg == 'authentication_error') {
								alert("您没有授权");
								rcode_flag = true;
							} else {
								location.href = basePath + "home";
							}
		                },
		                error : function() {
		                    alert("异常！");
		                }
		            });
			 
			 
		}

	    </script>
		
</head>
<body>

<form action="" name="ThisForm" method="post">
<div class="login">
    <div class="box png">
		<div class="logo png"></div>
		<div class="input">
			<div class="log">
				<div class="name">
					<label>用户名</label><input type="text" class="text" id="userName" placeholder="用户名" name="userName" tabindex="1">
				</div>
				<div class="pwd">
					<label>密　码</label><input type="password" class="text" id="userPw" placeholder="密码" name="userPw" tabindex="2">
				</div>
				<div class="tip">
				<center>

					<img src="<%=path %>/img/dl.gif" onClick="check1()">
                    <img id="indicator" src="<%=path %>/img/loading.gif" style="display:none"/>

					</center>
				</div>
				
			</div>
		</div>
	</div>
    <div class="air-balloon ab-1 png"></div>
	<div class="air-balloon ab-2 png"></div>
    <div class="footer"></div>
</div>
</form>
<div style="text-align:center;margin:50px 0; font:normal 14px/24px 'MicroSoft YaHei';">

</div>
</body>
</html>