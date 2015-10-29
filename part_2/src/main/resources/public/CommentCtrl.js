angular.module('app', []) .controller('CommentCtrl', function($scope, $http) {
    
	
	$http.get("http://api.sr.se/api/v2/traffic/messages?format=json").then(function(response) {
		$scope.traffic = response.data;
	})
	
	$scope.comments = $http.get("/user/" +$scope.user.id +"/comment/")
	
    $scope.add = function(c) {
		$http.post("/user/" +$scope.user.id +"/comment/").then(function(response){
			$scope.comments.push(c);
		},function(){
			alert("error from server")
		})
		
    };

    
  });

