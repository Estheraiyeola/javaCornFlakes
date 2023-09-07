package arraySnacks;


import java.util.Arrays;

public class Question2 {
    public static void main(String[] args) {
        int[] arr = {10, 324, 45, 67};
        reversedArray(arr);
    }

    private static void reversedArray(int[] arr) {
        for (int index = 0; index < arr.length - index; index++) {
            int start = arr[index];
            arr[index] = arr[arr.length - index - 1];
            arr[arr.length - index - 1] = start;
        }
        System.out.println(Arrays.toString(arr));
    }
}
