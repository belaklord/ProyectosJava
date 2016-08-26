@include('cabecera')

<!--rutas relativas para acceder al css en esta vista no se ha encontrado 
otra forma ya que no está en el archivo de rutas , se accede desde la otroa vista blog -->
<link rel="stylesheet" href="../css/vistaBlog.css" />
<link rel="stylesheet" href="../css/cabecera.css">

<link rel="stylesheet" href="../css/tarifas.css" />
<link rel="stylesheet" href="../css/pie.css">

<script src="../js/cabecera.js" type="text/javascript"> </script> 



<script>
    
loading();
</script>


                @foreach ($result as $contacto) <!-- BUCLE QUE RECORRE LA TABLA PARA MOSTARAR LOS USUARIOS -->



<div id="pricing-table" class="clear">

<h3> {{ $contacto->titulo }}</h3> 
    
</div>

<div class="contenido" >

    <p>
    
 {{ $contacto->notes }}
    </p>

    <div>
          <img class="imagen-blog" src="{{ '../imagenes/blog/'.$contacto->foto }}" alt="">
    </div>


    

    </div>


       
                    @endforeach
                     
            
               {!! $result->render() !!}
    </div>

@include('pie')  
                    
                   
