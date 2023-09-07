package arraySnacks;

public class Question6 {
    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5};
        runningTotal(number);
    }

    private static void runningTotal(int[] arr) {
        int total = 0;
        for (int i : arr) {
            total += i;
            System.out.println(total);
        }
    }

}
