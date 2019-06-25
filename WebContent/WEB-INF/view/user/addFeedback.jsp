<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">

.rating {
    float:left;
}

/* :not(:checked) is a filter, so that browsers that don’t support :checked don’t 
   follow these rules. Every browser that supports :checked also supports :not(), so
   it doesn’t make the test unnecessarily selective */
.rating:not(:checked) > input {
    position:absolute;
    top:-9999px;
    clip:rect(0,0,0,0);
}

.rating:not(:checked) > label {
    float:right;
    width:1em;
    padding:0 .1em;
    overflow:hidden;
    white-space:nowrap;
    cursor:pointer;
    font-size:200%;
    line-height:1.2;
    color:#ddd;
    text-shadow:1px 1px #bbb, 2px 2px #666, .1em .1em .2em rgba(0,0,0,.5);
}

.rating:not(:checked) > label:before {
    content: ' ';
}

.rating > input:checked ~ label {
    color: #f70;
    text-shadow:1px 1px #c60, 2px 2px #940, .1em .1em .2em rgba(0,0,0,.5);
}

.rating:not(:checked) > label:hover,
.rating:not(:checked) > label:hover ~ label {
    color: gold;
    text-shadow:1px 1px goldenrod, 2px 2px #B57340, .1em .1em .2em rgba(0,0,0,.5);
}

.rating > input:checked + label:hover,
.rating > input:checked + label:hover ~ label,
.rating > input:checked ~ label:hover,
.rating > input:checked ~ label:hover ~ label,
.rating > label:hover ~ input:checked ~ label {
    color: #ea0;
    text-shadow:1px 1px goldenrod, 2px 2px #B57340, .1em .1em .2em rgba(0,0,0,.5);
}

.rating > label:active {
    position:relative;
    top:2px;
    left:2px;
}

</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<meta charset="UTF-8">
		<!-- For IE -->
		<meta http-equiv="X-UA-Compatible" content="IE=edge">

		<!-- For Resposive Device -->
		<meta name="viewport" content="width=device-width, initial-scale=1.0">

		<title>inobiz -  Business & Agency Template</title>

		<!-- Favicon -->
		<link rel="icon" type="image/png" sizes="56x56" href="images/fav-icon/icon.png">


		<!-- Main style sheet -->
		<link rel="stylesheet" type="text/css" href="userResources/css/style.css">
		<!-- responsive style sheet -->
		<link rel="stylesheet" type="text/css" href="userResources/css/responsive.css">

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
					<!-- 	<p>Inpire Your Business, Our talent team member of business agency </p> -->
						<h2>Feedback</h2>
						<ul>
							<li><a href="index.html">Home</a></li>
							<li>.</li>
							<li><a href="#">Feedback</a></li>
							<li>.</li>
							<li>Post Feedback</li>
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
						<div class="col-lg-9 col-md-8 col-xs-12">
							<div class="blog-post-data">
								<div class="image"><img src="images/blog/10.jpg" alt=""></div>
								
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
								<div class="reply-comment-section">
									<h4 class="title-inner">Add your Feedback</h4>
									<f:form action="insertFeedback.html" method="GET" modelAttribute="feedbackVO" >
										<div class="row">
											<div class="col-sm-12 col-xs-12 float-left">
											<f:textarea placeholder="Feedback Description" path="feedbackDescription"/>
										
											<div class="form-group "> 
		<div class="rating">
    <h4> <span class="flaticon-house-key"></span>Rating</h4><br/>
     <input type="radio" id="star5" name="rating" value="5" /><label for="star5" title="Rocks!"><span class="fa fa-star checked"></span></label>
    <input type="radio" id="star4" name="rating" value="4" /><label for="star4" title="Pretty good"><span class="fa fa-star checked"></span></label>
    <input type="radio" id="star3" name="rating" value="3" /><label for="star3" title="Meh"><span class="fa fa-star checked"></span></label>
    <input type="radio" id="star2" name="rating" value="2" /><label for="star2" title="Kinda bad"><span class="fa fa-star checked"></span></label>
    <input type="radio" id="star1" name="rating" value="1" /><label for="star1" title="Sucks big time"><span class="fa fa-star checked"></span></label>
</div>
</div>
											</div>
											</div>
											
									
											<div class="rating ml-auto d-flex align-items-center">
                        
											
										</div> <!-- /.row -->
										<br>
										<br>
										<br>
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