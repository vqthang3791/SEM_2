<?php
require 'Animal.php';
require 'Cow.php';
require 'Lion.php';
$cow_01 = new Cow_01('Herbivore', 'Grass');
$lion_01 = new Lion_01('Canirval', 'Meat');
echo '<b>Cow Object</b> <br>';
echo 'The Cow belongs to the ' . $cow_01->getFamily() . ' family and eats ' . $cow_01->getFood() . '<br><br>';
echo '<b>Lion Object</b> <br>';
echo 'The Lion belongs to the ' . $lion_01->getFamily() . ' family and eats ' . $lion_01->getFood();
?>