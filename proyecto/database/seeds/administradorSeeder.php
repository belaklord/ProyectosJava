<?php

use Illuminate\Database\Seeder;


class administradorSeeder extends Seeder
{
    /**
     * Run the database seeds.
     *
     * @return void
     */
    public function run()
    {



    	 DB::table('users')->insert([
            'name' => 'antonio luis',
            'email' => 'belaklord@gmail.com',
            'password' => bcrypt('1234'),
            'direccion' => 'test@domain.com',
            'apellidos' => 'gallego',
        	'tipo' => 'admin'
        ]);


   }

}
