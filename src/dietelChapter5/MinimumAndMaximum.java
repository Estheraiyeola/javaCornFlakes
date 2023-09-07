package dietelChapter5;

import java.util.Arrays;
import java.util.List;

public class MinimumAndMaximum {
    private static int numberOfInputs;
    private static int size = numberOfInputs;
    private static int[] array = new int[numberOfInputs];

    public void add(int userInput) {
        for (int index = 0; index < array.length; index++) {
            array[index] = userInput;
        }
    }

    public int[] getArray() {
        return array;
    }

    public void numberOfInputs(int numberOfInputs) {
        this.numberOfInputs = numberOfInputs;
    }
    public int getSize(){
        return size;
    }
}
