import org.junit.Before;
import org.junit.Test;

import java.awt.print.Book;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before(){
        library = new Library("Larry's Library", ArrayList<Book>);
    }

    @Test
    public void canGetName(){
        assertEquals("Larry's Library", library.getName());
    }

//    @Test
//    public void canCountBookCollection(){
//        assertEquals(0, collection.bookCount());
//    }


}
