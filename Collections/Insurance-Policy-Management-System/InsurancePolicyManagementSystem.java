import java.time.LocalDate;
import java.util.*;

public class InsurancePolicyManagementSystem {

    private Set<Policy> hashSetPolicies = new HashSet<>();
    private Set<Policy> linkedHashSetPolicies = new LinkedHashSet<>();
    private Set<Policy> treeSetPolicies = new TreeSet<>();

    // Add a policy to all sets
    public void addPolicy(Policy policy) {
        hashSetPolicies.add(policy);
        linkedHashSetPolicies.add(policy);
        treeSetPolicies.add(policy);
    }

    // Retrieve all unique policies
    public void displayAllPolicies() {
        System.out.println("\n--- All Unique Policies ---");
        for (Policy policy : hashSetPolicies) {
            System.out.println(policy);
        }
    }

    // Retrieve policies expiring in next 30 days
    public void displayExpiringPolicies() {
        System.out.println("\n--- Policies Expiring Within 30 Days ---");
        LocalDate today = LocalDate.now();
        for (Policy policy : treeSetPolicies) {
            if (!policy.getExpiryDate().isBefore(today) &&
                !policy.getExpiryDate().isAfter(today.plusDays(30))) {
                System.out.println(policy);
            }
        }
    }

    // Retrieve policies by coverage type
    public void displayPoliciesByCoverage(String coverageType) {
        System.out.println("\n--- Policies with Coverage Type: " + coverageType + " ---");
        for (Policy policy : linkedHashSetPolicies) {
            if (policy.getCoverageType().equalsIgnoreCase(coverageType)) {
                System.out.println(policy);
            }
        }
    }

    // Check for duplicates based on policy number
    public void displayDuplicatePolicies() {
        System.out.println("\n--- Duplicate Policies (By Policy Number) ---");
        Set<String> seen = new HashSet<>();
        for (Policy policy : hashSetPolicies) {
            if (!seen.add(policy.getPolicyNumber())) {
                System.out.println("Duplicate found: " + policy);
            }
        }
    }

    // Compare performance of HashSet, LinkedHashSet, TreeSet
    public void comparePerformance() {
        System.out.println("\n--- Performance Comparison ---");
        List<Set<Policy>> sets = Arrays.asList(new HashSet<>(), new LinkedHashSet<>(), new TreeSet<>());

        for (Set<Policy> set : sets) {
            String type = set.getClass().getSimpleName();
            long start, end;

            // Add performance
            start = System.nanoTime();
            for (int i = 0; i < 10000; i++) {
                set.add(new Policy("P" + i, "Holder" + i,
                        LocalDate.now().plusDays(i), "Auto", 1000 + i));
            }
            end = System.nanoTime();
            System.out.println(type + " - Add: " + (end - start) + " ns");

            // Search performance
            start = System.nanoTime();
            set.contains(new Policy("P5000", "Holder5000",
                    LocalDate.now().plusDays(5000), "Auto", 6000));
            end = System.nanoTime();
            System.out.println(type + " - Search: " + (end - start) + " ns");

            // Remove performance
            start = System.nanoTime();
            set.remove(new Policy("P5000", "Holder5000",
                    LocalDate.now().plusDays(5000), "Auto", 6000));
            end = System.nanoTime();
            System.out.println(type + " - Remove: " + (end - start) + " ns");
        }
    }

    public static void main(String[] args) {
        InsurancePolicyManagementSystem system = new InsurancePolicyManagementSystem();

        // Sample policies
        system.addPolicy(new Policy("P101", "Alice", LocalDate.now().plusDays(10), "Health", 5000));
        system.addPolicy(new Policy("P102", "Bob", LocalDate.now().plusDays(40), "Auto", 3000));
        system.addPolicy(new Policy("P103", "Charlie", LocalDate.now().plusDays(20), "Home", 7000));
        system.addPolicy(new Policy("P101", "Alice Duplicate", LocalDate.now().plusDays(15), "Health", 6000)); // Duplicate

        // Display policies
        system.displayAllPolicies();
        system.displayExpiringPolicies();
        system.displayPoliciesByCoverage("Health");
        system.displayDuplicatePolicies();

        // Compare performance
        system.comparePerformance();
    }
}
