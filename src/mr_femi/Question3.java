package mr_femi;


public class Question3 {
    public static void main(String[] args) {
//        int result = fibonacciMethod(5);
//        System.out.println(result);
    }
    public static void fibonacciMethod(int length){
        int number1 = 0;
        int number2 = 1;
        int currentNumber;
        int count = 0;

        if (length <= 0){
            System.out.println("Input a positive number");
        } else if (length == 1) {
            System.out.println(number1);
        }
        else {
            while (count < length){
                System.out.print(number1 + " ");
                currentNumber = number1 + number2;
                number1 = number2;
                number2 = currentNumber;
                count++;
            }
        }
    }
}
