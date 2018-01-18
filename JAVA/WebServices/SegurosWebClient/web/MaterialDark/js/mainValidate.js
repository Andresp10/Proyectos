///////////////////////////////// VALIDAR LOGIN //////////////////////////////
$("#frmLogin").validate({
   rules:{
       txtUsuario:{
           required:true
       },
       txtContrasenia:{
           required:true,
           minlength:8
       }
   },
   messages:{
        txtUsuario:{
            required: "Ingresa tu correo E-mail",
            email:"Por favor ingresa un  correo valido"
        },
        txtContrasenia:{
            required: "Ingresa tu contraseña",
            minlength: "Como minimo 8 catacteres"
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
    }
});
//////////////////////////////////// VALIDAR REGISTRO USUARIO /////////////////////////
$("#frmRegistroUsuario").validate({
   rules:{
       txtNombreUsuario:{
           required:true,
           minlength:5
       },
       txtApellidoUsuario:{
           required:true,
           minlength:5
       },
       txtFechaNacimientoUsuario:{
           required:false
       },
       txtTelefonoUsuario:{
           required:false
           
       },
       txtCorreoUsuario:{
           required:true,
           minlength:5
       },
       txtContraseniaUsuario:{
           required:true,
           minlength:8,
           maxlength:20
       },
       txtConfirmarContraseniaUsuario:{
           required:true,
           equalTo: "#txtContraseniaUsuario"
       }
   },
   messages:{
       txtNombreUsuario:{
           required:"Ingresa un usuario",
           minlength:"Minimo 5 caracteres"
       },
       txtApellidoUsuario:{
           required:"Ingresa un apellido",
           minlength:"Minimo 5 caracteres"
       },
       txtFechaNacimientoUsuario:{
           required:"Ingresa una fecha de nacimiento"
       },
       txtTelefonoUsuario:{
           required:"Ingresa un telefono"
           
       },cmbGeneroUsuario:{
           required:true
           
       },txtCorreoUsuario:{
           required:"Ingresa un correo",
           email:"Ingresa un correo valido",
           minlength:"Minimo 5 caracteres",
           maxlength:"Maximo 20 caracteres"
       },
       txtContraseniaUsuario:{
           required:"Ingresa una contraseña",
           minlength:"Minimo 8 caracteres",
           maxlength:"Maximo 20 caracteres"
       },
       txtConfirmarContraseniaUsuario:{
           required:"Ingresa la contraseña",
           equalTo: "Las contraseñas no coinciden"
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
        $('ul.tabs').tabs('select_tab', 'test-swipe-2');
    }
});
///////////////////////////////// VALIDAR REGISTRO DEL JUGADOR /////////////////////////////
$("#frmRegistroJugador").validate({
    rules:{
        txtAliasJugador:{
            required:true,
            minlength:4
        },txtDescripcionJugador:{
            required:true,
            minlength:5
            
        }
        
    },messages:{
        txtAliasJugador:{
            required:"Ingresa tu alias",
            minlength:"Minimo 4 caracteres"
        },txtDescripcionJugador:{
            required:"Ingresa la descripcion",
            minlength:"Minimo 5 caracteres"
        }
        
    },errorElement : 'div',
        errorPlacement: function(error, element) {
          var placement = $(element).data('error');
          if (placement) {
            $(placement).append(error);
          } else {
            error.insertAfter(element);
          }
    },
    submitHandler:function(){
        registrarUsuario();
    }
});
///////////// CAMBIAR DE TAB ////////////////////////////////////
$("#atrasRegistro").click(function (){
     $('ul.tabs').tabs('select_tab', 'test-swipe-1');
});
/////////////////////////////////// Validar REGISTRO EQUIPO ///////////////////////
$("#frmRgistrarEquipo").validate({
    rules:{
        txtNombreEquipo:{
            required:true,
            minlength:4
        },txtCiudadEquipo:{
            required:true,
            minlength:3
        }
        
    },messages:{
        txtNombreEquipo:{
            required:"Ingresa el nombre de tu equipo",
            minlength:"Minimo 4 caracteres"
        },txtCiudadEquipo:{
            required:"Ingresa la ciudad",
            minlength:"Ciudad no valida"
        }
        
    },errorElement : 'div',
        errorPlacement: function(error, element) {
          var placement = $(element).data('error');
          if (placement) {
            $(placement).append(error);
          } else {
            error.insertAfter(element);
          }
    },
    submitHandler:function(){
        registrarEquipo();
    }
});
///////////////////////////////////// VALIDAR EDITAR EQUIPO ///////////////////////////////
$("#frmEditarEquipo").validate({
    rules:{
        txtNombreEditarEquipo:{
            required:true,
            minlength:4
        },txtCiudadEditarEquipo:{
            required:true,
            minlength:3
        }
        
    },messages:{
        txtNombreEditarEquipo:{
            required:"Ingresa el nombre de tu equipo",
            minlength:"Minimo 4 caracteres"
        },txtCiudadEditarEquipo:{
            required:"Ingresa la ciudad",
            minlength:"Ciudad no valida"
        }
        
    },errorElement : 'div',
        errorPlacement: function(error, element) {
          var placement = $(element).data('error');
          if (placement) {
            $(placement).append(error);
          } else {
            error.insertAfter(element);
          }
    },
    submitHandler:function(){
        editarEquipo();
    }
});