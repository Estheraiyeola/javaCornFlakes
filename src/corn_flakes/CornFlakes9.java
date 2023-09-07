package corn_flakes;

import java.util.Scanner;

public class CornFlakes9 {
    public static void main(String[] args) {
        int total = 0;
        for (int scores = 0; scores < 10; scores++){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the score: ");
            int studentScore = input.nextInt();
            total += studentScore;
        }
        System.out.println(total);
    }
}
