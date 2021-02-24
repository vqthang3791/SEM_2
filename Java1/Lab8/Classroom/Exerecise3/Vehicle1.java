package Java1.Lab8.Classroom.Exerecise3;

public class Vehicle1 {
    protected String vehicleNo;
    protected String vehicleName;
    protected int wheels;

    public Vehicle1(String vId, String vName, int numWheels) {
        vehicleNo = vId;
        vehicleName = vName;
        wheels = numWheels;
    }

    public void accelerate(int speed) {
        System.out.println("Accelerating at :" + speed + "kmph");
    }
}
