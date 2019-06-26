<%@page import="com.util.BaseMethods"%>
<nav class="navbar col-lg-12 col-12 p-0 fixed-top d-flex flex-row">
      <div class="text-center navbar-brand-wrapper d-flex align-items-top justify-content-center">
        <a class="navbar-brand brand-logo" href="index.html"><img src="adminResources/images/AI.png" style="height:60px;"		 alt="logo"/></a>
        <a class="navbar-brand brand-logo-mini" href="index.html"><img src="adminResources/images/AI_mini.png" style="width:30px" alt="logo"/></a>
      </div>
      <div class="navbar-menu-wrapper d-flex align-items-center">
        
        <button class="navbar-toggler navbar-toggler align-self-center" type="button" data-toggle="minimize">
          <span class="icon-menu"></span>
        </button>
        
        <ul class="navbar-nav navbar-nav-right">
          
          <li class="nav-item dropdown d-none d-lg-flex">
            <a class="nav-link dropdown-toggle" id="languageDropdown" href="#" data-toggle="dropdown">
              <i class="icon-user"></i>
              <%= BaseMethods.getUser()%>
            </a>
            
            <div class="dropdown-menu navbar-dropdown" aria-labelledby="languageDropdown">
              
              
              <div class="dropdown-divider"></div>
              <a class="dropdown-item font-weight-medium" href="j_spring_security_logout">
                <i class="icon-logout"></i>
                logout
              </a>
            
            </div>
          </li>
          
          
          
        </ul>
        <button class="navbar-toggler navbar-toggler-right d-lg-none align-self-center" type="button" data-toggle="offcanvas">
          <span class="icon-menu"></span>
        </button>
      </div>
    </nav>