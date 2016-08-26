

function loading(){

/*
cambia la clase de los elemento de la cabcera */
 $(document).ready(function(){

    
if ($(location).attr('href') == "http://localhost/proyecto/public/home" ||
    $(location).attr('href') == "http://localhost/proyecto/public/"){

    $('#tab_1').addClass('active');
}

if ($(location).attr('href') == "http://localhost/proyecto/public/servicios"){

    $('#tab_2').addClass('active');
}

if ($(location).attr('href') == "http://localhost/proyecto/public/tarifas"){

    $('#tab_3').addClass('active');
}

if ($(location).attr('href') == "http://localhost/proyecto/public/belinker"){

    $('#tab_4').addClass('active');
}

if ($(location).attr('href') == "http://localhost/proyecto/public/contacto"){

    $('#tab_5').addClass('active');
}


/*
funcion que muestra durante un tiempo la pantalla de carga */
window.onload=cerrar; 
function cerrar(){ 
$("#carga").animate({"opacity":"0"},1000,function(){$("#carga").css("display","none");}); 
} 
$("#carga").click(function(){cerrar();});

});



}
