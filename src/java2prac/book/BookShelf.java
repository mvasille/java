package java2prac.book;
import java.util.Arrays;

class BookShelf {
    private Book[] books;
    private int count;

    public BookShelf(int capacity) {
        books = new Book[capacity];
        count = 0;
    }

    public void addBook(Book book) {
        if (count < books.length) {
            books[count++] = book;
        } else {
            System.out.println("Книжная полка полна, нельзя добавить больше книг.");
        }
    }

    public Book getLatestBook() {
        if (count == 0) {
            return null;
        }

        Book latestBook = books[0];
        for (int i = 1; i < count; i++) {
            if (books[i].getYear() > latestBook.getYear()) {
                latestBook = books[i];
            }
        }
        return latestBook;
    }

    public Book getOldestBook() {
        if (count == 0) {
            return null;
        }

        Book oldestBook = books[0];
        for (int i = 1; i < count; i++) {
            if (books[i].getYear() < oldestBook.getYear()) {
                oldestBook = books[i];
            }
        }
        return oldestBook;
    }

    public void sortBooksByYear() {
        Arrays.sort(books, 0, count, (book1, book2) -> book1.getYear() - book2.getYear());
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Bookshelf{\n");
        for (int i = 0; i < count; i++) {
            result.append(books[i]);
            if (i < count - 1) {
                result.append("\n");
            }
        }
        result.append("\n}");
        return result.toString();
    }
}