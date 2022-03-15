
var app = angular.module("myapp", []);


app.controller('mycontroller', ['$scope', function($scope)  {

    $scope.reviews = [
        {
            comment: 'could this be more awesome:',
            by:' Ajit Johnson'
        },
        {
            comment: 'could thhggjjkkjkjjkkjis be more awesome:',
            by:' Ann Johnson'
        },
    ];


}]);
