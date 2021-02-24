package Java2.Lab7;

public class Books {
    private int ISBN;
    private String Book_Name;
    private String Title;
    private String Author;
    private int Qty;
    private double Price;

    public Books(int ISBN, String book_Name, String title, String author, int qty, double price) {
        this.ISBN = ISBN;
        Book_Name = book_Name;
        Title = title;
        Author = author;
        Qty = qty;
        Price = price;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getBook_Name() {
        return Book_Name;
    }

    public void setBook_Name(String book_Name) {
        Book_Name = book_Name;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public int getQty() {
        return Qty;
    }

    public void setQty(int qty) {
        Qty = qty;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    @Override
    public String toString() {
        return "Books{" +
                "ISBN='" + ISBN + '\'' +
                ", Book_Name='" + Book_Name + '\'' +
                ", Title='" + Title + '\'' +
                ", Author='" + Author + '\'' +
                ", Qty='" + Qty + '\'' +
                ", Price='" + Price + '\'' +
                '}';
    }
}

