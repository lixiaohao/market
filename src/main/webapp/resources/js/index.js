// JavaScript Document
	var app=angular.module('myApp',[]);
	app.controller('myContro',function($scope,$http){
		$http.get("/market/resources/json/index.json")
		.success(function(response){
			$scope.names = response.records;
			});
		});