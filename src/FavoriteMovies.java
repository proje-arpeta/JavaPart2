import java.util.ArrayList;
import java.util.Scanner;

public class FavoriteMovies {
    private ArrayList<String> movies;

    public FavoriteMovies() {
        this.movies = new ArrayList<>();
    }
    public void addMovie(String movie) {
        movies.add(movie);
        System.out.println("Film eklendi: " + movie);
    }
    public void removeMovie(int index) {
        if (index >= 0 && index < movies.size()) {
            String removedMovie = movies.remove(index);
            System.out.println("Film çıkarıldı: " + removedMovie);
        } else {
            System.out.println("Geçersiz indeks.");
        }
    }
    public void listMovies() {
        if (movies.isEmpty()) {
            System.out.println("Favori film listeniz boş.");
        } else {
            System.out.println("Favori Filmleriniz:");
            for (int i = 0; i < movies.size(); i++) {
                System.out.println((i + 1) + ". Film: " + movies.get(i));
            }
        }
    }

    public static void main(String[] args) {
        FavoriteMovies favoriteMovies = new FavoriteMovies();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("1. Film Ekle");
            System.out.println("2. Film Çıkar");
            System.out.println("3. Filmleri Listele");
            System.out.println("4. Çıkış");
            System.out.print("Seçiminiz: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Satır sonunu tüket

            switch (choice) {
                case 1:
                    System.out.print("Eklenecek filmi girin: ");
                    String movie = scanner.nextLine();
                    favoriteMovies.addMovie(movie);
                    break;
                case 2:
                    System.out.print("Çıkarılacak filmin indeksini girin: ");
                    int index = scanner.nextInt();
                    favoriteMovies.removeMovie(index - 1);
                    break;
                case 3:
                    favoriteMovies.listMovies();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Geçersiz seçim.");
            }
        }
        scanner.close();
    }
}
