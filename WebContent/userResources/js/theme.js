// js Document

  // Project:        inobiz -  Business & Agency Template.
  // Version:        1.0
  // Last change:    23/02/2018.
  // Designed:       Template_mr
  // Developed:      Template_mr


(function($) {
    "use strict";
    
    
    $(document).on ('ready', function (){
        
        // -------------------- Navigation Scroll
        $(window).scroll(function() {    
          var sticky = $('.theme-menu-wrapper'),
          scroll = $(window).scrollTop();
          if (scroll >= 190) sticky.addClass('fixed');
          else sticky.removeClass('fixed');

        });


        // ------------------------------- WOW Animation 
        var wow = new WOW({
            boxClass:     'wow',      // animated element css class (default is wow)
            animateClass: 'animated', // animation css class (default is animated)
            offset:       80,          // distance to the element when triggering the animation (default is 0)
            mobile:       true,       // trigger animations on mobile devices (default is true)
            live:         true,       // act on asynchronously loaded content (default is true)
          });
          wow.init();


        
        // -------------------- Remove Placeholder When Focus Or Click
        $("input,textarea").each( function(){
            $(this).data('holder',$(this).attr('placeholder'));
            $(this).on('focusin', function() {
                $(this).attr('placeholder','');
            });
            $(this).on('focusout', function() {
                $(this).attr('placeholder',$(this).data('holder'));
            });     
        });
        
        // -------------------- From Bottom to Top Button
            //Check to see if the window is top if not then display button
        $(window).on('scroll', function (){
          if ($(this).scrollTop() > 200) {
            $('.scroll-top').fadeIn();
          } else {
            $('.scroll-top').fadeOut();
          }
        });
            //Click event to scroll to top
        $('.scroll-top').on('click', function() {
          $('html, body').animate({scrollTop : 0},1500);
          return false;
        });



        // --------------------------- Theme Main Banner Slider One
        var banner = $("#theme-main-banner");
        if (banner.length) {
          banner.camera({ //here I declared some settings, the height and the presence of the thumbnails 
            height: '680px',
            pagination: false,
            navigation: false,
            thumbnails: false,
            playPause: false,
            pauseOnClick: false,
            autoPlay:true,
            hover: false,
            overlayer: true,
            loader: 'none',
            minHeight: '400px',
            time: 4000,
          });
        };



        // ------------------------------- Testimonial Slider
        var tSlider = $ (".client-slider");
        if(tSlider.length) {
            tSlider.owlCarousel({
              loop:true,
              nav:false,
              dots:false,
              autoplay:true,
              autoplayTimeout:4000,
              autoplayHoverPause:true,
              smartSpeed:1200,
              lazyLoad:true,
              items:1
          })
        }


        // ------------------------------- Testimonial Slider Two
        var tSlider = $ (".sidebar-partner-slider");
        if(tSlider.length) {
            tSlider.owlCarousel({
              loop:true,
              nav:false,
              dots:false,
              autoplay:true,
              autoplayTimeout:4000,
              autoplayHoverPause:true,
              smartSpeed:1200,
              lazyLoad:true,
              items:1,
          })
        }


        // -------------------------------  Related Project Slider
        var pSlider = $ (".related-product-slider");
          if(pSlider.length) {
              pSlider.owlCarousel({
                loop:true,
                nav:false,
                dots:false,
                autoplay:true,
                autoplayTimeout:4000,
                autoplaySpeed:1000,
                lazyLoad:true,
                smartSpeed:1000,
                responsive:{
                    0:{
                        items:1
                    },
                    550:{
                        items:2
                    },
                    1200:{
                        items:3
                    }
                }
            })
          }



          // --------------------------------- Contact Form Validation
          if($('.form-validation').length){
            $('.form-validation').validate({ // initialize the plugin
              rules: {
                name: {
                  required: true
                },
                email: {
                  required: true,
                  email: true
                },
                sub: {
                  required: true
                },
                message: {
                  required: true
                }
              },
            submitHandler: function(form) {
              $(form).ajaxSubmit({
                success: function() {
                  $('.form-validation :input').attr('disabled', 'disabled');
                  $('.form-validation').fadeTo( "slow", 1, function() {
                      $(this).find(':input').attr('disabled', 'disabled');
                      $(this).find('label').css('cursor','default');
                      $('#alert-success').fadeIn();
                    });
                  },
                  error: function() {
                    $('.form-validation').fadeTo( "slow", 1, function() {
                      $('#alert-error').fadeIn();
                    });
                  }
                });
              }
            });
          }


          // ---------------------------------- Validation Alert
          var closeButton = $ (".closeAlert");
            if(closeButton.length) {
                closeButton.on('click', function(){
                  $(".alert-wrapper").fadeOut();
                });
                closeButton.on('click', function(){
                  $(".alert-wrapper").fadeOut();
                })
            }


          // -------------------------------- Accordion Panel
          if ($('.theme-accordion > .panel').length) {
            $('.theme-accordion > .panel').on('show.bs.collapse', function (e) {
                  var heading = $(this).find('.panel-heading');
                  heading.addClass("active-panel");
                  
            });
            $('.theme-accordion > .panel').on('hidden.bs.collapse', function (e) {
                var heading = $(this).find('.panel-heading');
                  heading.removeClass("active-panel");
                  //setProgressBar(heading.get(0).id);
            });
            $('.panel-heading a').on('click',function(e){
                if($(this).parents('.panel').children('.panel-collapse').hasClass('in')){
                    e.stopPropagation();
                }
            });
          };


          // ----------------------------- Shop Page Quantity Function
          var inputVal = $("#product-value");
          if(inputVal.length) {
            $("#value-decrease").on ('click', function (){
                var v= inputVal.val()-1;
                if(v>=inputVal.attr('min'))
                inputVal.val(v)
              });

            $("#value-increase").on ('click', function (){
              var v= inputVal.val()*1+1;
              if(v<=inputVal.attr('max'))
              inputVal.val(v)
            });
          }
        

        
    });
    
    $(window).on ('load', function (){ // makes sure the whole site is loaded

        // -------------------- Site Preloader
        $('#loader').fadeOut(); // will first fade out the loading animation
        $('#loader-wrapper').delay(350).fadeOut('slow'); // will fade out the white DIV that covers the website.
        $('body').delay(350).css({'overflow':'visible'});
    })
    
})(jQuery)