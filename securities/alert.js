//obj = {"message" : "alert", "val" : "80"};


//==========================URLs for breach data==========================

const balanceURL = '';
const tradeURL = '';
const varianceURL = '';
var alertMessage = document.getElementById('alertMessage');
var alertModalHeader = document.getElementById('alertModalHeader');
var breachCount = 0;
var closeAlert = document.getElementById('closeAlert');
var alertLine2 = document.getElementById('alertLine2');

//==========Balance exceeded============= 
fetch(balanceURL).then(
	function(response){
		
		//return obj;
		return response.json();
		}
).then(function(data){
	if(data.message == "breach"){
		if(breachCount <= 1){
			alertModalHeader.innerHTML = "COMPLIANCE BREACH";
			alertMessage.innerHTML = "Order exceeds allowed balance limit. Profile will be blocked for the day on second attempt.";
			$('#alertModal').modal({backdrop: 'static'});
			$('#alertModal').modal('show');
			breachCount++;
		}
		else{
			alertModalHeader.innerHTML = "COMPLIANCE BREACH";
			alertMessage.innerHTML = "Profile blocked.";
			alertLine2.innerHTML = "Click OK to log out.";
			closeAlert.innerHTML = "OK";
			$('#alertModal').modal({backdrop: 'static', keyboard: false});
			closeAlert.addEventListener("click", function(){
   				 document.location.href = 'login.html';});
			$('#alertModal').modal('show');
		}
	}

	if(data.message == "alert"){
		alertMessage.innerHTML = "You have reached " + data.val + "% of your balance limit.";
		$('#alertModal').modal('show');
	}
	
});


//=========Trade limit exceeded=================
fetch(tradeURL).then(
	function(response){
		return response.json();
		}
).then(function(data){
	if(data.message == "breach"){
		if(breachCount <= 1){
			alertModalHeader.innerHTML = "COMPLIANCE BREACH";
			alertMessage.innerHTML = "Order exceeds allowed trade limit. Profile will be blocked for the day on second attempt.";
			$('#alertModal').modal({backdrop: 'static'});
			$('#alertModal').modal('show');
			breachCount++;
		}
		else{
			alertModalHeader.innerHTML = "COMPLIANCE BREACH";
			alertMessage.innerHTML = "Profile blocked.";
			alertLine2.innerHTML = "Click OK to log out.";
			closeAlert.innerHTML = "OK";
			$('#alertModal').modal({backdrop: 'static', keyboard: false});
			closeAlert.addEventListener("click", function(){
   				 document.location.href = 'login.html';});
			$('#alertModal').modal('show');
		}
	}

	if(data.message == "alert"){
		alertMessage.innerHTML = "You have reached " + data.val + "% of your trade limit.";
		$('#alertModal').modal('show');
	}
	
});


//=============Variance breach=========
fetch(balanceURL).then(
	function(response){
		return response.json();
		}
).then(function(data){
	if(data.message == "breach"){
		if(breachCount <= 1){
			alertModalHeader.innerHTML = "COMPLIANCE BREACH";
			$('#alertModal').modal({backdrop: 'static'});
			alertMessage.innerHTML = "Trade cannot be made at a price difference of over 4%. Profile will be blocked for the day on second attempt";
			$('#alertModal').modal('show');
			breachCount++;
		}
		else{
			alertModalHeader.innerHTML = "COMPLIANCE BREACH";
			alertMessage.innerHTML = "Profile blocked.";
			alertLine2.innerHTML = "Click OK to log out.";
			closeAlert.innerHTML = "OK";
			closeAlert.addEventListener("click", function(){
   				 document.location.href = 'login.html';});
			$('#alertModal').modal({backdrop: 'static', keyboard: false});
			$('#alertModal').modal('show');
		}
	}
	
});