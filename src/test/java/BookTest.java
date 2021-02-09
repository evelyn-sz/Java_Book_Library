import org.junit.Before;

public class BookTest {
    private Book lotr;

    @Before
    public void before(){
        lotr = new Book("LOTR", "Tolkien", "Fantasy");
    }
}
