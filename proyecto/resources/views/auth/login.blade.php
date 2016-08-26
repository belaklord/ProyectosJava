

@include('cabecera')

<link rel="stylesheet" href="css/login.css"/>
<script src='https://www.google.com/recaptcha/api.js'></script> <!-- script del captcha -->

<div class="container">


        <div class="col-md-8 col-md-offset-2">
            <div class="panel panel-primary">
                <div class="panel-heading">Login de usuario</div>
                <div class="panel-body">
                    @include('plantillasComunes.errores')
                    <form class="form-horizontal" role="form" method="POST" action="{{ url('/login') }}">
                        {!! csrf_field() !!}

                        <div class="form-group{{ $errors->has('email') ? ' has-error' : '' }}">
                            <label class="col-md-4 control-label">Direccion de email</label>

                            <div class="col-md-6">
                                <input type="email" class="form-control" name="email" value="{{ old('email') }}">

                                @if ($errors->has('email'))
                                    <span class="help-block">
                                        <strong>{{ $errors->first('email') }}</strong>
                                    </span>
                                @endif
                            </div>
                        </div>

                        <div class="form-group{{ $errors->has('password') ? ' has-error' : '' }}">
                            <label class="col-md-4 control-label">Contraseña</label>

                            <div class="col-md-6">
                                <input type="password" class="form-control" name="password">

                                @if ($errors->has('password'))
                                    <span class="help-block">
                                        <strong>{{ $errors->first('password') }}</strong>
                                    </span>
                                @endif
                            </div>
                        </div>

                        <div class="form-group">
                            <div class="col-md-6 col-md-offset-4">
                                <div class="checkbox">
                                    <label>
                                        <input type="checkbox" name="remember"> Recordar
                                    </label>
                                </div>
                            </div>
                        </div>
                        
  <!-- muestra el  captcha en el formulario -->
                         <div class="g-recaptcha" data-sitekey="6Lf16B8TAAAAAF54Imzsln1fkFZxb76ebFPAfHUZ"></div>
                        <div class="form-group">
                            <div class="col-md-6 col-md-offset-4">

                                <button type="submit" class="btn btn-primary">
                                    <i class="fa fa-btn fa-sign-in"></i>Logearse
                                </button>

                                <a class="btn btn-link" href="{{ url('/password') }}">Olvidaste tu password?</a>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>

    </div>

</div>

@include('pie')
</div>
</html>
