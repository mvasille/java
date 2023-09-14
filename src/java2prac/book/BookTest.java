package java2prac.book;

public class BookTest {
    public static void main(String[] args) {
        BookShelf bookshelf = new BookShelf(5);

        Book book1 = new Book("Автор1", "Книга1", 2000);
        Book book2 = new Book("Автор2", "Книга2", 1995);
        Book book3 = new Book("Автор3", "Книга3", 2010);
        Book book4 = new Book("Автор4", "Книга4", 1980);
        Book book5 = new Book("Автор5", "Книга5", 2022);

        bookshelf.addBook(book1);
        bookshelf.addBook(book2);
        bookshelf.addBook(book3);
        bookshelf.addBook(book4);
        bookshelf.addBook(book5);

        System.out.println("Все книги на полке:");
        System.out.println(bookshelf);

        bookshelf.sortBooksByYear();
        System.out.println("Книги на полке после сортировки по году выпуска:");
        System.out.println(bookshelf);

        Book latestBook = bookshelf.getLatestBook();
        System.out.println("Самая поздняя книга:");
        System.out.println(latestBook);

        Book oldestBook = bookshelf.getOldestBook();
        System.out.println("Самая ранняя книга:");
        System.out.println(oldestBook);
    }
}