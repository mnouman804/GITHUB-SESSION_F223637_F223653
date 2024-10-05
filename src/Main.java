/**
 * The Main class demonstrates the usage of the Library class
 * by adding books and listing them in the console.
 */
public class Main {

    /**
     * The main method is the entry point of the program.
     * It creates a Library object, adds books to it, and displays the book list.
     *
     * @param args command-line arguments (not used here)
     */
    public static void main(String[] args) {
        // Create a new Library object
        Library myLibrary = new Library();

        // Add books to the library
        myLibrary.addBook("Harry Potter");
        myLibrary.addBook("Lord of the Rings");

        // List all the books in the library
        myLibrary.listBooks();
    }
}
