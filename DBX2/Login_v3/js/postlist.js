function combine(){
	ajaxPost();
	ajaxPost2();
	
}


function ajaxPost(){
    	
       
    	
        
    	// DO POST
    	$.ajax({
			type : "POST",
			contentType : "application/json",
			url : "http://localhost:8999//getdataSector1/1",
		//	data : JSON.stringify(formData),
			dataType : 'json',
			success : function(result) {
				
				console.log(result);
				var j=1;
				 
				 $.each(result, function(i, item) {
				 var dir;	 
			     if(result[i].direction == "B"){
					 dir="BUY";
					 
				 }
					 else{
						 dir="SELL";
					 }
                $('<tr>').html("<td>" + j + "</td><td>" + result[i].client_name + "</td><td>" + result[i].security + "</td><td>" + result[i].quantity + "</td><td>" + dir +"</td><td>" + result[i].value +  "</td><td>" + result[i].order_id +"</td><td>" + result[i].limit_price+"</td>"  ).appendTo('#sector1');
				j++;
                 });
			},
			error : function(e) {
				alert("Error!")
				console.log("ERROR: ", e);
			}
		});
    	
    	
    }
	
	
	function ajaxPost2(){
    	
       
    	
        
    	// DO POST
    	$.ajax({
			type : "POST",
			contentType : "application/json",
			url : "http://localhost:8999//getdataSector2/1",
		//	data : JSON.stringify(formData),
			dataType : 'json',
			success : function(result) {
				
				console.log(result);
				var j=1;
				 
				 $.each(result, function(i, item) {
				 var dir;	 
			     if(result[i].direction == "B"){
					 dir="BUY";
					 
				 }
					 else{
						 dir="SELL";
					 }
                $('<tr>').html("<td>" + j + "</td><td>" + result[i].client_name + "</td><td>" + result[i].security + "</td><td>" + result[i].quantity + "</td><td>" + dir +"</td><td>" + result[i].value +  "</td><td>" + result[i].order_id +"</td><td>" + result[i].limit_price+"</td>"  ).appendTo('#sector2');
				j++;
                 });
			},
			error : function(e) {
				alert("Error!")
				console.log("ERROR: ", e);
			}
		});
    	
    	
    }
    
    
    
    