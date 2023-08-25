package mr_chibuzor;

public class SwappingNumbers {
    private int[] array;
    private static int size;
    public boolean isEmpty(int[] array) {
        this.array = array;
        int size = array.length;
        if (size == 0)return true;
        else return false;
    }

    public int[] swapEvenNumbers(int[] array) {
        this.array = array;
        for (int index = 0; index < array.length; index++) {
            int temp = 0;
            if (index == array.length - 1){
                array[index] = array[index];
            }
            else if (size % 2 == 0) {
                if (index % 2 == 0) {
                    swapNumbers(array, index);
                }
            }
        }
        return array;
    }

    public int[] swapOddNumbers(int[] array){
        this.array = array;
        int temp = 0;
        for (int index = 0; index < array.length; index++) {
            if (isAnOddNumber(array[index])) validatesOddNumber(array, index);
            else array[index] = array[index];
        }{

        }
        return array;
    }

    private static void validatesOddNumber(int[] array, int index) {
        if (index % 2 == 0 ) {
            if (array[index + 1] % 2 == 1) {
                swapNumbers(array, index);
            }
        }
    }

    private static void swapNumbers(int[] array, int index) {
        int temp;
        temp = array[index];
        array[index] = array[index + 1];
        array[index + 1] = temp;
    }
    public int[] swapFirstWithLast(int[] array) {
        this.array = array;
        int temp = 0;
        for (int index = 0; index < array.length / 2; index++) {
            temp = array[array.length - 1 - index];
            array[array.length - 1 - index] = array[index];
            array[index] = temp;
        }
        return array;
    }
    public static boolean isAnOddNumber(int number){
        return number % 2 == 1;
    }
}
