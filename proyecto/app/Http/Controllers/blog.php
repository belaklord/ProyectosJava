<?php

namespace App\Http\Controllers;


use App\Http\Requests;


/*USAMOS FACHADAS */
use Illuminate\Support\Facades\Request;

use App\vistaBlog;

use DB;

class blog extends Controller
{
    

public function index()
{



	$result = \DB::table('blog', 'blog')
     		->select('blog.titulo', 'blog.foto', 'blog.notes', 'id')
     		->orderBy('id')
     		->paginate(10);


     		
 return view('blog', compact('result', $result));
}


public function create(Request $Request){



$result = \DB::table('blog', 'blog')
     		->select('blog.titulo', 'blog.foto', 'blog.notes', 'id')
			->orderBy('id')
			->paginate(1);
     		 ;

  

 return view('adminvistaBlog', compact('result', $result));

}


}
