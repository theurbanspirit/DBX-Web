function ajaxPost(){
      
       
      
      $.ajax({
      type : "GET",
      contentType : "application/json",
      url : "http://localhost:7877/getdata",
    //  data : JSON.stringify(formData),
      dataType : 'json',
      success : function(result) {
        alert("hi");
        console.log(result.length);
        for(var i=0; i<result.length;i++)
        {
          console.log(result[i].sector);
        }


    $.each(result, function(i, item) {
    $('<tr>').html("<td>" + result[i].symbol + "</td><td>" + result[i].isin + "</td><td>" + result[i].sector + "</td>").appendTo('#security_table');
});
     

        console.log(result);
      },
      error : function(e) {
        alert("Error!")
        console.log("ERROR: ", e);
      }
    }); 

    alert("hi");
      
      
    } 


  $(".use-add").click(function() {

    var $item = $(this).closest("tr")   // Finds the closest row <tr> 
                       .find(".nr")     // Gets a descendent with class="nr"
                       .text();         // Retrieves the text within <td>

    $(".media-heading").text($item);       // Outputs the answer
});
