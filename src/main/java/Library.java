import java.util.ArrayList;

public class Library {
    private String name;
    private int capacity;
    private ArrayList<Book> bookList;

    public Library(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
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
        if (this.countBooks() < this.capacity)
        this.bookList.add(book);
    }
}
