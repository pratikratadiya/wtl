angular.module('Calculator', [])
.controller('CalcController', function($scope) {
    $scope.result = function() {
        if ($scope.operator == '+') {
            return parseInt($scope.a) + parseInt($scope.b);
        }
        if ($scope.operator == '-') {
            return parseInt($scope.a) - parseInt($scope.b);
        }
        if ($scope.operator == '*') {
            return parseInt($scope.a) * parseInt($scope.b);
        }
        if ($scope.operator == '/') {
            return parseInt($scope.a) / parseInt($scope.b);
        }
    };
});
