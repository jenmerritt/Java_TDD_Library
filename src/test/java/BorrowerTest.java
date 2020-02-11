import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Library library;
    private Book book1;

    @Before
    public void before(){
        borrower = new Borrower();
        book1 = new Book("Harry Potter", "JK Rowling", "Fantasy");
        library = new Library(1);
    }

    @Test
    public void can_get_number_of_books_in_collection(){
        assertEquals(0, borrower.getNumberOfBooksInCollection());
    }

    @Test
    public void can_add_book_to_collection(){
        borrower.addBook(book1);
        assertEquals(1, borrower.getNumberOfBooksInCollection());
    }

    @Test
    public void can_loan_book_if_library_has_stock(){
        library.addBook(book1);
        borrower.loanBookFromLibrary(library);
        assertEquals(1, borrower.getNumberOfBooksInCollection());
    }

    @Test
    public void cannot_loan_book_if_library_does_not_have_stock(){
        borrower.loanBookFromLibrary(library);
        assertEquals(0, borrower.getNumberOfBooksInCollection());
    }
}
