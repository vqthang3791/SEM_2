<?php

class Animal_01
{
    private $family;
    private $food;

    public function __construct($family, $food)
    {
        $this->family = $family;
        $this->food = $food;
    }

    /**
     * @return mixed
     */
    public function getFamily()
    {
        return $this->family;
    }

    /**
     * @param mixed $family
     */
    public function setFamily($family)
    {
        $this->family = $family;
    }

    /**
     * @return mixed
     */
    public function getFood()
    {
        return $this->food;
    }

    /**
     * @param mixed $food
     */
    public function setFood($food)
    {
        $this->food = $food;
    }
}

?>