$(document).ready(function(){
    $('.button-collapse').sideNav();
    $('.parallax').parallax();
    $('.modal').modal({
        dismissible: true, // Modal can be dismissed by clicking outside of the modal
        opacity: .5, // Opacity of modal background
        inDuration: 300, // Transition in duration
        outDuration: 200, // Transition out duration
        startingTop: '24%', // Starting top style attribute
        endingTop: '10%', // Ending top style attribute
        ready: function(modal, trigger) {

        },
        complete: function() {  }
    });
    $('select').material_select();
    $('#horarioatencionabre').pickatime({
        autoclose:false,
        donetext:'Aceptar'
    });
    $('#horarioatencionabreUP').pickatime({
        autoclose:false,
        donetext:'Aceptar'
    });
    $('#horarioatencioncierre').pickatime({
        autoclose:false,
        donetext:'Aceptar'
    });
     $('#horarioatencioncierreUP').pickatime({
        autoclose:false,
        donetext:'Aceptar'
    });
    $('.NavLateral-DropDown').on('click', function(e){
        e.preventDefault();
        var DropMenu=$(this).next('ul');
        var CaretDown=$(this).children('i.NavLateral-CaretDown');
        DropMenu.slideToggle('fast');
        if(CaretDown.hasClass('NavLateral-CaretDownRotate')){
            CaretDown.removeClass('NavLateral-CaretDownRotate');    
        }else{
            CaretDown.addClass('NavLateral-CaretDownRotate');    
        }
         
    });
    $('.tooltipped').tooltip({delay: 50});
    $('.ShowHideMenu').on('click', function(){
        var MobileMenu=$('.NavLateral');
        if(MobileMenu.css('opacity')==="0"){
            MobileMenu.addClass('Show-menu');   
        }else{
            MobileMenu.removeClass('Show-menu'); 
        }   
    }); 
    $('.btn-ExitSystem').on('click', function(e){
        e.preventDefault();
        swal({ 
            title: "Cerrar sesion",   
            text: "Seguro que deseas cerrar sesion?",   
            type: "warning",   
            showCancelButton: true,   
            confirmButtonColor: "#DD6B55",   
            confirmButtonText: "Sí",
            animation: "slide-from-top",   
            closeOnConfirm: false,
            cancelButtonText: "Cancelar",
            showLoaderOnConfirm:true
        }, function(){   
            setTimeout(function(){
                $.ajax({
                  url:"../../inicio/cerrar"  
                }).done(function(rt){
                    if(rt==="sessionClosed"){
                       window.location='/FutPlay/GaiaTemplate/index.html'; 
                    }
                    else{
                       swal("Error","Ocurrio un error al momento de procesar la solicitud!","error");
                    }
                });
            },2000);
        });
    }); 
    $('.btn-Notification').on('click', function(){
        var NotificationArea=$('.NotificationArea');
        if(NotificationArea.hasClass('NotificationArea-show')){
            NotificationArea.removeClass('NotificationArea-show');
        }else{
            NotificationArea.addClass('NotificationArea-show');
        }
    }); 
////////////Validacion y registro de un campo/////////////
    $("#frmRCampo").validate({
        rules:{
            nombrecampo:{
                required: true,
                minlength: 5
            },
            direccioncampo:{
                required:true,
                minlength:5
            },
            horarioatencionabre:{
                required:true
            },
            horarioatencioncierre:{
                required:true
            }
        },
        messages:{
            nombrecampo:{
                required: "Ingresa un nombre para tu campo",
                minlength: "Ingresa 5 caracteres como minimo"
            },
            direccioncampo:{
                required:"Ingresa una direccion para tu campo",
                minlength: "Ingresa 5 caracteres como minimo"
            },
            horarioatencionabre:{
                required: "Ingresa un horario de apertura"
            },
            horarioatencioncierre:{
                required: "Ingresa un horario de cierre"
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
            swal({
                title:"Confimar datos",
                text:"¿Estas seguro de que todos tus datos son correctos?",
                type:"info",
                confirmButtonText:"Sí",
                cancelButtonText:"Cancelar",
                showCancelButton:true,
                closeOnConfirm:false,
                showLoaderOnConfirm:true
            },function(){
               setTimeout(function(){
                    var nombrecampo = $("#nombrecampo").val();
                    var direccioncampo = $("#direccioncampo").val();
                    var horarioapertura = $("#horarioatencionabre").val();
                    var horariocierre = $("#horarioatencioncierre").val();
                    var fotocampo = $("#fotocampo").val();
                    function getUbicacion(ubicacionGmap){
                        var geocoder = new google.maps.Geocoder();
                        geocoder.geocode({ 'address': direccioncampo}, function (results, status) {
                            if (status === google.maps.GeocoderStatus.OK) {
                                var ubicacionLatLng = results[0].geometry.location.lat()+"/"+results[0].geometry.location.lng();
                                ubicacionGmap(ubicacionLatLng);
                            }
                            else {
                                alert("Ubicacion no encontrada razon: " + status);
                            }
                        });
                    }
                    getUbicacion(function(ubi){
                        
                        var data = new FormData();
                        $.each($('#fotocampoupload')[0].files, function(i, file) {
                             data.append('file-'+i, file);
                        });
                        $.ajax({
                            url: '/FutPlay/uploadfiles',
                            data: data,
                            dataType: 'text',
                            processData: false,
                            contentType: false,
                            type: 'POST'
                        });
                        
                        $.ajax({
                            url:"../../campos/registrarcampo",
                            type:"post",
                            data:{nombrecampo:nombrecampo,direccioncampo:direccioncampo,ubicacion:ubi,horarioapertura:horarioapertura,horariocierre:horariocierre,fotocampo:fotocampo},
                            cache:false
                        }).done(function(rt){          
                            if(rt!=="0"){
                                swal({
                                    title:"Exito",
                                    text:"Campo registrado exitosamente!",
                                    type:"success",
                                    closeOnConfirm:true,
                                    showCancelButton:true
                                },function(){
                                    window.location="/FutPlay/PAGES/Campo/AdministrarCampo.jsp";
                                });
                                $("#nombrecampo").val("");
                                $("#direccioncampo").val("");
                                $("#horarioatencionabre").val("");
                                $("#horarioatencioncierre").val("");
                            }
                            else{
                                swal("Error!","Ocurrio un error al momento de procesar la solicitud","error");
                            }
                        });
                    });
                },2000);
            });
        }                  
    });
/////////////Peticion de ajax para eliminar un campo////////////////////
    $('.eliminarCampo').on('click',function(e){
       e.preventDefault();
       var idcampo = $(this).attr("value");
       swal({ 
            title: "Advertencia",   
            text: "Si eliminas este campo las canchas que poseas en este serán eliminadas de la misma forma!",   
            type: "warning",   
            showCancelButton: true,   
            confirmButtonColor: "#DD6B55",   
            confirmButtonText: "Sí",
            animation: "slide-from-top",   
            closeOnConfirm: false,
            cancelButtonText: "Cancelar",
            showLoaderOnConfirm:true
        }, function(){   
            setTimeout(function(){
                $.ajax({
                    url:"../../campos/eliminar",
                    method:"post",
                    data:{idcampo:idcampo}
                }).done(function(rt){
                    if(rt!=="0"){
                        swal({
                            title:"Exito",
                            text:"Campo elimiado exitosamente",
                            type:"success"
                        },function(){
                           window.location="/FutPlay/PAGES/Campo/AdministrarCampo.jsp"; 
                        });
                    }
                    else{
                        swal("Error","Ocurrio un error al momento de procesar la solicitud","error");
                    }
                });
            },2000);
        });
    });
////////////////////Mapa del campo///////////////////////
    $(".btnMapCampo").on("click", function(){
        var coordenadas = $(this).val().split("/");
        $(".btnMapCampo").each(function(){
            $("#mapModal").modal("open");
            $('#map-canvas').addClass('loading');    
              var latlng = new google.maps.LatLng(coordenadas[0] ,coordenadas[1]); 
              var settings = {
                  zoom: 16,
                  center: latlng,
                  mapTypeId: google.maps.MapTypeId.ROADMAP,
                  mapTypeControl: false,
                  scrollwheel: false,
                  draggable: true,
                  styles: [{"featureType":"landscape.natural","elementType":"geometry.fill","stylers":[{"visibility":"on"},{"color":"#e0efef"}]},{"featureType":"poi","elementType":"geometry.fill","stylers":[{"visibility":"on"},{"hue":"#1900ff"},{"color":"#c0e8e8"}]},{"featureType":"road","elementType":"geometry","stylers":[{"lightness":100},{"visibility":"simplified"}]},{"featureType":"road","elementType":"labels","stylers":[{"visibility":"off"}]},{"featureType":"transit.line","elementType":"geometry","stylers":[{"visibility":"on"},{"lightness":700}]},{"featureType":"water","elementType":"all","stylers":[{"color":"#7dcdcd"}]}],
                  mapTypeControlOptions: {style: google.maps.MapTypeControlStyle.DROPDOWN_MENU},
                  navigationControl: false,
                  navigationControlOptions: {style: google.maps.NavigationControlStyle.SMALL},           
              };
              var map = new google.maps.Map(document.getElementById("map-canvas"), settings);

              google.maps.event.addDomListener(window, "resize", function() {
                  var center = map.getCenter();
                  google.maps.event.trigger(map, "resize");
                  map.setCenter(center);
                  $('#map-canvas').removeClass('loading');
              });


              var campoImage = new google.maps.MarkerImage('/FutPlay/MaterialDark/assets/img/map-marker.png',
                  new google.maps.Size(36,62),
                  new google.maps.Point(0,0),
                  new google.maps.Point(18,52)
              );

              var campoPos = new google.maps.LatLng(coordenadas[0],coordenadas[1]);

              var campoMarker = new google.maps.Marker({
                  position: campoPos,
                  map: map,
                  icon: campoImage,
                  title:"Shapeshift Interactive",
                  zIndex: 3
              });
        });
    });
///////////////////Peticion de ajax para cargar datos de un campo//////////////////////////
    $('.actualizarCampo').on('click',function(e){
       e.preventDefault();
       var idcampo = $(this).attr("value");
       $.ajax({
          url:"../../campos/getJSONCampo",
          method:"post",
          data:{idcampo:idcampo}
       }).done(function(data){
          localStorage.setItem('JSONCampo', JSON.stringify(data));
          location.href = "/FutPlay/PAGES/Campo/ActualizarCampo.jsp"; 
       });
    });
    var data = localStorage.getItem('JSONCampo');
    var dt = JSON.parse(data);
    var horariossplit = dt[2];
    var horarios = horariossplit.split("/");
    if (data !== undefined) {
        $("#nombrecampoUP").val(dt[0]);
        $("#direccioncampoUP").val(dt[1]);
        $("#horarioatencionabreUP").val(horarios[0]);
        $("#horarioatencioncierreUP").val(horarios[1]);
        $("#fotocampoUP").val(dt[3]);
    }
///////////////////Peticion de ajax para actualizar un campo////////////////////////////
    $("#frmRCampoUP").validate({
       rules:{
            nombrecampoUP:{
                required: true,
                minlength: 5
            },
            direccioncampoUP:{
                required:true,
                minlength:5
            },
            horarioatencionabreUP:{
                required:true
            },
            horarioatencioncierreUP:{
                required:true
            }
        },
        messages:{
            nombrecampoUP:{
                required: "Ingresa un nombre para tu campo",
                minlength: "Ingresa 5 caracteres como minimo"
            },
            direccioncampoUP:{
                required:"Ingresa una direccion para tu campo",
                minlength: "Ingresa 5 caracteres como minimo"
            },
            horarioatencionabreUP:{
                required: "Ingresa un horario de apertura"
            },
            horarioatencioncierreUP:{
                required: "Ingresa un horario de cierre"
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
        submitHandler:function(){
            swal({
                title:"Confirmar datos",
                text:"¿Estas seguro de que todos tus datos son correctos?",
                showLoaderOnConfirm:true,
                confirmButtonText:"Aceptar",
                cancelButtonText:"Cancelar",
                type:"info",
                showCancelButton:true,
                closeOnConfirm:false
            },function(){
              setTimeout(function(){
                 var nombrecampoUP = $("#nombrecampoUP").val();
                 var direccioncampoUP = $("#direccioncampoUP").val();
                 var horarioatencionabreUP = $("#horarioatencionabreUP").val();
                 var horarioatencioncierreUP = $("#horarioatencioncierreUP").val();
                 var fotocampoUP = $("#fotocampoUP").val();
                 function getUbicacion(ubicacionGmap){
                     var geocoder = new google.maps.Geocoder();
                     geocoder.geocode({ 'address': direccioncampoUP}, function (results, status) {
                         if (status === google.maps.GeocoderStatus.OK) {
                             var ubicacionLatLng = results[0].geometry.location.lat()+"/"+results[0].geometry.location.lng();
                             ubicacionGmap(ubicacionLatLng);
                         }
                         else {
                             alert("Ubicacion no encontrada razon: " + status);
                         }
                     });
                 }
                 getUbicacion(function(ubi){
                     var data = new FormData();
                     $.each($('#fotocampouploadUP')[0].files, function(i, file) {
                          data.append('file-'+i, file);
                     });
                     $.ajax({
                         url: '/FutPlay/uploadfiles',
                         data: data,
                         dataType: 'text',
                         processData: false,
                         contentType: false,
                         type: 'POST'
                     });

                     $.ajax({
                         url:"../../campos/actualizarcampo",
                         method:"post",
                         data:{nombrecampoUP:nombrecampoUP,direccioncampoUP:direccioncampoUP,ubicacionUP:ubi,horarioatencionabreUP:horarioatencionabreUP,horarioatencioncierreUP:horarioatencioncierreUP,fotocampoUP:fotocampoUP}
                     }).done(function(rt){
                          if(rt!=="0"){
                              swal({
                                  title:"Exito",
                                  text:"Campo actualizado exitosamente",
                                  type:"success"
                              },function(){
                                  location.href = "/FutPlay/PAGES/Campo/AdministrarCampo.jsp";                  
                              });
                          }
                          else{
                              swal("Error","Ocurrio un error al momento de procesar la solicitud","error");
                          }
                     });
                 });  
              },2000);
            });
        }    
    });
//////////////////////Peticion de ajax para registrar una cancha////////////////////////
    $(".añadirCancha").on("click",function(e){
        e.preventDefault();
        
    });
/////////////////////////////////Peticion de ajax para eliminar una cancha///////////////////////////////
    $(".btnEliminarCancha").on("click",function(e){
        var idcancha = $(this).attr("value");
        var btn = $(this);
        e.preventDefault();
        swal({
           title:"Advertencia",
           text:"¿Deseas eliminar la siguiente cancha?",
           type:"warning",
           showCancelButton:true,
           cancelButtonText:"Cancelar",
           confirmButtonText:"Sí",
           confirmButtonColor:"#DD6B55",
           showLoaderOnConfirm:true,
           closeOnConfirm:false
        },function(){
            setTimeout(function(){
                $.ajax({
                    url:"../../canchas/eliminarCancha",
                    method:"post",
                    data:{idcancha:idcancha}
                }).done(function(rt){
                    if(rt!=="0"){
                        swal("Exito","Cancha eliminada exitosamente","success");
                        btn.parent().parent().remove();
                    }
                    else{
                        swal("Error","Ocurrio un error al momento de procesar la solicitud","error");
                    }
                });
            },2000);
        });
    });
///////////////////////////////////Peticion de ajax para cargar datos de la cancha//////////////////////////
    $(".btnActualizarCancha").on("click",function(e){
        e.preventDefault();
        
    });
////////////////////////////////////Peticion de ajax para actualizar una cancha/////////////////////////////
    $("#frmCanchaUP").on("submit",function(e){
        e.preventDefault();
    });
});
//////////////////////////////////Chequeo de campos registrados fancy button////////////////////////////////
    $("#btnVerCampos").on("click",function(e){
       e.preventDefault();
       $.ajax({
           url:"/FutPlay/campos/checkCampos"
       }).done(function(data){
           if(data>"0"){
               window.location = "/FutPlay/PAGES/Campo/AdministrarCampo.jsp";
           }
           else{
               swal({
                  title:"Información",
                  text:"No tienes campos registrados",
                  type:"info"
               });
           }
       });
    });
//////////////////////////////////////Chequeo de canchas registradas fancy button/////////////////////////////
    $(".btnCheckCanchas").on("click",function(){
        var idcampo = $(this).attr("value");
        $.ajax({
            url:"/FutPlay/canchas/checkCanchas",
            type:"post",
            data:{idcampo:idcampo}
        }).done(function(rt){
            if(rt>"0"){ 
                
            }else{  
                swal("Informacion","No tienes canchas registradas en este campo","info");                             
            }           
        });
    });
(function($){
    $(window).load(function(){
        $(".container").mCustomScrollbar({
            theme:"dark-thin",
            scrollbarPosition: "inside",
            autoHideScrollbar: true,
            scrollButtons:{ enable: true }
        });
    });
})(jQuery);
