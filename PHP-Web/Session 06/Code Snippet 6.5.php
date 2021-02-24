<?php
// Declaring and assigning value to variables
$int1 = 68;
$int2 = 50;
// Creating a function
function division() {
    global $int1, $int2;
    // Storing the result in a variable
    $int3 = $int1 / $int2;
    // Displaying text
    echo "The quotitent for $int1 / $int2 = $int3";
}
// Calling the function
division();
?>