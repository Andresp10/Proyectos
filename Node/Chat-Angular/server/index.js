var expres = require('express');
var app = expres();
var server = require('http').Server(app);
var io = require('socket.io')(server);

app.use(expres.static('client'));

app.get('/hola',function(req, res){

	res.status(200).send('Holan mundo este es un proyecto con ANGULAR');

});

var messages = [{
    id:1,
    text:'Este es un mensaje de Andres XDXDXDXDXDX',
    nickname:'Andres'
}];

io.on('connection', function (socket){

	console.log("El nodo y la ip son : " + socket.handshake.address)

    socket.emit('messages',messages);

		socket.on('add-message',function (data){

			messages.push(data);

			io.sockets.emit('messages',messages);

		});



});

server.listen(6677,function (){
	//alert('Estoy en el listen: linea 39 index js');
	console.log('SERVIDOR :: 200');
});
