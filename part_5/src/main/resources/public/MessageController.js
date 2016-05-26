var app = angular.module('app', []) 
 
app.controller('MessageController', function($scope, ngstomp) {
    
  $scope.messages = [];
    $scope.client = ngstomp('http://localhost:15674/stomp');
    $scope.client.connect("guest", "guest", function(){
        $scope.client.subscribe("/topic/test", function(message) {
            $scope.messages.push(message.body);
        });
    }, function(){}, '/');
  
 });
 