package diaryApp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);
    private static Diaries diaries = new Diaries();
    private static String username;
    private static String password;
    private static Diary diary = new Diary(username, password);


    public static void main(String[] args) {
        Main main = new Main();
        mainMenu();
    }
    public static void mainMenu(){
        System.out.print("""
                ===========================================================================
                                        WELCOME TO THE DIARY PLACE
                ===========================================================================
                SELECT AN OPTION:
                1. LOGIN
                2. SIGN UP
                """);
        String userInput = input.next();
        if (userInput.equals("1"))logInValidator();
        else if (userInput.equals("2"))signUpMenu();
        else mainMenu();
    }
    public static void logInValidator(){
        try {
            System.out.println("Username: ");
            String username = input.next();
            if (diaries.findByUsername(username).getUsername().equals(username)) logInMenu();
        }catch (IllegalArgumentException e){
            System.out.println("Diary does not exist");
            mainMenu();
        }

    }
    public static void logInMenu(){
        System.out.print("""
                ============================================================================
                                                MENU
                ============================================================================
                SELECT AN OPTION
                1. ADD ENTRY
                2. UPDATE ENTRY
                3. DELETE ENTRY
                4. FIND ENTRY
                5. LOCK DIARY
                6. UNLOCK DIARY
                """);
        String userInput = input.next();
        if (userInput.equals("1")) addEntry();
        else if (userInput.equals("2")) updateEntry();
        else if (userInput.equals("3")) deleteEntry();
        else if (userInput.equals("4")) findEntry();
        else if (userInput.equals("5")) lockEntry();
        else if (userInput.equals("6")) unlockEntry();
        else {
            System.out.println("Invalid Input");
            logInMenu();
        }
    }

    private static void unlockEntry() {
    }

    private static void lockEntry() {
    }

    private static void findEntry() {
        try {
            System.out.println("Enter entry id: ");
            int id = input.nextInt();
            System.out.println(diary.findEntry(id));
            logInMenu();
        }catch (IllegalArgumentException e){
            System.out.println("Invalid Input");
            logInMenu();
        }
    }

    private static void deleteEntry() {
    }

    private static void updateEntry() {
        System.out.println("Enter your id number: ");
        int id = input.nextInt();
        System.out.println("Add to title: ");
        input.next();
        String newTitle = input.nextLine();
        System.out.println("Add to body: ");
        String newBody = input.nextLine();
        try {
            diary.findEntry(id).updateEntry(newTitle,newBody);
            saveEntry();
        }
        catch (IllegalArgumentException e){
            System.out.println("Entry not found");
            logInMenu();
        }
    }

    private static void addEntry() {
        System.out.print("""
                ========================================================
                                    ADD ENTRY.....
                ========================================================
                """);
        System.out.println("What's the title of your entry? ");
        String title = input.nextLine();
        input.next();
        System.out.println("What do you want to share today? ");
        String body = input.nextLine();
        input.next();
        try {
            diary.createEntry(title, body);
            System.out.printf("ID for this entry is %d\n", diary.getSize());
            saveEntry();
        }catch (InputMismatchException | IllegalArgumentException e){
            System.out.println("Invalid Input");
            logInMenu();
        }


    }

    public static void saveEntry(){
        System.out.print("Saving");
        System.out.println(">".repeat(10));
        System.out.println("Saved");
        System.out.println();
        logInMenu();
    }

    public static void signUpMenu(){
        System.out.print("""
                ============================================================================
                                                SIGN UP
                ============================================================================
                SELECT AN OPTION
                1. CREATE DIARY
                """);
        String userInput = input.next();
        if (userInput.equals("1")) createDiary();
        else {
            System.out.println("Invalid Input");
            signUpMenu();
        }
    }
    public static void createDiary(){
        System.out.println("Enter a username: ");
        username = input.next();
        System.out.println("Enter a password: ");
        password = input.next();
        try {
            diaries.add(username, password);
            System.out.print("""
                DIARY CREATED SUCCESSFULLY!!!
                """);
            mainMenu();
        }catch (InputMismatchException e){
            System.out.println("Invalid Input");
            mainMenu();
        }

    }
}
