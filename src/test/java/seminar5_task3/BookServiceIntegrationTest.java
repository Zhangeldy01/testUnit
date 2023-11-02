package seminar5_task3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookServiceIntegrationTest {
    private BookService bookService;

    @BeforeEach
    public void setUp() {
        bookService = new BookService();
    }

    @Test
    public void testAddBookAndGetAllBooks() {
        // Задание:
        // 1. Создайте: 3 книги и добавьте их в bookService.

        Book book1 = new Book("All Quiet on the Western Front", "E. M. Remarque");
        Book book2 = new Book("Three Comrades", "E. M. Remarque");
        Book book3 = new Book("The Black Obelisk", "E. M. Remarque");

        bookService.addBook(book1);
        bookService.addBook(book2);
        bookService.addBook(book3);

        // 2. Получите список всех книг из bookService.

       List<Book> allBooks =  bookService.getAllBooks();

        // 3. Проверьте, что список не является null.

        assertNotNull(allBooks);

        // 4. Проверьте, что список содержит 3 книги.

        assertEquals(3, allBooks.size());

        // 5. Вывдите информацию о каждой книге (используйте метод toString).

        for (Book book : allBooks)
            System.out.println(book);

        // Подсказка: Используйте методы addBook и getAllBooks из  bookService.
        // Проверьте, что результаты соответствуют жиданиям.

        assertEquals("All Quiet on the Western Front", allBooks.get(0).getTitle());
        assertEquals("E. M. Remarque", allBooks.get(0).getAuthor());
        assertEquals("Three Comrades", allBooks.get(1).getTitle());
        assertEquals("E. M. Remarque", allBooks.get(1).getAuthor());
        assertEquals("The Black Obelisk", allBooks.get(2).getTitle());
        assertEquals("E. M. Remarque", allBooks.get(2).getAuthor());
        // Проведите всевозможные интеграционные тестирования.
    }
}
