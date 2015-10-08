var app = angular.module('app', ['ngResource']) 

 
app.controller('CommentController', function($scope, $http) {
    
	$http.get("api/comment/").then(function(response){
		$scope.comments = response.data;
	});
	
    $scope.add = function(c) {
    	$http.post("api/comment/", c).then(function(response){
    		$scope.comments.push(c);
    	}, function(){
    		alert("Error")
    	})
    };

    
    
 });

