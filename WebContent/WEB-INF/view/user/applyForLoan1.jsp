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

<title>inobiz - Business & Agency Template</title>

<!-- Favicon -->
<link rel="icon" type="image/png" sizes="56x56"
	href="images/fav-icon/icon.png">


<!-- Main style sheet -->
<link rel="stylesheet" type="text/css"
	href="userResources/css/style.css">
<!-- responsive style sheet -->
<link rel="stylesheet" type="text/css"
	href="userResources/css/responsive.css">


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
					<h2>Apply for loan</h2>
					<ul>
						<li><a href="index.html">Home</a></li>
						<li>.</li>
						<li><a href="#">Loan</a></li>
						<li>.</li>
						<li>Apply for loan</li>
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
		<div class="our-blog section-margin-bottom blog-details">
			<div class="container">
				<!-- 				<form>
					<div class="row">
						<div class="col-md-6">
							<input type="text" class="form-control" placeholder="First name">
						</div>
						<div class="col-md-6">
							<input type="text" class="form-control" placeholder="Last name">
						</div>
					</div>
				</form>
 -->
				<div class="row">
					<div class="col-lg-12 col-md-8 col-xs-12">
						<div class="blog-post-data">
							<div class="image">
								<img src="images/blog/10.jpg" alt="">
							</div>

							<div class="reply-comment-section">
								<h4 class="title-inner" align="center">Add your Loan</h4>
								<%@taglib prefix="f"
									uri="http://www.springframework.org/tags/form"%>
								<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
								<f:form action="insertAddLoan.html" method="post" modelAttribute="applyLoan" enctype="multipart/form-data">
									<div class="row">
										<div class="col-md-6">
											<f:select path="loanTypeVO.id"
												class="col-lg-12 col-md-8 col-xs-12 "
												style="width: 100%;  height: 60px;  background: #f7f4f4;border:none;padding: 0 15px;margin-bottom: 30px;">
												<c:forEach items="${loanTypeList}" var="i">
													<option value="${i.id}">${i.loanType}</option>
												</c:forEach>

											</f:select>
										</div>

										<div class="col-md-6">
											<f:select path="loanRateVO.id"
												class="col-lg-12 col-md-8 col-xs-12 "
												style="width: 100%;  height: 60px;  background: #f7f4f4;border:none;padding: 0 15px;margin-bottom: 30px;">
												<c:forEach items="${loanRateList}" var="i">
													<option value="${i.id}">${i.loanRate}</option>
												</c:forEach>

											</f:select>

										</div>

										<div class="col-md-6">
											<input type="text" placeholder="loan Amount"
												name="loanAmount">
										</div>

										<div class="col-md-6">
											<input type="text" placeholder="Loan Description"
												name="loanDescription">
										</div>

										<div class="col-md-6">
											<label>Photo:-</label><input type="file" name="photofile">
										</div>

										<!-- <div class="col-md-6">
											<label>Adhar Card:-</label><input type="file"
												name="adharCard">
										</div> -->

										<div class="col-md-6">
											<label>Pan Card:-</label><input type="file" name="panCard">
										</div>

										<div class="col-md-6">
											<label>Residential Proof:-</label><input type="file"
												name="file">
										</div>


									</div>
									<!-- /.row -->
									<button class="theme-button-one p-bg-color">Submit</button>
								</f:form>
							</div>
							<!-- /.reply-comment-section -->
						</div>
						<!-- /.blog-post-data -->
					</div>
					<!-- /.col- -->
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
