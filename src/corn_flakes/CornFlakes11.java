package corn_flakes;

import java.util.Scanner;

public class CornFlakes11 {
    public static void main(String[] args) {
        int total = 0;
        double average = 0.00;
        int counter = 0;
        for (; counter < 10; counter++){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the score: ");
            int studentScore = input.nextInt();
            total += studentScore;
        }
        average = (double) total / counter;
        System.out.println(total);
        System.out.println(average);
    }
}
