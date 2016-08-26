function pestanas(id){


var pesana1 = document.getElementById('pestana1');
var remoto = document.getElementById('remoto');
var estandard = document.getElementById('estandard');


if(id == 'tab_1'){

	

	pestana1.style.display ='block';
	remoto.style.display = 'block';
	estandard.style.display = 'none';


	

}

else{
	pestana1.style.display = 'block';
	estandard.style.display = 'block';
	remoto.style.display = 'none';

}

}
