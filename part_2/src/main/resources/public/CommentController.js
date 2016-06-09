var app = angular.module('app', []) ;
 
app.controller('CommentController', function($scope, $http) {
    
	$http.get("api/comment").then(function(response){
		// Add code here
	});
	
    $scope.add = function() {
    	$http.post("api/comment", $scope.comment).then(function(response){
    		//add code here
    		
    	}, function(){
    		alert("Error")
    	});
    };
  
 });
 
