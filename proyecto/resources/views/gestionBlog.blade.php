@include('cabecera')

<link rel="stylesheet" href="../css/adminblog/entradas.css">
<link rel="stylesheet" href="../css/cabecera.css">
<link rel="stylesheet" href="../css/pie.css">
<script src="../js/cabecera.js" type="text/javascript"> </script>




<script>
    
loading();
</script>

<div id="pricing-table" class="clear">
<h1>Crear Entrada</h1>
</div>



<div class="container">


        <div class="col-md-8 col-md-offset-2">
            <div class="panel panel-primary">
                <div class="panel-heading">Entrada de blog</div>
                <div class="panel-body">
                    @include('plantillasComunes.errores')
                    <form class="form-horizontal" role="form" method="POST" action="{{ url('/entradaBlog') }}"> <!-- SE VA A LA CARPETA ADMIN AL CONROLADOR BLOGCONTROLLER AL METODO STORE -->
                        {!! csrf_field() !!}

                        <div class="form-group{{ $errors->has('titulo') ? ' has-error' : '' }}">
                            <label class="col-md-4 control-label">Título</label>

                            <div class="col-md-6">
                                <input type="text" class="form-control" name="titulo" value="{{ old('titulo') }}">

                                @if ($errors->has('titulo'))
                                    <span class="help-block">
                                        <strong>{{ $errors->first('titulo') }}</strong>
                                    </span>
                                @endif
                            </div>
                        </div>

 							<label class="col-md-4 control-label">Texto</label>

                        {{ Form::textarea('notes') }}

                            <label class="col-md-4 control-label">Imagen</label>

                        {{ Form::file('foto') }}

                        <div class="form-group">
                            <div class="col-md-6 col-md-offset-4">

                                <button type="submit" class="btn btn-primary">
                                    <i class="fa fa-btn fa-sign-in"></i>Insertar
                                </button>

                               
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>

    </div>

</div>

@include('pie')