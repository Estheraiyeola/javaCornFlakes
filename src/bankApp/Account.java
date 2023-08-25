package bankApp;

public class Account {
    private int balance;
    private String pin;
    private String accountNumber;

    public Account(String accountNumber, String firstNameLastName, String pin) {
        this.pin = pin;
        this.accountNumber = accountNumber;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public int checkBalance(String pin) {
        validate(pin);
        return balance;
    }

    public void withdraw(int amount, String pin) {
        validate(pin);
        balance -= amount;
    }

    private void validate(String pin) {
        if (!isCorrectPin(pin)) throw new IllegalArgumentException("pin is not correct");
    }

    private boolean isCorrectPin(String pin) {
        return this.pin.equals(pin);
    }

    public String getAccount() {
        return accountNumber;
    }
}
