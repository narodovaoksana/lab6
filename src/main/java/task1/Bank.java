package task1;

import java.util.List;

public class Bank {
    private List<Account> accounts;
    // Конструктор та інші методи класу...

    public void processAccounts() {
        for (Account account : accounts) {
            double interest = calculateInterestForAccount(account);
            System.out.println("Interest calculated: " + interest);
        }
    }

    private double calculateInterestForAccount(Account account) {
        double balance = account.getBalance();
        double interestRate = account.getInterestRate();
        return balance * interestRate / 100;
    }
}
