<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

use App\Http\Requests;

class UsersController extends Controller
{
    

     public function index()
    {

    	$result = \DB::table('users', 'users')
     		->select('users.name', 'users.apellidos', 'users.email', 'direccion', 'id')
     		->orderBy('id')
     		->paginate(5);


        return view('admin.adminUsers', compact('result', $result));
    }


}
