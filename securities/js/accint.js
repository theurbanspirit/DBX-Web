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
					$('#acintable').empty();
//					alert(result);
					var custList = "";
					$.each(result.data, function(i, customer){
						var customer = '<tr align="center"><td>' + customer.security_symbol + "</td><td>" + customer.security_name_trade + "</td><td>" + customer.security_isi_number + "</td><td>" + customer.coupon+ "%" +"</td><td>" + customer.issue_date_string + "</td><td>" + customer.maturity_date_string +"</td><td>" + customer.trade_price + "</td><td>"+ customer.trade_date_string +"</td><td>" + customer.settle_date_string + "</td><td>"+ customer.current_market_price +"</td><td>" + customer.accurued_interest + "</td></tr>";
						$('#acintable').append(customer)
			        });
			        // $('#getResultDiv').css({"background-color":"yellow"});
			        // $('.list-group').css({"list-style-type": "circle"});
					console.log("Success: ", result);
				}else{
					$('#acintable').html("<strong>Error</strong>");
					console.log("Fail: ", result);
				}
			},
			error : function(e) {
				$('#acintable').html("<strong>Error</strong>");
				console.log("ERROR: ", e);
			}
		});	
	}
})