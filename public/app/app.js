angular.module('rhplay',
        ['ngRoute',
            'ngResource',
            'ngSanitize',
            'ngAria',
            'ngAnimate',
            'angular-loading-bar',
            'toastr',
            'ui.bootstrap',
            'datetimepicker'
        ]
    )
    .config(function ($routeProvider) {
        $routeProvider
            .when('/', {
                templateUrl: '/assets/app/views/home.html',
                controller: 'home.controller',
                activetab: 'home'
            }).when('/colaborador/novo', {
                templateUrl: '/assets/app/views/colaboradores/create.html',
                controller: 'colaborador.create.controller'
            })
            .when('/colaborador/detalhe/:id', {
                templateUrl: '/assets/app/views/colaboradores/detail.html',
                controller: 'colaborador.detail.controller'
            })
            .when('/colaborador/editar/:id', {
                templateUrl: '/assets/app/views/colaboradores/edit.html',
                controller: 'colaborador.edit.controller'
            })
            .when('/colaboradores', {
                templateUrl: '/assets/app/views/colaboradores/list.html',
                controller: 'colaborador.list.controller'
            })
    }).directive('formatDate',formatDate);
        function formatDate(){
            return {
                require: 'ngModel',
                link: function(scope, elem, attr, modelCtrl) {
                    modelCtrl.$formatters.push(function(modelValue){
                        return new Date(modelValue);
                    })
                }
            }
    }