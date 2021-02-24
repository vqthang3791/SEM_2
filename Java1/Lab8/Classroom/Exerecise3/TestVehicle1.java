package Java1.Lab8.Classroom.Exerecise3;

public class TestVehicle1 {
    public static void main(String[] args) {
        FourWheeler1 obj1 = new FourWheeler1("LA-09 CS-1406", "Volkswagen", 4, true);
        obj1.showDetails();
        obj1.accelerate(2000);
    }
}
