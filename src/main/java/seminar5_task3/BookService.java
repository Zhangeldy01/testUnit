package seminar5_task3;

import java.util.List;
import java.util.ArrayList;

public class BookService {
    private List<Book> books = new ArrayList<>();

    public void addBook (Book book) {
        books.add(book);
    }

    public List<Book> getAllBooks(){
        return books;
    }
}
