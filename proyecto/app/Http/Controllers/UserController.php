<?php

namespace App\Http\Controllers;

/*para usar las validaciones de forma estática */

use Illuminate\Support\Facades\Validator;
/*USAMOS FACHADAS */
use Illuminate\Support\Facades\Request;
use App\Http\Requests;
use App\User;
use Illuminate\Support\Facades\Hash;
use DB;
/*uso de la clase captcha */
use ReCaptcha\ReCaptcha;


class UserController extends Controller
{
    

		 public function index()
    {

        return view('home');
    }


    public function insertar(Request $request){


        $data = $request::all();

			$rules = [
			'name' => 'required',
			'email' => 'required',
			'password' => 'confirmed', // busca un campo con _confirmation y lo compara //
			'direccion' => 'required',
			'apellidos' => 'required',
      'g-recaptcha-response'  => 'required' // comprueba el captcha //


			];



			 $validator = Validator::make($data, $rules);
			if($validator->fails()){
			return redirect()->back()->withErrors($validator->errors())->withInput($request::except('password'));
			}
			/*inserta los datos en caso correcto, si no muestra el formulario con errores */
				$user = new User($data);
				$user->save();


			$correo=$data['email'];

			$datos = array(
    
    		'correo' => $correo,
    
);

    	 //se envia el array y la vista lo recibe en llaves individuales {{ $email }} , {{ $subject }}...
       \Mail::send('emailRegistro', $datos ,function($message) use ($request)
       {


       	   $data = $request::all();

           $asunto ="Mensaje de bienvenida";
			
           //remitente
           $message->from('belaklord@gmail.com', 'Antonio Luis');
 
           //asunto
           $message->subject($asunto);


 
           //receptor
           $message->to($data['email'], env('CONTACT_NAME'));
 
       });	

			return view('vistaEmail');


    }

    public function password(){


    	return view('password');
    }



    public function recupera(Request $request){


      $data = $request::all();

    
      /*validamos los campos del formulario con el uso de fachadas */


      $rules = [
      'email' => 'required',
      

      ];

      $validator = Validator::make($data, $rules);
      if($validator->fails()){
      return redirect()->back()->withErrors($validator->errors())->withInput($request::except('password'));
      }

       $correo = $data['email']; //obtenemos el correo del usuario //
 
   
      $user = DB::table('users')->where('email', $correo)->first(); //consulta para sacar los datos del susuario por el email  //

      $id_usuario = $user->id; // obtenemos el email del usuario //

      $user = User::findOrFail($id_usuario);

      $hashed_random_password =str_random(8); //funcion numero aleatorio que se enviara por email y se guaradara en la base de datos //

      $user->password = $hashed_random_password;

      $user->save();  


      $datos = array(
    
        'correo' => $correo,
        'password' => $hashed_random_password, // contraseña nueva autogenerada
    
);


      

       //se envia el array y la vista lo recibe en llaves individuales {{ $email }} , {{ $subject }}...
       \Mail::send('plantillaPassword', $datos ,function($message) use ($request)
       {
           $data = $request::all();

           $asunto ="Recuperacion de contraseña";
      
           //remitente
           $message->from('info@belinker');
 
           //asunto
           $message->subject($asunto);


 
           //receptor
          $message->to($data['email'], env('CONTACT_NAME'));
 
 
       });  

      return redirect()->back();
      }



   

}



