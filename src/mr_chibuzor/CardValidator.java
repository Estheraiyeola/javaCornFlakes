package mr_chibuzor;

import java.util.Scanner;

public class CardValidator {
    private int length;
    private Scanner input = new Scanner(System.in);
    private String cardNumber;
    private int[] cardNumberArray = new int[16];

    public void creditCardCollector() {
        int length = 0;
        String cardNumber = input.next();
        this.cardNumber = cardNumber;
        for (int index = 0; index < cardNumber.length(); index++) {
            length++;
        }
        if (cardNumber.length() >= 13 && cardNumber.length() <= 16){
            this.length = length;
        }
        else System.out.println("Invalid length");
    }

    public int getLength() {
        return length;
    }

}
