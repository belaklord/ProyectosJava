<?php

use Illuminate\Database\Seeder;

class blogSeeder extends Seeder
{
    /**
     * Run the database seeds.
     *
     * @return void
     */
    public function run()
    {
       


        DB::table('blog')->insert([
            'titulo' => 'Limpieza y reparación de arranque (SONY VAIO)',
            'notes' => 'Solucionado el problema de arranque de windows y posterior limpieza interna del mismo para evitar el sobrecalentamiento.SOLUCIONADO POR BELINKER',
            'foto' => 'sony.jpg'
            
        ]);


        DB::table('blog')->insert([
            'titulo' => 'LG Rolly: Teclado Bluetooth enrollable',
            'notes' => 'Dotado de la tecnología Bluetooth para su conexión a cualquier equipo, smartphone o tablet, y alimentado por una única batería en forma de una pila AAA que promete 3 meses de autonomía, nos encontramos con un teclado físico QWERTY que se puede enrollar para ocupar el mínimo espacio posible, estando acompañado de una base que se podrá abrir para colocar encima una tablet y tener un pequeño equipo portátil con el que poder escribir de una forma mucho más rápida y cómoda.',
            'foto' => 'lg.jpg'
            
        ]);



        DB::table('blog')->insert([
            'titulo' => 'Samsung tiene el primer reproductor Ultra HD Blu-ray',
            'notes' => 'Samsung mostró en la IFA 2015 el que se trata del primer reproductor Ultra HD Blu-ray del mercado, el cual permite reproducir este nuevo formato de vídeo que es capaz de reproducir películas a una resolución cuatro veces superior respecto a los reproductores Blu-ray tradicionales con con 64 veces “más alta expresión del color” (paleta de color de 10 bits vs 8 bits).',
            'foto' => 'Samsung-Ultra-HD-Blu-ray-1-740x403.jpg'
            
        ]);



        DB::table('blog')->insert([
            'titulo' => 'Google renueva por completo su imagen con un nuevo logotipo, cuatro puntos y un icono',
            'notes' => 'El famoso buscador está hoy de estreno. La cuenta Google Design presentaba hace unos minutos la nueva imagen de Google, con un logotipo renovado y la puesta en marcha, por primera vez, de un icono -una letra G, concretamente- para identificar a la compañía.',
            'foto' => 'google.png'
            
        ]);



        DB::table('blog')->insert([
            'titulo' => 'Nvidia lanza los controladores GeForce 355.82 WHQL',
            'notes' => 'Nvidia lanzó en el día de hoy los controladores gráficos GeForce 355.82 WHQL de la serie Game Ready, esto se traduce en simplemente dotar de compatibilidad a los nuevos juegos Triple A que llegan al mercado. Es por ello que ahora las gráficas GeForce ofrecerán soporta al juego Metal Gear Sold V: The Phantom Pain junto a Mad Max, incluye soporte tanto mono-GPU como Multi-GPU (SLI) y configuraciones optimizadas por medio del software GeForce Experience.Por otro lado, se añaden/mejoras perfiles SLI para Batman: Arkham Knight, DMC 4 Special Edition, Rocket League, y World of Tanks. Todas estas mejoras son para Windows 10. Puedes descargarlos desde el siguiente enlace o por medio de GeForce Experience.',
            'foto' => 'nvidia_logo31.jpg'
            
        ]);


    }
}
