var app = angular.module('app', []);

app.controller('Ctrl', function($scope){
<!-- REMOVE -->
    $scope.isLoggedIn = false;
   
    $scope.login = function () {
	$scope.isLoggedIn = true;
    }

});
