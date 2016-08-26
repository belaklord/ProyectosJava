



 <div class="panel-body">
<div class="container">
   <div class="col-md-8 col-md-offset-2">
            <div class="panel panel-primary">
                <div class="panel-heading">Nuevo Usuario</div>
                 <div class="panel-body">
                   @if(Session::has('message'))
                        
                        <p class="alert alert-success">
                        {{ Session::get('message') }}
                        </p>
                        @endif

    
                        <div class="form-group">
                          {{ Form::label('name', ' Nombre') }}
                          {{ Form::text('name', null, ['class' => 'form-control',
                          'placeholder' => 'Nombre']) }}
                          </div>

                          <div class="form-group">
                          {{ Form::label('apellidos', 'Apellidos') }}
                          {{ Form::text('apellidos', null, ['class' => 'form-control',
                          'placeholder' => ' Apellidos']) }}
                          </div>

                          <div class="form-group">
                          {{ Form::label('email', 'Correo electrónico') }}
                          {{ Form::text('email', null, ['class' => 'form-control',
                          'placeholder' => ' e-mail']) }}
                          </div>

                          <div class="form-group">
                          {{ Form::label('direccion', 'Direccion') }}
                          {{ Form::text('direccion', null, ['class' => 'form-control',
                          'placeholder' => 'Direccion']) }}
                          </div>


                          <div class="form-group">
                          {{ Form::label('password', 'Contraseña') }}
                          {{ Form::password('password', ['class' => 'form-control',
                          'placeholder' => ' password']) }}
                          </div>

                          <div class="form-group">
                          {{ Form::label('password', 'Repite Contraseña') }}
                          {{ Form::password('password_confirmation', ['class' => 'form-control',
                          'placeholder' => ' password']) }}
                          </div>
                            <!-- muestra el  captcha en el formulario -->
                         <div class="g-recaptcha" data-sitekey="6Lf16B8TAAAAAF54Imzsln1fkFZxb76ebFPAfHUZ"></div>


                 <button type="submit" class="btn btn-info">Registrar</button>

                        

                        </div>
                    