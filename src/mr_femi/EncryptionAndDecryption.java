package mr_femi;

import java.util.Scanner;

public class EncryptionAndDecryption {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a four digit integer: ");
        String value = input.next();
        System.out.println(decryptFourIntegers(value));
    }
    public static String encryptFourDigitInteger(String integer){
        String numbers = "";
        if(integer.length() <= 4) {
            int value = Integer.parseInt(integer);
            int firstNumber = value / 1000;
            int second = value / 100;
            int secondNumber = second % 10;
            int third = value / 10;
            int thirdNumber = third % 10;
            int fourthNumber = value % 10;

            int addFirstNumber = (firstNumber + 7) % 10;
            int addSecondNumber = (secondNumber + 7) % 10;
            int addThirdNumber = (thirdNumber + 7) % 10;
            int addFourthNumber = (fourthNumber + 7) % 10;


            numbers = String.valueOf(addThirdNumber) + addFourthNumber + addFirstNumber + addSecondNumber;
        }

        return numbers;
    }
    public static  String decryptFourIntegers(String integer){
        String numbers = "";
        if (integer.length() <= 4){
            int value = Integer.parseInt(integer);
            int third = value / 1000;
            int four = value / 100;
            int fourth = four % 10;
            int firs = value / 10;
            int first = firs % 10;
            int second = value % 10;
            System.out.println(first);
            int multiplyFirstNumber = first * 10 - 7;
            int multiplySecondNumber = second * 10 - 7;
            int multiplyThirdNumber = third * 10 - 7;
            int multiplyFourthNumber = fourth * 10 -7;

            numbers = "" + multiplyFirstNumber + multiplySecondNumber + multiplyThirdNumber + multiplyFourthNumber;
        }
        return numbers;
    }
}
