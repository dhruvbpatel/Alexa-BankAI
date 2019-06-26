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


		<header class="theme-menu-wrapper">
				<div class="container">
			
			
			
			<jsp:include page="menu1.jsp"></jsp:include>
			<!-- 
			=============================================
				Theme Inner Banner
			============================================== 
			-->
			
				</div>
			 </header>
			<div class="theme-inner-banner">
				<div class="opacity">
					<div class="container">
						
						<h2>View Loan</h2>
						<ul>
							<li><a href="index.html">Home</a></li>
							<li>.</li>
							<li><a href="#">Loan</a></li>
							<li>.</li>
							<li>View Loan</li>
						</ul>
					</div> <!-- /.container -->
				</div> <!-- /.opacity -->
			</div> <!-- /.theme-inner-banner -->
			
		
			<!-- 
			=============================================
				Our Service
			============================================== 
			-->
			<div class="our-service section-margin-bottom">
				<div class="container">
					<div class="row">
						

			<%@taglib prefix="f" uri="http://java.sun.com/jstl/core_rt" %>
						
				<f:forEach items="${loanRequest}" var="i" >		
						<div class="col-md-4 col-sm-6 col-xs-12">
							<div class="single-service">
								<div class="image"><img src="images/service/1.jpg" alt=""></div>
								
								<div class="text">
									<h4><a href="service-details.html">${i.loanTypeId.loanType}</a> <i class="flaticon-pie-chart"></i></h4>
									<p>Loan Rate:-${i.loanRate}</p>
									<p>Loan Description:-${i.loanTypeId.loanTypeDescription}</p>
								</div> <!-- /.text -->
							</div> <!-- /.single-service -->
							
							
						</div> <!-- /.col- -->
						
				</f:forEach>		
						
						<!-- <div class="col-md-4 col-sm-6 col-xs-12">
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
 -->
				<!-- 	<div class="load-more-button text-center"><a href="#" class="theme-button-one">See more services</a></div>
				</div> /.container -->
			</div> <!-- /.our-service -->


			<!--
			=============================================
				Consultation Help
			==============================================
			-->
		<!-- 	<div class="consultation-help clearfix section-margin-bottom">
				<div class="container">
					<div class="theme-title">
						<h2>Request a Free Consultation</h2>
						<p>How workforce development programs turn talent puddles into talent pools , Hiring isn’t easy. Employers <br> might get hundreds </p>
					</div> /.theme-title
				</div> /.container
				<div class="clearfix"> -->
					<!-- <div class="section-part float-left">
						<div class="consultation-form-wrapper float-right col">
							<form action="#">
								<select class="selectpicker" name="category">
									<option value="Investment Plan">Investment Plan</option>
									<option value="Material">Material</option>
									<option value="Electronics ">Electronics </option>
									<option value="Industry">Industry</option>
								</select>
								<input type="text" placeholder="Name">
								<input type="email" placeholder="Email">
								<input type="text" placeholder="Phone">
								<button class="theme-button-one p-bg-color">Submit Request</button>
							</form>
						</div> /.consultation-form-wrapper -->
					</div> <!-- /.section-part -->

					<!-- <div class="section-part float-left text-wrapper">
						<div class="opacity clearfix">
							<div class="col float-left">
								<h3>27 Years of <br>Experience in <span class="p-color">Finance</span> <br>&amp; Business</h3>
								<p>Hiring isn’t easy. Employers might get hundreds — sometimes thousands — of resumes for a single open position and still, somehow, hire the wrong </p>
								<a href="project-v2.html" class="theme-button-one">See Services</a>
							</div> /.col
						</div> /.opacity
					</div> /.section-part
				</div> -->
			</div> <!-- /.consultation-help -->

			

		
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