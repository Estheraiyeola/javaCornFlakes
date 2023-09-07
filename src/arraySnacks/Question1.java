package arraySnacks;

public class Question1 {
    public static void main(String[] args) {
        int[] arr = {60, 2, 65, 3, 4};
        System.out.println(largestNumber(arr));
    }

    public static int largestNumber(int[] arr){
        int max = arr[0];
        for (int index = 1; index < arr.length; index++){
            if(arr[index] > max) max = arr[index];
        }
        return max;
    }
}
