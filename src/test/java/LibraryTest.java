import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library wordFactory;
    private Book lotr;
    private Book hp;
    private Book oceanography;

    @Before
    public void before(){
        wordFactory = new Library("Word Factory");
        lotr = new Book("LOTR", "Tolkien", "Fantasy");
        hp = new Book("Harry Potter", "Rowling", "Fantasy");
        oceanography = new Book("Oceanography", "Thurman", "Science");
    }

    @Test
    public void canAddBookToLibrary(){
        wordFactory.addBook(lotr);
        wordFactory.addBook(hp);
        assertEquals(2, wordFactory.countBooks());
    }
    @Test
    public void canCountNumberOfBooks(){

    }

}
