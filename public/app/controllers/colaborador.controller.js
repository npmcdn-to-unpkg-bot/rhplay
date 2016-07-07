angular.module('rhplay')
    .controller('colaborador.create.controller', function ($scope, $location, Colaborador, toastr) {

        $scope.save = function() {
            Colaborador.save($scope.colaborador, function(data) {
                toastr.success('foi salvo com Sucesso.', 'O colaborador: ' + $scope.colaborador.nome);
                $location.path('/colaboradores');
            }, function(data) {
                toastr.error(data.data,'Não foi possível Salvar');
            });
        };

        $scope.cancel = function() {
            $location.path('/colaboradores');
        };
        
    }).controller('colaborador.detail.controller', function ($scope, $modal, $routeParams, $location, Colaborador, toastr) {

        $scope.init = function() {
            $scope.colaborador = Colaborador.get({id:$routeParams.id}, function(data) {
            },function(data) {
                toastr.error(data.data);
            });
        };

        $scope.delete = function() {
            $scope.colaborador = Colaborador.get({id:$routeParams.id}, function(data) {
                $scope.colaboradorExcluido = $scope.colaborador.nome;
            });
            Colaborador.delete({id:$routeParams.id}, function() {
                toastr.warning('foi removido com Sucesso.', 'O colaborador: ' + $scope.colaboradorExcluido);
                $modalInstance.close();
                $location.path('/colaboradores');
            }, function(data) {
                $modalInstance.close();
                toastr.error(data.data,'Não foi possível Remover');
            });
        };

        $scope.cancel = function() {
            $location.path('/colaboradores');
        };

        $scope.open = function (size) {

            $modalInstance = $modal.open({
                templateUrl: 'modalConfirmacao.html',
                controller: 'colaborador.detail.controller',
                size: size
            });
        };

        $scope.cancelModal = function () {
            $modalInstance.dismiss('cancelModal');
        };
    
    }).controller('colaborador.edit.controller', function ($scope, $modal, $routeParams, $location, Colaborador, toastr) {

        $scope.init = function() {
            $scope.colaborador = Colaborador.get({id:$routeParams.id}, function(data) {
            },function(data) {
                toastr.error(data.data);
            });
        };

        $scope.update = function() {
            Colaborador.update({id:$routeParams.id}, $scope.colaborador, function(data) {
                toastr.info('foi atualizado com Sucesso.', 'O colaborador: ' + $scope.colaborador.nome);
                $location.path('/colaboradores');
            },function(data) {
                toastr.error(data.data, 'Não foi possível Atualizar.');
            });
        };
    
    }).controller('colaborador.list.controller', function ($scope, Colaborador) {

        $scope.init = function() {
            $scope.nomeFiltro = '';

            Colaborador.getAll(function(data) {
                $scope.colaboradores = data;
                $scope.quantidade = $scope.colaboradores.length;
            });
        };

        $scope.busca = function() {

            if ($scope.nomeFiltro) {
                Colaborador.getFiltroColaborador({filtro:$scope.nomeFiltro}, $scope.colaborador, function(data) {
                    $scope.colaboradores = data;
                });
            } else {
                Colaborador.getAll(function(data) {
                    $scope.colaboradores = data;
                });
            }
        };
    
    });