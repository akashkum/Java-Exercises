var empModule=angular.module("empModule", []);

//gets automatically called
empModule.run(
//This method is a bootstrap Method for a module
function($rootScope){
	$rootScope.title="Capgemini India Pvt. Ltd.";
}

);

empModule.controller("empController",
	function($scope,$http){
	$scope.pageHead="List of Employees";
	refreshPage();
	function refreshPage(){
	$http( {
		
		method: 'GET',
		url: 'http://localhost:8088/SpringMVC040_NgRest/rest/empList'
		
	}		
	).success(
			function(data){
				$scope.empList=data;
			}
			);
	}
	 $scope.empDetails=function(empNo){
		 $http( {
				
				method: 'GET',
				url: 'http://localhost:8088/SpringMVC040_NgRest/rest/empDetails/'+empNo
				
			}		
			).success(
					function(data){
						
						$scope.emp=data;
					}
					);
		 
	 }
	 $scope.empDelete=function(empNo){
		 $http( {
				
				method: 'DELETE',
				url: 'http://localhost:8088/SpringMVC040_NgRest/rest/empDelete/'+empNo
				
			}		
			).success(
					function(data){
						alert(data);
						refreshPage();
						
					});
					
		 
	 }
	
		
	}	

);
