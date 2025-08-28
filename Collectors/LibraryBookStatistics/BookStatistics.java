import java.util.*;
import java.util.stream.Collectors;

class Book {
    String title;
    String genre;
    int pages;

    Book(String title, String genre, int pages) {
        this.title = title;
        this.genre = genre;
        this.pages = pages;
    }

    public String getGenre() {
        return genre;
    }
    public int getPages() {
        return pages;
    }
}

public class BookStatistics {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
            new Book("Book1", "Fantasy", 400),
            new Book("Book2", "Fantasy", 350),
            new Book("Book3", "Science", 500),
            new Book("Book4", "Science", 600)
        );

        Map<String, IntSummaryStatistics> statsByGenre = books.stream()
            .collect(Collectors.groupingBy(
                Book::getGenre,
                Collectors.summarizingInt(Book::getPages)
            ));

        statsByGenre.forEach((genre, stats) -> {
            System.out.println(genre + " -> " +
                "Total Pages: " + stats.getSum() +
                ", Avg: " + stats.getAverage() +
                ", Max: " + stats.getMax());
        });
    }
}
