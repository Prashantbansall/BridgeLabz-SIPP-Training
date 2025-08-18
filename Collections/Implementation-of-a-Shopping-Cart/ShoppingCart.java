import java.util.*;

public class ShoppingCart {
    public static void main(String[] args) {
        // HashMap to store product prices
        HashMap<String, Integer> productPrices = new HashMap<>();
        productPrices.put("Apple", 50);
        productPrices.put("Banana", 20);
        productPrices.put("Orange", 30);
        productPrices.put("Mango", 60);

        System.out.println("Product Prices (HashMap): " + productPrices);

        // LinkedHashMap to maintain order of items added to cart
        LinkedHashMap<String, Integer> cart = new LinkedHashMap<>();
        addToCart(cart, "Apple", productPrices);
        addToCart(cart, "Banana", productPrices);
        addToCart(cart, "Mango", productPrices);
        addToCart(cart, "Orange", productPrices);

        System.out.println("Cart (LinkedHashMap - insertion order): " + cart);

        // TreeMap to display items sorted by price
        TreeMap<Integer, String> sortedByPrice = new TreeMap<>();
        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            sortedByPrice.put(entry.getValue(), entry.getKey());
        }
        System.out.println("Cart (TreeMap - sorted by price): " + sortedByPrice);
    }

    // Function to add items to cart
    public static void addToCart(LinkedHashMap<String, Integer> cart, String product, HashMap<String, Integer> productPrices) {
        if (productPrices.containsKey(product)) {
            cart.put(product, productPrices.get(product));
        } else {
            System.out.println(product + " is not available!");
        }
    }
}

