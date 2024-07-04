package class2;

public class BookManagement {
    public static void main(String[] args) {
        Book book1    = new Book("Şeker Portakalı","Jose");

        book1.barrow();
        Book book2 = new Book("Satranç", "Ahmet");
        book2.returned();

    }
}
