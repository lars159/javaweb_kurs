angular.module("app", []).controller('ctrl', function($scope) {
	
	$scope.click = function(name){
		alert(name);
	}
	
});