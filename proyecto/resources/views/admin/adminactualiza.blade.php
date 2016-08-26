

<div class="panel-body">
<div class="container">
   <div class="col-md-8 col-md-offset-2">
            <div class="panel panel-primary">
                <div class="panel-heading">Actualizar Usuario</div>
                 <div class="panel-body">

                        
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
                         
                          {{ Form::hidden('user_id', Auth::user()->id, ['class' => 'form-control']) }}
                          </div>

                          
                    <button type="submit" class="btn btn-info">Actualiza</button>

                        </div>
                    