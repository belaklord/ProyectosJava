<?php

use Illuminate\Database\Seeder;

class DatabaseSeeder extends Seeder
{
    /**
     * Run the database seeds.
     *
     * @return void
     */
    public function run()
    {
        $this->call(administradorSeeder::class); // llama a la clase que hara los seeders //
         $this->call(blogSeeder::class); // llama a la clase que hara los seeders //
    }
    
}
