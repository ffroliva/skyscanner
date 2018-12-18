
'use strict'
angular.module('app.service', []).factory('FlightService', ["$http", "CONSTANTS", function($http, CONSTANTS) {
    var service = {};
    service.fetchNextMondayFlights = function() {
        return $http.get(CONSTANTS.fetchNextMondayFlights);
    }
    return service;
}]);