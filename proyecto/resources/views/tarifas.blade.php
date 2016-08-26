
@include('cabecera')

<link rel="stylesheet" href="css/tarifas.css" />

<script src='https://www.google.com/recaptcha/api.js'></script> <!-- script del captcha -->
<script src="js/tarifas.js" type="text/javascript"></script>

@if (Auth::user())

<div id="pricing-table" class="clear">

	<h3>NUESTRAS TARIFAS</h3>
</div>

<div class="migaspan">
<ol class="breadcrumb">
  <li><a href="{{ url('/home') }}">HOME</a></li>
  <li class="active">TARIFAS</li>
</ol>

</div>
<div id="pricing-table" class="clear">

	<h4>*Los precios pueden variar al alza o la baja, según el tipo de reparación.</h4>
	<br>
    <div class="plan">
        <h3>Control remoto<span>15&#8364;/h</span></h3>
        <a href="#precio" class="signup" id ="tab_1" onclick="pestanas('tab_1')";>Contratar</a>     
        <ul>
            <li>
            	<h4><b>Reparaciones por control remoto con teamviewer</b> </h4>
            </li>
            		
        </ul> 
    </div>
    <div class="plan" id="most-popular">
       <h3>Precio por hora<span>20&#8364;</span></h3>
        <a href="#precio" class="signup"id ="tab_2" onclick="pestanas('tab_2')";>Contratar</a>     
        <ul>
          <h4><b> A domicilio: Precio/hora 20&#8364;</b> </h4>


            			
        </ul>    
    </div>
    <div class="plan">
         <h3>Siguientes horas<span>15&#8364;</span></h3>
		
        <ul>
            <li>
            	<h4><b>Después de la primera hora, las siguientes a 15€.</b> </h4>
            </li>
           		
        </ul>
    </div>
    <div class="plan">
        <h3>Fracciones de 30 minutos<span>10&#8364;</span></h3>
       		
        <ul>
            <li>
            	<h4><b>Cualquier reparación que supere el tiempo estipulado.</b> </h4>
            </li>
            		
        </ul>
    </div> 	
</div>

    
    <div class="col-md-8 col-md-offset-2" id= "pestana1" style='display:none;' >
         <div class="panel panel-warning">

                <div class="panel-heading">Comentario</div>
                <div class="panel-body">


        {!! Form::open(array('url' => 'contacto/insertar')) !!}

        <p id="precio" class="centrado">Dejanos la descripcion de tu problema y te responderemos los antes posible</p>
        <br>
            

            <p class="centrado" id="remoto" style='display:none;'>Ha elegido reparacion por control remoto</p>


            <p class="centrado" id="estandard" style='display:none;'>Ha elegido reparacion estandar</p>


    <input  type="hidden" class="form-control" name="id_usuario" value="{{auth::user()->id}}">
     <input type="hidden" class="form-control" name="cabecera" value="Peticion de Reparacion">

    {{ Form::textarea('comentario', null ) }}
<!-- muestra el  captcha en el formulario -->
    <div class="g-recaptcha" data-sitekey="6Lf16B8TAAAAAF54Imzsln1fkFZxb76ebFPAfHUZ"></div>
</div>
  
<button  type="submit" class="btn btn-warning btn-lg btn-block">Enviar Consulta</button>
</div>

</div>
</div>
{!! Form::close() !!}



            @else


            <div class="col-md-8 col-md-offset-2" >
         <div class="panel panel-danger">

                <div class="panel-heading">Registro</div>
                <div class="panel-body">

                    <p class="centrado">Debes estar registrado para poder elegir tu tarifa</p>

</div>

    </div>

        </div>
            </div>
            @endif

</div>

@include('pie')