import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    private Borrower bob;
    private Library library;

    @Before
    public void before(){
        bob = new Borrower("Bob");
        library = new Library("Word Factory", 3);
    }

//    @Test
//    public void canBorrowBook(){
//        bob.borrowBook(library);
//        assertEquals(3, bob.countBorrowedBooks());
//    }
}
