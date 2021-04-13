<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Models\Product;

class ProductControl extends Controller
{
    //
    public function addProducts()
    {
        $product = [
            ["name" => "phone"],
            ["name" => "Tablet"],
            ["name" => "Laptops"],
            ["name" => "Watch"],
            ["name" => "Television"],
            ["name" => "Freeze"],
        ];

        $product::insert($product);
        return "Product ok";
    }

    public function search()
    {
        return view('search');
    }

    public function autocomplete(Request $request)
    {
        $data = Product::select("name")
            ->where("name", "LIKE", "%{$request->terms}%")
            ->get();
        return response()->json($data);
    }
}
