var app = angular.module('app', []) 
 
app.controller('MessageController', function($scope) {
    
     $scope.messages = []; 
      var stompClient = null;

      $scope.messages = [];

      var socket = new SockJS('/chatWS');
      stompClient = Stomp.over(socket); 
      stompClient.connect({}, (frame) => {
          console.log('Connected: ' + frame);
          stompClient.subscribe('/topic/messages', function (msg){
        	  console.log(msg);
        	  $scope.$apply(function () {
        		  $scope.messages.push(msg.body);
        	  });
        	  
          });
      });
  
 });
 