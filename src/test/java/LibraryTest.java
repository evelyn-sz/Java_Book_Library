import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library wordFactory;
    private Book lotr;
    private Book hp;
    private Book ocean;
    private Book geo;

    @Before
    public void before(){
        wordFactory = new Library("Word Factory", 3);
        lotr = new Book("LOTR", "Tolkien", "Fantasy");
        hp = new Book("Harry Potter", "Rowling", "Fantasy");
        ocean = new Book("Oceanography", "Thurman", "Science");
        geo = new Book("Geochemistry", "Killops", "Science");
        wordFactory.addBook(lotr);
        wordFactory.addBook(hp);
        wordFactory.addBook(ocean);

    }

    @Test
    public void canAddBookToLibrary(){
        assertEquals(3, wordFactory.countBooks());
    }
    @Test
    public void canCountNumberOfBooks(){
        assertEquals(3, wordFactory.countBooks());
    }

    @Test
    public void cannotGoOverCapacity(){
        wordFactory.addBook(geo);
        assertEquals(3, wordFactory.countBooks());
    }

}
