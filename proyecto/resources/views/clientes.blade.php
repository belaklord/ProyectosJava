@include('cabecera')

<link rel="stylesheet" href="css/servicios.css" />

<script src="js/servicios.js" type="text/javascript"></script>



<div class="titulo">
	<h3>Clientes</h3>
</div>


<div class="migaspan">

<ol class="breadcrumb">
  <li><a href="{{ url('/home') }}">HOME</a></li>
  <li class="active">CLIENTES</li>
</ol>
 

	
</div>


<div class="panel panel-default">


  <div class="panel-heading">
  	<h3>NUESTROS CLIENTES</h3>
  	<ul class="butons">
  	<li id ="tab_1" onclick="pestanas('tab_1')";> <a class="btn btn-default" >Librofutsal</a></li>
  	<li id ="tab_2" onclick="pestanas('tab_2')";> <a class="btn btn-default" >Unive Abogados</a> </li>

  	</ul>

  	


  </div>
  <div class="panel-body">

<div id= "pestana1" style='display:block;'>

	<div class="contenido">
		<p>

		“La táctica ofensiva en el futsal”
		 realizado por Antonio Luis Gallego.Veremos en los gráficos como las alas están en la situación más ventajosa que requiera la acción a realizar, 
		 al igual que cualquier otro jugador. Además, los movimientos y la colocación defensiva, en la mayoría de los casos, es referencial, 
		 con el objetivo de dejar claro aquello que queremos explicar desde el punto de vista ofensivo…
		 
		</p>
 		

	</div>
	
</div>


<div  id= "pestana2" style='display:none;'>
	<div class="contenido">

		<p>
		Se constituye como una red de despachos de ámbito nacional, 
		con amplia presencia territorial, que cuenta con un grupo de profesionales de gran nivel, 
		especializados en el ejercicio diario de la abogacía, 
		y que cumplen con todos los requisitos que en la actualidad pueden exigirse 
		a una firma multidisciplinar de calidad.
		</p>

	</div>
	
</div>



<div id= "pestana4" style='display:none;'>
	<div class="contenido">
		
	Eliminamos la mayoría de amenazas que circulan por la red proporcionando al cliente la mejor opción 
	a nuestra disposición de manera que pueda sentirse seguro con nosotros.

</div>
</div>




  </div>


  </div>
</div>
@include('pie')