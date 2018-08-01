import jdk.internal.jline.internal.TestAccessible;

import java.awt.print.Book;


public class TestLibrary {
    Book book;
    Library library;

    @Before
    public void before(){
    book = new Book("Winnie the Pooh");
    library = new Library(4);
    }

    @Test
    public void countBook(){
        assertEquals(0, library.countBook());

    }

    @Test
    public void addBook(){
        assertEquals(1, library.addBook());

    }

    @Test
    public void isLibraryFull(){

    }
}


