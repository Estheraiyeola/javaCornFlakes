package mr_chibuzor;

import java.util.Arrays;

public class ReturnsPosition {
    private static int[] array = new int[]{5, 18, 32, 3, 4};
    private static int[] sortedArray = new int[array.length];
    public static void main(String[] args) {
        sortMethod(copyMethod(array));
        System.out.println(Arrays.toString(determinePositionMethod(sortMethod(array), array)));
    }
    public static int[] copyMethod(int[] array){
        System.arraycopy(array, 0, sortedArray, 0, array.length);
        return sortedArray;
    }
    public static int[] sortMethod(int[] sortedArray) {
        for (int index = 0; index < sortedArray.length; index++) {
            sortedArray = swapArray(sortedArray, index);
        }
        return sortedArray;
    }
    public static int[] determinePositionMethod(int[] sortedArray, int[] originalArray){
        int[] positionIndex = new int[sortedArray.length];
        for (int index = 0; index < sortedArray.length; index++) {
            getPosition(originalArray,sortedArray,index,positionIndex);
        }
        return positionIndex;
    }

    public static int[] swapArray(int[] sortedArray, int index){
        int temp = 0;
        for (int idx = index + 1; idx < sortedArray.length; idx++) {
            if (sortedArray[index] < sortedArray[idx]) {
                temp = sortedArray[index];
                sortedArray[index] = sortedArray[idx];
                sortedArray[idx] = temp;
            }
        }
        return sortedArray;
    }
    public static int[] getPosition(int[] originalArray, int[] sortedArray, int index, int[] positionIndex){
        for (int idx = 0; idx < originalArray.length; idx++) {
            if (originalArray[idx] == sortedArray[index]) {
                positionIndex[idx] = index + 1;
            }
        }
        return positionIndex;
    }
}