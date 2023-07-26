package arraySnacks;

public class Question8 {
    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5};
        System.out.println(sumUsingForLoop(number));
        System.out.println(sumUsingWhileLoop(number));
        System.out.println(sumUsingDoWhileLoop(number));
    }

    private static int sumUsingDoWhileLoop(int[] arr) {
        int total = 0;
        int index = 0;
        do {
            total += arr[index];
            index++;
        }while (index < arr.length);
        return total;
    }

    private static int sumUsingWhileLoop(int[] arr) {
        int total = 0;
        int index = 0;
        while (index < arr.length){
            total += arr[index];
            index++;
        }
        return total;
    }

    private static int sumUsingForLoop(int[] arr) {
        int total = 0;
        for (int i : arr) {
            total += i;
        }
        return total;
    }
}
