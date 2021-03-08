<?php

use Illuminate\Support\Facades\Route;

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| contains the "web" middleware group. Now create something great!
|
*/

Route::get('/', function () {
    return view('welcome');
});

Route::get('/insert', function () {
    $insert = DB::table('practice')->insert([
        ['name'=>'An', 'age'=>18, 'address'=>'100 Hang Bac', 'telephone'=>'0945521195'],
        ['name'=>'Toan', 'age'=>19, 'address'=>'100 Hang Be', 'telephone'=>'0945123123'],
    ]);
    echo 'Inserted Successfully';
});

Route::get('/display', function () {
    $students = DB::select('select * from practice');
    foreach ($students as $student) {
        echo 'ID: '. $student->id . '&nbsp;&nbsp;&nbsp;&nbsp;Name:' . $student->name .
            '&nbsp;&nbsp;&nbsp;&nbsp;Age:' . $student->age .
            '&nbsp;&nbsp;&nbsp;&nbsp;Address:' . $student->address .
            '&nbsp;&nbsp;&nbsp;&nbsp;Telephone' . $student->telephone . '<br>';
    }
});
