<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

class Blog extends Model
{
   

    public $timestamps = false;

    protected $table = 'Blog';

    /**
     * The attributes that are mass assignable.
     *
     * @var array
     */

	protected $fillable = [
       'titulo',  'notes',  'foto','id'
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
