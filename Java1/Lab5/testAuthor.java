package Java1.Lab5;

public class testAuthor {
    public static void main(String[] args) {
        Author author1 = new Author("Van Goh", "Vangodvip@gmail.com", 'm');
        System.out.println(author1);
        author1.setEmail("codelean@gmail.com");
        System.out.println("Name author: " + author1.getName());
        System.out.println("Email: " + author1.getEmail());
        System.out.println("Gender: " + author1.getGender());
    }
}
