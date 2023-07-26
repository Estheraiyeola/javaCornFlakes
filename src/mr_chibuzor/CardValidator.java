package mr_chibuzor;

import java.util.Scanner;

public class CardValidator {
    private int length;
    private final Scanner input = new Scanner(System.in);
    private String cardNumber ;
    private int[] cardNumberArray;
    private char[] cardNumberArray2;

    public void creditCardCollector() {
        int length = 0;
        String cardNumber = input.next();
        this.cardNumber = cardNumber;
        for (int index = 0; index < cardNumber.length(); index++) {
            length++;
        }
        if (cardNumber.length() >= 13 && cardNumber.length() <= 16){
            this.length = length;
            System.out.println(getLength());
            allocatingAnArrayToTheCardNumber();
            System.out.println(iteratesOverTheStringAndAllocatesItToAVariable());
            System.out.println(checksForTypeOfCard());
            System.out.println(addingNumbersInEvenPositions());
        }
        else System.out.println("Invalid length");


    }

    public int getLength() {
        return length;
    }
    public void allocatingAnArrayToTheCardNumber(){
        if (cardNumber.length() == 13) {
            cardNumberArray2 = new char[13];
            cardNumberArray = new int[cardNumberArray2.length];
        }
        if (cardNumber.length() == 14) {
            cardNumberArray2 = new char[14];
            cardNumberArray2 = new char[16];
            cardNumberArray = new int[16];
        }
    }
    public int[] iteratesOverTheStringAndAllocatesItToAVariable(){
       cardNumberArray2 = cardNumber.toCharArray();
        for (int index = 0; index < cardNumberArray2.length; index++) {
            cardNumberArray[index] = cardNumberArray2[index];
        }

        return cardNumberArray;
    }
    public String checksForTypeOfCard(){
        String cardType = "";
        if (cardNumber.startsWith("4")){
            cardType= "Visa Card";
        }
        else if (cardNumber.startsWith("5")){
            cardType = "MasterCard";
        }
        else if (cardNumber.startsWith("37")){
            cardType = "American Express Cards";
        }
        else if (cardNumber.startsWith("6")){
            cardType = "Discover Cards";
        }
        else System.out.println("Invalid input");
        return cardType;
    }
    public int addingNumbersInEvenPositions(){
        char temp = 0;
        for (int index = 0; index < cardNumberArray.length; index++) {
            if (index % 2 == 0){
                temp += cardNumberArray[index];
                if (temp > 9){
                    String convertedTemp = String.valueOf((temp));
                    temp = 0;
                    for (int idx = 0; idx < convertedTemp.length(); idx++) {
                        temp += convertedTemp.charAt(idx);
                    }
                }
            }
        }
        return temp;
    }
}
