package corn_flakes;

import java.util.Scanner;

public class CornFlakes14 {
    public static void main(String[] args) {
        int total = 0;
        double average = 0.0;
        int counter = 0;
        int evenCounter = 0;
        for (; counter < 10; counter++) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the score: ");
            int studentScore = input.nextInt();
            if (studentScore % 2 == 0) {
                total += studentScore;
                evenCounter++;
            }

        }
        average = (double)total / evenCounter;
        System.out.println(total);
        System.out.println(average);
    }
}
