import java.util.*;
import java.util.stream.Collectors;

class Claim {
    String type;
    double amount;
    Claim(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }
}

public class ClaimAnalysis {
    public static void main(String[] args) {
        List<Claim> claims = Arrays.asList(
            new Claim("Health", 3000),
            new Claim("Auto", 5500),
            new Claim("Health", 2200),
            new Claim("Auto", 4000)
        );

        Map<String, Double> avgByType = claims.stream()
            .collect(Collectors.groupingBy(
                claim -> claim.type,
                Collectors.averagingDouble(claim -> claim.amount)
            ));

        System.out.println(avgByType);
    }
}
