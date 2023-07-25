package corn_flakes;

import java.util.Objects;
import java.util.Scanner;
public class CornFlakes1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 0;
        int total = 0;
        double average = 0.0;
        String requiredClass = "SS3";
        System.out.println("Enter your class: ");
        String class_ = input.next();

        if (Objects.equals(class_, requiredClass)) {
            while (counter < 20) {
                Scanner inputTwo = new Scanner(System.in);
                System.out.print("Enter your grade: ");
                int grade = inputTwo.nextInt();
                total += grade;

                counter += 1;
            }
            if (counter == 20) {
                average = (double) total / counter;
            }
            for (int asterisks = 0; asterisks < 70; ++asterisks){
                System.out.print("*");
            }
            System.out.println();
            System.out.println("       Aso Rock Secondary School, Abuja Nigeria");
            for (int asterisks = 0; asterisks < 70; ++asterisks){
                System.out.print("*");
            }
            System.out.println();
            System.out.println("Class: " + class_);
            System.out.println("Number of Student in class: " + counter);
            System.out.println("Total score: " + total);
            System.out.println("Average Score: " + average);
        }
        else {
            System.out.println("Input correct Class!!!");
        }
    }

}
