var app = angular.module('app', ['ngStomp']) 
 
app.controller('MessageController', function($scope, $stomp) {
    
     $scope.messages = []; 
      var stompClient = null;



    var socket = new SockJS('/socketjs');
    stompClient = Stomp.over(socket);
    stompClient.connect({}, function(frame) {
        setConnected(true);
        console.log('Connected: ' + frame);
        stompClient.subscribe('/topic/greetings', function(greeting){
            alert("asd")
            $scope.messages.push(message.body);
        });
    });
 
     
 
  
 });
 