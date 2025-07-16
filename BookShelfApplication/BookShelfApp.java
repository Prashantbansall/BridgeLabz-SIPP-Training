import java.io.*;
import java.time.LocalDate;
import java.util.*;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Book))
            return false;
        Book b = (Book) o;
        return title.equalsIgnoreCase(b.title) && author.equalsIgnoreCase(b.author);
    }

    public int hashCode() {
        return Objects.hash(title.toLowerCase(), author.toLowerCase());
    }

    public String toString() {
        return title + " by " + author;
    }
}

class Library {
    Map<String, LinkedList<Book>> catalog = new HashMap<>();
    Set<Book> allBooks = new HashSet<>();
    Map<Book, LocalDate> borrowedBooks = new HashMap<>();

    void addBook(String genre, Book book) {
        if (allBooks.contains(book)) {
            System.out.println("Book already exists.");
            return;
        }
        catalog.putIfAbsent(genre, new LinkedList<>());
        catalog.get(genre).add(book);
        allBooks.add(book);
        System.out.println("Book added.");
    }

    void removeBook(String genre, Book book) {
        if (!catalog.containsKey(genre)) {
            System.out.println("Genre not found.");
            return;
        }
        LinkedList<Book> list = catalog.get(genre);
        if (list.remove(book)) {
            allBooks.remove(book);
            borrowedBooks.remove(book);
            System.out.println("Book removed.");
        } else {
            System.out.println("Book not found.");
        }
        if (list.isEmpty())
            catalog.remove(genre);
    }

    void borrowBook(Book book, LocalDate returnDate) {
        if (!allBooks.contains(book)) {
            System.out.println("Book doesn't exist in library.");
            return;
        }
        if (borrowedBooks.containsKey(book)) {
            System.out.println("Book already borrowed.");
            return;
        }
        borrowedBooks.put(book, returnDate);
        System.out.println("You borrowed: " + book);
        System.out.println("Return by: " + returnDate);
    }

    void returnBook(Book book) {
        if (!borrowedBooks.containsKey(book)) {
            System.out.println("This book was not borrowed.");
            return;
        }
        borrowedBooks.remove(book);
        System.out.println("Returned: " + book);
    }

    void printCatalog() {
        if (catalog.isEmpty()) {
            System.out.println("Library is empty.");
            return;
        }
        for (String genre : catalog.keySet()) {
            System.out.println(genre + ":");
            for (Book book : catalog.get(genre)) {
                if (borrowedBooks.containsKey(book)) {
                    LocalDate due = borrowedBooks.get(book);
                    String tag = due.isBefore(LocalDate.now()) ? "⚠️ OVERDUE" : "";
                    System.out.println("  - " + book + " (Borrowed, return by " + due + ") " + tag);
                } else {
                    System.out.println("  - " + book);
                }
            }
        }
    }

    void printBorrowedBooks() {
        if (borrowedBooks.isEmpty()) {
            System.out.println("No books are currently borrowed.");
            return;
        }
        for (Book book : borrowedBooks.keySet()) {
            LocalDate due = borrowedBooks.get(book);
            boolean isOverdue = due.isBefore(LocalDate.now());
            String tag = isOverdue ? "⚠️ OVERDUE" : "";
            System.out.println(book + " → Return by: " + due + " " + tag);
        }
    }

