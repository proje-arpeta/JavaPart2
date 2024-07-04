import java.util.ArrayList;
import java.util.List;
public class BookManagement {

    private List<BookClass> books;

    public BookManagement(){
        books = new ArrayList<>();
    }

    public  void addBook(BookClass book){
     books.add(book);
     System.out.println(book.getName());
    }

    public void  listBooks(){
        for (BookClass book : books){
            System.out.println(book.getName());
        }
    }
    public static void main(String[] args) {

    }
}
