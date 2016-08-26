<?php

namespace App\Http\Controllers;



use App\Http\Requests;

use App\User;

use Illuminate\Support\Facades\Request;
use App\Http\Requests\EditUserRequest;

/*uso de fachadas para usar la clase sesion 
	para informar de los cambios al usuario */
use Illuminate\Support\Facades\Session;

class usuariosController extends Controller
{
   


public function edit($id){

	$user = User::findOrFail($id);  // findorfail busca el usuario con esa id si no lo encuentra lanza error 404 
	return view('auth.register', compact('user')); // le pasa a la vista de edicion los datos del usuario a editar
}


public function update(Request $request, $id)
{



			$user = User::findOrFail($id);
			$user->fill(Request::all());
			$user->save();
			Session::flash('message', 'El registro ha sido Actualizado'); // informa al usuario del cambio ralizado//
			return redirect()->back();


}

public function show($id){

User::destroy($id);
Session::flash('message', 'El registro ha sido eliminado'); // informa al usuario del cambio ralizado//
return redirect()->back();


}


   

}



