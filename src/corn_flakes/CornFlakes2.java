package corn_flakes;

import java.util.Objects;
import java.util.Scanner;

public class CornFlakes2 {
    public static void main(String[] args) {
        int total = 0;
        int counter = 0;
        double average = 0.0;
        String required_class = "SS3";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your class: ");
        String class_ = input.next();

        Scanner inputTwo = new Scanner(System.in);
        System.out.println("Enter the grade or press -25 to end the program: ");
        int grade = inputTwo.nextInt();

        if (Objects.equals(class_, required_class)) {
            while (grade != -25) {
                total += grade;
                counter += 1;

                System.out.println("Enter another grade or press -25 to end the program: ");
                grade = inputTwo.nextInt();
            }
            if (grade != 0) {
                average = (double) total / counter;

            }
            for (int asterisks = 0; asterisks < 70; ++asterisks) {
                System.out.print("*");
            }
            System.out.println();
            System.out.println("       Aso Rock Secondary School, Abuja Nigeria");
            for (int asterisks = 0; asterisks < 70; ++asterisks) {
                System.out.print("*");
            }
            System.out.println();
            System.out.println("Class: " + class_);
            System.out.println("Number of Student in class: " + counter);
            System.out.println("Total score: " + total);
            System.out.println("Average Score: " + average);
        }
    }
}
