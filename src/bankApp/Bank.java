package bankApp;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts = new ArrayList<>();


    public Bank(String bankName) {
    }

    public void register(String firstName, String lastName, String pin) {
        Account account = new Account(generateAccountNumber(), firstName + " " + lastName, "pin");
        accounts.add(account);
    }

    private String generateAccountNumber() {
        return accounts.size() + 1 + " ";
    }

    public Account findAccount(String accountNumber) {
        for (Account account:accounts) {
            if (account.getAccount().equals(accountNumber)) return account;
        }
        return null;
    }

    public String printListOfAccounts() {
        for (Account account:accounts) {
            return account.getAccount();
        }
        return null;
    }
}
