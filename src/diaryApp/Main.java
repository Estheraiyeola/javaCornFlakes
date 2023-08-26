package diaryApp;

import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);
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
        if (userInput.equals("2"))signUpMenu();
    }
    public static void logInValidator(){
        System.out.println("Username: ");
        String username = input.next();
        Diaries diaries = new Diaries();
        if (diaries.findByUsername(username).equals(username)) logInMenu();
        else {
            signUpMenu();
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
                7. UPDATE ENTRY
                """);
    }
    public static void signUpMenu(){
        System.out.print("""
                ============================================================================
                                                SIGN UP
                ============================================================================
                SELECT AN OPTION
                1. CREATE DIARY
                """);
    }
    public static void addEntry(){

    }
}
