import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private Integer stock;

    public Library(Integer stock){
        this.books = new ArrayList<Book>();
        this.stock = stock;
    }

    public int getNumberOfBooks() {
        return this.books.size();
    }

    public void addBook(Book book) {
        if(this.getNumberOfBooks() < this.stock){
            this.books.add(book);
        }
    }
}
