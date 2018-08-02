$( document ).ready(function() {
	
	// SUBMIT FORM
    $("#customerForm").submit(function(event) {
		// Prevent the form from submitting via the browser.
		event.preventDefault();
		ajaxPost();
	});
    
    
    function ajaxPost(){
    	
       
    	// PREPARE FORM DATA
    	var formData = {
    		name : $("#username").val(),
    		password :  $("#pass").val()

    	}
        
    	// DO POST
    	$.ajax({
			type : "POST",
			contentType : "application/json",
			url : "http://localhost:7877/api/login",
			data : JSON.stringify(formData),
			dataType : 'json',
			success : function(result) {
				if(result.status == "done"){
					alert("Successfully Logged In");
					 $.session.set("Trader_Id", result.id);
                
                     alert($.session.get("Trader_Id"));
                     window.location="E:/Downloads/DBX2/Login_v3/prev_orders.html";
					
				}else{
                        alert("Wrong id or password");
				}
				console.log(result);
			},
			error : function(e) {
				alert("Error!")
				console.log("ERROR: ", e);
			}
		});
    	
    	// Reset FormData after Posting
    	resetData();

    }
    
    function resetData(){
    	$("#username").val("");
    	$("#pass").val("");
    }
})