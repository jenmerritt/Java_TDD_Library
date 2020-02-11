import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;

    @Before
    public void before(){
        library = new Library(2);
        book1 = new Book("Harry Potter", "JK Rowling", "Fantasy");
        book2 = new Book("Becoming", "Michelle Obama", "Biography");
        book3 = new Book("Atlas", "DK", "Reference");
    }

    @Test
    public void number_of_books_in_library(){
        assertEquals(0, library.getNumberOfBooks());
    }

    @Test
    public void add_book_to_library_space(){
        library.addBook(book1);
        assertEquals(1, library.getNumberOfBooks());
    }

    @Test
    public void add_book_to_library_no_space(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(2, library.getNumberOfBooks());
    }

    @Test
    public void remove_book_if_stock(){
        library.addBook(book1);
        library.addBook(book2);
        library.loanOutBook();
        assertEquals(1, library.getNumberOfBooks());
    }

    @Test
    public void do_not_remove_book_if_no_stock(){
        library.loanOutBook();
        assertEquals(0, library.getNumberOfBooks());
    }

}
