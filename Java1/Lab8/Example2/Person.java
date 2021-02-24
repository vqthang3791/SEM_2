package Java1.Lab8.Example2;

public class Person {
    private String name;
    private String address;

    public Person() {
        this.name = "student";
        this.address = "My Dinh";
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
