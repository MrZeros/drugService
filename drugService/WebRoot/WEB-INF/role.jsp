<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	<link href="./layui/css/layui.css" rel="stylesheet">
    <!-- Custom Theme Style -->
    <link href="./build/css/custom.min.css" rel="stylesheet">
    <link href="./build/user.css" rel="stylesheet">
	<link href="./build/button.css" rel="stylesheet">

  </head>

  <body class="nav-md">
    <div class="uedit">
      <div class="main_container">
     <div class="right_col" role="main">
        <div class="">
        	 <div class="page-title">							 	
	              <div class="title_left">	              	
	              	<h3>   
	              		<a href="javascript:void(0)" class="css_btn_class">质检</a>
	              		<a href="javascript:void(0)" class="css_btn_class">审核</a>
	              		<a href="javascript:void(0)" class="css_btn_class">入库</a>      
	              		<a href="javascript:void(0)" class="css_btn_class">作废</a>                   		             		
	              	</h3>
	                 
	              </div>

	              <div class="title_right">
	                <div class="col-md-5 col-sm-5 col-xs-12 form-group pull-right top_search">
	                  <div class="input-group">
	                    <input type="text" class="form-control" id="search" placeholder="Search for...">
	                    <span class="input-group-btn">
	                      <button class="btn btn-default" type="button" id="go">Go!</button>
	                    </span>
	                  </div>
	                </div>
	              </div>
            </div>
            <div class="x_panel">
              <div class="x_title">
                <ul class="nav navbar-right panel_toolbox">
                  <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                  </li>

                  <li><a class="close-link"><i class="fa fa-close"></i></a>
                  </li>
                </ul>
                <div class="clearfix"></div>
              </div>
              <div class="x_content">

                <div class="row">

                </div>
              </div>
            </div>
            
            <div class="row" style="height: 800px">
              <div class="col-md-12 col-sm-20 col-xs-24">
                <div class="x_panel">
                  <div class="x_title">
                    <h2>查询结果</h2>
                    <ul class="nav navbar-right panel_toolbox">
                      <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                      </li>

                      <li><a class="close-link"><i class="fa fa-close"></i></a>
                      </li>
                    </ul>
                    <div class="clearfix"></div>
                  </div>
                  <div class="x_content">
                    <div id="datatable-checkbox_wrapper" class="dataTables_wrapper form-inline dt-bootstrap no-footer">
      					  <div class="row">
           						<div class="col-sm-12">
           						<div class="layui-form">
								  <table class="layui-table" width="100%" style="font-size:1px">
								    <thead>
								      <tr>
								        <th width="5%"><input type="checkbox" name="" lay-skin="primary" lay-filter="allChoose"></th>
								        <th width="25%" >角色ID</th>
				                          <th width="25%">角色名</th>
				                          <th width="25%">是否使用</th>
				                          <th width="25%">创建时间</th>
								      </tr> 
								    </thead>
								    <tbody>								      		 								       
								     	  <c:forEach items="${allRoles }" var="role">
								     	  	<tr>
								     	  		<td><input type='checkbox' name='' lay-skin='primary'></td>
								     	  		<td>${role.role_id }</td>
								     	  		<td>${role.role_name }</td>
								     	  		<td>${role.is_used }</td>
								     	  		<td>${role.last_time }</td>
								     	  	</tr>
								     	  </c:forEach>    								      								     
								    </tbody>
								  </table>
								</div>
								</div>           
		                  </div>
	        							</div>
			               		<div class="row">
			                		<div class="col-sm-7">
			                			<div class="dataTables_paginate paging_simple_numbers" id="datatable-checkbox_paginate">
			                				<ul class="pagination">
			                					<li class="paginate_button previous" id="datatable-checkbox_previous"><a href="javascript:void(0)" aria-controls="datatable-checkbox" data-dt-idx="0" tabindex="0">Previous</a></li>
			                					<li class="paginate_button active"><a href="javascript:void(0)" aria-controls="datatable-checkbox" data-dt-idx="1" tabindex="0">1</a></li>
			                					<li class="paginate_button "><a href="javascript:void(0)" aria-controls="datatable-checkbox" data-dt-idx="2" tabindex="0">2</a></li>
			                					<li class="paginate_button "><a href="javascript:void(0)" aria-controls="datatable-checkbox" data-dt-idx="3" tabindex="0">3</a></li>
			                					<li class="paginate_button "><a href="javascript:void(0)" aria-controls="datatable-checkbox" data-dt-idx="4" tabindex="0">4</a></li>
			                					<li class="paginate_button "><a href="javascript:void(0)" aria-controls="datatable-checkbox" data-dt-idx="5" tabindex="0">5</a></li>
			                					<li class="paginate_button "><a href="javascript:void(0)" aria-controls="datatable-checkbox" data-dt-idx="6" tabindex="0">6</a></li>
			                					<li class="paginate_button "><a href="javascript:void(0)" aria-controls="datatable-checkbox" data-dt-idx="2" tabindex="0">7</a></li>
			                					<li class="paginate_button "><a href="javascript:void(0)" aria-controls="datatable-checkbox" data-dt-idx="3" tabindex="0">8</a></li>
			                					<li class="paginate_button "><a href="javascript:void(0)" aria-controls="datatable-checkbox" data-dt-idx="4" tabindex="0">9</a></li>
			                					<li class="paginate_button "><a href="javascript:void(0)" aria-controls="datatable-checkbox" data-dt-idx="5" tabindex="0">10</a></li>
			                					<li class="paginate_button "><a href="javascript:void(0)" aria-controls="datatable-checkbox" data-dt-idx="6" tabindex="0">11</a></li>
			                					<li class="paginate_button next" id="datatable-checkbox_next"><a href="javascript:void(0)" aria-controls="datatable-checkbox" data-dt-idx="7" tabindex="0">Next</a></li>
			                				</ul>
			                			</div>
			                		</div>
			                	</div>
                		</div>
                  	</div>
                </div>
              </div>
          </div>





        </div>
    </div>
          </div>
        </div>

