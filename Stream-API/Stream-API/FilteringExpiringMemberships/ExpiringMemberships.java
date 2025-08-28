import java.util.*;
import java.time.LocalDate;
import java.util.stream.Collectors;

class Member {
    String name;
    LocalDate expiryDate;

    Member(String name, LocalDate expiryDate) {
        this.name = name;
        this.expiryDate = expiryDate;
    }
}

public class ExpiringMemberships {
    public static void main(String[] args) {
        List<Member> members = Arrays.asList(
                new Member("Alice", LocalDate.now().plusDays(15)),
                new Member("Bob", LocalDate.now().plusDays(35)),
                new Member("Charlie", LocalDate.now().plusDays(5)));

        List<Member> expiring = members.stream()
                .filter(m -> !m.expiryDate.isBefore(LocalDate.now()) &&
                        m.expiryDate.isBefore(LocalDate.now().plusDays(30)))
                .collect(Collectors.toList());

        expiring.forEach(m -> System.out.println(m.name + " expires on " + m.expiryDate));
    }
}
