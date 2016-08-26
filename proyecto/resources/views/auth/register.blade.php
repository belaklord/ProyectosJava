

@include('cabecera')



@if(Auth::user())

<link rel="stylesheet" href="../../css/registro.css">
<link rel="stylesheet" href="../../css/cabecera.css" />
<link rel="stylesheet" href="../../css/pie.css" />
<script src="../../js/cabecera.js" type="text/javascript"> </script> 



<script>
	
loading();
</script>



<div class="col-md-10 col-md-offset-1">

{{ Form::model($user, ['route' => ['usuarios.update',$user->id], 'method' => 'PUT']) }}

 
        

                @include('plantillasComunes.actualiza')

                {{ Form::close() }}

</div>
@else


 
<link rel="stylesheet" href="css/cabecera.css" />
<link rel="stylesheet" href="css/pie.css" />
<link rel="stylesheet" href="css/registro.css">
	
<script src='https://www.google.com/recaptcha/api.js'></script> <!-- script del captcha -->

<div class="col-md-10 col-md-offset-1">

{{ Form::open(array('url' => 'User/insertar')) }}


                @include('plantillasComunes.registro')




{{ Form::close() }}

</div>
@endif


    				</div>
                </div>
            </div>
        </div>
    </div>

</div>

<!-- en cada include del pie añadir una etiqueta de cierre de div -->
</div>


    
</html>
@include('pie')