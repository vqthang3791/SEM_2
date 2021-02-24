package Java1.Lab5;

public class Author {
    //Declare variable name, email, gender of author
    private String name;
    private String email;
    private char gender;

    //declare class author
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    //getter
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    //setter
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Author{" + "name='" + name + '\'' + ", email='" + email + '\'' + ", gender=" + gender + '}';
    }
}
