import com.zzut.config.SpringConfig;
import com.zzut.domain.Book;
import com.zzut.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class TestUserService {
    @Autowired
    private BookService bookService;
@Test
    public void testUserServiceImp() {
    System.out.println(bookService.deleteById(3));
    System.out.println(bookService.addOneBook(new Book("java核心技术", 66, null, "计算法算法书",null)));
//    System.out.println(bookService.selectById(2));
//    bookService.updateBook(new Book("算法图解1", 66, "这是一本较好的算法入门书", "计算法算法书", 1));
//    List<Book> books = bookService.selectAll();
//    System.out.println(books);
}
}
