var app = angular.module("app", []);

app.controller('IntroController', function($scope, $timeout, $http) {

	
	
	console.log($scope);

	$scope.click = function(name){
		alert(name);
	}

	$timeout(function(){
		console.log("3 sec delay");
	}, 3000);

	$http.get("/api/user", function(response){
		console.log(response);
		$scope.result = response;
	})
	
	$scope.array = ["1", "2"];
 
});
