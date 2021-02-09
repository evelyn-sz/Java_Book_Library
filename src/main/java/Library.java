import java.util.ArrayList;

public class Library {
    private String name;
    private ArrayList<Book> bookList;

    public Library(String name){
        this.name = name;
        this.bookList = new ArrayList<Book>();
    }
    public String getName(){
        return this.name;
    }

    public ArrayList<Book> getBookList(){
        return this.bookList;
    }

    public int countBooks(){
        return this.bookList.size();
    }

    public void addBook(Book book) {
        this.bookList.add(book);
    }
}
