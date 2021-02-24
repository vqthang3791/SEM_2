<?php
class employee
{
    private $man_no;
    private $name;
    protected $position;

    public function __construct($man_no, $name, $position)
    {
        $this->man_no = $man_no;
        $this->name = $name;
        $this->position = $position;
    }

    /**
     * @return mixed
     */
    public function getManNo()
    {
        return $this->man_no;
    }

    /**
     * @param mixed $man_no
     */
    public function setManNo($man_no)
    {
        $this->man_no = $man_no;
    }

    /**
     * @return mixed
     */
    public function getName()
    {
        return $this->name;
    }

    /**
     * @param mixed $name
     */
    public function setName($name)
    {
        $this->name = $name;
    }

    /**
     * @return mixed
     */
    public function getPosition()
    {
        return $this->position;
    }

    /**
     * @param mixed $position
     */
    public function setPosition($position)
    {
        $this->position = $position;
    }
}
?>
