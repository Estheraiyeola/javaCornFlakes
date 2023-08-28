package bankApp;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts = new ArrayList<>();


    public Bank(String bankName) {
    }

    public void register(String firstName, String lastName, String pin) {
        Account account = new Account(generateAccountNumber(), firstName + " " + lastName, pin);
        accounts.add(account);
    }

    private String generateAccountNumber() {
        return accounts.size() + 1 + "";
    }

    public Account findAccount(String accountNumber) {
        for (Account account: accounts) {
            if (account.getAccountNumber().equals(accountNumber)) return account;
        }
        throw new IllegalStateException("Account not found");

    }

    public String printListOfAccounts() {
        for (Account account:accounts) {
            return account.getAccount();
        }
        return null;
    }

    public void deposit(int amount, String accountNumber) {
        findAccount(accountNumber).deposit(amount);
    }

    public int checkBalance(String accountNumber, String pin) {
        return findAccount(accountNumber).checkBalance(pin);
    }

    public void withdraw(int amount, String accountNumber, String pin) {
        findAccount(accountNumber).withdraw(amount, pin);
    }

    public void transfer(int amount, String sendersAccountNumber, String receiversAccountNumber, String sendersPin) {
        findAccount(sendersAccountNumber).withdraw(amount, sendersPin);
        findAccount(receiversAccountNumber).deposit(amount);
    }
    public int getSize(){
        return accounts.size();
    }
}
