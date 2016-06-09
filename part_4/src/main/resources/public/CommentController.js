var app = angular.module('app');

  
app.controller('CommentController', function($scope , $http) {
      
	var commentResource = $resource('/api/comment/:commentId', {commentId:'@id'});
    
    $scope.comments = commentResource.query();
    
    $scope.save = function (){
        commentResource.save({name : $scope.text})
    }
    
    $scope.update = function (){
        user.$save();
    }
    
  
    $http.get("http://api.sr.se/api/v2/traffic/messages?format=json").then(function(response) {
        $scope.traffic = response.data.messages;
    });
 
	
});

