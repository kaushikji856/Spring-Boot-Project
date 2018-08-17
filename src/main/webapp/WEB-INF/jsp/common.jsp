
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html lang="en">
<head>
<title>Bajji-Blogs</title>

<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="icon" href="../images/tittle6.png" type="image/png" />
		<link rel="stylesheet" type="text/css"
			href="../assets/css/font-awesome.min.css">

			<link rel="stylesheet" type="text/css" href="../assets/css/style.css" />
			<link rel="stylesheet" type="text/css"
				href="../assets/css/ui.jqgrid.css" />
			<link rel="stylesheet" type="text/css"
				href="../assets/css/ui.multiselect.css" />
			<link rel="stylesheet" type="text/css"
				href="../assets/css/jquery-ui-custom.css" />
			<link rel="stylesheet" type="text/css"
				href="../assets/css/jquery-ui.css" />
			<link rel="stylesheet" type="text/css"
				href="../assets/css/common.css" />

			<script src="../assets/js/jquery-1.9.1.js" type="text/javascript"></script>
			<script src="../assets/js/common.js" type="text/javascript"></script>
			<script src="../assets/js/blog.js" type="text/javascript"></script>
			<script src="../assets/js/jquery-1.9.1.js" type="text/javascript"></script>
			<script src="../assets/js/jquery-ui.js" type="text/javascript"></script>
			<script src="../assets/js/jquery.jqGrid.js" type="text/javascript"></script>
			<script src="../assets/js/customjQuery.js" type="text/javascript"></script>
			<script src="../assets/js/jquery.layout.js" type="text/javascript"></script>

			<script src="../assets/js/grid.locale-en.js" type="text/javascript"></script>
			<script src="../assets/js/ui.multiselect.js" type="text/javascript"></script>
			<script src="../assets/js/jquery.tablednd.js" type="text/javascript"></script>
			<script src="../assets/js/jquery.contextmenu.js"
				type="text/javascript"></script>
</head>

