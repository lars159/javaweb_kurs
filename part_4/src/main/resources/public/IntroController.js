var app = angular.module('app', []);

app.controller('Ctrl', function($scope, $http){
	$http.get("http://api.sr.se/api/v2/traffic/messages?format=json").then(function(response){
		$scope.traffic = response.data.messages;
	}) 

	$scope.add = function(t){
		if (t.comments) {
			t.comments = [];
		} 
		$scope.t.comments.push(t.c);
	}

});
