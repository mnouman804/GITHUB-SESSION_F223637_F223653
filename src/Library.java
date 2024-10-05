import java.util.ArrayList;
import java.util.List;

/**
 * The Library class represents a collection of books and provides methods
 * to add, remove, search, and list the books in the library.
 */
public class Library {

    // List to store the collection of books in the library
    private List<String> books = new ArrayList<>();

    /**
     * Adds a book to the library's collection.
     *
     * @param bookName the name of the book to add
     */
    public void addBook(String bookName) {
        books.add(bookName);  // Adds the book to the collection
        System.out.println(bookName + " added to library.");
    }

    /**
     * Lists all the books currently available in the library.
     */
    public void listBooks() {
        System.out.println("Books in library: " + books);  // Prints the list of books
    }

    /**
     * Searches for a book in the library by name.
     *
     * @param bookName the name of the book to search for
     * @return true if the book is found, false otherwise
     */
    public boolean searchBook(String bookName) {
        return books.contains(bookName);  // Checks if the book is present in the collection
    }

    /**
     * Removes a book from the library's collection.
     *
     * @param bookName the name of the book to remove
     */
    public void removeBook(String bookName) {
        // Attempts to remove the book from the collection
        if (books.remove(bookName)) {
            System.out.println(bookName + " removed from the library.");
        } else {
            System.out.println(bookName + " not found in the library.");
        }
    }
}
