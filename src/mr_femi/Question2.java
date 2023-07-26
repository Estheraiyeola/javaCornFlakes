package mr_femi;

import java.util.Arrays;

public class Question2 {
    public static void main(String[] args) {
        int[] array = {2, 9, 3, 6, 5};
        int[] totalArray = new int[array.length];
        int[] newArray = new int[2];
        int lowest = array[0];
        int highest = array[0];
        for (int index = 0; index < array.length; index++){
            int total = 0;
            for (int index2 = 0; index2 < array.length; index2++){
                total += array[index2];

            }
            totalArray[index] = total - array[index];
            if (totalArray[index] < lowest){
                newArray[index] = lowest;
            }
            if (totalArray[index] > highest){
                newArray[index] = highest;
            }
        }
        System.out.println(Arrays.toString(totalArray));
        System.out.println(Arrays.toString(newArray));
    }
    public static int[] arrayMethod(int[] arr){
        int result = 0;
        int[] newArray = new int[arr.length];
        for (int index = 0; index < arr.length; index++) {
            result += arr[index];
            newArray[index] = result - arr[index];

        }
        return newArray;
//        System.out.println(Arrays.toString(newArray));

    }
}
