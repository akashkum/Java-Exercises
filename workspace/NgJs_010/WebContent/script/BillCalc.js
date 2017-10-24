//A Factory Method.module() creates a module Object.
var billModule=angular.module("billModule",[]);


//A module has a factory method .controller to create Controller
billModule.controller("billController", function($scope) {
	
	
	//Objects in Javascript
	$scope.bill= {
			
			'cost' : 0,
	       'qty' : 1,
	       'discount' : 0	       
	};
	
	$scope.calcTotalBill=function(){
		return $scope.bill.cost * $scope.bill.qty;
	};
	
	$scope.calcDiscount=function(){
		return $scope.calcTotalBill() * $scope.bill.discount/100;
	};
	
	$scope.calcDiscountedBill = function(){
		return $scope.calTotalBill()- $scope.calcDiscount();
	};
}
);
