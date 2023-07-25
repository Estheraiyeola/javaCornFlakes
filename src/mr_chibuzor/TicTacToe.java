package mr_chibuzor;

public class TicTacToe {
    public static void main(String[] args) {
        String[][] array = new String[3][3];

        array[0] = new String[]{"X", "O", "X"};
        array[1] = new String[]{"O", "O", "X"};
        array[2] = new String[]{"O", "X", "X"};

        for (int index = 0; index < array.length; index++){
            for (int index1 = 0; index1 < array[index].length; index1++) {
               System.out.print(array[index][index1] + " ");
           }
            System.out.println();
        }
    }

}
