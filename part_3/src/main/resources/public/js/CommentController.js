var app = angular.module('app', []) 

app.controller('CommentCtrl', function($scope, $http) {
     	 
	$http.get("api/user").then(function(response){
		if(response.data) {
			$scope.isLogin = true;
		} else {
			$scope.isLogin = false;
		}
	});
	
 
	
    $scope.add = function() {	
    	$http.post("api/comment",  $scope.comment).then(
				function(response) {
					$scope.comments.push($scope.comment);
				});
		
    };
      
 });

