package mr_femi;

import java.util.Arrays;
import java.util.Scanner;

public class UserInputArray {
    public static void main(String[] args) {
        collectUserInput();
        sumUserInput();
        averageUserInput();
        minimumUserInput();
        maximumUserInput();
        System.out.println(Arrays.deepToString(userInputStorage));

    }
    public static int[][] userInputStorage = new int[3][7];
    private static Scanner input = new Scanner(System.in);
    public static void collectUserInput(){
        for (int index = 0; index < 9; index++) {
            int userInput = input.nextInt();
            if (index == 0) userInputStorage[0][0] = userInput;
            if (index == 1) userInputStorage[0][1] = userInput;
            if (index == 2) userInputStorage[0][2] = userInput;
            if (index == 3) userInputStorage[1][0] = userInput;
            if (index == 4) userInputStorage[1][1] = userInput;
            if (index == 5) userInputStorage[1][2] = userInput;
            if (index == 6) userInputStorage[2][0] = userInput;
            if (index == 7) userInputStorage[2][1] = userInput;
            if (index == 8) userInputStorage[2][2] = userInput;
        }
    }
    public static void sumUserInput(){
        int sum = 0;
        for (int index = 0; index < userInputStorage.length; index++) {
            for (int index2 = 0; index2 < 3; index2++) {
                sum += userInputStorage[index][index2];
                userInputStorage[index][3] = sum;
            }
            sum = 0;
        }
    }
    public static void averageUserInput(){
        userInputStorage[0][4] = userInputStorage[0][3] / 3;
        userInputStorage[1][4] = userInputStorage[1][3] / 3;
        userInputStorage[2][4] = userInputStorage[2][3] / 3;
    }
    public static void minimumUserInput(){
        for (int index = 0; index < userInputStorage.length; index++) {
            int minimum;
            for (int index2 = 0; index2 < 3; index2++) {
                minimum = userInputStorage[index][0];
                if (userInputStorage[index][index2] < minimum) {
                    userInputStorage[index][5] = userInputStorage[index][index2];
                }
                else userInputStorage[index][5] = minimum;
            }
            minimum = 0;
        }
    }
    public static void maximumUserInput(){
        for (int index = 0; index < userInputStorage.length; index++) {
            int maximum;
            for (int index2 = 0; index2 < 3; index2++) {
                maximum = userInputStorage[index][0];
                if (userInputStorage[index][index2] > maximum){
                    userInputStorage[index][6] = userInputStorage[index][index2];
                }
                else userInputStorage[index][6] = maximum;
            }
            maximum = 0;
        }
    }
    
}
