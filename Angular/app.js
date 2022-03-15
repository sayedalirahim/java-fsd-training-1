

var app = angular.module("myapp", []);


app.controller('mycontroller', ['$scope', function($scope)  {

// $scope.name="ajith";
// $scope.name="riya";
// $scope.age="25";

    // $scope.firstname = "Ajith";
    // $scope.lastname = "Johnson";
    // $scope.fullname  = function() {
    //     return $scope.firstname+ " " + $scope.lastname;

    // };
    // $scope.isSpy = true;
    // $scope.codename= ' chancy';


    // $scope.employees = [
    //     {
    //         fname:'Ajith',
    //         lname:"Johnson",
    //         salary:45000
    //     },
    //     {
    //         fname:'Ann maria',
    //         lname:"Johnson",
    //         salary:55000
    //     },
    //     {
    //         fname:'Riya',
    //         lname:"Ajith",
    //         salary:355000
    //     }
    // ];

    $scope.count= 0;
    $scope.show= true;
    $scope.toggleshow = function() {
        $scope.show = !$scope.show;
    };


}]);