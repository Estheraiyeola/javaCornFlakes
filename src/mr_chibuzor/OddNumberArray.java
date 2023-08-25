package mr_chibuzor;
import mr_chibuzor.SwappingNumbers;

import static mr_chibuzor.SwappingNumbers.isAnOddNumber;

public class OddNumberArray {

    public int[] subtractTwoFromOddNumbers(int[] array) {
        int counter = getNumbersOfOddNumbers(array);
        int[] newArray = new int[counter];
        for (int index = 0; index < newArray.length;) {
            index = addOddNumbersToTheArraysWhileSubtracting(array, newArray, index);
        }
        return newArray;
    }

    private static int addOddNumbersToTheArraysWhileSubtracting(int[] array, int[] newArray, int index) {
        for (int idx = 0; idx < array.length; idx++) {
            if (isAnOddNumber(array[idx])){
                newArray[index] = array[idx];
                newArray[index] = newArray[index] - 2;
                index++;
            }

        }
        return index;
    }

    private static int getNumbersOfOddNumbers(int[] array) {
        int counter =0;
        for (int number = 0; number < array.length; number++) {
            if (isAnOddNumber(array[number])) counter++;
        }
        return counter;
    }
}
