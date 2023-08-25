package mr_chibuzor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitArray {
    public int[] splitArray(int[] array) {
        int[] newArray = new int[array.length * 2];
        for (int index = 0; index < newArray.length;) {
            index = splitEachElement(array, newArray, index);
        }
        return newArray;
    }

    private static int splitEachElement(int[] array, int[] newArray, int index) {
        for (int idx = 0; idx < array.length; idx++) {
            splitNumberAtIndex(newArray, index, array[idx]);
            index += 2;
        }
        return index;
    }

    private static void splitNumberAtIndex(int[] newArray, int index, int array) {
        newArray[index] = array / 10;
        newArray[index + 1] = array % 10;
    }

    public int[] addOneToSumOfElements(int[] array) {
        String[] newArray = new String[array.length];
        changingIntegerElementsToString(array, newArray);
        StringBuilder elements = addingElementsInTheNewArrayToAString(newArray);
        int total = Integer.parseInt(String.valueOf(elements)) + 1;
        String newStringFromTotal = String.valueOf(total);
        int[] output = new int[newStringFromTotal.length()];
        outputArrayCollectsInput(output, newStringFromTotal);
        return output;
    }

    private static void changingIntegerElementsToString(int[] array, String[] newArray) {
        for (int index = 0; index < array.length; index++) {
            newArray[index] = String.valueOf(array[index]);
        }
    }

    private static void outputArrayCollectsInput(int[] output, String newStringFromTotal) {
        for (int index = 0; index < output.length; index++) {
            output[index] = newStringFromTotal.charAt(index) - '0';
        }
    }

    private static StringBuilder addingElementsInTheNewArrayToAString(String[] newArray) {
        StringBuilder elements = new StringBuilder();
        for (String string : newArray) {
            elements.append(string);
        }
        return elements;
    }
}
