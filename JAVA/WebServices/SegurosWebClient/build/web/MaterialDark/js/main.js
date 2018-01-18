$(document).ready(function () {
    $('select').material_select();
    $('.carousel.carousel-slider').carousel({fullWidth: true});
    $('.carousel').carousel();
    $('ul.tabs').tabs();
    $('.datepicker').pickadate({

        selectMonths: true, // Creates a dropdown to control month
        selectYears: 15 // Creates a dropdown of 15 years to control year

    });
    $('.modal').modal({
        dismissble: true,
        opacity: .5,
        inDuration: 300,
        outDuration: 200,
        startingTop: '24%',
        endingTop: '10%',
        ready: function (modal, trigger) {

        },
        complete: function () {


        }

    });
    // the "href" attribute of .modal-trigger must specify the modal ID that wants to be triggered
    //$('.modal-trigger').leanModal();
//            
    $('.timepicker').pickatime({
        default: 'now', // Set default time
        fromnow: 0, // set default time to * milliseconds from now (using with default = 'now')
        twelvehour: false, // Use AM/PM or 24-hour format
        donetext: 'OK', // text for done-button
        cleartext: 'Clear', // text for clear-button
        canceltext: 'Cancel', // Text for cancel-button
        autoclose: false, // automatic close timepicker
        ampmclickable: true, // make AM PM clickable
        aftershow: function () {} //Function for after opening timepicker 
    });
    $('.NavLateral-DropDown').on('click', function (e) {
        e.preventDefault();
        var DropMenu = $(this).next('ul');
        var CaretDown = $(this).children('i.NavLateral-CaretDown');
        DropMenu.slideToggle('fast');
        if (CaretDown.hasClass('NavLateral-CaretDownRotate')) {
            CaretDown.removeClass('NavLateral-CaretDownRotate');
        } else {
            CaretDown.addClass('NavLateral-CaretDownRotate');
        }

    });
    $('.tooltipped').tooltip({delay: 50});
    $('.ShowHideMenu').on('click', function () {
        var MobileMenu = $('.NavLateral');
        if (MobileMenu.css('opacity') === "0") {
            MobileMenu.addClass('Show-menu');
        } else {
            MobileMenu.removeClass('Show-menu');
        }
    });
    $('.btn-ExitSystem').on('click', function (e) {
        e.preventDefault();
        swal({
            title: "Cerrar Sesion",
            text: "¿Estas seguro que deseas cerrar sesion?",
            type: "warning",
            showCancelButton: true,
            confirmButtonColor: "#DD6B55",
            confirmButtonText: "Si",
            animation: "slide-from-top",
            closeOnConfirm: false,
            cancelButtonText: "Cancelar"
        }, function () {
            
            $.post("/SegurosWebClient/funcionario/cerrarsesion",function (responseText){
               
                window.location = "/SegurosWebClient/PAGES/Funcionario/Login.jsp";
                
            });

        });
    });
    $('.btn-Search').on('click', function (e) {
        e.preventDefault();
        swal({
            title: "What are you looking for?",
            text: "Write what you want",
            type: "input",
            showCancelButton: true,
            closeOnConfirm: false,
            animation: "slide-from-top",
            inputPlaceholder: "Write here",
            confirmButtonText: "Search",
            cancelButtonText: "Cancel"
        }, function (inputValue) {
            if (inputValue === false)
                return false;
            if (inputValue === "") {
                swal.showInputError("You must write something");
                return false
            }
            swal("Nice!", "You wrote: " + inputValue, "success");
        });
    });
    $('.btn-Notification').on('click', function () {
        var NotificationArea = $('.NotificationArea');
        if (NotificationArea.hasClass('NotificationArea-show')) {
            NotificationArea.removeClass('NotificationArea-show');
        } else {
            NotificationArea.addClass('NotificationArea-show');
        }
    });



});
$("#btnRegistrar").click(function (e) {
    e.preventDefault();
    swal("¡Bienvenido!", "Ahora haces parte del mundo FutPlay", "success");

});
$("#frmLogin").validate({
    rules: {
        Usuario: {
            required: true,
            minlength: 3
        },
        Contrasenia: {
            required: true,
            minlength: 3
        }
    },
    messages: {
        Usuario: {
            required: "Ingresa tu usuario",
            minlength: "Usuario no valido"
        },
        Contrasenia: {
            required: "Ingressa tu contraseña",
            minlength: "Contraseña no valida"
        }
    },
    errorElement: 'div',
    errorPlacement: function (error, element) {
        var placement = $(element).data('error');
        if (placement) {
            $(placement).append(error);
        } else {
            error.insertAfter(element);
        }
    },
    submitHandler: function () {
        
        var usuario = $("#Usuario").val();
        var contrasenia = $("#Contrasenia").val();
        
        $.post("/SegurosWebClient/funcionario/iniciarsesion",{Usuario:usuario,Contrasenia:contrasenia},function (responseText) {
           
            if (responseText == "1") {
                window.location = "/SegurosWebClient/PAGES/Funcionario/IndexFuncionario.jsp";
            }else{
                
                swal("¡Error!", "Usuario o contraseña incorrectos", "error");
            }
            
        });
    }
});
$(".verCliente").click(function (){
    
    $.post("/SegurosWebClient/cliente/vercliente",{idAfiliado:$(this).val()},function (responseText) {
       
        if (responseText == "1") {
            window.location = "/SegurosWebClient/PAGES/Afiliado/VerAfiliado.jsp";
        }
        
    });
    
});
$(".verSiniestro").click(function (){
    
    $.post("/SegurosWebClient/cliente/vercliente",{idAfiliado:$(this).val()},function (responseText) {
       
        if (responseText == "1") {
            window.location = "/SegurosWebClient/PAGES/Siniestro/VerSiniestro.jsp";
        }
        
    });
    
});
////////////////////////////////////////// TABS //////////////////////////
$("#registrarUsuario").click(function () {

    var x = $("#lol2").css({class: "Active"});
    alert("click " + x.toString());
});