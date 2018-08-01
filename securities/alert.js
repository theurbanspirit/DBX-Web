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

//=========progress bar==============

  var a_limit = 100000;
  var a_executed = 40000;
  var a_remaining = a_limit - a_executed;
  document.getElementById("sec_a_limit").innerHTML =
    "Sector A Limit: " + a_limit;
  document.getElementById("sec_a_executed").innerHTML =
    "Trades Executed: " + a_executed;
  document.getElementById("sec_a_remaining").innerHTML =
    "Remaining Balance: " + a_remaining;

  var b_limit = 50000;
  var b_executed = 30000;
  var b_remaining = b_limit - b_executed;
  document.getElementById("sec_b_limit").innerHTML =
    "Sector B Limit: " + b_limit;
  document.getElementById("sec_b_executed").innerHTML =
    "Trades Executed: " + b_executed;
  document.getElementById("sec_b_remaining").innerHTML =
    "Remaining Balance: " + b_remaining;

  var total_limit = a_limit + b_limit;
  var total_executed = a_executed + b_executed;
  var total_remaining = total_limit - total_executed;
  document.getElementById("overall_limit").innerHTML =
    "Overall Limit: " + total_limit;
  document.getElementById("overall_executed").innerHTML =
    "Trades Executed: " + total_executed;
  document.getElementById("overall_remaining").innerHTML =
    "Remaining Balance: " + total_remaining;

  document.getElementById("progbar_a").innerHTML=Math.round((a_executed/a_limit)*100);
  document.getElementById("progbar_b").innerHTML=Math.round((b_executed/b_limit)*100);
  document.getElementById("progbar_c").innerHTML=Math.round((total_executed/total_limit)*100);
