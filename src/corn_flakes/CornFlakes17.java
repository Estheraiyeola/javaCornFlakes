package corn_flakes;

import java.util.Scanner;

public class CornFlakes17 {
    public static void main(String[] args) {
        int total = 0;
        double average = 0.0;
        int numCounter = 0;
        for (int counter = 1; counter <= 10; counter++) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the score: ");
            int studentScore = input.nextInt();
            if (studentScore >= 0 && studentScore <= 100){
                total += studentScore;
                numCounter++;
            }
        }
        average = (double)total / numCounter;
        System.out.println(total);
        System.out.println(average);
    }
}
