$( document ).ready(function() {
	ajaxGet();
	// GET REQUEST
	// $("#getprofitloss").click(function(event){
	// 	event.preventDefault();
	// 	ajaxGet();
	// });
	
	// DO GET
	function ajaxGet(){
			//var name= $.session.get("Client_name");
			var user=localStorage.getItem('Client_name');
		$.ajax({
			type : "GET",
			url : "http://localhost:8878/api/getcustomerdata/"+ user,
			success: function(result){
				if(result.status == "Done"){
					$('#profittable').empty();
//					alert(result);
					var custList = "";
					$.each(result.data, function(i, customer){
						var customer = '<tr><td>' + customer.security_name_trade  + '</td><td>' + customer.notional_amount + "</td><td>" + customer.current_market_price + "</td><td>" + customer.trade_value + "</td></tr>";
						$('#profittable').append(customer)
			        });
			        // $('#getResultDiv').css({"background-color":"yellow"});
			        // $('.list-group').css({"list-style-type": "circle"});
					console.log("Success: ", result);
				}else{
					$('#profittable').html("<strong>Error</strong>");
					console.log("Fail: ", result);
				}
			},
			error : function(e) {
				$('#profittable').html("<strong>Error</strong>");
				console.log("ERROR: ", e);
			}
		});	
	}
})