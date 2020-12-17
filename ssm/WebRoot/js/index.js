		$(document).ready(function(){
			
				$.ajax({
					type: "post",
					url: "querymanu.do",
					data: {},
					dataType: "json",
					success: function(response) {
						var rows =response.rows;
						$.each(rows,function(index,row){
											if(row.firstCatalogId==1){
												if(row.secondCatalogId%100 == 0){
													$("#manu1").attr('href',row.href);
													$("#manu1").text(row.catalogValue);
												}
												var str= "<a class='dropdown-item text-white bg-my' href='"
												 str = str+row.href+"'>"+row.catalogValue+"</a>";
												 $("#dropmanu1").append(str);
											 }
											 else if(row.firstCatalogId==2){
												 if(row.secondCatalogId%100 == 0){
												 	$("#manu2").attr('href',row.href);
												 	$("#manu2").text(row.catalogValue);
												 }
												 var str= "<a class='dropdown-item text-white bg-my' href='"
												  str = str+row.href+"'>"+row.catalogValue+"</a>";
												  $("#dropmanu2").append(str);
											 }
											 else if(row.firstCatalogId==3){
												 if(row.secondCatalogId%100 == 0){
												 	$("#manu3").attr('href',row.href);
												 	$("#manu3").text(row.catalogValue);
												 }
													var str= "<a class='dropdown-item text-white bg-my' href='"
													str = str+row.href+"'>"+row.catalogValue+"</a>";
													$("#dropmanu3").append(str);
											 }
											 
											 else if(row.firstCatalogId==4){
												 if(row.secondCatalogId%100 == 0){
												 	$("#manu4").attr('href',row.href);
												 	$("#manu4").text(row.catalogValue);
												 }
													var str= "<a class='dropdown-item text-white bg-my' href='"
													str = str+row.href+"'>"+row.catalogValue+"</a>";
													$("#dropmanu4").append(str);
											 }
											 
											 else{
												 if(row.secondCatalogId%100 == 0){
												 	$("#manu5").attr('href',row.href);
												 	$("#manu5").text(row.catalogValue);
												 }
													var str= "<a class='dropdown-item text-white bg-my' href='"
													str = str+row.href+"'>"+row.catalogValue+"</a>";
													$("#dropmanu5").append(str);
											 }
										});
									
								    }	
				});
			
			$.ajax({
				type: "post",
				url: "queryimages.do",
				data: {},
				dataType: "json",
				success: function(response) {
					var rows =response.rows;
					$.each(rows,function(index,row){
									
											var str="#lunbo"+row.imageid.toString();
											console.log(str);
											$(str).attr('src',row.path);
											$(str).parents("a").attr('href',row.href);
										
									});
								
							    }	
			});
		});