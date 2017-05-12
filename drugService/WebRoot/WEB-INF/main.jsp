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
    <div class="uedit">
      <div class="main_container">
<!-- page content -->
        <div class="right_col" role="main">
    <!-- top tiles -->
          <div class="row tile_count">
            
            <div class="col-md-3 col-sm-4 col-xs-6 tile_stats_count">
              <span class="count_top"><i class="fa fa-user"></i>上周绩效排名</span>
              <div class="count">3</div>
              <span class="count_bottom"><i class="green"><i class="fa fa-sort-asc"></i>4 </i> Compared with last Time</span>
            </div>


            <div class="col-md-3 col-sm-6 col-xs-8 tile_stats_count">
              <span class="count_top"><i class="fa fa-clock-o"></i> 昨日销售笔数</span>
              <div class="count">7</div>
              <span class="count_bottom"><i class="green"><i class="fa fa-sort-asc"></i>3 </i> Compared with last Day</span>
            </div>
            <div class="col-md-3 col-sm-4 col-xs-6 tile_stats_count">
              <span class="count_top"><i class="fa fa-user"></i> 当前销售笔数</span>
              <div class="count ">2</div>
              <span class="count_bottom"><i class="red"><i class="fa fa-sort-desc"></i>5 </i> Compared with  last Time</span>
            </div>
            <div class="col-md-3 col-sm-4 col-xs-6 tile_stats_count">
              <span class="count_top"><i class="fa fa-user"></i> 到岗时间</span>
              <div class="count">08：46</div>
              <span class="count_bottom"><i class="red"><i class="fa fa-sort-desc"></i>12% </i> From last Day</span>
            </div>


          </div>
         <!-- /top tiles -->

          <div class="row">
            <div class="col-md-12 col-sm-12 col-xs-12">
              <div class="dashboard_graph">

                <div class="row x_title">
                  <div class="col-md-6">
                    <h3>本月个人销售统计 <small></small></h3>
                  </div>
                  <div class="col-md-6">
                    <div id="reportrange" class="pull-right" style="background: #fff; cursor: pointer; padding: 5px 10px; border: 1px solid #ccc">
                      <i class="glyphicon glyphicon-calendar fa fa-calendar"></i>
                      <span>December 30, 2014 - January 28, 2015</span> <b class="caret"></b>
                    </div>
                  </div>
                </div>
                <!--销售图表-->
                <div class="col-md-12 col-sm-12 col-xs-24">
                  <div id="chart_plot_01" class="demo-placeholder"></div>
                </div>


                <div class="clearfix"></div>
              </div>
            </div>

          </div>

          <br />

          <!--店内通知-->

          <div class="row">
            <div class="col-md-4 col-sm-4 col-xs-12">
              <div class="x_panel">
                
                <div class="x_title">
                  <h2>店内通知</h2>
                  <ul class="nav navbar-right panel_toolbox">
                    <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                    </li>

                    <li><a class="close-link"><i class="fa fa-close"></i></a>
                    </li>
                  </ul>
                  <div class="clearfix"></div>
                </div>


                <div class="x_content">
                  <div class="dashboard-widget-content">

                    <ul class="list-unstyled timeline widget">
                      <li>
                        <div class="block">
                          <div class="block_content">
                            <h2 class="title">
                             <a>关于五一放假通知</a>
                            </h2>
                            <div class="byline">
                              <span>13 hours ago</span> by <a>店长</a>
                            </div>
                            <p class="excerpt">Film festivals used to be do-or-die moments for movie makers. They were where you met the producers that could fund your project, and if the buyers liked your flick, they’d pay to Fast-forward and… <a>Read&nbsp;More</a>
                            </p>
                          </div>
                        </div>
                      </li>
                      

                    </ul>
                  </div>
                </div>
              </div>
            </div>
 		<!-- 店内通知 -->

         <!-- 规章制度 -->
	        <div class="col-md-4 col-sm-4 col-xs-12">
	          <div class="x_panel">
	            <div class="x_title">
	              <h2>规章制度</h2>

	              <ul class="nav navbar-right panel_toolbox">
	                <li>
	                	<a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
	                </li>

	                <li>
	                	<a class="close-link"><i class="fa fa-close"></i></a>
	                </li>
	              </ul>

	              <div class="clearfix"></div>
	            </div>
	            <div class="x_content">

	              <div class="">
	                <ul class="to_do">
	                  <li>
	                    <a href="#"><p>安全守则</p></a>	                     
	                  </li>
	                  <li>
	                    <a href="#"><p>销售宝典</p></a>	                     
	                  </li>	                 
	                  <li>
	                    <a href="#"><p>********</p></a>		                     
	                  </li>
	                </ul>
	              </div>
	            </div>
	          </div>
            </div>
        <!-- 规章制度 -->
                
        <!-- start of weather widget -->
            <div class="col-md-4 col-sm-4 col-xs-12">
              <div class="x_panel">
                
                <div class="x_title">
                  <h2>本周天气</h2>
                  <ul class="nav navbar-right panel_toolbox">
                    <li>
                    	<a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                    </li>

                    <li>
                    	<a class="close-link"><i class="fa fa-close"></i></a>
                    </li>
                  </ul>
                  <div class="clearfix"></div>
                </div>

                <div class="x_content">
                  <div class="row">
                    <div class="col-sm-12">
                      <div class="temperature"><b>星期三</b>, 07:30 AM
                        <span>F</span>
                        <span><b>C</b></span>
                      </div>
                    </div>
                  </div>
                  <div class="row">
                    <div class="col-sm-4">
                      <div class="weather-icon">
                        <canvas height="84" width="84" id="partly-cloudy-day"></canvas>
                      </div>
                    </div>
                    <div class="col-sm-8">
                      <div class="weather-text">
                        <h2>苏州 <br><i>多云</i></h2>
                      </div>
                    </div>
                  </div>
                  <div class="col-sm-12">
                    <div class="weather-text pull-right">
                      <h3 class="degrees">23</h3>
                    </div>
                  </div>

                  <div class="clearfix"></div>

                  <div class="row weather-days">
                    <div class="col-sm-2">
                      <div class="daily-weather">
                        <h2 class="day">Mon</h2>
                        <h3 class="degrees">25</h3>
                        <canvas id="clear-day" width="32" height="32"></canvas>
                        <h5>15 <i>km/h</i></h5>
                      </div>
                    </div>
                    <div class="col-sm-2">
                      <div class="daily-weather">
                        <h2 class="day">Tue</h2>
                        <h3 class="degrees">25</h3>
                        <canvas height="32" width="32" id="rain"></canvas>
                        <h5>12 <i>km/h</i></h5>
                      </div>
                    </div>
                    <div class="col-sm-2">
                      <div class="daily-weather">
                        <h2 class="day">Wed</h2>
                        <h3 class="degrees">27</h3>
                        <canvas height="32" width="32" id="snow"></canvas>
                        <h5>14 <i>km/h</i></h5>
                      </div>
                    </div>
                    <div class="col-sm-2">
                      <div class="daily-weather">
                        <h2 class="day">Thu</h2>
                        <h3 class="degrees">28</h3>
                        <canvas height="32" width="32" id="sleet"></canvas>
                        <h5>15 <i>km/h</i></h5>
                      </div>
                    </div>
                    <div class="col-sm-2">
                      <div class="daily-weather">
                        <h2 class="day">Fri</h2>
                        <h3 class="degrees">28</h3>
                        <canvas height="32" width="32" id="wind"></canvas>
                        <h5>11 <i>km/h</i></h5>
                      </div>
                    </div>
                    <div class="col-sm-2">
                      <div class="daily-weather">
                        <h2 class="day">Sat</h2>
                        <h3 class="degrees">26</h3>
                        <canvas height="32" width="32" id="cloudy"></canvas>
                        <h5>10 <i>km/h</i></h5>
                      </div>
                    </div>
                    <div class="clearfix"></div>
                  </div>
                </div>
              </div>

            </div>
        <!-- end of weather widget -->
              
            
          </div>
        </div>
<!-- /page content -->
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
	
  </body>
</html>
    