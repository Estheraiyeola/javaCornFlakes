package corn_flakes;

public class CornFlakes20 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        int counter = 1;
        for (int index = 0; index < numbers.length; index++){
            numbers[index] = counter * 2;
            counter++;
        }
        for (int index = 0; index < numbers.length; index++){
            System.out.println(numbers[index]);
        }
    }
}
