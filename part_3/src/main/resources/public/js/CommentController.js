var app = angular.module('app', []) 

app.controller('CommentCtrl', function($scope, $http) {
     	 
	$http.get("api/comment").then(function(response){
		$scope.comments = response.data;
	},function(){
		alert("error from server");
	});
	
    $scope.add = function() {
    	
    	$http.post("api/comment",  $scope.comment).then(
				function(response){
					$scope.comments.push($scope.comment);
				}, function() {
					alert("error from server");
				});
		
    };
      
 });

