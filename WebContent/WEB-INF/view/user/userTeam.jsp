<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<meta charset="UTF-8">
		<!-- For IE -->
		<meta http-equiv="X-UA-Compatible" content="IE=edge">

		<!-- For Resposive Device -->
		<meta name="viewport" content="width=device-width, initial-scale=1.0">

		<title>BankAI -Automated Loan Application System</title>

		<!-- Favicon -->
		<link rel="icon" type="userResources/image/png" sizes="56x56" href="userResources/images/fav-icon/icon.png">


		<!-- Main style sheet -->
		<link rel="stylesheet" type="text/css" href="userResources/css/style.css">
		<!-- responsive style sheet -->
		<link rel="stylesheet" type="text/css" href="userResources/css/responsive.css">


		<!-- Fix Internet Explorer ______________________________________-->

		<!--[if lt IE 9]>
			<script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
			<script src="vendor/html5shiv.js"></script>
			<script src="vendor/respond.js"></script>
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
					<jsp:include page="header.jsp"></jsp:include>

					<jsp:include page="menu1.jsp"></jsp:include>
			</header> <!-- /.theme-menu-wrapper -->


			<!-- 
			=============================================
				Theme Inner Banner
			============================================== 
			-->
			<div class="theme-inner-banner">
				<div class="opacity">
					<div class="container">
						
						<h2>Our Team</h2>
						<ul>
							<li><a href="index.html">Home</a></li>
							<li>></li>
							<li>Our Team</li>
						</ul>
					</div> <!-- /.container -->
				</div> <!-- /.opacity -->
			</div> <!-- /.theme-inner-banner -->
			

		
			<!--
			=============================================
				Our Team
			==============================================
			-->
			<div class="our-team section-margin-bottom-two">
				<div class="container">
					<div class="row">
						<div class="col-lg-9 col-md-8 col-xs-12 float-right">
							<div class="row">
								<div class="col-sm-4 col-xs-6">	
									<div class="single-team-member">
										<div class="image"><img src="userResources/images/team/1.jpg" alt=""></div>
										<div class="text">
											<h6><a href="#">Vedant Patel</a></h6>
											<p>Intern</p>
											<ul class="social-icon">
												<li><a href="#" class="tran3s"><i class="fa fa-facebook" aria-hidden="true"></i></a></li>
												<li><a href="#" class="tran3s"><i class="fa fa-twitter" aria-hidden="true"></i></a></li>
												<li><a href="#" class="tran3s"><i class="fa fa-instagram" aria-hidden="true"></i></a></li>
											</ul>
										</div>
									</div> <!-- /.single-team-member -->
								</div> <!-- /.col- -->
								<div class="col-sm-4 col-xs-6">
									<div class="single-team-member">
										<div class="image">
										<img src="userResources/images/team/2.jpg" alt=""></div>
										<div class="text">
											<h6><a href="#">Dhruv Patel</a></h6>
											<p>Intern</p>
											<ul class="social-icon">
												<li><a href="#" class="tran3s"><i class="fa fa-facebook" aria-hidden="true"></i></a></li>
												<li><a href="#" class="tran3s"><i class="fa fa-twitter" aria-hidden="true"></i></a></li>
												<li><a href="#" class="tran3s"><i class="fa fa-instagram" aria-hidden="true"></i></a></li>
											</ul>
										</div>
									</div> <!-- /.single-team-member -->
								</div> <!-- /.col- -->
								<div class="col-sm-4 col-xs-6">
									<div class="single-team-member">
										<div class="image"><img src="userResources/images/team/3.jpg" alt=""></div>
										<div class="text">
											<h6><a href="#">Saurin Patel</a></h6>
											<p>Intern</p>
											<ul class="social-icon">
												<li><a href="#" class="tran3s"><i class="fa fa-facebook" aria-hidden="true"></i></a></li>
												<li><a href="#" class="tran3s"><i class="fa fa-twitter" aria-hidden="true"></i></a></li>
												<li><a href="#" class="tran3s"><i class="fa fa-instagram" aria-hidden="true"></i></a></li>
											</ul>
										</div>
									</div> <!-- /.single-team-member -->
								</div> <!-- /.col- -->
								 <!-- /.col- -->
								 <!-- /.col- -->
								
								 <!-- /.col- -->
							</div> <!-- /.row -->
						</div> <!-- /.col- -->

						<div class="col-lg-3 col-md-4 col-sm-6 col-xs-12 theme-sidebar">
							<div class="sidebar-categories widget-margin">
								<ul>
									<li class="active"><a href="#">Our Team</a></li>
								</ul>
							</div> <!-- /.sidebar-categories -->

							<div class="sidebar-partner-slider">
								<div class="item">
									<img src="userResources/images/home/4.jpg" alt="">
									<h6>Vedant Patel</h6>
									<p>Softvan.in</p>
								</div>
								<div class="item">
									<img src="userResources/images/home/5.jpg" alt="">
									<h6>Dhruv Patel</h6>
									<p>Softvan.in</p>
								</div>
								<div class="item">
									<img src="userResources/images/home/5.jpg" alt="">
									<h6>Saurin Patel</h6>
									<p>Softvan.in</p>
								</div>
							</div> <!-- /.sidebar-partner-slider -->
						</div> <!-- /.theme-sidebar -->
					</div>
				</div> <!-- /.container -->
			</div> <!-- /.our-team -->



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


			<jsp:include page="footer.jsp"></jsp:include>


	  
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
		<script type="text/javascript" src="userResources/vendor/bootstrap-select/dist/js/bootstrap-select.js"></script>
		<!-- Camera Slider -->
		<script type='text/javascript' src='userResources/vendor/Camera-master/scripts/jquery.mobile.customized.min.js'></script>
	    <script type='text/javascript' src='userResources/vendor/Camera-master/scripts/jquery.easing.1.3.js'></script> 
	    <script type='text/javascript' src='userResources/vendor/Camera-master/scripts/camera.min.js'></script>
	    <!-- Mega menu  -->
		<script type="text/javascript" src="userResources/vendor/bootstrap-mega-menu/js/menu.js"></script>
		<!-- WOW js -->
		<script src="userResources/vendor/WOW-master/dist/wow.min.js"></script>
		<!-- owl.carousel -->
		<script src="userResources/vendor/owl-carousel/owl.carousel.min.js"></script>


		<!-- Theme js -->
		<script type="text/javascript" src="userResources/js/theme.js"></script>

		</div> <!-- /.main-page-wrapper -->
	</body>
</html>
