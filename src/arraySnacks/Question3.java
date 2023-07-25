package arraySnacks;

public class Question3 {
    public static void main(String[] args) {
        int[] number= {2, 4, 6, 5, 20, 50, 100, 60, 4, 1, 7, 8, 90};
        int itemToBeChecked = 90;
        checkForElements(number, itemToBeChecked);
    }

    private static void checkForElements(int[] arr, int item) {
        int pivot = arr[0];
        int index = 1;
        while (pivot != item && index != arr.length){
            pivot = arr[index];
            index++;
        }
        if (pivot != item){
            System.out.println("Invalid input");
        }
        else {
            System.out.printf("""
                    The element %d was found at index %d""", pivot, index);
        }
    }


}
