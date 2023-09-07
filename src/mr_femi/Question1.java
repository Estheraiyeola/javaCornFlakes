package mr_femi;

public class Question1 {
    public static int MultiplyNumbers(int firstNumber, int secondNumber){
        int multiply = 0;
        for (int counter = 1; counter <= secondNumber; counter++){
            multiply += firstNumber;
        }
        return multiply;
    }
    public static int PowerOfANumber(int number, int power){
        int result = 1;
        for (int counter = 0; counter < power; counter++){
            result = MultiplyNumbers(result, number);
        }
        return result;
    }
}
