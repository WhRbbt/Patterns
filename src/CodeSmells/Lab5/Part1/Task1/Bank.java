package CodeSmells.Lab5.Part1.Task1;

import java.util.List;

public class Bank {
    private List<Account> accounts;

    public void calculateInterest(Account account) {
        double interest = account.getBalance() * account.getInterestRate() / 100;
        System.out.println("Interest calculated: " + interest);
    }

    public void processAccounts() {
        for (Account account : accounts) {
            calculateInterest(account);
        }
    }
}