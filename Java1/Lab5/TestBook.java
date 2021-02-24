package Java1.Lab5;

public class TestBook {
    public static void main(String[] args) {
        // Construct an author instance
        Author codeLean = new Author("Code Lean", "codeleanvn@gmail.com", 'f');
        System.out.println(codeLean);  // Author's toString()

        Book dummyBook = new Book("Java for dummy", codeLean, 19.95, 99);  // Test Book's Constructor
        System.out.println(dummyBook);  // Test Book's toString()

// Test Getters and Setters
        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("name is: " + dummyBook.getName());
        System.out.println("price is: " + dummyBook.getPrice());
        System.out.println("qty is: " + dummyBook.getQty());
        System.out.println("Author is: " + dummyBook.getAuthor());  // Author's toString()
        System.out.println("Author's name is: " + dummyBook.getAuthor().getName());
        System.out.println("Author's email is: " + dummyBook.getAuthor().getEmail());
//Another way to display author's name
        System.out.println("Author name: " + dummyBook.getAuthorName());

// Use an anonymous instance of Author to construct a Book instance
        Book anotherBook = new Book("more Java",
                new Author("Dang Kim Thi", "dangkimthi@gmail.com", 'f'), 29.95);
        System.out.println(anotherBook);  // toString()
    }
}
