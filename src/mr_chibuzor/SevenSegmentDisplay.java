package mr_chibuzor;

import java.util.Scanner;

public class SevenSegmentDisplay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number with 8 digits: ");
        String userInput = input.next();
        String[][] number = new String[5][4];

        createDisplay(userInput, number);
    }
    public static void createDisplay(String userInput, String[][] array){
        if (userInput.length() > 0 && userInput.length() <= 8) {
            int segmentA = userInput.charAt(0);
            int segmentB = userInput.charAt(1);
            int segmentC = userInput.charAt(2);
            int segmentD = userInput.charAt(3);
            int segmentE = userInput.charAt(4);
            int segmentF = userInput.charAt(5);
            int segmentG = userInput.charAt(6);
            int segmentH = userInput.charAt(7);
            if (segmentH == 49) {
                for (int index = 0; index < array.length; index++) {
                    for (int index1 = 0; index1 < array[index].length; index1++) {
                        array[index][index1] = " ";
                        if (segmentA == 49) {
                            array[0] = new String[]{"#", "#", "#", "#"};
                        }
                        if (segmentB == 49) {
                            array[1][3] = "#";
                        }
                        if (segmentC == 49) {
                            array[3][3] = "#";
                        }
                        if (segmentD == 49) {
                            array[4] = new String[]{"#", "#", "#", "#"};
                        }
                        if (segmentE == 49) {
                            array[3][0] = "#";
                        }
                        if (segmentF == 49) {
                            array[0][0] = "#";
                            array[1][0] = "#";
                        }
                        if (segmentG == 49) {
                            array[2] = new String[]{"#", "#", "#", "#"};
                        }
                        if (segmentB == 49 && segmentC == 49){
                            array[0][3] = "#";
                            array[1][3] = "#";
                            array[2][3] = "#";
                            array[3][3] = "#";
                            array[4][3] = "#";
                        }
                        if (segmentE == 49 && segmentF == 49){
                            array[0][0] = "#";
                            array[1][0] = "#";
                            array[2][0] = "#";
                            array[3][0] = "#";
                            array[4][0] = "#";
                        }
                        else System.out.print(" ");


                        System.out.print(array[index][index1] + " ");
                    }
                    System.out.println();

                }
            }
        }
        else System.out.println("Invalid input");
    }



}
