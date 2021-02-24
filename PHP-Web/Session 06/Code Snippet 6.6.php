<?php
// Creating a Function
function decrement() {
    // Declaring the Variable and assigning the Value
    static  $static_int1 = 99;
    // Decrementing the Value
    $static_int1--;
    // Displaying the Value
    echo "The decrement value is $static_int1";
}
// Calling the Function
decrement();
?>
