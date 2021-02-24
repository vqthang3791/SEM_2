package Java1.Lab8.Classroom.Exerecise2;

public class EmployeeDetails {
    public static void main(String[] args) {
        Employee obj = new Employee("E001", "Maria", 40000);
        obj.calcCommission(20000F);
        obj.displayDetails();
    }
}
