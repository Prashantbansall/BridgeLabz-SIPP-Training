import java.util.*;

public class BankingSystem {
    private Map<Integer, Double> accounts = new HashMap<>();
    private TreeMap<Double, List<Integer>> sortedAccounts = new TreeMap<>(Collections.reverseOrder());
    private Queue<WithdrawalRequest> withdrawalQueue = new LinkedList<>();

    static class WithdrawalRequest {
        int accountNumber;
        double amount;

        WithdrawalRequest(int accountNumber, double amount) {
            this.accountNumber = accountNumber;
            this.amount = amount;
        }
    }

    public void addAccount(int accountNumber, double balance) {
        accounts.put(accountNumber, balance);
        sortedAccounts.computeIfAbsent(balance, k -> new ArrayList<>()).add(accountNumber);
    }

    public void queueWithdrawal(int accountNumber, double amount) {
        withdrawalQueue.offer(new WithdrawalRequest(accountNumber, amount));
    }

    public void processWithdrawals() {
        while (!withdrawalQueue.isEmpty()) {
            WithdrawalRequest request = withdrawalQueue.poll();
            double currentBalance = accounts.getOrDefault(request.accountNumber, -1.0);
            if (currentBalance >= request.amount) {
                updateBalance(request.accountNumber, currentBalance - request.amount);
                System.out.println("Withdrawal successful: " + request.accountNumber + " -> " + request.amount);
            } else {
                System.out.println("Insufficient funds: " + request.accountNumber);
            }
        }
    }

    private void updateBalance(int accountNumber, double newBalance) {
        double oldBalance = accounts.get(accountNumber);
        accounts.put(accountNumber, newBalance);
        sortedAccounts.get(oldBalance).remove((Integer) accountNumber);
        if (sortedAccounts.get(oldBalance).isEmpty()) sortedAccounts.remove(oldBalance);
        sortedAccounts.computeIfAbsent(newBalance, k -> new ArrayList<>()).add(accountNumber);
    }

    public void printSortedAccounts() {
        for (Map.Entry<Double, List<Integer>> entry : sortedAccounts.entrySet()) {
            for (int accNum : entry.getValue()) {
                System.out.println("Account: " + accNum + ", Balance: " + entry.getKey());
            }
        }
    }

    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();
        bank.addAccount(101, 5000);
        bank.addAccount(102, 3000);
        bank.addAccount(103, 7000);
        bank.addAccount(104, 3000);

        bank.queueWithdrawal(101, 1500);
        bank.queueWithdrawal(102, 4000);
        bank.queueWithdrawal(103, 2000);
        bank.queueWithdrawal(104, 1000);

        bank.processWithdrawals();

        System.out.println("Sorted Accounts:");
        bank.printSortedAccounts();
    }
}
