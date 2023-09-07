package mr_chibuzor;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] array = {34, 11, 13, 17, 18, 32};
        int[] secondArray = new int[array.length];
        for (int index = 0; index < array.length; index++) {
            secondArray[index] = array[index];
        }
        System.out.println(Arrays.toString(secondArray));
        for (int index = 0; index < array.length; index++) {
            int temp = 0;
            for (int idx = index + 1; idx < secondArray.length; idx++) {
                if (secondArray[index] < secondArray[idx]){
                    temp = secondArray[index];
                    secondArray[index] = secondArray[idx];
                    secondArray[idx] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(secondArray));
        for (int index = 0; index < array.length; index++) {
            for (int idx = 0; idx < secondArray.length; idx++) {
                if (array[idx] == secondArray[index]){
                    array[idx] = index + 1;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