<body background="../images/body-bg-32.png">

	<div class="tab">
		<div class="w3-content w3-section" style="max-height: 300px">
			<img class="mySlides" src="../images/Untitled design (2).png"
				style="width: 100%; max-height: 300px"> <img class="mySlides"
				src="../images/Untitled design (3).png"
				style="width: 100%; max-height: 300px"> <img class="mySlides"
					src="../images/Untitled design (4).png"
					style="width: 100%; max-height: 300px"> <img class="mySlides"
						src="../images/Untitled design (5).png"
						style="width: 100%; max-height: 300px">
		</div>
	</div>

	<div>
		<input type="hidden" id="user_name" value="${username}" /> <input
			type="hidden" id="user_id" value="${userid}" />
	</div>
	<div>
		<button class="tablink">
			<img src="../images/tittle1.png"
				style="width: 100%; max-height: 60px" />
		</button>
		<button class="tablink" id="HOME">Home</button>
		<button class="tablink" id="SOLUTION">Solution</button>
		<button class="tablink" id="NEWS">News</button>
		<button class="tablink" id="BLOGS">Blogs</button>
		<button class="tablink" id="CONTACT_BOOK">Contact Book</button>
		<button class="tablink" id="ABOUT">About</button>
		<a class="fa fa-globe tablink" style="width: 40px; max-height: 48px">
			<span class="fa fa-comment"></span> <span class="num">0</span>
		</a>
		<button class="tablink" id="LOGOUT_USER">Logout</button>
	</div>
	<div>
		<p style="float: right;color: #110000;font-weight: bold;">Welcome : ${username}</p>
	</div>

	<div id="home" class="tabcontent">
		<div class="row">
			<div class="side">
				<div class="fakeimg" style="height: 200px;">
					<img src="../images/tittle2.png" class="side-img">
				</div>
			</div>
			<div class="main" id="id_home">
				<h2>About the Home</h2>
				<p>SA solution provider is a vendor, a service provider or a
					value-added reseller (VAR) that comprehensively handles the project
					needs of their client from concept to installation through support.
					This process normally involves studying the client's current
					infrastructure, evaluating the client's needs, specifying the mix
					of manufacturers' hardware and software required to meet project
					goals, installing the hardware and software at the client's
					site(s). In many cases, the "solution" also includes ongoing
					service and support from the VAR.</p>
				<p>SA solution provider is a vendor, a service provider or a
					value-added reseller (VAR) that comprehensively handles the project
					needs of their client from concept to installation through support.
					This process normally involves studying the client's current
					infrastructure, evaluating the client's needs, specifying the mix
					of manufacturers' hardware and software required to meet project
					goals, installing the hardware and software at the client's
					site(s). In many cases, the "solution" also includes ongoing
					service and support from the VAR.</p>
				<p>SA solution provider is a vendor, a service provider or a
					value-added reseller (VAR) that comprehensively handles the project
					needs of their client from concept to installation through support.
					This process normally involves studying the client's current
					infrastructure, evaluating the client's needs, specifying the mix
					of manufacturers' hardware and software required to meet project
					goals, installing the hardware and software at the client's
					site(s). In many cases, the "solution" also includes ongoing
					service and support from the VAR.</p>
				<br>
			</div>
			<div class="right-side">
				<button class="accordion">Section 1</button>
				<div class="online-panel">
					<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
						sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
						Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris
						nisi ut aliquip ex ea commodo consequat.</p>
				</div>

				<button class="accordion">Section 2</button>
				<div class="online-panel">
					<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
						sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
						Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris
						nisi ut aliquip ex ea commodo consequat.</p>
				</div>

				<button class="accordion">Section 3</button>
				<div class="online-panel">
					<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
						sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
						Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris
						nisi ut aliquip ex ea commodo consequat.</p>
				</div>
			</div>

		</div>
	</div>

	<div id="solution" class="tabcontent">
		<div class="row">
			<div class="side">
				<div class="fakeimg" style="height: 200px;">
					<img src="../images/solution_logo1.jpg" class="side-img1">
				</div>
			</div>
			<div class="main" id="id_solution">
				<h2>About the Solution</h2>
				<p>SA solution provider is a vendor, a service provider or a
					value-added reseller (VAR) that comprehensively handles the project
					needs of their client from concept to installation through support.
					This process normally involves studying the client's current
					infrastructure, evaluating the client's needs, specifying the mix
					of manufacturers' hardware and software required to meet project
					goals, installing the hardware and software at the client's
					site(s). In many cases, the "solution" also includes ongoing
					service and support from the VAR.</p>

				<p>SA solution provider is a vendor, a service provider or a
					value-added reseller (VAR) that comprehensively handles the project
					needs of their client from concept to installation through support.
					This process normally involves studying the client's current
					infrastructure, evaluating the client's needs, specifying the mix
					of manufacturers' hardware and software required to meet project
					goals, installing the hardware and software at the client's
					site(s). In many cases, the "solution" also includes ongoing
					service and support from the VAR.</p>
				<p>SA solution provider is a vendor, a service provider or a
					value-added reseller (VAR) that comprehensively handles the project
					needs of their client from concept to installation through support.
					This process normally involves studying the client's current
					infrastructure, evaluating the client's needs, specifying the mix
					of manufacturers' hardware and software required to meet project
					goals, installing the hardware and software at the client's
					site(s). In many cases, the "solution" also includes ongoing
					service and support from the VAR.</p>
				<br>
			</div>
			<div class="right-side">
				<button class="accordion">Section 1</button>
				<div class="online-panel">
					<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
						sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
						Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris
						nisi ut aliquip ex ea commodo consequat.</p>
				</div>

				<button class="accordion">Section 2</button>
				<div class="online-panel">
					<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
						sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
						Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris
						nisi ut aliquip ex ea commodo consequat.</p>
				</div>

				<button class="accordion">Section 3</button>
				<div class="online-panel">
					<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
						sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
						Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris
						nisi ut aliquip ex ea commodo consequat.</p>
				</div>
			</div>
		</div>
	</div>

	<div id="news" class="tabcontent">
		<div class="row">
			<div class="side">
				<div class="fakeimg" style="height: 200px;">
					<img src="../images/news_logo.jpg" class="side-img1">
				</div>
			</div>
			<div class="main" id="id_news">
				<h2>About the News</h2>
				<p>SA solution provider is a vendor, a service provider or a
					value-added reseller (VAR) that comprehensively handles the project
					needs of their client from concept to installation through support.
					This process normally involves studying the client's current
					infrastructure, evaluating the client's needs, specifying the mix
					of manufacturers' hardware and software required to meet project
					goals, installing the hardware and software at the client's
					site(s). In many cases, the "solution" also includes ongoing
					service and support from the VAR.</p>

				<p>SA solution provider is a vendor, a service provider or a
					value-added reseller (VAR) that comprehensively handles the project
					needs of their client from concept to installation through support.
					This process normally involves studying the client's current
					infrastructure, evaluating the client's needs, specifying the mix
					of manufacturers' hardware and software required to meet project
					goals, installing the hardware and software at the client's
					site(s). In many cases, the "solution" also includes ongoing
					service and support from the VAR.</p>
				<p>SA solution provider is a vendor, a service provider or a
					value-added reseller (VAR) that comprehensively handles the project
					needs of their client from concept to installation through support.
					This process normally involves studying the client's current
					infrastructure, evaluating the client's needs, specifying the mix
					of manufacturers' hardware and software required to meet project
					goals, installing the hardware and software at the client's
					site(s). In many cases, the "solution" also includes ongoing
					service and support from the VAR.</p>
				<br>
			</div>
			<div class="right-side">
				<button class="accordion">Section 1</button>
				<div class="online-panel">
					<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
						sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
						Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris
						nisi ut aliquip ex ea commodo consequat.</p>
				</div>

				<button class="accordion">Section 2</button>
				<div class="online-panel">
					<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
						sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
						Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris
						nisi ut aliquip ex ea commodo consequat.</p>
				</div>

				<button class="accordion">Section 3</button>
				<div class="online-panel">
					<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
						sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
						Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris
						nisi ut aliquip ex ea commodo consequat.</p>
				</div>
			</div>
		</div>
	</div>

	<div id="blogs" class="tabcontent">
		<div class="row">
			<div class="side">
				<div class="fakeimg" style="height: 200px;">
					<img src="../images/blog_logo2.png" class="side-img1">
				</div>
				<button class="accordion">Top Latest 20 Blogs</button>
				<div>
					<input type="text" id="blog_serachInput"
						placeholder="Search by blog name.." title="Type bog name..">
						<table id="top_blog_Grid">
							<tr class="header">
							</tr>

						</table>
						<div id="top20_blogGridPager"></div>
				</div>
				<button class="accordion">Top 20 Most Liked Blogs</button>
				<div></div>
				<button class="accordion">Top 20 Most Viewed Blogs</button>
				<div></div>
			</div>
			<div class="main" id="id_create_blog_panel" style="display: none">
				<img src="../images/photo.png" alt="" class="contact-profile" />
				<div id="blog_heading" class="blog_heading">
					<h5 id="blog_time"></h5>
					<a href="#" class="blog_buttons" id="id_save_blog"><img src="../images/save-icon.png" alt=""/></a> <a
						href="#" class="blog_buttons" id="id_update_blog"><img src="../images/edit-icon.png" alt=""/></a> <a
						href="#" class="blog_buttons" id="id_delete_blog"><img src="../images/delete-icon.png" alt=""/></a> <!-- <a
					    href="#" class="blog_buttons" id="id_draft_blog">Save as Draft</a> -->
					<a href="#" class="blog_buttons" id="id_reset_blog"><img src="../images/clear-icon.png" alt=""/></a> <a
						href="#" class="blog_buttons" id="id_back_blog"><img src="../images/go-back-icon.png" alt=""/></a> <br></br>
				</div>

				<div>
					<input type="text" class="class_blog_content" id="id_blog_tittle"
						placeholder="Enter the blog tittle.. ">
						<h4>Topic:</h4> <input type="text" class="class_blog_content"
						id="id_blog_name" placeholder="Enter the blog Topic.. ">
							<h4>Content:</h4> <textarea class="class_blog_content"
								id="id_blog_content" rows="20" cols="100"
								placeholder="Write your own blog here.." required></textarea>
							<div class="row">
								<button class="fa fa-thumbs-up blog_buttons" id="id_like">0</button>
								<button class="fa blog_buttons" type="button" id="id_comments"></button>
							</div> <br></br>
							<div>
								<textarea name="comments" rows="5" cols="40"
									id="id_comment_toSave" placeholder="Write your comment here.."
									maxlength="100"></textarea>
							</div> <input type="submit" value="Submit" id="id_submit_comment"
							class="blog_buttons"> <br></br>
								<div class="messages">
									<ul>
										<li class="sent"></li>
										<li class="replies"></li>
									</ul>
								</div>
				</div>
			</div>

			<div class="main" id="id_create_blog">
				<div id="blog_heading" class="blog_heading">
					<a href="#" class="blog_buttons" id="id_create_blog_button">
					<img src="../images/blog-write-icon.png" alt="" />
					</a>
					<div class="main" id="id_about">
						<h3>Your Own Blog List</h3>
						<input type="text" id="blog_grid_serachInput"
							placeholder="Search by blog title.."> <input
							type="hidden" id="blogGridColumns"
							value="Blog Id, Blog Tittle, 
											Blog Name, Blog Content, Blog Date, User Id" />
							<table id="blogGrid">
								<tr>
									<td />
								</tr>
							</table>
							<div id="blogGridPager"></div>
					</div>
				</div>

			</div>
			<div class="right-side">
				<button class="accordion" id="id_online_friends">Online
					Friends</button>
				<div class="online-panel" id="id_online">
					<ul>
						<li class="online-friends"></li>
					</ul>

				</div>

				<button class="accordion">Section 2</button>
				<div class="online-panel">
					<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
						sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
						Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris
						nisi ut aliquip ex ea commodo consequat.</p>
				</div>

				<button class="accordion">Section 3</button>
				<div class="online-panel">
					<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
						sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
						Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris
						nisi ut aliquip ex ea commodo consequat.</p>
				</div>
			</div>
		</div>
	</div>

	<div id="contact_book" class="tabcontent">
		<div class="row">
			<div class="side">
				<div class="fakeimg" style="height: 200px;">
					<img src="../images/contact_book_logo.jpg" class="side-img1">
				</div>
			</div>
			<div class="main" id="id_about">
				<a href="#" class="blog_buttons" id="id_create_blog_button">
					<img src="../images/blog-write-icon.png" alt=""/>
				</a>
				<h2>About the Contact</h2>
				<input type="text" id="contact_grid_serachInput"
					placeholder="Search by contact name.."> <input
					type="hidden" id="addressBookColumns"
					value="Address Id, Frist Name, 
										Last Name, Address, Email-Id, phone-No, User Id" />
					<table id="contactGrid">
						<tr>
							<td />
						</tr>
					</table>
					<div id="contactGridPager"></div>
			</div>
			<div class="right-side">
				<button class="accordion">Section 1</button>
				<div class="online-panel">
					<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
						sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
						Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris
						nisi ut aliquip ex ea commodo consequat.</p>
				</div>

				<button class="accordion">Section 2</button>
				<div class="online-panel">
					<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
						sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
						Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris
						nisi ut aliquip ex ea commodo consequat.</p>
				</div>

				<button class="accordion">Section 3</button>
				<div class="online-panel">
					<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
						sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
						Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris
						nisi ut aliquip ex ea commodo consequat.</p>
				</div>
			</div>
		</div>
	</div>

	<div id="about" class="tabcontent">
		<div class="row">
			<div class="side">
				<h5>Vipin Kumar Sharma</h5>
				<div class="fakeimg" style="height: 200px;">
					<img src="../images/photo.png" width="180" height="200">
				</div>
				<form>
					<input class="profile-button" type="button" value="Profile" />
				</form>
			</div>

			<div class="main" id="id_about">
				<h2>About the Owner</h2>
				<p>SA solution provider is a vendor, a service provider or a
					value-added reseller (VAR) that comprehensively handles the project
					needs of their client from concept to installation through support.
					This process normally involves studying the client's current
					infrastructure, evaluating the client's needs, specifying the mix
					of manufacturers' hardware and software required to meet project
					goals, installing the hardware and software at the client's
					site(s). In many cases, the "solution" also includes ongoing
					service and support from the VAR.</p>

				<p>SA solution provider is a vendor, a service provider or a
					value-added reseller (VAR) that comprehensively handles the project
					needs of their client from concept to installation through support.
					This process normally involves studying the client's current
					infrastructure, evaluating the client's needs, specifying the mix
					of manufacturers' hardware and software required to meet project
					goals, installing the hardware and software at the client's
					site(s). In many cases, the "solution" also includes ongoing
					service and support from the VAR.</p>
				<p>SA solution provider is a vendor, a service provider or a
					value-added reseller (VAR) that comprehensively handles the project
					needs of their client from concept to installation through support.
					This process normally involves studying the client's current
					infrastructure, evaluating the client's needs, specifying the mix
					of manufacturers' hardware and software required to meet project
					goals, installing the hardware and software at the client's
					site(s). In many cases, the "solution" also includes ongoing
					service and support from the VAR.</p>
				<br>
			</div>
			<div class="right-side">
				<button class="accordion">Section 1</button>
				<div class="online-panel">
					<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
						sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
						Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris
						nisi ut aliquip ex ea commodo consequat.</p>
				</div>

				<button class="accordion">Section 2</button>
				<div class="online-panel">
					<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
						sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
						Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris
						nisi ut aliquip ex ea commodo consequat.</p>
				</div>

				<button class="accordion">Section 3</button>
				<div class="online-panel">
					<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
						sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
						Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris
						nisi ut aliquip ex ea commodo consequat.</p>
				</div>
			</div>
		</div>
	</div>

	<div id="logout_user" class="tabcontent"></div>

	<script>
		
	</script>

	<div class="footer">
		<h6>@CopyRights Reserved..!!</h6>
	</div>

</body>
</html>
