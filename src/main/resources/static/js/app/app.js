
'use strict'
var app = angular.module('app', ['app.service']);
app.constant("CONSTANTS", {
    apiKey: APIKEY,
    skyscannerApi: 'http://partners.api.skyscanner.net/',
    getCustomersWithinDistance: "/customers/within-distance/",
    getAllCustomers: "/customers"
});