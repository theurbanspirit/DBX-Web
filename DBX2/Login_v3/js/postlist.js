function ajaxPost(){
    	
       
    	
        
    	// DO POST
    	$.ajax({
			type : "POST",
			contentType : "application/json",
			url : "http://localhost:8999//getdataSector1/1",
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
    
    