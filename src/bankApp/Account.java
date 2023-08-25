package bankApp;

import java.util.regex.Pattern;

public class Account {
    private final String name;
    private int balance;
    private String pin;
    private String accountNumber;

    public Account(String accountNumber, String firstNameLastName, String pin) {
        this.pin = pin;
        this.accountNumber = accountNumber;
        this.name = firstNameLastName;
    }

    public void deposit(int amount) {
        validate(amount);
        balance += amount;
    }

    public int checkBalance(String pin) {
        validate(pin);
        return balance;
    }

    public void withdraw(int amount, String pin) {
        validate(pin);
        validate(amount);
        balance -= amount;
    }

    private void validate(String pin) {
        if (!pinIsANumber(pin)) throw new IllegalArgumentException("pin is a number");
        if (!isCorrectPin(pin)) throw new IllegalArgumentException("pin is not correct");
    }
    private void validate(int amount){
        if (amountIsNegative(amount)) throw new IllegalArgumentException("Amount cannot be negative");
    }

    private boolean amountIsNegative(int amount) {
        return (amount < 0);
    }

    private boolean pinIsANumber(String pin) {
        return (pin.matches("[0-9]{4}"));
    }

    private boolean isCorrectPin(String pin) {
        return this.pin.equals(pin);
    }

    public String getAccount() {
        return accountNumber + " " + name + " " + pin;
    }
    public  String getAccountNumber(){
        return accountNumber;
    }
    public String getName(){
        return accountNumber;
    }

    public void updatePin(String pin) {
        this.pin = pin;
    }
}
