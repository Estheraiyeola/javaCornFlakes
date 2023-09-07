package corn_flakes;

import java.util.Scanner;

public class CornFlakes16 {
    public static void main(String[] args) {
        int total = 0;
        for (int counter = 1; counter <= 10; ) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the score: ");
            int studentScore = input.nextInt();
            if (studentScore >= 0 && studentScore <= 100){
                total += studentScore;
                counter++;
            }
            else {
                System.out.print("Enter the score: ");
                studentScore = input.nextInt();
            }
        }
        System.out.println(total);
    }
}
