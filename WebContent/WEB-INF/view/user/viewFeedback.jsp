<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
.rating {
	float: left;
}

/* :not(:checked) is a filter, so that browsers that don’t support :checked don’t 
   follow these rules. Every browser that supports :checked also supports :not(), so
   it doesn’t make the test unnecessarily selective */
.rating:not (:checked ) >input {
	position: absolute;
	top: -9999px;
	clip: rect(0, 0, 0, 0);
}

.rating:not (:checked ) >label {
	float: right;
	width: 1em;
	padding: 0 .1em;
	overflow: hidden;
	white-space: nowrap;
	cursor: pointer;
	font-size: 200%;
	line-height: 1.2;
	color: #ddd;
	text-shadow: 1px 1px #bbb, 2px 2px #666, .1em .1em .2em
		rgba(0, 0, 0, .5);
}

.rating:not (:checked ) >label:before {
	content: ' ';
}

.rating>input:checked ~ label {
	color: #f70;
	text-shadow: 1px 1px #c60, 2px 2px #940, .1em .1em .2em
		rgba(0, 0, 0, .5);
}

.rating:not (:checked ) >label:hover, .rating:not (:checked ) >label:hover 
	 ~ label {
	color: gold;
	text-shadow: 1px 1px goldenrod, 2px 2px #B57340, .1em .1em .2em
		rgba(0, 0, 0, .5);
}

.rating>input:checked+label:hover, .rating>input:checked+label:hover ~
	label, .rating>input:checked ~ label:hover, .rating>input:checked ~
	label:hover ~ label, .rating>label:hover ~ input:checked ~ label {
	color: #ea0;
	text-shadow: 1px 1px goldenrod, 2px 2px #B57340, .1em .1em .2em
		rgba(0, 0, 0, .5);
}

