package class2;

public class Book {
    private String title;
    private String author;

    public Book(String title, String author){
      this.title = title;
      this.author = author;
    }

    public void barrow(){
        System.out.println("Barrowd" + title);
    }
    public void returned(){
        System.out.println("Returned" + title);
    }
}
