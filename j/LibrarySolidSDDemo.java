// Q: Apply SOLID Principles (S and D)
// Design a simple library system following all SOLID principles with at least 2-3 classes/interfaces.

import java.util.*;

// SRP: This class is only responsible for holding book data
class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getDetails() {
        return title + " by " + author;
    }
}

// Abstraction for storing books (DIP)
interface BookStorage {
    void addBook(Book book);
    List<Book> getAllBooks();
}

// Low-level class: stores books in memory
class InMemoryBookStorage implements BookStorage {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getAllBooks() {
        return books;
    }
}

// SRP: This class is only responsible for managing library operations
// DIP: Depends on BookStorage interface, not concrete class
class LibraryManager {
    private BookStorage storage;

    public LibraryManager(BookStorage storage) {
        this.storage = storage;
    }

    public void addBookToLibrary(Book book) {
        storage.addBook(book);
        System.out.println("Book added to library.");
    }

    public void showAllBooks() {
        System.out.println("\nLibrary Collection:");
        for (Book book : storage.getAllBooks()) {
            System.out.println(book.getDetails());
        }
    }
}

// Main class to run the system
public class LibrarySolidSDDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // High-level class depending on abstraction (DIP)
        BookStorage storage = new InMemoryBookStorage();
        LibraryManager manager = new LibraryManager(storage);

        System.out.print("Enter number of books to add: ");
        int count = scanner.nextInt();
        scanner.nextLine(); // consume newline

        for (int i = 1; i <= count; i++) {
            System.out.print("\nEnter title of book " + i + ": ");
            String title = scanner.nextLine();
            System.out.print("Enter author of book " + i + ": ");
            String author = scanner.nextLine();
            manager.addBookToLibrary(new Book(title, author));
        }

        manager.showAllBooks();
        scanner.close();
    }
}
