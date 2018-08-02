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
					$('#panel3').empty();
//					alert(result);
					var custList = "";
					$.each(result.data, function(i, customer){
						var customer ='<div class="panel-heading dark-overlay"><b>'+ customer.security_symbol+ " : "  + customer.security_name_trade  +   '</b></div><div class="panel-body">' + '<p><b> Notional Amount   :   </b>' + customer.notional_amount +  '<br><b> Current Market Price   :   </b>' +  customer.current_market_price +  '<br><b> Trade Value  :   </b>' + customer.trade_value +'</p></div></div></div>'
						//var customer = '<tr><td>' + customer.security_name_trade  + '</td><td>' + customer.notional_amount + "</td><td>" + customer.current_market_price + "</td><td>" + customer.trade_value + "</td></tr>";
						$('#panel3').append(customer)
			        });
			        // $('#getResultDiv').css({"background-color":"yellow"});
			        // $('.list-group').css({"list-style-type": "circle"});
					console.log("Success: ", result);
				}else{
					$('#panel3').html("<strong>Error</strong>");
					console.log("Fail: ", result);
				}
			},
			error : function(e) {
				$('#panel3').html("<strong>Error</strong>");
				console.log("ERROR: ", e);
			}
		});	
	}
})