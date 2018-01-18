$(document).ready(function(){

$(".btnRemoveEvents").on("click",function(){
    $("#calendar").fullCalendar('removeEvents');
});

/* inicializa los eventos externos drag & drop */
    $('#external-events .fc-event').each(function() {

        $(this).data('event', {
            title: $.trim($(this).text()),
            stick: true, 
            color: "#F77168"
        });

        $(this).draggable({
            zIndex: 999,
            revert: true,      
            revertDuration: 0  
        });

    });
/* inicializa el calendario */
    $("#cmbCampos").change(function(){
        var campo = $(this).val();
        $('#calendar').fullCalendar({
         header: {
             left: 'prev,next today',
             center: 'title',
             right: 'month,agendaWeek,agendaDay'
         },
         defaultView: 'agendaWeek',
         titleFormat:"MMMM YYYY",
         columnFormat:"ddd D",
         slotLabelFormat:"h (:mm)a",
         editable:true,
         droppable:true,
         events:"/FutPlay/canchas/getJSONEncuentros/"+campo+"",
         eventDrop: function(event, delta, revertFunc) {
             var id = event._id;
             var title = event.title;
             var start = event.start.format();
             var end = event.end.format();
             var color = $(this).css("background-color");
             var campo = $("#cmbCampos").val();
             $.ajax({
                 url:"/FutPlay/canchas/guardarEncuentro",
                 method:"post",
                 data:{id:id,title:title,start:start,end:end,color:color,campo,campo}
             }).done(function(rt){
                 if(rt>"0"){
                     swal("Excelente","Evento guardado exitosamente","success");   
                 }
                 else{
                     swal("Error","Ocurrio un error al momento de procesar la solicitud","error");
                 }
             });
         },
         eventResize : function( event, jsEvent, ui, view ){
             var id = event._id;
             var title = event.title;
             var start = event.start.format();
             var end = event.end.format();
             var color = $(this).css("background-color");
             var campo =$("#cmbCampos").val();
             $.ajax({
                 url:"/FutPlay/canchas/guardarEncuentro",
                 method:"post",
                 data:{id:id,title:title,start:start,end:end,color:color,campo:campo}
             }).done(function(rt){
                 if(rt>"0"){
                     swal("Excelente","Evento guardado exitosamente","success");   
                 }
                 else{
                     swal("Error","Ocurrio un error al momento de procesar la solicitud","error");
                 }
             });
         }
     }); 
    });
});