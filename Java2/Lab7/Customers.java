package Java2.Lab7;

public class Customers {
    private int Customer_ID;
    private String Customer_Name;
    private String Email;
    private String Phone;
    private String Address;
    private String lever;

    public Customers(int customer_ID, String customer_Name, String email, String phone, String address, String lever) {
        Customer_ID = customer_ID;
        Customer_Name = customer_Name;
        Email = email;
        Phone = phone;
        Address = address;
        this.lever = lever;
    }

    public int getCustomer_ID() {
        return Customer_ID;
    }

    public void setCustomer_ID(int customer_ID) {
        Customer_ID = customer_ID;
    }

    public String getCustomer_Name() {
        return Customer_Name;
    }

    public void setCustomer_Name(String customer_Name) {
        Customer_Name = customer_Name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getLever() {
        return lever;
    }

    public void setLever(String lever) {
        this.lever = lever;
    }
}