

@include('cabecera')

<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="css/app.css" />
<script src="http://code.jquery.com/jquery-latest.min.js" type="text/javascript"></script>
<script src="js/coockies.js" type="text/javascript"></script>


   
<div id="overbox3">
    <div id="infobox3">
        <p>Esta web utiliza cookies para obtener datos estadísticos de la navegación de sus usuarios. Si continúas navegando consideramos que aceptas su uso.
        <a href="politica-privacidad.php">Más información</a>
        <a onclick="aceptar_cookies();" style="cursor:pointer;">X Cerrar</a></p>
    </div>
</div>
 
<div id="myCarousel" class="carousel slide" data-ride="carousel">
  <!-- Indicators -->
  <ol class="carousel-indicators">
    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
    <li data-target="#myCarousel" data-slide-to="1"></li>
    <li data-target="#myCarousel" data-slide-to="2"></li>
    <li data-target="#myCarousel" data-slide-to="3"></li>
  </ol>

  <!-- Wrapper for slides -->
  <div class="carousel-inner" role="listbox">
    <div class="item active">
      <img src="imagenes/slider3.jpg" alt="Chania">
      <div class="carousel-caption">
        <h3>Belinker</h3>
        <p>Soluciones informáticas</p>
      </div>
    </div>

    <div class="item">
      <img src="imagenes/slider2.jpg" alt="Chania">
      <div class="carousel-caption">
        <h3>Belinker</h3>
        <p>Hardware y Software</p>
      </div>
    </div>

    <div class="item">
      <img src="imagenes/fondoslider.jpg" alt="Flower">
      <div class="carousel-caption">
        <h3>Belinker</h3>
        <p>Servicio téctnico a domicilio</p>
      </div>
    </div>

    
  </div>

  <!-- Left and right controls -->
  <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>

 
   
   <div class="iconos">

     <div class="caption2">
        
<a href="{{ url('/servicios') }}" class="benefits-grid-ico fadeInDown animate-element animation-triggered start-animation">

       <img src="imagenes/settings-icon.png" alt=""></a> 

              <h4>Servicios</h4>

                <p>Infórmate de nuestros servicios <br>
                  y de las soluciones que ofrecemos.</p>

         

      </div>
        

         <div class="caption2">

         <a href="{{ url('/contacto') }}" class="benefits-grid-ico fadeInDown animate-element animation-triggered start-animation">  

           <img src="imagenes/pen-icon.png" alt=""></a> 


        <h4>Comentarios</h4>

        <p>Déjanos tu opinión sobre la calidad <br>
          y eficiencia de nuestros servicios.</p>



      </div>

       <div class="caption2">


         <a href="{{ url('clientes') }}" class="benefits-grid-ico fadeInDown animate-element animation-triggered start-animation" > 

           <img src="imagenes/people-icon.png" alt=""></a> 
          
          <div class="clientes">
             <h4>Clientes</h4>

           <p>infórmate de las empresas que <br>
            contratan nuestros servicios.</p>
          </div>
          

         </div>

        <div class="caption2">

        <a href="{{ url('blog') }}" class="benefits-grid-ico fadeInDown animate-element animation-triggered start-animation"> 

            <img src="imagenes/pointer-2-icon.png" alt=""></a> 
          
          <div class="blog">
            <h4>Blog</h4>

            <p>Visita nuestros últimos trabajos <br>
              y entradas.</p>
          </div>
            

     

</div>
            

   </div>

     <div class="espacio">
       
     </div>
    



  <a class="twitter-timeline" href="https://twitter.com/belinker_es" data-widget-id="711928724225187840">Tweets por el @belinker_es.</a>
<script>

!function(d,s,id){var js,fjs=d.getElementsByTagName(s)[0],p=/^http:/.test(d.location)?'http':'https';

if(!d.getElementById(id)){js=d.createElement(s);js.id=id;js.src=p+"://platform.twitter.com/widgets.js";

fjs.parentNode.insertBefore(js,fjs);

}}(document,"script","twitter-wjs");

</script>
 
</div>


</div>

</div>



     </div>

@include('pie')
