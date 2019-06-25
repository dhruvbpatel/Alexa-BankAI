
function validateForm(){

	
	var loanType = document.loanTypeForm.loanType;
	var loanDescription = document.loanTypeForm.loanDescription;
		
	   	
	
	if(loanType.value.trim()==""){
		
		alert("Please Insert Value in LoanType");
		loanType.focus();
		loanType.value="";
		return false;
	}
	
	  if(loanDescription.value.trim()==""){
	 		
	 		alert("Please Insert Value in Description");
	 		loanDescription.focus();
	 		loanDescription.value="";
	 		return false;
	 	}
	
	  
	
	 var letters = /^[0-9a-zA-Z _]+$/;
     if(loanType.value.match(letters))
     {
    	 typelength();
    	 return true;
     }	
     else
     {
    	 alert('Please input alpha-Numeric characters only');
    	 loanType.focus();
    	 return false;
     }
     
/*-----------------------  validations  for   description --------------------------*/     
     
     var letters = /^[A-Za-z0-9 _]/;
     if(loanDecription.value.match(letters))
     {
    	 descriptionLength();
    	 return true;
     }	
     else
     {
    	 alert('Please input alpha-Numeric characters only');
    	 loanDescription.focus();
    	 return false;
     }
     
}   
 
/*-----------------------  validations  for   Max length --------------------------*/
 	
function typelength()
{ 
var field = document.loanTypeForm.loanType.value;
var mnlen=4;
var mxlen=255;


if(field.length<mnlen || field.length> mxlen)
{ 
alert("Please input the userid between " +mnlen+ " and " +mxlen+ " characters");
return false;
}
else
{ 
alert('Value Inserted');
return true;
}
}

/*for descripiton length*/

function descriptionLength()
{ 
var field1 = document.loanTypeForm.loanDescription.value;
var mnlen1=2;
var mxlen1=255;


if(field1.length<mnlen1 || field1.length> mxlen1)
{ 
alert("Please input the userid between " +mnlen1+ " and " +mxlen1+ " characters");
return false;
}
else
{ 
alert('Inserted Data !');
return true;
}
}
     



  
	
	
	
	
	

	



	
	
	
	