<!--/left-->

<!-- page content -->
  
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
	<script src="./layui/layui.js"></script>
    <!-- Custom Theme Scripts -->
    <script src="./build/js/custom.min.js"></script>
	<script type="text/javascript">
		 var form=null;
		 layui.use('form', function(){
		  var $ = layui.jquery;
		   form = layui.form();
		  //全选
		  form.on('checkbox(allChoose)', function(data){
		    var child = $(data.elem).parents('table').find('tbody input[type="checkbox"]');
		    child.each(function(index, item){
		      item.checked = data.elem.checked;
		    });
		    form.render('checkbox');
		  });
		});
		function getDate(){
			 var date = new Date();
		    var seperator1 = "-";
		    var month = date.getMonth() + 1;
		    var strDate = date.getDate();
		    if (month >= 1 && month <= 9) {
		        month = "0" + month;
		    }
		    if (strDate >= 0 && strDate <= 9) {
		        strDate = "0" + strDate;
		    }
		    var currentdate = date.getFullYear() + seperator1 + month + seperator1 + strDate;
		    return currentdate;
		}
		$(function(){
			$(".pagination").on("click",'a',function(){
				var currPage=$(this).text();
				var allLi=$(this).parent().siblings();
				if(currPage=="Previous"){
					for(var i=0;i<allLi.length;i++){
						var $v=$(allLi[i]);
						if($v.hasClass("paginate_button active")){
							if($v.find("a").text()==1){
								currPage="1";
								console.log();
							}else{
								currPage=$v.find("a").text()-1;
								currPage+="";
								var $pre=$(allLi[i-1]);
								$pre.attr("class","paginate_button active");
								$v.attr("class","paginate_button ");
							}
							break;
						}
					}
				}else if(currPage=="Next"){
					for(var i=0;i<allLi.length;i++){
						var $v=$(allLi[i]);
						if($v.hasClass("paginate_button active")){
							if($v.find("a").text()==11){
								currPage="11";
							}else{
								currPage=$v.find("a").text();
								++currPage;
								currPage+="";
								var $next=$(allLi[i+1]);
								$next.attr("class","paginate_button active");
								$v.attr("class","paginate_button ");
							}
							break;
						}
					}
				}else{
					for(var i=0;i<allLi.length;i++){
					var $v=$(allLi[i]);
					if($v.hasClass("paginate_button active")){
						$v.attr("class","paginate_button");
					}
					}
					var $parent=$(this).parent();
					$parent.attr("class","paginate_button active");
				}
				var search=$("#search").val();
				var cmd={"page":currPage,"search":search};
				$.ajax({
				type:"post",
				datatype:"json",
				contentType: "application/json; charset=utf-8", 
				url:"roleData.do",
				data:JSON.stringify(cmd),
				success:function(result){
					var $tbody=$("tbody").html("");
					var newData="";
					for(var i=0;i<result.length;i++){
						var tr="<tr> <td><input type='checkbox' name='' lay-skin='primary'></td>";
							tr+="<td>"+result[i].role_id+"</td>";
	                        tr+="<td>"+result[i].role_name+"</td>";
	                        tr+="<td>"+result[i].is_used+"</td>";
	                        tr+= "<td>"+result[i].last_time+"</td>"; 
							tr+="</tr>";
							newData+=tr;
						}
						$tbody.html(newData);
						form.render('checkbox');
					}
				});
				return;
			});
			$("#go").click(function(){
				var search=$("#search").val();
				var cmd={"page":"1","search":search};
				$.ajax({
				type:"post",
				datatype:"json",
				contentType: "application/json; charset=utf-8", 
				url:"roleData.do",
				data:JSON.stringify(cmd),
				success:function(result){
					var $tbody=$("tbody").html("");
					var newData="";
					for(var i=0;i<result.length;i++){
						var tr="<tr> <td><input type='checkbox' name='' lay-skin='primary'></td>";
							tr+="<td>"+result[i].role_id+"</td>";
	                        tr+="<td>"+result[i].role_name+"</td>";
	                        tr+="<td>"+result[i].is_used+"</td>";
	                        tr+= "<td>"+result[i].last_time+"</td>"; 
							tr+="</tr>";
							newData+=tr;
					}
					$tbody.html(newData);
					form.render('checkbox');
				}
			});
			return;
		});
	});
		 
	</script>
  </body>
</html>