.rating>label:active {
	position: relative;
	top: 2px;
	left: 2px;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="UTF-8">
<!-- For IE -->
<meta http-equiv="X-UA-Compatible" content="IE=edge">

<!-- For Resposive Device -->
<meta name="viewport" content="width=device-width, initial-scale=1.0">


<!-- Favicon -->
<link rel="icon" type="image/png" sizes="56x56"
	href="images/fav-icon/icon.png">


<!-- Main style sheet -->
<link rel="stylesheet" type="text/css"
	href="userResources/css/style.css">
<!-- responsive style sheet -->
<link rel="stylesheet" type="text/css"
	href="userResources/css/responsive.css">

<link rel="stylesheet" type="text/css" href="userResources/css/star.css">

<!-- Fix Internet Explorer ______________________________________-->

<!--[if lt IE 9]>
			<script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
			<script src="userResources/vendor/html5shiv.js"></script>
			<script src="userResources/vendor/respond.js"></script>
		<![endif]-->

</head>
<body>
	<div class="main-page-wrapper">

		<!-- ===================================================
				Loading Transition
			==================================================== -->
		<div id="loader-wrapper">
			<div id="loader"></div>
		</div>




		<!-- 
			=============================================
				Theme Header
			============================================== 
			-->
		<header class="theme-menu-wrapper">
		<div class="container">


			<jsp:include page="menu1.jsp"></jsp:include>
		</div>
		<!-- /.container --> </header>
		<!-- /.theme-menu-wrapper -->


		<!-- 
			=============================================
				Theme Inner Banner
			============================================== 
			-->
		<div class="theme-inner-banner">
			<div class="opacity">
				<div class="container">
					<!-- <p>Inpire Your Business, Our talent team member of business agency </p> -->
					<h2>View Feedback</h2>
					<ul>
						<li><a href="index.html">Home</a></li>
						<li>.</li>
						<li><a href="#">Feedback</a></li>
						<li>.</li>
						<li>View Feedback</li>
					</ul>
				</div>
				<!-- /.container -->
			</div>
			<!-- /.opacity -->
		</div>
		<!-- /.theme-inner-banner -->


		<!-- 
			=============================================
				Our Blog 
			============================================== 
			-->
		<div class="our-blog section-margin-bottom-two blog-list">
			<div class="container">
				<div class="row">
					<div class="col-lg-9 col-md-8 col-xs-17">


						<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
						<%@taglib prefix="f" uri="http://java.sun.com/jstl/core_rt"%>
						<c:forEach items="${feedback}" var="i">

							<div class="single-blog">
								<div class="image">
									<img src="images/blog/10.jpg" alt="">
								</div>

								<div class="text">
									<div class="space-fix">
										<div class="date">${i.loginVO.email}</div>
										<div>
											<p>DESCRIPTION : ${i.feedbackDescription}</p>
										</div>
										<p>Rating :</p>
										<div class="rating">
											<c:forEach begin="1" end="${i.rating}" var="i">
												<input type="radio" id="star5" name="rating" value="5"
													checked="checked" />
												<label for="star5" title="Rocks!"><span
													class="fa fa-star checked"></span></label>
											</c:forEach>
										</div>

										<%-- 	<p>REPLY : ${i.reply}</p> --%>
									</div>

								</div>
							</div>
							<!-- /.single-blog -->

						</c:forEach>
						<!-- /.single-blog -->
					</div>

					<!-- /.col- -->
					<!-- <div class="col-lg-3 col-md-4 col-sm-6 col-xs-12 theme-sidebar">
							<form action="#" class="sidebar-search widget-margin">
								<input type="text" placeholder="Search">
								<button><i class="fa fa-search" aria-hidden="true"></i></button>
							</form>
							<div class="sidebar-categories widget-margin">
								<h4>Categories</h4>
								<ul>
									<li><a href="#">Business <span>( 12 )</span></a></li>
									<li><a href="#">Accounting <span>( 10 )</span></a></li>
									<li><a href="#">Consulting <span>( 09 )</span></a></li>
									<li><a href="#">Business Partner <span>( 05 )</span></a></li>
									<li><a href="#">Business Partner <span>( 11 )</span></a></li>
								</ul>
							</div> /.sidebar-categories

							<div class="sidebar-recent-post widget-margin">
								<h4>Recent Posts</h4>
								<ul>
									<li><a href="#">Hilfiger Show This watermelon I bought on a whim is pretty good</a></li>
									<li><a href="#">The hand rail is going a little faster than the moving</a></li>
									<li><a href="#">Hilfiger Show This watermelon I bought on a whim </a></li>
								</ul>
							</div> /.sidebar-recent-post

							<div class="sidebar-categories widget-margin">
								<h4>Archives</h4>
								<ul>
									<li><a href="#">January 2017 <span>( 12 )</span></a></li>
									<li><a href="#">February 2017 <span>( 10 )</span></a></li>
								</ul>
							</div> /.sidebar-categories

							<div class="sidebar-partner-slider">
								<div class="item">
<!-- 									<img src="images/home/4.jpg" alt=""> -->
								<!-- 	<h6>Joan Riad</h6>
									<p>Duis autem vel eum iriure dolor in hendrerit in vulput ate velit esse molestie consequat, vel illum dolore eu feugiat nulla</p>
								</div>
								<div class="item">
									<img src="images/home/5.jpg" alt="">
									<h6>Joan Munna</h6>
									<p>Duis autem vel eum iriure dolor in hendrerit in vulput ate velit esse molestie consequat, vel illum dolore eu feugiat nulla</p>
								</div>
							</div> 
						</div>  -->
 
				</div>
				<!-- /.row -->
			</div>
			<!-- /.container -->
		</div>
		<!-- /.our-blog -->



		<!-- 
			=============================================
				Bottom Banner
			============================================== 
			-->



		<!-- 
			=============================================
				Footer
			============================================== 
			-->
		<jsp:include page="footer1.jsp"></jsp:include>

		<!-- Scroll Top Button -->
		<button class="scroll-top tran3s">
			<i class="fa fa-angle-up" aria-hidden="true"></i>
		</button>





		<!-- Js File_________________________________ -->

		<!-- j Query -->
		<script src="userResources/vendor/jquery.2.2.3.min.js"></script>
		<!-- Bootstrap JS -->
		<script src="userResources/vendor/bootstrap/bootstrap.min.js"></script>
		<!-- Bootstrap Select JS -->
		<script type="text/javascript"
			src="userResources/vendor/bootstrap-select/dist/js/bootstrap-select.js"></script>
		<!-- Camera Slider -->
		<script type='text/javascript'
			src='userResources/vendor/Camera-master/scripts/jquery.mobile.customized.min.js'></script>
		<script type='text/javascript'
			src='userResources/vendor/Camera-master/scripts/jquery.easing.1.3.js'></script>
		<script type='text/javascript'
			src='userResources/vendor/Camera-master/scripts/camera.min.js'></script>
		<!-- Mega menu  -->
		<script type="text/javascript"
			src="userResources/vendor/bootstrap-mega-menu/js/menu.js"></script>
		<!-- WOW js -->
		<script src="userResources/vendor/WOW-master/dist/wow.min.js"></script>
		<!-- owl.carousel -->
		<script src="userResources/vendor/owl-carousel/owl.carousel.min.js"></script>


		<!-- Theme js -->
		<script type="text/javascript" src="userResources/js/theme.js"></script>

	</div>
	<!-- /.main-page-wrapper -->
</body>
</html>