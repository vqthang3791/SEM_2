<?php
$x = array();
$y = array();
echo 'array()'. '<=>'.'array()'.'Reaturns', $x <=> $y;
// This will oupt 0
echo '</br>';

$m = array(1,2, 3);
$n = array(1,2, 3);
$p = array(1,2, 1);
$q = array(1,2, 4);
echo 'array(1,2,3)'.' <=> '.' array (1,2,3) '.' Returns ', $m <=> $n;
// This will output 0
echo '</br>';
echo 'array(1,2,3)'.'<=>'.'array()'.' Returns ', $m <=> $x;
// This will oupt 1
echo  '</br>';
echo  'array(1,2,3)'.'<=>'.'array(1,2,4)'.' Returns ', $m <=> $q;
?>