package part2.task11;

import java.awt.print.Book;
import java.util.List;
public class Library {
    private List<Book> books;
    public Library(List<Book> books) {
        this.books = books;
    }
    public List<Book> getBooks() {
        return books;
    }
    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
