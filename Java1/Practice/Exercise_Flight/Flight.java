package Java1.Practice.Exercise_Flight;

public class Flight {
    private int number;
    private String destination;

    public Flight() {
        this.number = 0;
        this.destination = "";
    }

    public int getNumber() {
        return number;
    }

    public String getDestination() {
        return destination;
    }

    public Flight(int number, String destination) {
        this.number = number;
        this.destination = destination;
    }

    public void Display() {
        if (number < 0) {
            System.out.println("Invalid Flight!!");
        } else {
            System.out.println(getNumber() + "," + getDestination());
        }
    }
}
