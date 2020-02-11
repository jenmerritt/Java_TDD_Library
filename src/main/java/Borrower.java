import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> collection;

    public Borrower(){
        this.collection = new ArrayList<Book>();
    }

    public int getNumberOfBooksInCollection() {
        return this.collection.size();
    }

    public void addBook(Book book) {
        this.collection.add(book);
    }
}
