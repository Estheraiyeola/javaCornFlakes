package arraySnacks;



public class Question4 {
    public static void main(String[] args) {
        int[] number = {2, 4, 6, 5, 20, 50, 100, 60, 4, 1, 7, 8, 90};
        oddPositions(number);
    }

    private static void oddPositions(int[] arr) {
        for(int index = 1; index < arr.length - 1; index += 2){
            System.out.print(arr[index] + " ");
        }
    }
}
