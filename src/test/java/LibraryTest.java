import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;
    private Book lotr;
    private Book hp;
    private Book ocean;
    private Book geo;

    @Before
    public void before(){
        library = new Library("Word Factory", 3);
        lotr = new Book("LOTR", "Tolkien", "Fantasy", true);
        hp = new Book("Harry Potter", "Rowling", "Fantasy", true);
        ocean = new Book("Oceanography", "Thurman", "Science", true);
        geo = new Book("Geochemistry", "Killops", "Science", true);
        library.addBook(lotr);
        library.addBook(hp);
        library.addBook(ocean);

    }

    @Test
    public void canAddBookToLibrary(){
        assertEquals(3, library.countBooks());
    }
    @Test
    public void canCountNumberOfBooks(){
        assertEquals(3, library.countBooks());
    }

    @Test
    public void cannotGoOverCapacity(){
        library.addBook(geo);
        assertEquals(3, library.countBooks());
    }

}
