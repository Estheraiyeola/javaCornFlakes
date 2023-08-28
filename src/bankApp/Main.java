package bankApp;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    private static Scanner input = new Scanner(System.in);
    private static Bank bank = new Bank("Esther's Bank");

    public static void main(String[] args) {
        mainMenu();
    }
    public static void mainMenu(){
        System.out.print("""
                =====================================================================
                                WELCOME TO ESTHER'S BANK
                =====================================================================
                SELECT AN OPTION
                1. CREATE ACCOUNT
                2. DEPOSIT
                3. WITHDRAW
                4. TRANSFER
                5. CHECK BALANCE
                0. EXIT
                """);
        String userInput = input.next();
        if (userInput.equals("1")) createAccount();
        else if (userInput.equals("2")) deposit();
        else if (userInput.equals("3")) withdraw();
        else if (userInput.equals("4")) transfer();
        else if (userInput.equals("5")) checkBalance();
        else if (userInput.equals("0")){
            System.out.println("BYE!!!");
            exit(0);
        }
        else{
            System.out.println("Invalid option");
            mainMenu();
        }
    }

    private static void checkBalance() {
        System.out.println("Enter your account number: ");
        String accountNumber = input.next();
        System.out.println("Enter your pin: ");
        String pin = input.next();
        int balance = bank.checkBalance(accountNumber, pin);
        System.out.printf("BALANCE IS %d\n", balance);
        goBackToMain();
        mainMenu();
    }
    public static void getAccountNumber(){
        System.out.print("""
                ======================================================
                        TO GET YOUR ACCOUNT NUMBER
                       CONFIRM YOUR FIRST AND LAST NAME
                ======================================================
                """);
        System.out.println("Enter your firstName: ");
        String firstName = input.next();
        System.out.println("Enter your lastName: ");
        String lastName = input.next();
        System.out.printf("Your Account Number is %s\n", bank.getSize());
    }

    private static void transfer() {
        System.out.println("How much do you want to transfer: ");
        int amountToBeTransferred = input.nextInt();
        System.out.println("What is your account number: ");
        String sendersAccountNumber = input.next();
        System.out.println("What is the receivers account number: ");
        String receiversAccountNumber = input.next();
        System.out.println("Enter your 4 digit pin: ");
        String sendersPin = input.next();
        bank.transfer(amountToBeTransferred, sendersAccountNumber, receiversAccountNumber, sendersPin);
        System.out.println("TRANSFER SUCCESSFUL!!!");
        goBackToMain();
        mainMenu();
    }

    private static void withdraw() {
        System.out.println("How much do you want to withdraw: ");
        int amountToWithdraw = input.nextInt();
        System.out.println("Account number please: ");
        String accountNumber = input.next();
        System.out.println("Enter your 4 digit pin: ");
        String pin = input.next();
        bank.withdraw(amountToWithdraw, accountNumber, pin);
        System.out.println("TAKE YOUR CASH!!!");
        goBackToMain();
        mainMenu();
    }

    private static void deposit() {
        System.out.println("How much do uou want to deposit? ");
        int amountToBeDeposited = input.nextInt();
        System.out.println("Account number please: ");
        String accountNumber = input.next();
        bank.deposit(amountToBeDeposited, accountNumber);
        System.out.println("""
                DEPOSIT WAS SUCCESSFUL!!!
                """);
        goBackToMain();
        mainMenu();
    }

    private static void goBackToMain() {
        System.out.println("PRESS 0 TO GO BACK TO MAIN MENU");
        String userInput = input.next();
        if (userInput.equals("0")) mainMenu();
        else System.out.println("Invalid Option. Press 0 to continue");
    }

    public static void createAccount(){
        System.out.println("Enter your first name: ");
        String firstName = input.next();
        System.out.println("Enter your last name: ");
        String lastName = input.next();
        System.out.println("Enter your 4 digit pin: ");
        String pin = input.next();
        bank.register(firstName, lastName, pin);
        getAccountNumber();
        System.out.println("ACCOUNT CREATED SUCCESSFULLY");
        goBackToMain();
        mainMenu();
    }
}
