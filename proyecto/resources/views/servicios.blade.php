

@include('cabecera')

<link rel="stylesheet" href="css/servicios.css" />

<script src="js/servicios.js" type="text/javascript"></script>

<div id="pricing-table" class="clear">

	<h3>SERVICIOS</h3>


</div>
<div class="migaspan">

<ol class="breadcrumb">
  <li><a href="{{ url('/home') }}">HOME</a></li>
  <li class="active">SERVICIOS</li>
</ol>
 

	
</div>


<div class="panel panel-default">


  <div class="panel-heading">
  	<h3>NUESTROS SERVICIOS</h3>
  	<ul class="botones">
  	<li id ="tab_1" onclick="pestanas('tab_1')";> <a class="btn btn-default"  >Software</a></li>
  	<li id ="tab_2" onclick="pestanas('tab_2')";> <a class="btn btn-default" >Hardware</a> </li>
	<li id ="tab_3" onclick="pestanas('tab_3')";> <a class="btn btn-default" >Asesoramiento</a> </li>
	<li id ="tab_4" onclick="pestanas('tab_4')";> <a class="btn btn-default" >Antivirus</a> </li>
	<li id ="tab_5" onclick="pestanas('tab_5')";> <a class="btn btn-default" >Montaje y testeo</a> </li>
  	</ul>

  	


  </div>
  <div class="panel-body">

<div id= "pestana1" style='display:block;'>

	<div class="contenido">
Instalamos y asesoramos sobre cualquier tipo de software a saber:<br>

1) Sistemas operativos, tanto windows(para empresas requiere pago de licencia) como linux en todas sus extensiones (software libre y por lo tanto gratuito).
<br>
2) Antivirus (a gusto del consumidor, también asesoramos el tipo de antivirus según el equipo del que disponga).
<br>
3) Procesadores de texto, tanto microsoft office (requiere licencia para empresas) como libre office u openoffice (software libre, gratuito).
<br>
4) Software de limpieza y mantenimiento de equipos.
<br>
5) Otros tipos de software.
	</div>
	
</div>


<div  id= "pestana2" style='display:none;'>
	<div class="contenido">
		Nos encargamos de darle la mejor solución a los problemas de hardware que pueda tener con rapidez y eficiencia.

Montamos cualquier tipo de hardware a saber:

Cualquier tipo de tarjeta interna (gráfica, sonido, etc)
Cualquier tipo de procesador
Memorias ram
Discos duros
Cualquier otro componente interno.
También damos asesoramiento personalizado sobre el tipo de hardware que más le convenga.
	</div>
	
</div>

<div  id= "pestana3" style='display:none;'>
	<div class="contenido">
		Asesoramos a nuestros clientes en cualquier ámbito informático, de esta forma podrá estar seguro de que tomará la mejor opción a su disposición.

También disponemos de asesoramiento web:
	
	

Dominio, hosting, configuración de cuentas e-mail personalizadas, instalación y configuración de wordpress.
</div>
</div>

<div id= "pestana4" style='display:none;'>
	<div class="contenido">
		
	

	Eliminamos la mayoría de amenazas que circulan por la red proporcionando al cliente la mejor opción a nuestra disposición de manera que pueda sentirse seguro con nosotros.
</div>
</div>

<div  id="pestana5" style='display:none;'>
	<div class="contenido">

		Montamos y configuramos equipos informáticos de sobremesa.También incluimos la instalación del software básico para el funcionamiento optimo del equipo.

Elaboramos un presupuesto personalizado con las indicaciones que el cliente nos proporcione y nos encargamos del montaje del equipo tanto de la instalación del sistema operativo elegido como los programas necesarios para su correcto funcionamiento.
		
	</div>
	
</div>


  </div>


  </div>
</div>
@include('pie')







