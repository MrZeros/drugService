$(function(){	
	$(".nav-md").on("click",'a',function(e){
			var $ds=$(this).attr("data_src");
			var $showFrame=$("#show_content").attr("src",$ds);
	});
});
