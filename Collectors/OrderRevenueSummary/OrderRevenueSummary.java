import java.util.*;
import java.util.stream.Collectors;

class Order {
    String customer;
    double total;

    Order(String customer, double total) {
        this.customer = customer;
        this.total = total;
    }
}

public class OrderRevenueSummary {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
            new Order("Alice", 100.0),
            new Order("Bob", 150.5),
            new Order("Alice", 200.75)
        );

        Map<String, Double> revenueByCustomer = orders.stream()
            .collect(Collectors.groupingBy(
                order -> order.customer,
                Collectors.summingDouble(order -> order.total)
            ));
        System.out.println(revenueByCustomer);
    }
}
