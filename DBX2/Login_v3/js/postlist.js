function ajaxPost(){
    	
       
    	// PREPARE FORM DATA
    	/*var formData = {
    		name : $("#username").val(),
    		password :  $("#pass").val()

    	} */
        
    	// DO POST
    	$.ajax({
			type : "POST",
			contentType : "application/json",
			url : "http://localhost:7877/api/login",
		//	data : JSON.stringify(formData),
			dataType : 'json',
			success : function(result) {
				alert("hi");
				console.log(result);
			},
			error : function(e) {
				alert("Error!")
				console.log("ERROR: ", e);
			}
		});
    	
    	
    }
    
    