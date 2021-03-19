<?php

namespace App\Http\Controllers\Front;

use App\Http\Controllers\Controller;
use App\Models\Blog;
use App\Models\Product;
use Illuminate\Http\Request;

class HomeController extends Controller
{
    //
    public function index()
    {

        $menProducts = Product::where('featured', true)->where('product_category_id', 1)->get();
        $womenProducts = Product::where('featured', true)->where('product_category_id', 2)->get();

//        return view('front.index');

        $blogs = Blog::orderBy('id', 'desc')->limit(3)->get();
//        dd($menProducts);
//        return view('front.index', compact('menProducts', 'womenProducts'));
        return view('front.index', compact('menProducts', 'womenProducts', 'blogs'));
    }
}
