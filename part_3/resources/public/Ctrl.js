var app = angular.module('app', []);

app.controller('Ctrl', function($scope, $http){
	$http.get("http://api.sr.se/api/v2/traffic/messages?format=json").then(function(response){
		alert(response)
	})
	
<!-- REMOVE -->
    $scope.isLoggedIn = false;
   
    $scope.login = function () {
	$scope.isLoggedIn = true;
    }



});
