package corn_flakes;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {
    private String password;
    public void collectPassword(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a password: ");
        this.password = input.nextLine();
    }
    public void passwordValidatorMethod(){
        collectPassword();
        hasEightCharacters(password);
        hasUpperCaseCharacters(password);
        hasLowerCaseCharacters(password);
        hasDigits(password);
        hasSpecialCharacters(password);
    }
    public void hasEightCharacters(String password){
        if (password.length() < 8){
            System.out.println("Password must be eight characters");
            passwordValidatorMethod();
        }
    }
    public void hasUpperCaseCharacters(String password){
        Pattern pattern = Pattern.compile("[A-Z]");
        Matcher matcher = pattern.matcher(password);
        if (!matcher.find()){
            System.out.println("Password must have capital letter");
            passwordValidatorMethod();
        }
    }

    public void hasLowerCaseCharacters(String password) {
        Pattern pattern = Pattern.compile("[a-z]");
        Matcher matcher = pattern.matcher(password);
        if (!matcher.find()) {
            System.out.println("Password must have smaller letter");
            passwordValidatorMethod();
        }
    }
    public void hasDigits(String password) {
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher(password);
        if (!matcher.find()) {
            System.out.println("Password must have digits");
            passwordValidatorMethod();
        }
    }
    public void hasSpecialCharacters(String password){
        Pattern pattern = Pattern.compile("[^A-Za-z0-9]");
        Matcher matcher = pattern.matcher(password);
        if (!matcher.find()) {
            System.out.println("Password must have special characters");
            passwordValidatorMethod();
        }
    }

    public static void main(String[] args) {
        PasswordValidator passwordValidator = new PasswordValidator();
        passwordValidator.passwordValidatorMethod();
        System.out.println("Correct Password");
    }
}
