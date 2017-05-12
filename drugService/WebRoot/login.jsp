<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Gentelella Alela! | </title>

    <!-- Bootstrap -->
    <link href="./vendors/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link href="./vendors/font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <!-- NProgress -->
    <link href="./vendors/nprogress/nprogress.css" rel="stylesheet">
    <!-- Animate.css -->
    <link href="./vendors/animate.css/animate.min.css" rel="stylesheet">

    <!-- Custom Theme Style -->
    <link href="./build/css/custom.min.css" rel="stylesheet">
    <script src="./vendors/jquery/dist/jquery.js"></script>
    <script type="text/javascript">
    	function login(){
    		var userId=$("#userId").val();
    		var userPasswd=$("#userPasswd").val();
    		var req={"userId":userId,"userPasswd":userPasswd};
    		$.ajax({
    			type:"post",
    			url:"login.do",
    			datatype:"json",
    			contentType: "application/json; charset=utf-8", 
    			data:JSON.stringify(req),
    			success:function(result){
    				if(result==""){
    					window.location.href="./index.do";
    				}else{
    					$("#error").html(result);
    				}
    			}
    		});
    	}
    </script>
  </head>

  <body class="login">
    <div>
      <a class="hiddenanchor" id="signup"></a>
      <a class="hiddenanchor" id="signin"></a>

    <div class="login_wrapper">
        <div class="animate form login_form">
          <section class="login_content">
            <form>
				<h1>登录</h1>
				<p id="error" style="color:red"></p>
				<div>
					<input id="userId" name="userId" type="text" class="form-control" placeholder="Username" required="" />
				</div>
				<div>
					<input id="userPasswd" name="userPasswd" type="password" class="form-control" placeholder="Password" required="" />
				</div>
				<div>
					<a class="btn btn-default submit" href="javascript:void(0)" onclick="login()">Log in</a>
					<a class="reset_pass" href="#">Lost your password?</a>
				</div>

				<div class="clearfix"></div> 

				
				
				<br />
				
				
				<div class="separator">
					<div class="clearfix"></div>
					<br />

					<div>
					  <h1> 终端药品销售系统</h1>
					  <p>copy@******</p>
					</div>
                </div>
            </form>
          </section>
        </div>

    </div>
  </body>
</html>
