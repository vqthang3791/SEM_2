<?php
require 'employee.php';

$employe1 = new employee("MAN10101", "Ho Va Ten 1", "Front-end Developer");
echo "MAN_NO: " . $employe1->getManNo() . "<br>";
echo "NAME: " . $employe1->getName() . "<br>";
echo "POSITION: " . $employe1->getPosition() . "<br>";
echo "<br>";

$employe2 = new employee("MAN10102", "Ho Va Ten 2", "Back-end Developer");
echo "MAN_NO: " . $employe2->getManNo() . "<br>";
echo "NAME: " . $employe2->getName() . "<br>";
echo "POSITION: " . $employe2->getPosition() . "<br>";
echo "<br>";

$employe3 = new employee("MAN10103", "Ho Va Ten 3", "Full-stack Developer");
echo "MAN_NO: " . $employe3->getManNo() . "<br>";
echo "NAME: " . $employe3->getName() . "<br>";
echo "POSITION: " . $employe3->getPosition() . "<br>";
echo "<br>";
?>
