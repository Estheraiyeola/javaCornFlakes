package mr_femi;

import java.util.Arrays;
import java.util.Scanner;

public class UserInputArray2 {
    public static void main(String[] args) {
        collectUserInput();
        sumUserInput();
        System.out.println(Arrays.deepToString(userInputStorage));
    }
    private static final Scanner input = new Scanner(System.in);
    public static int[][] userInputStorage = new int[4][3];
    public static void collectUserInput(){
        for (int index = 0; index < 9; index++) {
            int userInput = input.nextInt();
            if (index == 0) userInputStorage[0][0] = userInput;
            if (index == 1) userInputStorage[1][0] = userInput;
            if (index == 2) userInputStorage[2][0] = userInput;
            if (index == 3) userInputStorage[0][1] = userInput;
            if (index == 4) userInputStorage[1][1] = userInput;
            if (index == 5) userInputStorage[2][1] = userInput;
            if (index == 6) userInputStorage[0][2] = userInput;
            if (index == 7) userInputStorage[1][2] = userInput;
            if (index == 8) userInputStorage[2][2] = userInput;
        }
    }
    public static void sumUserInput(){
        int sum = 0;
        for (int index = 0; index < 3; index++) {
            for (int idx = 0; idx < 3; idx++) {
                sum += userInputStorage[idx][index];
                userInputStorage[3][index] = sum;
            }
            sum = 0;

        }
    }
}
