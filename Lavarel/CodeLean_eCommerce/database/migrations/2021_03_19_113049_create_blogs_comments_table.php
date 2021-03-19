<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

class CreateBlogsCommentsTable extends Migration
{
    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        Schema::create('blogs_comments', function (Blueprint $table) {
            $table->id();

            $table->integer('blog_id')->unsigned();
            $table->integer('user_id')->unsigned()->nullable();
            $table->string('email');
            $table->string('name');
            $table->string('message');

            $table->timestamps();
        });
    }

    /**
     * Reverse the migrations.
     *
     * @return void
     */
    public function down()
    {
        Schema::dropIfExists('blogs_comments');
    }
}
