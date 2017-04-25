package zajecia.oop.bookstore;

/**
 * Created by RENT on 2017-04-24.
 */
public class Application {

    public static void main(String[] args) {
        Bookstore bookstore = new Bookstore();
        insertExampleData(bookstore);
//        bookstore.showBooks();
//        System.out.println(bookstore.books[0].toString());
//        System.out.println(bookstore.getNumberOfBooks("Henryk Sienkiewicz"));
//        Book[] books = bookstore.getBooks("Adam Mickiewicz");
        System.out.println(bookstore.getBook("97883872312"));
        System.out.println(bookstore.getNumberOfBooks());


    }

    public static void insertExampleData(Bookstore bookstore) {
        Book book = new Book("Krzyzacy", "Henryk Sienkiewicz", "2001");
        book.setISBN("97883564312");
        book.setSize(150);
        String[] ogniemIMieczem = new String[4];
        ogniemIMieczem[0]="Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.\n";
        ogniemIMieczem[1]="Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.\n";
        ogniemIMieczem[2]="Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.\n";
        ogniemIMieczem[3]="Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.\n";
        book.setContent(ogniemIMieczem);

        Book book2 = new Book("Quovadis", "Henryk Sienkiewicz", "2002");
        book2.setISBN("97883872312");
        book2.setSize(300);
        String[] quoVadis = new String[4];
        quoVadis[0]="Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.\n";
        quoVadis[1]="Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.\n";
        quoVadis[2]="Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.\n";
        quoVadis[3]="Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.\n";
        book2.setContent(quoVadis);

        Book book3 = new Book("DziadyIV", "Adam Mickiewicz", "2003");
        book3.setISBN("978837892432");
        book3.setSize(200);
        String[] dziadyIV = new String[4];
        dziadyIV[0]="Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.\n";
        dziadyIV[1]="Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.\n";
        dziadyIV[2]="Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.\n";
        dziadyIV[3]="Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.\n";
        book3.setContent(dziadyIV);

        bookstore.add(book);
        bookstore.add(book2);
        bookstore.add(book3);
    }

}
