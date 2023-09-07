package deitel_package.chapter6;

import java.util.Scanner;

public class HypotenuseCalculations {
    public static double collectFirstSide(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first side of the triangle:");
        return input.nextDouble();
    }

    public static double collectSecondSide(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the second side of the triangle:");
        return input.nextDouble();
    }
    public static void display(){
        double firstSide = collectFirstSide();
        double secondSide = collectSecondSide();
        System.out.println(hypotenuse(firstSide, secondSide));
    }

    public static double hypotenuse(double side1, double side2) {
        double hypotenuseSum = Math.pow(side1, 2) + Math.pow(side2, 2);
        return Math.sqrt(hypotenuseSum);
    }

    public static void main(String[] args) {
        display();
    }
}
