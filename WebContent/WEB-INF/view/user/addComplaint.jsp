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
		<link rel="icon" type="image/png" sizes="56x56" href="images/fav-icon/icon.png">


		<!-- Main style sheet -->
		<link rel="stylesheet" type="text/css" href="userResources/css/style.css">
		<!-- responsive style sheet -->
		<link rel="stylesheet" type="text/css" href="userResources/css/responsive.css">


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
					<!-- <div class="top-header">
						<div class="row">
							<div class="col-md-4 col-sm-6 col-xs-12">
								<p>Providing awesome since 2001 years</p>
							</div>
							<div class="col-md-4 col-sm-3 col-xs-12">
								<div class="call"><a href="#"><i class="flaticon-telephone"></i> +88 01682648101</a></div>
							</div>
							<div class="col-md-4 col-sm-3 col-xs-12">
								<ul class="social-icon text-right">
									<li><a href="#" class="tran3s"><i class="fa fa-facebook" aria-hidden="true"></i></a></li>
									<li><a href="#" class="tran3s"><i class="fa fa-twitter" aria-hidden="true"></i></a></li>
									<li><a href="#" class="tran3s"><i class="fa fa-skype" aria-hidden="true"></i></a></li>
									<li><a href="#" class="tran3s"><i class="fa fa-pinterest" aria-hidden="true"></i></a></li>
									<li><a href="#" class="tran3s"><i class="fa fa-google-plus" aria-hidden="true"></i></a></li>
								</ul>
							</div>
						</div> /.row
					</div> /.top-header
 -->
					<jsp:include page="menu1.jsp"></jsp:include>
				</div> <!-- /.container -->
			</header> <!-- /.theme-menu-wrapper -->


			<!-- 
			=============================================
				Theme Inner Banner
			============================================== 
			-->
			<div class="theme-inner-banner">
				<div class="opacity">
					<div class="container">
						<!-- <p>Inpire Your Business, Our talent team member of business agency </p> -->
						<h2>Post Complain</h2>
						<ul>
							<li><a href="index.html">Home</a></li>
							<li>.</li>
							<li><a href="#">Complain</a></li>
							<li>.</li>
							<li>Post Complain</li>
						</ul>
					</div> <!-- /.container -->
				</div> <!-- /.opacity -->
			</div> <!-- /.theme-inner-banner -->
			
		
			<!-- 
			=============================================
				Our Blog 
			============================================== 
			-->
			<div class="our-blog section-margin-bottom blog-details">
				<div class="container">
					<div class="row">
						<div class="col-lg-12 col-md-8 col-xs-12">
							<div class="blog-post-data">
								<div class="image"><img src="images/blog/10.jpg" alt=""></div>
								

								<div class="reply-comment-section">
									<h4 class="title-inner" align="center">Add your Complain</h4>


<%@taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
					
									<f:form action="insertComplaint.html" method="POST" modelAttribute="ComplaintVO" >
										<div class="row">
											<div>
												<f:input type="text" path="complaintSubject" plceholder="Subject" placeholder="Subject"/>
												
												<f:textarea path="complaintDescrption" placeholder="Description"/>	
											</div>
											
											
											
										</div> <!-- /.row -->
										<button class="theme-button-one p-bg-color">Submit</button>
									</f:form>

								</div> <!-- /.reply-comment-section -->
							</div> <!-- /.blog-post-data -->
						</div> <!-- /.col- -->
											</div> <!-- /.row -->
				</div> <!-- /.container -->
			</div> <!-- /.our-blog -->
			


			<!-- 
			=============================================
				Bottom Banner
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