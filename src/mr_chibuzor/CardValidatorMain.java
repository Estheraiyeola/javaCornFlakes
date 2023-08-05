package mr_chibuzor;

import java.util.Scanner;

public class CardValidatorMain {
    public static void main(String[] args) {
        CardValidator validator = new CardValidator();
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, Kindly Enter card details to verify");
        String cardNumber = input.next();
        validator.creditCardCollector(cardNumber);
    }
}
