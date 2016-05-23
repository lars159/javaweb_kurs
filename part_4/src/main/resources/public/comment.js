angular.module('app', []) .controller('IndexController', function() {
    
	$scope.comments = $resoruce(/comment/)
	
    $scope.add = function(c) {
		$scope.comments.$save(c);
    };

    $scope.getTraffic = function(){
    	$http.get("http://api.sr.se/api/v2/traffic/messages?format=json").then(function(response) {
    		$scope.traffic = response.data;
    	})
    	
    }
    
  });

