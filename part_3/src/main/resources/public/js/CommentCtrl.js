angular.module('app', []) .controller('CommentCtrl', function($scope, $http) {
     
    $scope.add = function(c) {
			$http.post("/comment/add", {comment : c}).then(function(response){
				$scope.user.comments.push(c);
			},function(){
				alert("error from server")
			})
    };

    
    $scope.signup = function(c) {
			$http.get("/user/signup/" + $scope.name + "?password=" + $scope.password).then(function(response){
				$scope.user = response.data;
			},function(){
				alert("error from server")
			}); 
    };
    
    $scope.login = function(c) {
			$http.post("/login/", {username : "admin", password : "admin"}).then(function(response){
				$scope.user = response.data;
				$scope.isLoggedIn = true;
			},function(){
				alert("error from server")
			}); 
    };
    
    
 });

