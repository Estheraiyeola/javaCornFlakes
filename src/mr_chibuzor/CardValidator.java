package mr_chibuzor;

import java.util.Scanner;

public class CardValidator {
    private int length;
    private Scanner input = new Scanner(System.in);
    private String cardNumber ;
    private int[] cardNumberArray;

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
    public void allocatingAnArrayToTheCardNumber(){
        if (cardNumber.length() == 13) cardNumberArray = new int[13];
        if (cardNumber.length() == 14) cardNumberArray = new int[14];
        if (cardNumber.length() == 15) cardNumberArray = new int[15];
        if (cardNumber.length() == 16) cardNumberArray = new int[16];
    }
//    public int[] iteratesOverTheStringAndAllocatesItToAVariable(){
//        int variable = 0;
//        for (int index = 0; index < cardNumber.length(); index++) {
//            variable = (() cardNumber.codePointAt(index));
//            cardNumberArray[index] = variable;
//        }
//        variable = 0;
//        return cardNumberArray;
//    }
}
