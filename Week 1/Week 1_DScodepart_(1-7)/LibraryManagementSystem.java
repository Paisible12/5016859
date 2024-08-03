import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Book {
    private int bookId;
    private String title;
    private String author;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

class LibraryManagementSystem {
    private List<Book> books;

    public LibraryManagementSystem() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    // Linear search 
    public Book linearSearchByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    // Binary search
    public Book binarySearchByTitle(String title) {
        Collections.sort(books, Comparator.comparing(Book::getTitle));
        int left = 0;
        int right = books.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            Book midBook = books.get(mid);
            int cmp = midBook.getTitle().compareToIgnoreCase(title);

            if (cmp == 0) {
                return midBook;
            } else if (cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null; 
    }

    public static void main(String[] args) {
        LibraryManagementSystem library = new LibraryManagementSystem();

        Book book1 = new Book(1, "Sonar Tari", "Rabindra Nath Tagore");
        Book book2 = new Book(2, "Srikanta", "sarat Chandra Chattopadhyay");
        Book book3 = new Book(3, "Harry Potter", "J.K.Rowling");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        System.out.println("Linear Search for 'Sonar Tari':");
        System.out.println(library.linearSearchByTitle("Sonar Tari"));

        System.out.println("\nBinary Search for 'Harry Potter':");
        System.out.println(library.binarySearchByTitle("Harry Potter"));
    }
}
