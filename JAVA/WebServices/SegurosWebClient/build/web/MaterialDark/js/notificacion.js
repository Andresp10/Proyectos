///////////////////////////////////////// CARGAR NOTIFICACIONES ///////////////////////////////////
window.onload = function cargar (){
    
    CargarNotificaciones();
};
function CargarNotificaciones (){
  
    alert("cargando notificaciones...");
    $.post("/FutPlay/notificacion/cargarnotificaciones",function (responseText){ 
        $("#notificacionesContenedor").html("");
        var Visto = 0;
        alert(responseText.toString());
        $("#numeroNotificaciones").text(responseText);
//        $.each(responseText,function (i,item){
//            
//            if(item.Visto == false){
//                
//                Visto++;
//                alert(Visto);
//                $("#numeroNotificaciones").text(Visto);
//                
//            }else{
//                
//            }
//            
//            $("#notificacionesContenedor").append("<a href='#' class='waves-effect Notification'><div class='Notification-icon'><i class='zmdi zmdi-accounts-alt bg-info'></i></div><div class='Notification-text'><p><i class='zmdi zmdi-circle tooltipped' data-position='left' data-delay='50' data-tooltip='Notification as UnRead' data-tooltip-id='d962b1bf-4f88-c1a1-c74f-a030bc88918c'></i><strong>FutPlay te da la vienvenida</strong><br><small>Just Now "+item.Hora+"</small></p></div></a>");
//        });
//        
    });
    
};