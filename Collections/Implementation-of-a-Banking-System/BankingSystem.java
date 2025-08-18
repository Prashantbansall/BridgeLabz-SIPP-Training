import java.util.*;

class WithdrawalRequest {
    int accountNumber;
    double amount;

    public WithdrawalRequest(int accountNumber, double amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        // HashMap to store accounts
        HashMap<Integer, Double> accounts = new HashMap<>();
        accounts.put(101, 5000.0);
        accounts.put(102, 3000.0);
        accounts.put(103, 7000.0);
        accounts.put(104, 2000.0);

        System.out.println("Accounts (HashMap): " + accounts);

        // TreeMap to sort customers by balance
        TreeMap<Double, Integer> sortedByBalance = new TreeMap<>();
        for (Map.Entry<Integer, Double> entry : accounts.entrySet()) {
            sortedByBalance.put(entry.getValue(), entry.getKey());
        }
        System.out.println("Accounts (TreeMap - sorted by balance): " + sortedByBalance);

        // Queue to process withdrawal requests
        Queue<WithdrawalRequest> withdrawalQueue = new LinkedList<>();
        withdrawalQueue.add(new WithdrawalRequest(101, 1000));
        withdrawalQueue.add(new WithdrawalRequest(102, 500));
        withdrawalQueue.add(new WithdrawalRequest(103, 2000));

        processWithdrawals(accounts, withdrawalQueue);

        System.out.println("Final Account Balances: " + accounts);
    }

    // Process withdrawal requests
    public static void processWithdrawals(HashMap<Integer, Double> accounts, Queue<WithdrawalRequest> withdrawalQueue) {
        while (!withdrawalQueue.isEmpty()) {
            WithdrawalRequest request = withdrawalQueue.poll();
            if (accounts.containsKey(request.accountNumber)) {
                double currentBalance = accounts.get(request.accountNumber);
                if (currentBalance >= request.amount) {
                    accounts.put(request.accountNumber, currentBalance - request.amount);
                    System.out.println("Withdrawal of " + request.amount + " from Account " + request.accountNumber + " successful.");
                } else {
                    System.out.println("Insufficient balance in Account " + request.accountNumber);
                }
            } else {
                System.out.println("Account " + request.accountNumber + " not found!");
            }
        }
    }
}
