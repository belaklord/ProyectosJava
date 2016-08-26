<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

class contact extends Model
{
    /**
     * The attributes that are mass assignable.
     *
     * @var array
     */
    protected $fillable = [
        'id_usuario', 'comentario','cabecera',
    ];

    /**
     * The attributes excluded from the model's JSON form.
     *
     * @var array
     */
    protected $hidden = [
         'remember_token',
    ];




}
