package diaryApp;

import javax.swing.*;
import java.util.InputMismatchException;

import static java.lang.System.exit;

public class Main {
    private static Diaries diaries = new Diaries();
    private  String username;


    public static void main(String[] args) {
        Main main = new Main();
        main.mainMenu();
    }
    public  void mainMenu(){
        String message =("""
                ===========================================================================
                                        WELCOME TO THE DIARY PLACE
                ===========================================================================
                SELECT AN OPTION:
                1. LOGIN
                2. SIGN UP
                3. EXIT
                """);
        String userInput = input(message);
        switch (userInput) {
            case "1" -> logInValidator();
            case "2" -> signUpMenu();
            case "3" -> exitApp();
            default -> {
                display("Invalid Input");
                mainMenu();
            }
        }
    }

    private  void exitApp() {
        exit(0);
    }

    public void logInValidator(){
        try {
            String username =input("Username: ");
            String password =input("Password: ");
            diaries.validate(username, password);
            this.username = username;
            logInMenu();
        }catch (IllegalArgumentException e){
            display("Diary does not exist");
            mainMenu();
        }

    }
    public void logInMenu(){
        String message = ("""
                ============================================================================
                                                MENU
                ============================================================================
                SELECT AN OPTION
                1. ADD ENTRY
                2. UPDATE ENTRY
                3. DELETE ENTRY
                4. FIND ENTRY
                5. LOCK DIARY
                6. LOG OUT
                """);
        String userInput = input(message);
        switch (userInput) {
            case "1" -> addEntry();
            case "2" -> updateEntry();
            case "3" -> deleteEntry();
            case "4" -> findEntry();
            case "5" -> lockDiary();
            case "6" -> {
                display("Logging out.......");
                mainMenu();
            }
            default -> {
                System.out.println("Invalid Input");
                logInMenu();
            }
        }
    }

    private void unlockDiary() {
        try {
            String password = input("Enter your password: ");
            diaries.findByUsername(username).unlockDiary(password);
            display("Diary Unlocked!!!");
            logInMenu();
        }catch (IllegalArgumentException e){
            display(e.getMessage());
            unlockDiary();
        }

    }

    private  void lockDiary() {
        diaries.findByUsername(username).lockDiary();
        display("Diary is locked");
        String message = input("""
        SELECT:
        1. UNLOCK DIARY
        2. LOG OUT
        3. EXIT
        """);
        switch (message){
            case "1" -> unlockDiary();
            case "2" -> {
                display("Logging out.......");
                mainMenu();
            }
            case "3" -> exitApp();
            default -> lockDiary();
        }
    }

    private  void findEntry() {
        try {
            int id = Integer.parseInt(input("Enter entry id: "));
            display(diaries.findByUsername(username).findEntry(id).getEntry());
            logInMenu();
        }catch (IllegalArgumentException e){
            display(e.getMessage());
            logInMenu();
        }
    }

    private void deleteEntry() {
        try {
            int id = Integer.parseInt(input("Enter your id: "));
            diaries.findByUsername(username).deleteEntry(id);
            display("Entry deleted");
            saveEntry();
        }catch (InputMismatchException | IllegalArgumentException e){
            display(e.getMessage());
            logInMenu();
        }
    }

    private  void updateEntry() {
        int id = Integer.parseInt(input("Enter your id number: "));
        String newTitle = input("Add to title: ");
        String newBody = input("Add to body: ");
        try {
            diaries.findByUsername(username).updateEntry(id, newTitle, newBody);
            saveEntry();
        }
        catch (IllegalArgumentException e){
            display("Entry not found");
            logInMenu();
        }
    }

    private  void addEntry() {
        try {
            display("ADD ENTRY.....");
            String title = input("What's the title of your entry? ");
            String body = input("What do you want to share today? ");
            diaries.findByUsername(username).createEntry(title, body);
            saveEntry();
        }catch (InputMismatchException | IllegalArgumentException e){
            display("Invalid Input");
            logInMenu();
        }


    }

    public  void saveEntry(){
        display("Saving" + ">".repeat(10));
        display("Saved");
        logInMenu();
    }

    public  void signUpMenu(){
        String message = ("""
                ============================================================================
                                                SIGN UP
                ============================================================================
                SELECT AN OPTION
                1. CREATE DIARY
                """);
        String userInput = input(message);
        if (userInput.equals("1")) createDiary();
        else {
            display("Invalid Input");
            signUpMenu();
        }
    }
    public  void createDiary(){
        try {
            String username = input("Enter a username: ");
            String password = input("Enter a password: ");
            diaries.add(username, password);
            display("""
                DIARY CREATED SUCCESSFULLY!!!
                """);
            mainMenu();
        }catch (InputMismatchException e){
            display("Invalid Input");
            mainMenu();
        }

    }
    private static String input(String message){
        return JOptionPane.showInputDialog(null, message);
    }
    private static void display(String message){
        JOptionPane.showMessageDialog(null, message);
    }
}
