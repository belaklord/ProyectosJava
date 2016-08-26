
@include('cabecera')


<link rel="stylesheet" href="css/contacto.css" />
<script src='https://www.google.com/recaptcha/api.js'></script> <!-- script del captcha -->

@if (Auth::user())
   
    <div class="col-md-8 col-md-offset-2">
         <div class="panel panel-warning">

                <div class="panel-heading">Comentario</div>
                <div class="panel-body">

        {!! Form::open(array('url' => 'contacto/insertar')) !!}

        <p class="centrado">Dejanos un comentario y te responderemos los antes posible</p>

    <input type="hidden" class="form-control" name="id_usuario" value="{{auth::user()->id}}">

    {{ Form::textarea('comentario', null) }}

              <!-- muestra el  captcha en el formulario -->
        <div class="g-recaptcha" data-sitekey="6Lf16B8TAAAAAF54Imzsln1fkFZxb76ebFPAfHUZ"></div>

</div>
<button  type="submit" class="btn btn-warning btn-lg btn-block">Enviar Comentario</button>
</div>

</div>
</div>
{!! Form::close() !!}

@else


	<div class="col-md-8 col-md-offset-2">
		 <div class="panel panel-danger">

                <div class="panel-heading">Registro</div>
                <div class="panel-body">

                	<p class="centrado">Debes estar registrado para contactar con nosotros</p>

</div>

    </div>

        </div>
            </div>
@endif

</div>
@include('pie')





