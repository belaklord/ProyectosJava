


@include('cabecera')

<link rel="stylesheet" href="css/password.css" />

<script src='https://www.google.com/recaptcha/api.js'></script> <!-- script del captcha -->

<div class="col-md-8 col-md-offset-2">
            <div class="panel panel-primary">
                <div class="panel-heading">Recuperar contraseña</div>
                <div class="panel-body">
                    @include('plantillasComunes.errores')
                        <form class="form-horizontal" role="form" method="POST" action="{{ url('User/recupera') }}">
                        {!! csrf_field() !!}

                         <div class="form-group{{ $errors->has('password') ? ' has-error' : '' }}">

                         
                            <label class="col-md-4 control-label">Introduce tu email</label>


                          

                            <div class="col-md-6">
                                <input type="email" class="form-control" name="email" value="{{ old('email') }}">

                                <label>

                                    <p class="centrado">La nueva contraseña se envíara a tu email</p>
                                    
                                </label>

                            </div>
                        </div>
                         <!-- muestra el  captcha en el formulario -->
        <div class="g-recaptcha" data-sitekey="6Lf16B8TAAAAAF54Imzsln1fkFZxb76ebFPAfHUZ"></div>
  
                        <div class="form-group">
                            <div class="col-md-6 col-md-offset-4">
                                <button type="submit" class="btn btn-primary">
                                    <i class="fa fa-btn"></i>Recuperar
                                </button>

                               
                            </div>
                        </div>
                    </form>
                </div>
                </div>
                </div>
                </div>


@include('pie')