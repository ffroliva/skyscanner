'use strict'
app.controller("FlightController", function FlightController($scope, FlightService) {

        var vm = this;
        
        // attributes
        vm.pricing = null;
        vm.error = '';

        // methods
        vm.fetchNextMondayFlights = function() {
            FlightService.fetchNextMondayFlights().then(function(value) {
                console.log(value.data)
                vm.pricing = value.data;
            }, function(reason) {
                console.log("error occured" + reason);
            }, function(value) {
                console.log("no callback" + value);
            });
        }
});
