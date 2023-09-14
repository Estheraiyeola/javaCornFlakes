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
        String message = ("""
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
        String userInput = input(message);
        switch (userInput) {
            case "1" -> createAccount();
            case "2" -> deposit();
            case "3" -> withdraw();
            case "4" -> transfer();
            case "5" -> checkBalance();
            case "0" -> {
                System.out.println("BYE!!!");
                exit(0);
            }
            default -> {
                System.out.println("Invalid option");
                mainMenu();
            }
        }
    }

    private static void checkBalance() {
        try {
            String accountNumber = input("Enter your account number: ");
            String pin = input("Enter your pin: ");
            int balance = bank.checkBalance(accountNumber, pin);
            display("BALANCE IS " + balance);
            goBackToMain();
            mainMenu();
        }catch (IllegalArgumentException | IllegalStateException e){
            display(e.getMessage());
            mainMenu();
        }

    }
    public static void getAccountNumber(){
        display("""
                ======================================================
                        GET YOUR ACCOUNT NUMBER
                ======================================================
                ACCOUNT NUMBER -> \s""" + bank.getSize());
    }

    private static void transfer() {
        try {
            int amountToBeTransferred = Integer.parseInt(input("How much do you want to transfer: "));
            String sendersAccountNumber = input("What is your account number: ");
            String receiversAccountNumber = input("What is the receivers account number: ");
            String sendersPin = input("Enter your pin: ");
            bank.transfer(amountToBeTransferred, sendersAccountNumber, receiversAccountNumber, sendersPin);
            display("TRANSFER SUCCESSFUL!!!");
            goBackToMain();
            mainMenu();
        }catch (InputMismatchException | IllegalStateException | IllegalArgumentException e){
            display(e.getMessage());
            mainMenu();
        }

    }


    private static void withdraw() {
        try {
            int amountToWithdraw = Integer.parseInt(input("How much do you want to withdraw: "));
            String accountNumber = input("Account number please: ");
            String pin = input("Enter your pin: ");
            bank.withdraw(amountToWithdraw, accountNumber, pin);
            System.out.println("TAKE YOUR CASH!!!");
            goBackToMain();
            mainMenu();
        }catch(IllegalStateException | IllegalArgumentException | InputMismatchException e) {
            display(e.getMessage());
            mainMenu();
        }

    }

//    private static String validatePin() {
//        try {
//            System.out.println("Enter your 4 digit pin: ");
//            String pin = input.next();
//            return pin;
//        }catch (IllegalArgumentException e){
//            System.out.println("Invalid pin");
//            validatePin();
//        }
//        return null;
//
//    }

//    private static String validateAccountNumber() {
//        try {
//            String accountNumber = input.next();
//            return accountNumber;
//        }catch (IllegalStateException e){
//            System.out.println("Account not found");
//            String accountNumber = input.next();
//            validateAccountNumber();
//        }
//        return null;
//
//    }
//
//    private static int validateAmount(int amount) {
//        try {
//            amount = input.nextInt();
//        }
//        catch (InputMismatchException e){
//            System.out.println("Invalid input");
//            validateAmount(amount);
//        }
//        return amount;
//    }

    private static void deposit() {
        try {
            int amountToBeDeposited = Integer.parseInt(input("How much do uou want to deposit? "));
            String accountNumber = input("Account number please: ");
            bank.deposit(amountToBeDeposited, accountNumber);
            display("Amount Successfully deposited");
            goBackToMain();
            mainMenu();
        }catch (InputMismatchException | IllegalArgumentException | IllegalStateException e){
            System.out.println("Invalid Input");
            deposit();
        }
    }

    private static void goBackToMain() {
        String userInput = input("PRESS 0 TO GO BACK TO MAIN MENU");
        if (userInput.equals("0")) mainMenu();
        else display("Invalid Option. Press 0 to continue");
    }

    public static void createAccount(){
        try {
            String firstName = input("Enter your first name: ");
            String lastName = input("Enter your last name: ");
            String pin = input("Enter your pin: ");
            bank.register(firstName, lastName, pin);
            getAccountNumber();
            display("ACCOUNT CREATED SUCCESSFULLY");
            goBackToMain();
            mainMenu();
        }
        catch (IllegalArgumentException | InputMismatchException e){
            display(e.getMessage());
            mainMenu();
        }

    }
    public static void display(String message){
        JOptionPane.showMessageDialog(null, message);
    }
    public static String input(String message){
        return JOptionPane.showInputDialog(null,message);
    }
}
