package mr_femi;

public class SwapNumbers {
    public int[] mrFemi(int[] array, int firstIndex, int secondIndex){
        array[firstIndex] += array[secondIndex];
        array[secondIndex] = array[firstIndex] - array[secondIndex];
        array[firstIndex] = array[firstIndex] - array[secondIndex];
        return array;
    }
}
