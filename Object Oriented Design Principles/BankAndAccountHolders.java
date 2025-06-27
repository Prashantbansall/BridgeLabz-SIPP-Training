package objectOrientedDesignPrinciples;

import java.util.ArrayList;

class Bank {
    String name;

    Bank(String name) {
        this.name = name;
    }

    void openAccount(Customer customer) {
        System.out.println(customer.name + " opened an account in " + name + ".");
    }
}

class Customer {
    String name;
    ArrayList<Bank> banks;
    double balance;

    Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
        banks = new ArrayList<>();
    }

    void addBank(Bank bank) {
        banks.add(bank);
        bank.openAccount(this);
    }

    void viewBalance() {
        System.out.println(name + "'s balance: $" + balance);
    }
}

public class BankAndAccountHolders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b1 = new Bank("HDFC");
        Bank b2 = new Bank("ICICI");

        Customer c1 = new Customer("Alice", 5000.0);
        Customer c2 = new Customer("Bob", 3000.0);

        c1.addBank(b1);
        c1.addBank(b2);

        c2.addBank(b2);

        c1.viewBalance();
        c2.viewBalance();
	}

}
