package this_static_final_keywords_and_instanceof_operator;

class BankAccount {
    static String bankName = "ABC Bank";
    static int totalAccounts = 0;

    final int accountNumber;
    String accountHolderName;

    BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
        }
    }
}
public class BankAccountSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount acc1 = new BankAccount("John Doe", 101);
        BankAccount acc2 = new BankAccount("Jane Smith", 102);

        acc1.displayDetails();
        acc2.displayDetails();

        BankAccount.getTotalAccounts();
	}

}
