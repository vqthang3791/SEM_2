<?php
$money = 1500;
$bank_balance = 3000;
$savings = 500;
// $money = ...
// $bank_balance = ...
if ($bank_balance < 1000) {
    $money = 500;
    $bank_balance += $money;
}
elseif ($bank_balance > 200) {
    $savings += 100;
    $bank_balance -= 100;
}
else {
    $savings += 50;
    $bank_balance -= 50;
}
// money =
// bank_balance =
// saving =
echo "Money: ".$money."<br>";
echo "Bank Balance: ". $bank_balance. "<br>";
echo "Savings: ".$savings."<br>";
?>