@include('cabecera')


<link rel="stylesheet" href="css/adminUsers/usuarios.css">


   
        <div class="col-md-10 col-md-offset-1">
            <div class="panel panel-default">
                <div class="panel-heading">Entradas de blog</div>
                    <div class="panel-body">
                        @if(Session::has('message'))
                        
                        <p class="alert alert-success">
                        {{ Session::get('message') }}
                        </p>
                        @endif
                        <!--boton para crear nuevos usuarios -->
   
                   
             <!--tabla sacada de la web bootstrap/css-->
                <table class="table table-condensed">
                    <th class="success">ID </th>
                    <th class="success">TITULO</th>
                    <th class="success">FOTO</th>
                    <th class="success">TEXTO</th>
                    
                      <a class="btn btn-info" href="{{route('blogController.create')}}">Agregar Entrada</a>
 
                   

                      @foreach ($result as $usuario) <!-- BUCLE QUE RECORRE LA TABLA PARA MOSTARAR LOS USUARIOS -->
                    <tr>
                        
                       <td class="success">{{ $usuario->id }}</td>
                        <td class="warning">{{ $usuario->titulo }}</td>
                        <td class="warning">{{ $usuario->foto }}</td>
                        <td class="warning">{{ $usuario->notes }}</td>
                       
                        <td>
                         
                       
                        <a class="btn btn-danger" href="{{route('blogController.show', $usuario->id)}} ">Borrar</a>
 
                          
                       
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

