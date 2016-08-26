@include('cabecera')


<link rel="stylesheet" href="css/adminUsers/usuarios.css">


   
        <div class="col-md-10 col-md-offset-1">
            <div class="panel panel-default">
                <div class="panel-heading">Usuarios</div>
                    <div class="panel-body">
                        @if(Session::has('message'))
                        
                        <p class="alert alert-success">
                        {{ Session::get('message') }}
                        </p>
                        @endif
                        <!--boton para crear nuevos usuarios -->
   
                   
  			 <!--tabla sacada de la web bootstrap/css-->
                <table class="table table-condensed">
                    <th class="success">ID contacto</th>
                    <th class="success">NOMBRE</th>
                    <th class="success">EMAIL</th>
                    <th class="success">Telefono</th>
                    <th class="success">Dirección</th>
                   

                      @foreach ($result as $usuario) <!-- BUCLE QUE RECORRE LA TABLA PARA MOSTARAR LOS USUARIOS -->
                    <tr>
                        
                       <td class="success">{{ $usuario->id }}</td>
                        <td class="warning">{{ $usuario->name }}</td>
                        <td class="warning">{{ $usuario->apellidos }}</td>
                        <td class="warning">{{ $usuario->email }}</td>
                        <td class="warning">{{ $usuario->direccion }}</td>
                        <td>
                         
                         <a class="btn btn-info" href="{{route('usuarios.edit', $usuario->id)}}">Editar</a>
 
                        <a class="btn btn-danger" href="{{route('usuarios.show', $usuario->id)}} ">Borrar</a>
 
                          
                       
                        </td>
                    </tr>
                    @endforeach
                   
                </table>

                    {!! $result->render() !!}



                    </div>
            </div>
        </div>
    
</div>



@include('pie')

