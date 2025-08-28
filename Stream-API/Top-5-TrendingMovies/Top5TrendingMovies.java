import java.util.*;
import java.util.stream.Collectors;

class Movie {
    String title;
    double rating;
    int releaseYear;
    Movie(String title, double rating, int releaseYear) {
        this.title = title;
        this.rating = rating;
        this.releaseYear = releaseYear;
    }
}

public class Top5TrendingMovies {
    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
            new Movie("MovieA", 9.1, 2024),
            new Movie("MovieB", 8.5, 2023),
            new Movie("MovieC", 9.0, 2025),
            new Movie("MovieD", 7.8, 2022),
            new Movie("MovieE", 9.5, 2025),
            new Movie("MovieF", 8.9, 2024),
            new Movie("MovieG", 9.3, 2025)
        );

        List<Movie> top5 = movies.stream()
            .filter(m -> m.rating >= 8.0)
            .sorted(Comparator.comparingDouble(Movie::rating)
                .thenComparing(Movie::releaseYear)
                .reversed())
            .limit(5)
            .collect(Collectors.toList());

        top5.forEach(m -> System.out.println(m.title + " " + m.rating + " " + m.releaseYear));
    }
}
