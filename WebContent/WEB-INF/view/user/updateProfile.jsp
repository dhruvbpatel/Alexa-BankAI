<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<!-- Mirrored from themazine.com/html/inobiz/service.html by HTTrack Website Copier/3.x [XR&CO'2014], Wed, 15 May 2019 08:36:38 GMT -->
<head>
		<meta charset="UTF-8">
		<!-- For IE -->
		<meta http-equiv="X-UA-Compatible" content="IE=edge">

		<!-- For Resposive Device -->
		<meta name="viewport" content="width=device-width, initial-scale=1.0">

		<title>BankAI -Automated Loan Application System</title>

		<!-- Favicon -->
		<link rel="shortcut icon" href="adminResources/images/AI.png" />


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
				</div> <!-- /.container -->
			</header> <!-- /.theme-menu-wrapper -->


			<!--
			=============================================
				Theme Inner Banner
			==============================================
			-->
			<!-- <div class="theme-inner-banner">
				<div class="opacity">
					<div class="container">
						<p>Inpire Your Business, Make your business more productive, deliver lightning fast and more</p>
						<h2>Business Services</h2>
						<ul>
							<li><a href="index-2.html">Home</a></li>
							<li>.</li>
							<li><a href="#">Page</a></li>
							<li>.</li>
							<li>Services</li>
						</ul>
					</div> /.container
				</div> /.opacity
			</div> /.theme-inner-banner -->


			<!--
			=============================================
				Our Service
			==============================================
			-->
		<!-- 	<div class="our-service section-margin-bottom">
				<div class="container">
					<div class="row">
						<div class="col-md-4 col-sm-6 col-xs-12">
							<div class="single-service">
								<div class="image"><img src="userResources/images/service/1.jpg" alt=""></div>

								<div class="text">
									<h4><a href="service-details.html">Business accounting</a> <i class="flaticon-pie-chart"></i></h4>
									<p>Interdum iusto pulvinar consequuntur augue optio repellat fuga  Purus expedita fusce temp oribus.</p>
								</div> /.text
							</div> /.single-service
						</div> /.col-
						<div class="col-md-4 col-sm-6 col-xs-12">
							<div class="single-service">
								<div class="image"><img src="images/service/2.jpg" alt=""></div>

								<div class="text">
									<h4><a href="service-details.html">Business Consulting</a> <i class="flaticon-upload"></i></h4>
									<p>Interdum iusto pulvinar consequuntur augue optio repellat fuga  Purus expedita fusce temp oribus.</p>
								</div> /.text
							</div> /.single-service
						</div> /.col-
						<div class="col-md-4 col-sm-6 col-xs-12">
							<div class="single-service">
								<div class="image"><img src="images/service/3.jpg" alt=""></div>

								<div class="text">
									<h4><a href="service-details.html">Expert Team Mates</a> <i class="flaticon-devices"></i></h4>
									<p>Interdum iusto pulvinar consequuntur augue optio repellat fuga  Purus expedita fusce temp oribus.</p>
								</div> /.text
							</div> /.single-service
						</div> /.col-
						<div class="col-md-4 col-sm-6 col-xs-12">
							<div class="single-service">
								<div class="image"><img src="images/service/4.jpg" alt=""></div>

								<div class="text">
									<h4><a href="service-details.html">Text Analysis</a> <i class="flaticon-pie-chart"></i></h4>
									<p>Interdum iusto pulvinar consequuntur augue optio repellat fuga  Purus expedita fusce temp oribus.</p>
								</div> /.text
							</div> /.single-service
						</div> /.col-
						<div class="col-md-4 col-sm-6 col-xs-12">
							<div class="single-service">
								<div class="image"><img src="images/service/5.jpg" alt=""></div>

								<div class="text">
									<h4><a href="service-details.html">Consulting Idea</a> <i class="flaticon-upload"></i></h4>
									<p>Interdum iusto pulvinar consequuntur augue optio repellat fuga  Purus expedita fusce temp oribus.</p>
								</div> /.text
							</div> /.single-service
						</div> /.col-
						<div class="col-md-4 col-sm-6 col-xs-12">
							<div class="single-service">
								<div class="image"><img src="images/service/6.jpg" alt=""></div>

								<div class="text">
									<h4><a href="service-details.html">Digital Marketing</a> <i class="flaticon-devices"></i></h4>
									<p>Interdum iusto pulvinar consequuntur augue optio repellat fuga  Purus expedita fusce temp oribus.</p>
								</div> /.text
							</div> /.single-service
						</div> /.col-
						<div class="col-md-4 col-sm-6 col-xs-12">
							<div class="single-service">
								<div class="image"><img src="images/service/7.jpg" alt=""></div>

								<div class="text">
									<h4><a href="service-details.html">Accounting</a> <i class="flaticon-pie-chart"></i></h4>
									<p>Interdum iusto pulvinar consequuntur augue optio repellat fuga  Purus expedita fusce temp oribus.</p>
								</div> /.text
							</div> /.single-service
						</div> /.col-
						<div class="col-md-4 col-sm-6 col-xs-12">
							<div class="single-service">
								<div class="image"><img src="images/service/8.jpg" alt=""></div>

								<div class="text">
									<h4><a href="service-details.html">Startup Consultation</a> <i class="flaticon-upload"></i></h4>
									<p>Interdum iusto pulvinar consequuntur augue optio repellat fuga  Purus expedita fusce temp oribus.</p>
								</div> /.text
							</div> /.single-service
						</div> /.col-
						<div class="col-md-4 col-sm-6 col-xs-12">
							<div class="single-service">
								<div class="image"><img src="images/service/9.jpg" alt=""></div>

								<div class="text">
									<h4><a href="service-details.html">Web Development</a> <i class="flaticon-devices"></i></h4>
									<p>Interdum iusto pulvinar consequuntur augue optio repellat fuga  Purus expedita fusce temp oribus.</p>
								</div> /.text
							</div> /.single-service
						</div> /.col-
					</div> /.row

					<div class="load-more-button text-center"><a href="#" class="theme-button-one">See more services</a></div>
				</div> /.container
			</div> /.our-service -->


			<!--
			=============================================
				Consultation Help
			==============================================
			-->
			<div class="consultation-help clearfix section-margin-bottom">
				<div class="container">
					<div class="theme-title">
						<h2>Update your profile</h2>
						<!-- <p>How workforce development programs turn talent puddles into talent pools , Hiring isn’t easy. Employers <br> might get hundreds </p> -->
					</div> <!-- /.theme-title -->
				</div> <!-- /.container -->
				<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
				<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
				<div class="clearfix">
					<div class="section-part float-left">
						<div class="consultation-form-wrapper float-right col">
							<f:form action="updateProfile.html" modelAttribute="updateProfile" method="post">
								<label>First Name</label>
								<f:input type="text" placeholder="Enter a first name" path="firstName"/>
									<label>last Name</label>
								<f:input type="text" placeholder="Enter a last name" path="lastName"/>
						
									<label>phone no</label>
								<f:input type="text" placeholder="Enter a phone no" path="phoneNumber"/>
								
								<label>Email id</label>
								
								<f:input path="email"/>
								
								<label>Birth Date</label>
								<f:input type="date" placeholder="Enter a birthDate" path="birthDate"/>
								
								<label>Pincode</label>
								<f:input type="text" placeholder="Enter a pincode" path="pinCode"/>
									
								<label>Occupation</label>
								<f:input type="text" placeholder="occupation" path="occupation"/>
								
								<label>Address</label>
							 
							 	<f:textarea rows="5" cols="50" class="form-control" placeholder="Enter a address" path="address"/>


								<f:hidden path="id"/>
								<f:hidden path="loginVO.id"/>
								
								<button class="theme-button-one p-bg-color">Update</button>
							</f:form>
						</div> <!-- /.consultation-form-wrapper -->
					</div> <!-- /.section-part -->

					<div class="section-part float-left text-wrapper">
						
					</div> <!-- /.section-part -->
				</div>
			</div> <!-- /.consultation-help -->



			<!--
			=============================================
				Bottom Banner
			==============================================
			-->
			


			<jsp:include page="footer.jsp"></jsp:include>
			<!--
			=============================================
				Footer
			==============================================
		

			 

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

<!-- Mirrored from themazine.com/html/inobiz/service.html by HTTrack Website Copier/3.x [XR&CO'2014], Wed, 15 May 2019 08:36:49 GMT -->
</html>
