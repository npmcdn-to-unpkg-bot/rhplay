angular.module('rhplay')
    .controller('home.controller', function ($scope, $rootScope, $routeParams, cfpLoadingBar, Usuario, $location, toastr) {

        // $rootScope.title = Messages('menu.top.title.1');

        // fake the initial load so first time users can see the bar right away:
        /*$scope.start = function() {
         cfpLoadingBar.start();
         };
         $scope.complete = function () {
         cfpLoadingBar.complete();
         };
         //fake the initial load so first time users can see the bar right away:
         $scope.start();
         $scope.fakeIntro = true;
         $timeout(function() {
         $scope.complete();
         $scope.fakeIntro = false;
         }, 9000);*/

    });