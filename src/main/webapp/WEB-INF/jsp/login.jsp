<html lang="en">
<head>
<title>Bajji Blogs-</title>
<link rel="icon" href="../images/tittle6.png" type="image/png"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"></meta>
<script src="js/jquery-1.9.1.js" type="text/javascript"></script>
<link rel="stylesheet" type="text/css"	href="../assets/css/jquery-ui.css" />
<script src="../assets/js/jquery-ui.js" type="text/javascript"></script>
<script type="text/javascript">
	$(function() {
		
		  $("#id01").dialog({
	            modal: true,
	            autoOpen: false,
	            title: "Sign Up",
	            width: 700,
	            height: 550
	        }); 
		 
	        $("#btn_sign_up").on('click', function() {
	            $('#id01').dialog('open');
	        });
		
		
		$('.col button').on('click', function() {
			location.href = "/landingPage";
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
		
		/* // Get the modal
		var modal = document.getElementById('id01');

		// When the user clicks anywhere outside of the modal, close it
		window.onclick = function(event) {
		    if (event.target == modal) {
		        modal.style.display = "none";
		    }
		}	 */
		       
	});
	
</script>

<style>

/* Sign Up start here*/

body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box}
/* Full-width input fields */
input[type=text], input[type=password] {
    width: 100%;
    padding: 15px;
    margin: 5px 0 22px 0;
    display: inline-block;
    border: none;
    background: #f1f1f1;
}

/* Add a background color when the inputs get focus */
input[type=text]:focus, input[type=password]:focus {
    background-color: #ddd;
    outline: none;
}

/* Set a style for all buttons */
button {
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 100%;
    opacity: 0.9;
}

button:hover {
    opacity:1;
}

/* Extra styles for the cancel button */
.cancelbtn {
    padding: 14px 20px;
    background-color: #f44336;
}

/* Float cancel and signup buttons and add an equal width */
.cancelbtn, .signupbtn {
  float: left;
  width: 20%;
}

/* Add padding to container elements */
.container {
     width: 70%; /* Full width */
     height: 100%; /* Full height */
     background-color: green;
}

/* The Modal (background) */
.modal {
    display: none; /* Hidden by default */
    position: fixed; /* Stay in place */
    z-index: 1; /* Sit on top */
    left: 300px;
    top: 20px;
    width: 60%; /* Full width */
    height: 100%; /* Full height */
    overflow: auto; /* Enable scroll if needed */
    background-color: blue;
    padding-top: 50px;
}

/* Modal Content/Box */
.modal-content {
}

/* Style the horizontal ruler */
hr {
    border: 1px solid #f1f1f1;
    margin-bottom: 25px;
}
 
/* The Close Button (x) */
.close {
    position: absolute;
    right: 35px;
    top: 15px;
    font-size: 40px;
    font-weight: bold;
    color: #f1f1f1;
}

.close:hover,
.close:focus {
    color: #f44336;
    cursor: pointer;
}

/* Clear floats */
.clearfix::after {
    content: "";
    clear: both;
    display: table;
}

/* Change styles for cancel button and signup button on extra small screens */
@media screen and (max-width: 300px) {
    .cancelbtn, .signupbtn {
       width: 100%;
    }
}

/* Sign Up ends here */

/* Footer */
.footer {
    padding: 10px;
    text-align: right;
    background: #ddd;
}

/* Header */
.header {
	background: #101928;
	text-align: center;
}
/* Footer */
.page {
	background: #5d97f4;
	height: 100%;
	width: 100%;
}
/* Column container */
.row {
	background: #5d97f4;
	height: 100%;
	width: 100%;
}
/* Responsive layout - when the screen is less than 400px wide, make the navigation links stack on top of each other instead of next to each other */
@media screen and (max-width: 400px) {
	.navbar a {
		float: none;
		width: 100%;
	}
}

.mySlides {
	display: none;
}

body {
	font-family: Arial, Helvetica, sans-serif;
}

* {
	box-sizing: border-box;
}

/* style the container */
.container {
	position: relative;
	border-radius: 5px;
	background-color: #f2f2f2;
	padding: 20px 0 30px 0;
	height: 100%;
	width: 100%;
}

/* style inputs and link buttons */
input, .btn {
	width: 100%;
	padding: 12px;
	border: none;
	border-radius: 4px;
	margin: 5px 0;
	opacity: 0.85;
	display: inline-block;
	font-size: 17px;
	line-height: 20px;
	text-decoration: none; /* remove underline from anchors */
}

input:hover, .btn:hover {
	opacity: 1;
}

/* add appropriate colors to fb, twitter and google buttons */
.fb {
	background-color: #3B5998;
	color: white;
}

.twitter {
	background-color: #55ACEE;
	color: white;
}

.google {
	background-color: #dd4b39;
	color: white;
}

/* style the submit button */
input[type=submit] {
	background-color: #4CAF50;
	color: white;
	cursor: pointer;
}

input[type=submit]:hover {
	background-color: #45a049;
}

/* Two-column layout */
.col {
	float: left;
	width: 50%;
	margin: auto;
	padding: 0 50px;
	margin-top: 6px;
	border-radius: 10%;
	
}

/* Clear floats after the columns */
.row:after {
	content: "";
	display: table;
	clear: both;
}

/* vertical line */
.vl {
	position: absolute;
	left: 50%;
	transform: translate(-50%);
	border: 2px solid #ddd;
	height: 175px;
}

/* text inside the vertical line */
.vl-innertext {
	position: absolute;
	top: 50%;
	transform: translate(-50%, -50%);
	background-color: #f1f1f1;
	border: 1px solid #ccc;
	border-radius: 50%;
	padding: 8px 10px;
}

/* hide some text on medium and large screens */
.hide-md-lg {
	display: none;
}

/* bottom container */
.bottom-container {
	text-align: center;
	background-color: red;
	border-radius: 0px 0px 4px 4px;
	height: 100%;
	width: 100%;
}

/* Responsive layout - when the screen is less than 650px wide, make the two columns stack on top of each other instead of next to each other */
@media screen and (max-width: 650px) {
	.col {
		width: 100%;
		margin-top: 0;
	}
	/* hide the vertical line */
	.vl {
		display: none;
	}
	/* show the hidden text on small screens */
	.hide-md-lg {
		display: block;
		text-align: center;
	}
}
</style>
</head>
<body background="../images/body-bg-32.png">

	<div class="w3-content w3-section" style="max-height: 300px">
		<img class="mySlides" src="../images/../images/Untitled design (2).png"
			style="width: 100%; max-height: 300px"> 
	<!-- <img class="mySlides" src="../images/Capture_new.PNG"
			style="width: 100%; max-height: 200px"> -->
	</div>

	<br></br>

		<form action="landingPage" method="get" class = "row">
		<br></br>
		<br></br>
		
			<div class="row">
				<div class="vl">
					<span class="vl-innertext">or</span>
				</div>
				<div class="col">
					<div class="hide-md-lg">
						<p>Or sign in manually:</p>
					</div>

					<input type="text" name="username" placeholder="Username" required>
						<input type="password" name="password" placeholder="Password"
						required> <input type="submit" value="Login" id="loginBtn">
						<a href="#"  id = "btn_sign_up"  style="color: white" class="btn">Sign up</a>
						<a href="#" style="color: white" class="btn">Forgot password?</a>
				</div>
				
				 <div class="col">
					<a href="#" class="fb btn"> <i class="fa fa-facebook fa-fw"></i>
						Login with Facebook
					</a> <a href="#" class="twitter btn"> <i
						class="fa fa-twitter fa-fw"></i> Login with Twitter
					</a> <a href="#" class="google btn"><i class="fa fa-google fa-fw">
					</i> Login with Google+ </a>
				</div> 
			</div>
		</form>

	<div id="id01" style="display: none" align = "center">
	  <form action="addUser" method="post">
	    <div class="container">
	      <label  for="username"><b>User Name</b></label>
	      <input  type="text" placeholder="Enter User Name" name="username" required>
	
	      <label for="passwprd"><b>Password</b></label>
	      <input type="password" placeholder="Enter Password" name="password" required>
	
	      <label for="email"><b>Email</b></label>
	      <input type="text" placeholder="Enter Email" name="email" required>
<!-- 	      <p>By creating an account you agree to our <a href="#" style="color:dodgerblue">Terms & Privacy</a>.</p> -->
	      <div class="clearfix">
	        <button type="button" onclick="document.getElementById('id01').style.display='none'" class="cancelbtn">Cancel</button>
	        <button type="submit" class="signupbtn">Sign Up</button>
	      </div>
	    </div> 
	  </form>
	</div>
	
	
	<!-- <div class="footer">
  <h6>@CopyRights Reserved..!!</h6>
</div> -->
</body>
</html>
