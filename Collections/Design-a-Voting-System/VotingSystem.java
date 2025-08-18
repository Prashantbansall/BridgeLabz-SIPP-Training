import java.util.*;

public class VotingSystem {
    // Stores candidate and their number of votes
    private HashMap<String, Integer> voteMap = new HashMap<>();
    // Maintains the order of voting
    private LinkedHashMap<String, Integer> orderMap = new LinkedHashMap<>();

    // Cast a vote for a candidate
    public void castVote(String candidate) {
        voteMap.put(candidate, voteMap.getOrDefault(candidate, 0) + 1);
        orderMap.put(candidate, voteMap.get(candidate));
    }

    // Display votes in insertion order
    public void displayVotesInOrder() {
        System.out.println("Votes in order of entry:");
        for (Map.Entry<String, Integer> entry : orderMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    // Display results sorted by candidate name
    public void displaySortedResults() {
        TreeMap<String, Integer> sortedMap = new TreeMap<>(voteMap);
        System.out.println("Votes in sorted order:");
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
