import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;
    private Library library;

    @Before
    public void before(){
        book = new Book("Catch-22", "Joseph Heller", "Absurdist Fiction" );
    }

    @Test
    public void canGetTitle(){
        assertEquals("Catch-22", book.getTitle());
    }

    @Test
    public void canGetAuthor(){
        assertEquals("Joseph Heller", book.getAuthor());
    }

    @Test
    public void canGetGenre(){
        assertEquals("Absurdist Fiction", book.getGenre());
    }


}