    void saveToFile() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("library_data.txt"))) {
            for (String genre : catalog.keySet()) {
                for (Book book : catalog.get(genre)) {
                    bw.write("#BOOK|" + genre + "|" + book.title + "|" + book.author);
                    bw.newLine();
                }
            }
            for (Book book : borrowedBooks.keySet()) {
                LocalDate date = borrowedBooks.get(book);
                bw.write("#BORROWED|" + book.title + "|" + book.author + "|" + date);
                bw.newLine();
            }
            System.out.println("Library data saved.");
        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }

    void loadFromFile() {
        File file = new File("library_data.txt");
        if (!file.exists())
            return;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.startsWith("#BOOK|")) {
                    String[] parts = line.split("\\|");
                    String genre = parts[1];
                    String title = parts[2];
                    String author = parts[3];
                    Book book = new Book(title, author);
                    addBookSilently(genre, book);
                } else if (line.startsWith("#BORROWED|")) {
                    String[] parts = line.split("\\|");
                    String title = parts[1];
                    String author = parts[2];
                    LocalDate returnDate = LocalDate.parse(parts[3]);
                    Book book = new Book(title, author);
                    borrowedBooks.put(book, returnDate);
                }
            }
            System.out.println("Library data loaded.");
        } catch (IOException e) {
            System.out.println("Error loading data: " + e.getMessage());
        }
    }

    private void addBookSilently(String genre, Book book) {
        catalog.putIfAbsent(genre, new LinkedList<>());
        catalog.get(genre).add(book);
        allBooks.add(book);
    }

    void exportToCSV() {
        try (PrintWriter pw = new PrintWriter(new FileWriter("library_export.csv"))) {
            pw.println("Type,Genre,Title,Author,Status/Return Date");

            for (String genre : catalog.keySet()) {
                for (Book book : catalog.get(genre)) {
                    String status = borrowedBooks.containsKey(book)
                            ? "Borrowed (" + borrowedBooks.get(book) + ")"
                            : "Available";
                    pw.println("Book," + genre + "," + book.title + "," + book.author + "," + status);
                }
            }

            for (Map.Entry<Book, LocalDate> entry : borrowedBooks.entrySet()) {
                Book book = entry.getKey();
                LocalDate due = entry.getValue();
                pw.println("Borrowed,," + book.title + "," + book.author + "," + due);
            }

            System.out.println("Library exported to library_export.csv");
        } catch (IOException e) {
            System.out.println("Error exporting CSV: " + e.getMessage());
        }
    }

}

public class BookShelfApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();

        lib.loadFromFile(); // Load saved data on startup

        while (true) {
            System.out.println("\n1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. View Catalog");
            System.out.println("4. Borrow Book");
            System.out.println("5. Return Book");
            System.out.println("6. View Borrowed Books");
            System.out.println("7. Exit");
            System.out.println("8. Export to CSV");
            System.out.print("Choose option: ");
            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number (1-7).");
                continue;
            }

            if (choice == 1) {
                System.out.print("Enter genre: ");
                String genre = sc.nextLine();
                System.out.print("Enter title: ");
                String title = sc.nextLine();
                System.out.print("Enter author: ");
                String author = sc.nextLine();
                lib.addBook(genre, new Book(title, author));

            } else if (choice == 2) {
                System.out.print("Enter genre: ");
                String genre = sc.nextLine();
                System.out.print("Enter title: ");
                String title = sc.nextLine();
                System.out.print("Enter author: ");
                String author = sc.nextLine();
                lib.removeBook(genre, new Book(title, author));

            } else if (choice == 3) {
                lib.printCatalog();

            } else if (choice == 4) {
                System.out.print("Enter title: ");
                String title = sc.nextLine();
                System.out.print("Enter author: ");
                String author = sc.nextLine();
                System.out.print("Enter return date (yyyy-mm-dd) or press Enter for default (7 days): ");
                String dateStr = sc.nextLine();
                LocalDate returnDate = dateStr.isEmpty()
                        ? LocalDate.now().plusDays(7)
                        : LocalDate.parse(dateStr);
                lib.borrowBook(new Book(title, author), returnDate);

            } else if (choice == 5) {
                System.out.print("Enter title: ");
                String title = sc.nextLine();
                System.out.print("Enter author: ");
                String author = sc.nextLine();
                lib.returnBook(new Book(title, author));

            } else if (choice == 6) {
                lib.printBorrowedBooks();

            } else if (choice == 7) {
                lib.saveToFile(); // Save on exit
                System.out.println("Goodbye!");
                break;

            } else if (choice == 8) {
                lib.exportToCSV();
            } else {
                System.out.println("Invalid option.");
            }
        }

        sc.close();
    }
}
