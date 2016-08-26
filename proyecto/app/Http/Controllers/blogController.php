<?php

namespace App\Http\Controllers;

/*para usar las validaciones de forma estática */

use Illuminate\Support\Facades\Validator;

use App\Http\Requests;
/*usamos la clase edicion request para las validaciones de la edicion del usuario*/

use App\Http\Requests\EditUserRequest;


use App\Http\Controllers\Controller;

/*USAMOS FACHADAS */
use Illuminate\Support\Facades\Request;


/*PARA USAR EL ORM ELOQUENT Y HACER LAS CONSULTAS A LA BASE DE DATOS
INTERACTUANDO CON EL MODELO */

use App\Blog;
/*uso de fachadas para usar la clase sesion 
	para informar de los cambios al usuario */
use Illuminate\Support\Facades\Session;

class blogController extends Controller
{
    

public function index()
{



	$result = \DB::table('blog', 'blog')
     		->select('blog.titulo', 'blog.foto', 'blog.notes', 'id')
     		->orderBy('id')
     		->paginate(10);


      return view('admin.adminBlog', compact('result', $result));


}

 public function store(Request $request){


			$data = $request::all();


			$rules = [
			'titulo' => 'required',
			'notes' => 'required',
			'foto' => 'required|string:value',
			

			];

			$validator = Validator::make($data, $rules);
			if($validator->fails()){
			return redirect()->back()->withErrors($validator->errors())->withInput($request::except('password'));
			}
			/*inserta los datos en caso correcto, si no muestra el formulario con errores */
			$user = new Blog($data);
			$user->save();
			Session::flash('message', 'El registro ha sido Insertado'); // informa al usuario del cambio ralizado//
			return redirect()->back();



}



public function create(){

	
	return view('gestionBlog'); 
}

public function show($id){

Blog::destroy($id);
Session::flash('message', 'El registro ha sido eliminado'); // informa al usuario del cambio ralizado//
return redirect()->back();


}
}