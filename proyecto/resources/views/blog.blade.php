
@include('cabecera')

<link rel="stylesheet" href="css/blog.css">



<?php 

$page = 1;
 ?>
@foreach ($result as $contacto) <!-- BUCLE QUE RECORRE LA TABLA PARA MOSTARAR LOS USUARIOS -->


<div class="articulo" id="efecto">

	<article>
	
<div class="contenido">

	<?php 

	echo "<a href= 'http://localhost/proyecto/public/blog/create?page= $page' > ";
	
	
 	
	 ?>
	<!-- añadir referencia para que se muestre la imagen en grande -->

<img class="imagen-blog" src="{{ 'imagenes/blog/' .$contacto->foto }}" alt=""></a>

<div class="texto">
<?php 

	echo "<a href= 'http://localhost/proyecto/public/blog/create?page= $page' > $contacto->titulo</a>";
	
	$page ++;
 	
	 ?>
	
	

</div>

</div>


</div>


@endforeach


</div>

@include('pie')