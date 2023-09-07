package bankApp;

import javax.swing.*;
import java.util.InputMismatchException;
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
        String accountNumber = validateAccountNumber();
        String pin = validatePin();
        int balance = bank.checkBalance(accountNumber, pin);
        System.out.println("BALANCE IS " + balance);
        goBackToMain();
        mainMenu();
    }
    public static void getAccountNumber(){
        System.out.print("""
                ======================================================
                        GET YOUR ACCOUNT NUMBER
                ======================================================
                """);
    }

    private static void transfer() {
        System.out.println("How much do you want to transfer: ");
        int amountToBeTransferred = input.nextInt();
        System.out.println("What is your account number: ");
        String sendersAccountNumber = validateAccountNumber();
        System.out.println("What is the receivers account number: ");
        String receiversAccountNumber = validateAccountNumber();
        String sendersPin = validatePin();
        bank.transfer(amountToBeTransferred, sendersAccountNumber, receiversAccountNumber, sendersPin);
        System.out.println("TRANSFER SUCCESSFUL!!!");
        goBackToMain();
        mainMenu();
    }


    private static void withdraw() {
        try {
            System.out.println("How much do you want to withdraw: ");
            int amountToWithdraw = input.nextInt();
            System.out.println("Account number please: ");
            String accountNumber = validateAccountNumber();
            String pin = validatePin();
            bank.withdraw(amountToWithdraw, accountNumber, pin);
        }catch(IllegalStateException e){
            System.out.println("Account not found");
            validateAccountNumber();
        }catch (IllegalArgumentException e){
            System.out.println("Incorrect pin");
            validatePin();
        }
        System.out.println("TAKE YOUR CASH!!!");
        goBackToMain();
        mainMenu();
    }

    private static String validatePin() {
        try {
            System.out.println("Enter your 4 digit pin: ");
            String pin = input.next();
            return pin;
        }catch (IllegalArgumentException e){
            System.out.println("Invalid pin");
            validatePin();
        }
        return null;

    }

    private static String validateAccountNumber() {
        try {
            String accountNumber = input.next();
            return accountNumber;
        }catch (IllegalStateException e){
            System.out.println("Account not found");
            String accountNumber = input.next();
            validateAccountNumber();
        }
        return null;

    }

    private static int validateAmount(int amount) {
        try {
            amount = input.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("Invalid input");
            validateAmount(amount);
        }
        return amount;
    }

    private static void deposit() {
        try {
            System.out.println("How much do uou want to deposit? ");
            int amountToBeDeposited = input.nextInt();
            System.out.println("Account number please: ");
            String accountNumber = validateAccountNumber();
            bank.deposit(amountToBeDeposited, accountNumber);
        }catch (InputMismatchException | IllegalArgumentException | IllegalStateException e){
            System.out.println("Invalid Input");
            deposit();
        }


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
        try {
            String pin = validatePin();
            bank.register(firstName, lastName, pin);
        }
        catch (IllegalArgumentException e){
            System.out.println("Invalid Pin");
            validatePin();
        }
        getAccountNumber();
        System.out.println("ACCOUNT CREATED SUCCESSFULLY");
        goBackToMain();
        mainMenu();
    }
    public static void display(String message){
        JOptionPane.showMessageDialog(null, message);
    }
    public static void input(String message){
        JOptionPane.showInputDialog(message);
    }
}
