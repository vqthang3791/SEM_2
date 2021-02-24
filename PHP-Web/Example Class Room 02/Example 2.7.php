<?php
$count = 1;
while ($count <= 12) {
    echo "$count. times 12 is " . $count * 12 .  "<br>";
    ++$count;
}
echo "<br><br>";
for ($count = 1; $count <= 12; $count++) {
    echo "$count. times 12 is " . $count * 12 .  "<br>";
}
echo "<br><br>";

do {
    echo "$count. times 12 is " . $count * 12 .  "<br>";
    $count++;
} while ($count <= 12);
