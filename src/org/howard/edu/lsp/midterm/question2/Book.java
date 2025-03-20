package src.org.howard.edu.lsp.midterm.question2;

public class Book {
    // Private attributes for encapsulation
    private String title;
    private String author;
    private String ISBN;
    private int yearPublished;
    private boolean checkedOut = false;

    // Constructor
    public Book(String title, String author, String ISBN, int yearPublished) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.yearPublished = yearPublished;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    // Override equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Check if the objects are the same instance
        if (obj == null || getClass() != obj.getClass()) return false; // Check if obj is null or not a Book
        Book book = (Book) obj; // Cast obj to Book
        return ISBN.equals(book.ISBN) && author.equals(book.author); // Compare ISBN and author
    }

    // Override toString method
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + ", Year Published: " + yearPublished + ", Checked Out: " + checkedOut;
    }
}
