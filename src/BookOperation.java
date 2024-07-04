import java.util.Scanner;

public class BookOperation {
    public static void main(String[] args) {

        BookManagement bookObj = new BookManagement();
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int id = scanner.nextInt();
        scanner.nextLine();

        BookClass bookSample = new BookClass(id,name);
        bookObj.addBook(bookSample);

    }
}
