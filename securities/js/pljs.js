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

		$.ajax({
			type : "GET",
			url : "http://localhost:8878/api/getcustomerdata/diego.costa",
			success: function(result){
				if(result.status == "Done"){
					$('#nettable').empty();
//					alert(result);
					var custList = "";
					$.each(result.data, function(i, customer){
						var customer = "<tr><td>" + customer.security_symbol+ "</td><td>"+ customer.notional_amount + "</td><td>"+ customer.trade_price + "</td><td>"+ customer.current_market_price +"</td><td>" + customer.profit + "</td><td>"+ customer.profit_loss + "</td></tr>";
						$('#nettable').append(customer)
			        });
			        // $('#getResultDiv').css({"background-color":"yellow"});
			        // $('.list-group').css({"list-style-type": "circle"});
					console.log("Success: ", result);
				}else{
					$('#nettable').html("<strong>Error</strong>");
					console.log("Fail: ", result);
				}
			},
			error : function(e) {
				$('#nettable').html("<strong>Error</strong>");
				console.log("ERROR: ", e);
			}
		});	
	}
})