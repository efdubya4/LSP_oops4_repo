package src.org.howard.edu.lsp.midterm.question2;
/* The Book Driver class is used to test the Book class by:
Creating instances of the Book class.
Testing the equals method to compare Book objects.
Testing the toString method to display Book details. */
public class BookDriver {
    public static void main(String[] args) {
        // Create Book objects
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456789", 1925);
        Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456789", 1925);
        Book book3 = new Book("A Promised Land", "Barack Obama", "9780593239681", 2020);

        // Test equals method
        System.out.println(book1.equals(book2)); // true
        System.out.println(book1.equals(book3)); // false

        // Test toString method
        System.out.println(book1); // Output: Title: The Great Gatsby, Author: F. Scott Fitzgerald, ISBN: 123456789, Year Published: 1925
    }
}