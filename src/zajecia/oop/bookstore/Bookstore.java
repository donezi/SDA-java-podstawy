package zajecia.oop.bookstore;

/**
 * Created by RENT on 2017-04-24.
 */
public class Bookstore {

    private Book[] books;
    private int numberOfBooks;

    public Bookstore() {
        books = new Book[100];
        this.numberOfBooks = 0;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public Book[] getBooks() {
        Book[] booksToReturn = new Book[numberOfBooks];
        for (int i = 0; i < this.numberOfBooks; i++) {
            booksToReturn[i] = books[i];
        }
        return booksToReturn;
    }

    public boolean add(Book book) {
        boolean valueToReturn = false;
        if (numberOfBooks < 100) {
            books[numberOfBooks] = book;
            numberOfBooks++;
            valueToReturn = true;
        }
        return valueToReturn;
    }

    public void showBooks() {
        for (int i = 0; i < numberOfBooks; i++) {
            System.out.println(books[i]);
        }
    }

    //ile razy wystepuje ten autor
    public int getNumberOfBooks(String author) {
        int counter = 0;
        for (int i = 0; i < this.numberOfBooks; i++) {
            if (books[i].getAuthor().equals(author)) {
                counter++;
            }
        }
        return counter;
    }

    //wszystkie ksiazki wybranego autora
    public Book[] getBooks(String author) {
        Book[] bookToReturn = new Book[getNumberOfBooks(author)];
        int index = 0;
        for (int i = 0; i < this.numberOfBooks; i++) {
            if (books[i].getAuthor().equals(author)) {
                bookToReturn[index] = books[i];
                index++;
            }
        }
        return bookToReturn;

    }

    public Book getBook(String ISBN) {
        Book book = null;
        int i = 0;
        while (i < this.numberOfBooks && book == null)
            if (books[i].getISBN().equals(ISBN)) {
                book = books[i];
            }
        i++;
        return book;
    }

}
