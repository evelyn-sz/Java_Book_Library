import java.util.ArrayList;

public class Borrower {
    private String name;
    private ArrayList<Book> borrowedBooks;

    public Borrower(String name){
        this.name = name;
        this.borrowedBooks = new ArrayList<Book>();
    }

//    public void borrowBook(Library library) {
//        Book book = library.borrowBookAndMarkUnavailable();
//                this.borrowedBooks.add(Book);
//    }
}
