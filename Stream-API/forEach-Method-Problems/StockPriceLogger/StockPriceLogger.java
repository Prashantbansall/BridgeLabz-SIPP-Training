import java.util.*;

public class StockPriceLogger {
    public static void main(String[] args) {
        List<Double> stockPrices = Arrays.asList(101.5, 103.2, 99.7, 104.8);
        stockPrices.forEach(price -> System.out.println("Stock Price: " + price));
    }
}
