package mr_chibuzor;

import java.util.Arrays;

public class CardValidatorMain {
    public static void main(String[] args) {
        CardValidator validator = new CardValidator();
        System.out.println("Hello, Kindly Enter card details to verify");
        validator.creditCardCollector();
    }
}
