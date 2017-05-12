<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
    <!-- iCheck -->
    <link href="./vendors/iCheck/skins/flat/green.css" rel="stylesheet">
	
    <!-- bootstrap-progressbar -->
    <link href="./vendors/bootstrap-progressbar/css/bootstrap-progressbar-3.3.4.min.css" rel="stylesheet">
    <!-- JQVMap -->
    <link href="./vendors/jqvmap/dist/jqvmap.min.css" rel="stylesheet"/>
    <!-- bootstrap-daterangepicker -->
    <link href="./vendors/bootstrap-daterangepicker/daterangepicker.css" rel="stylesheet">

    <!-- Custom Theme Style -->
    <link href="./build/css/custom.min.css" rel="stylesheet">
    <link href="./build/user.css" rel="stylesheet">
  </head>

  <body class="nav-md">
    <div class="container body">
      <div class="main_container">


<!--left-->
        <div class="col-md-3 left_col">
          <div class="left_col scroll-view">
            <div class="navbar nav_title" style="border: 0;">
              <a  data_src="main.html" class="site_title" id="showIframe"> <span>终端药品销售系统</span></a>
            </div>

            <div class="clearfix"></div>

            <!-- menu profile quick info -->
            <div class="profile clearfix">
              <div class="profile_pic">
                <img src="images/img.jpg" alt="..." class="img-circle profile_img">
              </div>
              <div class="profile_info">
                <span>Welcome,</span>
                <h2>${user.user_id }</h2>
              </div>
            </div>
            <!-- /menu profile quick info -->

            <br />


            <!-- sidebar menu -->
            <div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
              <div class="menu_section">
                <h3>功能列表</h3>
                <ul class="nav side-menu">
                  <li>
                  	<a href="javascript:void(0)" data_src="main.do"><i class="fa fa-home"></i> 首页 </a>
                  </li>
                  <c:forEach items="${user.funcs }" var="permissions">
                  	 <li><a><i class="${permissions.key.icon }"></i> ${permissions.key.func_name } </span></a> 
                  	 	<ul class="nav child_menu">
                  	 		<c:forEach items="${permissions.value }" var="childPermissions">
                  	 			<li><a data_src="${childPermissions.key.action }?level1=${permissions.key.func_id }&level2=${childPermissions.key.func_id }">${childPermissions.key.func_name }</a></li>
                  	 		</c:forEach>
                  	 	</ul>
                  	 </li>
                  </c:forEach>
                  
                </ul>
              </div>
              <div class="menu_section">
                
                <ul class="nav side-menu">


                  
                 
                </ul>
              </div>

            </div>
            <!-- /sidebar menu -->

            <!-- /menu footer buttons -->
            <div class="sidebar-footer hidden-small">

              <a data-toggle="tooltip" data-placement="top" title="Logout" href="login.html">
                <span class="glyphicon glyphicon-off" aria-hidden="true"></span>
              </a>
            </div>
            <!-- /menu footer buttons -->
          </div>
        </div>

<!--/left-->

<!-- right top  -->
        <div class="top_nav">
          <div class="nav_menu">
            <nav>
              <div class="nav toggle">
                <a id="menu_toggle"><i class="fa fa-bars"></i></a>
              </div>

              <ul class="nav navbar-nav navbar-right">
                <li class="">
                  <a href="javascript:;" class="user-profile dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
                    <img src="images/img.jpg" alt="">${user.user_id }
                    <span class=" fa fa-angle-down"></span>
                  </a>
                  <ul class="dropdown-menu dropdown-usermenu pull-right">
                    <li><a data_src="profile.html">个人信息</a></li>
                    <li>
                      <a data_src="setting.html">
                        <span>密码设置</span>
                      </a>
                    </li>
                    <li><a data_src="login.html"><i class="fa fa-sign-out pull-right"></i>退出登录</a></li>
                  </ul>
                </li>

                <li role="presentation" class="dropdown">
                  <a href="javascript:;" class="dropdown-toggle info-number" data-toggle="dropdown" aria-expanded="false">
                    <i class="fa fa-envelope-o"></i>
                    <span class="badge bg-green">1</span>
                  </a>
                  <ul id="menu1" class="dropdown-menu list-unstyled msg_list" role="menu">
                    <li>
                      <a>
                        <span class="image"><img src="images/img2.jpg" alt="Profile Image" /></span>
                        <span>
                          <span>yd</span>
                          <span class="time">3 mins ago</span>
                        </span>
                        <span class="message">
                          吃吃吃····
                        </span>
                      </a>
                    </li>
                  </ul>
                </li>
              </ul>
            </nav>
          </div>
        </div>
<!-- /right top  -->
<!-- page content -->
        <div class="right_col" role="main">
			 <iframe src="main.do" style="width:100%;border:0;height:800px" id="show_content" scrolling="auto"></iframe>
        </div>
<!-- /page content -->
<!-- footer content -->
        <footer>
          <div class="text-center">
            终端药品销售系统
          </div>
          <div class="clearfix"></div>
        </footer>
<!-- /footer content -->


      </div>
    </div>

    <!-- jQuery -->
    <script src="./vendors/jquery/dist/jquery.min.js"></script>
    <!-- Bootstrap -->
    <script src="./vendors/bootstrap/dist/js/bootstrap.min.js"></script>
    <!-- FastClick -->
    <script src="./vendors/fastclick/lib/fastclick.js"></script>
    <!-- NProgress -->
    <script src="./vendors/nprogress/nprogress.js"></script>
    <!-- Chart.js -->
    <script src="./vendors/Chart.js/dist/Chart.min.js"></script>
    <!-- gauge.js -->
    <script src="./vendors/gauge.js/dist/gauge.min.js"></script>
    <!-- bootstrap-progressbar -->
    <script src="./vendors/bootstrap-progressbar/bootstrap-progressbar.min.js"></script>
    <!-- iCheck -->
    <script src="./vendors/iCheck/icheck.min.js"></script>
    <!-- Skycons -->
    <script src="./vendors/skycons/skycons.js"></script>
    <!-- Flot -->
    <script src="./vendors/Flot/jquery.flot.js"></script>
    <script src="./vendors/Flot/jquery.flot.pie.js"></script>
    <script src="./vendors/Flot/jquery.flot.time.js"></script>
    <script src="./vendors/Flot/jquery.flot.stack.js"></script>
    <script src="./vendors/Flot/jquery.flot.resize.js"></script>
    <!-- Flot plugins -->
    <script src="./vendors/flot.orderbars/js/jquery.flot.orderBars.js"></script>
    <script src="./vendors/flot-spline/js/jquery.flot.spline.min.js"></script>
    <script src="./vendors/flot.curvedlines/curvedLines.js"></script>
    <!-- DateJS -->
    <script src="./vendors/DateJS/build/date.js"></script>
    <!-- JQVMap -->
    <script src="./vendors/jqvmap/dist/jquery.vmap.js"></script>
    <script src="./vendors/jqvmap/dist/maps/jquery.vmap.world.js"></script>
    <script src="./vendors/jqvmap/examples/js/jquery.vmap.sampledata.js"></script>
    <!-- bootstrap-daterangepicker -->
    <script src="./vendors/moment/min/moment.min.js"></script>
    <script src="./vendors/bootstrap-daterangepicker/daterangepicker.js"></script>

    <!-- Custom Theme Scripts -->
    <script src="./build/js/custom.min.js"></script>
	 	<script src="./build/uedit.js"></script>
	
  </body>
</html>

