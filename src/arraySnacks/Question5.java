package arraySnacks;

public class Question5 {
    public static void main(String[] args) {
        int[] number = {2, 4, 6, 5, 20, 50, 100, 60, 4, 1, 7, 8, 90};
        evenPositions(number);
    }

    private static void evenPositions(int[] arr) {
        for(int index = 0; index < arr.length; index += 2){
            System.out.print(arr[index] + " ");
        }
    }
}
