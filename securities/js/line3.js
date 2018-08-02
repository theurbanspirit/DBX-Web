$(function(){

    //get the line chart canvas
    var ctx = $("#line-chartcanvas");







//var x="<?php $x=[\"match1\", \"match2\", \"match3\", \"match4\", \"match5\"]; echo $x; ?>";
//var xe=x.replace("[","");
//var xf=xe.replace("]","");
//var pq="<?php $pq=array(\"ma1\",\"ma2\",\"ma3\",\"ma4\",\"ma5\"); foreach($pq as $d){ echo $d; }   ?>";
//var arr = JSON.parse("[" + xf + "]");
//var arr=x.split();
//console.log(x);

    var date = Math.floor((Math.random() * 30) + 1);
var month=Math.floor((Math.random() * 12) + 1);

var today = new Date();
var dd = today.getDate();
var mm = today.getMonth()+1; //January is 0!
var yyyy = today.getFullYear();

if(dd<10) {
    dd = '0'+dd
} 

if(mm<10) {
    mm = '0'+mm
} 

today = mm + '/' + dd + '/' + yyyy;

/*
var date = new Date();

date ; //# => Fri Apr 01 2011 11:14:50 GMT+0200 (CEST)

var today_m1=(date.getDate() - 1);
var today_m2=(date.getDate() - 2);
var today_m3=(date.getDate() - 3);
var today_m4=(date.getDate() - 4);
var today_m5=(date.getDate() - 5);
var today_m6=(date.getDate() - 6);

var today_1=(date.getDate() + 1);
var today_2=(date.getDate() + 2);
var today_3=(date.getDate() + 3);
var today_4=(date.getDate() + 4);
var today_5=(date.getDate() + 5);
var today_6=(date.getDate() + 6);


*/

if(dd<=1)
{
m=mm-1;
}
else if(dd>=30)
today_m1=(mm) + '/' + (dd-1) + '/' + yyyy;
today_m2=(mm) + '/' + (dd-2) + '/' + yyyy;
today_m3=(mm) + '/' + (dd-3) + '/' + yyyy;
today_m4=(mm) + '/' + (dd-4) + '/' + yyyy;
today_m5=(mm) + '/' + (dd-5) + '/' + yyyy;
today_m6=(mm) + '/' + (dd-6) + '/' + yyyy;
today_m7=(mm) + '/' + (dd-7) + '/' + yyyy;


today_1=(mm) + '/' + (dd+1) + '/' + yyyy;
today_2=(mm) + '/' + (dd+2) + '/' + yyyy;
today_3=(mm) + '/' + (dd+3) + '/' + yyyy;
today_4=(mm) + '/' + (dd+4) + '/' + yyyy;
today_5=(mm) + '/' + (dd+5) + '/' + yyyy;
today_6=(mm) + '/' + (dd+6) + '/' + yyyy;
today_7=(mm) + '/' + (dd+7) + '/' + yyyy;


var y=["20/07/2018","21/07/2018","22/07/2018","23/07/2018","24/07/2018","25/07/2018","26/07/2018","27/07/2018","28/07/2018","29/07/2018","30/07/2018","31/07/2018","01/08/2018","02/08/2018","03/08/2018"];
    //line chart data
    var data = {
        labels:y,
        datasets: [
            {
                label: "Bond A",
                data: [(Math.random()*(104-98+1)+98) ,(Math.random()*(104-98+1)+98) ,(Math.random()*(104-98+1)+98) ,(Math.random()*(104-98+1)+98) ,(Math.random()*(104-98+1)+98) ,(Math.random()*(104-98+1)+98) ,(Math.random()*(104-98+1)+98) ,(Math.random()*(104-98+1)+98) ,(Math.random()*(104-98+1)+98) ,(Math.random()*(104-98+1)+98) ,(Math.random()*(104-98+1)+98) ,(Math.random()*(104-98+1)+98) ,(Math.random()*(104-98+1)+98) ,(Math.random()*(104-98+1)+98) ,(Math.random()*(104-98+1)+98) ],
                backgroundColor: "blue",
                borderColor: "lightblue",
                fill: false,
                lineTension: 0,
                radius: 5
            }
        ]
    };

 
    //options
    var options = {
        responsive: true,
        title: {
            display: true,
            position: "top",
            text: "Line Graph",
            fontSize: 18,
            fontColor: "#111"
        },
        legend: {
            display: true,
            position: "bottom",
            labels: {
                fontColor: "#333",
                fontSize: 16
            }
        }
    };




    //create Chart class object
    var chart = new Chart(ctx, {
        type: "line",
        data: data,
        options: options
    });


   


});
