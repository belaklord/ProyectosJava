<!DOCTYPE html>
<html lang="en">
<head >
   <link rel="stylesheet" href="css/cabecera.css" />
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.5.2/jquery.min.js"></script> 
    

    <title>Belinker</title>
     
  

   <script src="js/cabecera.js" type="text/javascript"> </script>  

   <script>


/* llamada a la funcion de carga y activacion de botones */

loading();

   </script>

<!--div que permite la imagen de carga-->

<div id="carga" >
  
</div>


    <!-- Fonts -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.4.0/css/font-awesome.min.css" rel='stylesheet' type='text/css'>
    <link href="https://fonts.googleapis.com/css?family=Lato:100,300,400,700" rel='stylesheet' type='text/css'>
  

    <!-- Styles -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
    



 <body id="app-layout"> <!-- carga la funcion de activar botones del menu -->

<nav class="navbar navbar-inverse navbar-static-top">
        <p class="navbar-text">

    @if(Auth::user())

            Conectado como {{Auth::user()->name}}

        @else
        
            No estas autenticado
    @endif

        </p>

         <p class="navbar-text">
          info@belikner.es
         </p>

        <div class="container">
            <div class="navbar-header">

                <!-- Collapsed Hamburger -->
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#app-navbar-collapse">
                    <span class="sr-only">Toggle Navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>

                <!-- Branding Image -->
                <a class="navbar-brand" href="{{ url('/home') }}">
                    Belinker
                </a>
            </div>



            <div class="collapse navbar-collapse" id="app-navbar-collapse">
                <!-- Left Side Of Navbar -->
              

                <!-- Right Side Of Navbar -->
                <ul class="nav navbar-nav navbar-collapse ">
                    <!-- Authentication Links -->
                    @if(Auth::user())

                    <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">
                                {{ Auth::user()->name }} <span class="caret"></span>
                            </a>

                            <ul class="dropdown-menu" role="menu">
                                <li><a href="{{ url('/logout') }}"><i class="fa fa-btn fa-sign-out"></i>Salir</a></li>
                            </ul>
                      
                      </li>
                    @else
                        <ul class=" nav navbar-nav login">
                            <li ><a href="{{ url('/login') }}">Logeate</a></li>
                        <li ><a href="{{ url('/register') }}">Registrate</a></li>

                         <a  href="https://www.facebook.com/Belinker.es?fref=ts" target="_blank"> <i class="fa fa-facebook-square fa-2x"></i></a>
                    <a  href="https://twitter.com/belinker_es" target="_blank"><i class="fa fa-twitter-square fa-2x"></i></a>
                        </ul>
                      
                        
                    @endif


                </ul>

            </div>
        </div>
         </nav>

          <div class="row">
  

    <div class="cabecera">

       
<a href="{{ url('/home') }}"><img class="logo" src="http://belinker.es/wp-content/uploads/2015/07/belinker2.png" alt="belinker"></a>


<ul class="nav nav-pills">
  <li id="tab_1"><a href="{{ url('/home') }}">INICIO</a></li>
  <li id="tab_2"><a  href="{{ url('/servicios') }}">SERVICIOS</a></li>
  <li id="tab_3"><a href="{{ url('/tarifas') }}">TARIFAS</a></li>
  <li id="tab_4"><a href="{{ url('/belinker') }}">BELINKER</a></li>
  <li id="tab_5"><a href="{{ url('blog') }}">BLOG</a></li>
  <li id="tab_6"><a href="{{ url('/contacto') }}">CONTACTO</a></li>
  @if(Auth::user())
  @if(Auth::user()->tipo == 'admin')
<li>
 
  <button type="button" class="btn btn-danger">Configuración</button>
  <button type="button" class="btn btn-danger dropdown-toggle"
          data-toggle="dropdown">
    <span class="caret"></span>
    <span class="sr-only">Desplegar menú</span>
  </button>

  <ul class="dropdown-menu" role="menu">
    <li ><a href="{{ url('/adminUser')}}">Usuarios</a></li>
    <li><a href="{{ url('/adminBlog')}}">Blog</a></li>

  </ul>

   </li>

  @endif
  @endif


</ul>

    </div>
 
        </body>



           


         






