jQuery(document).ready(function($){
	var formModal = $('.cd-user-modal'),
		formLogin = formModal.find('#cd-login'),
		formSignup = formModal.find('#cd-signup'),
		formForgotPassword = formModal.find('#cd-reset-password'),
		formModalTab = $('.cd-switcher'),
		tabLogin = formModalTab.children('li').eq(0).children('a'),
		tabSignup = formModalTab.children('li').eq(1).children('a'),
		forgotPasswordLink = formLogin.find('.cd-form-bottom-message a'),
		backToLoginLink = formForgotPassword.find('.cd-form-bottom-message a'),
		mainNav = $('.main-nav');

	//open modal
	mainNav.on('click', function(event){
		$(event.target).is(mainNav) && mainNav.children('ul').toggleClass('is-visible');
	});    

	//open login-form form
	mainNav.on('click', '.cd-signin', login_selected);

	//close modal
	formModal.on('click', function(event){
		if( $(event.target).is(formModal) || $(event.target).is('.cd-close-form') ) {
			formModal.removeClass('is-visible');
		}	
	});
	//close modal when clicking the esc keyboard button
	$(document).keyup(function(event){
            if(event.which=='27'){
    		formModal.removeClass('is-visible');
	    }
        });

	

	function login_selected(){
		mainNav.children('ul').removeClass('is-visible');
		formModal.addClass('is-visible');
		formLogin.addClass('is-selected');
		formSignup.removeClass('is-selected');
		formForgotPassword.removeClass('is-selected');
		tabLogin.addClass('selected');
		tabSignup.removeClass('selected');
	}

        $("#cd-form").validate({
            rules:{
                signin_email:{
                    required: true,
                    minlength: 5
                },
                signin_password:{
                    required:true,
                    minlength:8
                }
            },
            messages:{
                signin_email:{
                    required: "Ingresa tu correo electronico o nombre de usuario",
                    minlength: "Ingresa 5 caracteres como minimo"
                },
                signin_password:{
                    required:"Ingresa tu contraseña",
                    minlength: "Ingresa 8 caracteres como minimo"
                }
            },
            errorElement : 'div',
            errorPlacement: function(error, element) {
              var placement = $(element).data('error');
              if (placement) {
                $(placement).append(error);
              } else {
                error.insertAfter(element);
              }
            },
            submitHandler: function(){
                var email = $("#signin_email").val();
                var pass = $("#signin_password").val();
                $.ajax({
                   url:"/FutPlay/inicio/iniciar",
                   type:"post",
                   data:{email:email,pass:pass}
                }).done(function(rt){
                    if(rt==="indexPropietario"){
                        window.location = "/FutPlay/PAGES/Propietario/indexPropietario.jsp";
                    }
                    else if(rt==="indexJugador"){
                        window.location = "/FutPlay/index.jsp"; 
                    }
                    else if(rt==="0"){
                        swal("Advertencia","Usuario o contraseña incorrectos","warning");
                    }
                    else{
                        swal("Error","Ocurrio un error al momento de procesar la solicitud!","error");
                    }
                });
            }
        });

});