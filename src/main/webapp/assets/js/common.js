jQuery(document).ready(function() {
	
		  document.getElementById(document.getElementsByClassName("tablink")[1].id.toLowerCase()).style.display = "block"; //by default open and clicked
		 $(document).on('click', '.tablink', function() {
			 var i, tabcontent, tablinks;
				tabcontent = document.getElementsByClassName("tabcontent");
				for (i = 0; i < tabcontent.length; i++) {
					tabcontent[i].style.display = "none";
				}
				tablinks = document.getElementsByClassName("tablink");
				for (i = 0; i < tablinks.length; i++) {
					tablinks[i].style.backgroundColor = "";
				}
//				document.getElementById(pageName).style.display = "block";
			    document.getElementById($(this)[0].id.toLowerCase()).style.display = "block";
			    if($(this)[0].id.toLowerCase()=="contact_book"){
			    	getAllAddress();
			    }
			    
		 });
		 
		 $("#blog_serachInput" ).keyup(function() {
			  var input, filter, table, tr, td, i;
			  input = document.getElementById("blog_serachInput");
			  filter = input.value.toUpperCase();
			  table = document.getElementById("top_blog_Grid");
			  tr = table.getElementsByTagName("tr");
			  for (i = 0; i < tr.length; i++) {
			    td = tr[i].getElementsByTagName("td")[1];
			    if (td) {
			      if (td.innerHTML.toUpperCase().indexOf(filter) > -1) {
			        tr[i].style.display = "";
			      } else {
			        tr[i].style.display = "none";
			      }
			    }       
			  }
		 });
		 
		 
		 
		 $("#blog_grid_serachInput" ).keyup(function() {
			  var input, filter, table, tr, td, i;
			  input = document.getElementById("blog_grid_serachInput");
			  filter = input.value.toUpperCase();
			  table = document.getElementById("blogGrid");
			  tr = table.getElementsByTagName("tr");
			  for (i = 0; i < tr.length; i++) {
			    td = tr[i].getElementsByTagName("td")[2];
			    if (td) {
			      if (td.innerHTML.toUpperCase().indexOf(filter) > -1) {
			        tr[i].style.display = "";
			      } else {
			        tr[i].style.display = "none";
			      }
			    }       
			  }
		 });
		
		 
			var myIndex = 0;
			carousel();
	function carousel() {
		var i;
		var x = document.getElementsByClassName("mySlides");
		for (i = 0; i < x.length; i++) {
			x[i].style.display = "none";
		}
		myIndex++;
		if (myIndex > x.length) {
			myIndex = 1
		}
		x[myIndex - 1].style.display = "block";
		setTimeout(carousel, 2000); // Change image every 2 seconds
	}
	
});

function addressBookGetNames() {
	return ($("#addressBookColumns").val()).split(",") ;
}

function blogGridColumn() {
	return ($("#blogGridColumns").val()).split(",") ;
}


function getAllAddress(){
 var addressBookNames= addressBookGetNames();
 
 /*TODO TnM END*/
// var gridWidth = $('.tabContent').width() / 7;
 var gridWidth = 100;//($(document).width())  / addressBookNames.length;
 var user_id = $("#user_id").val(); 
 $("#contactGrid").jqGrid('GridUnload');
	$("#contactGrid").jqGrid({
						url : 'getAllAddress?user_id='+user_id,
						datatype : 'json',
						mtype : 'GET',
						colNames : addressBookNames,
						colModel : [								
								{
									name : 'addressId',
									index : 'addressId',
									key : true,
									align : 'center',
									width : gridWidth,
									editable : false,
									hidden: true
								},
								{
									name : 'firstName',
									index : 'firstName',
									key : true,
									align : 'center',
									width : gridWidth,
									editable : false
								},
								{
									name : 'lastName',
									index : 'lastName',
									key : true,
									align : 'center',
									width : gridWidth,
									editable : false
								},
								{
									name : 'address',
									index : 'address',
									key : true,
									align : 'center',
									width : gridWidth,
									editable : false
								},
								{
									name : 'phoneNo',
									index : 'phoneNo',
									key : true,
									align : 'center',
									width : gridWidth,
									editable : false
								},
								{
									name : 'emailId',
									index : 'emailId',
									key : true,
									align : 'center',
									width : gridWidth,
									editable : false
								},
								{
									name : 'userId',
									index : 'userId',
									key : true,
									align : 'center',
									width : gridWidth,
									editable : false,
									hidden: true
								}
							 ],
						gridview : true,
						toolbar : [ false, "bottom" ],
						rowNum : 10,
						loadonce : true,
						rowList : [ 5, 10, 20 ],
						viewrecords : true,
						sortable : true,
						editable : true,
						height : '100%',
						pager: '#contactGridPager',
						paging : true,
						
						loadComplete: function (Data) {
							if ($('#contactGrid tr').length <= 1) {
								var msg = '<tr><td colspan="6"><h3 class="errMsg"><center>No Data Found.</center></h3></td></tr>';
								$('#contactGrid').html(msg);
								return false;
								}
							
						},
						success: function(data){
							alert("success--->>>>>>");
						},

					});
	 
}

