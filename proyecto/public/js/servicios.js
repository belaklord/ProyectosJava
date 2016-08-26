
function pestanas(id){


var pesana1 = document.getElementById('pestana1');
var pestana2 = document.getElementById('pestana2');
var pestana3 = document.getElementById('pestana3');
var pestana4 = document.getElementById('pestana4');
var pestana5 = document.getElementById('pestana5');


if(id == 'tab_1'){

	

	pestana1.style.display ='block';
	pestana4.style.display="none";
	pestana2.style.display="none";
	pestana3.style.display="none";
	pestana5.style.display="none";

}

if(id== 'tab_2'){


	
	pestana2.style.display = "block";
	pestana1.style.display ="none";
	pestana3.style.display="none";
	pestana4.style.display="none";
	pestana5.style.display="none";

}


if(id == 'tab_3'){

	

	pestana3.style.display = "block";
	pestana1.style.display="none";
	pestana2.style.display="none";
	pestana4.style.display="none";
	pestana5.style.display="none";
	
}


if(id == 'tab_4'){

	
	pestana4.style.display = "block";
	pestana1.style.display="none";
	pestana2.style.display="none";
	pestana3.style.display="none";
	pestana5.style.display="none";
}



if(id == 'tab_5'){

	
	pestana4.style.display = "none";
	pestana1.style.display="none";
	pestana2.style.display="none";
	pestana3.style.display="none";
	pestana5.style.display="block";
}





}