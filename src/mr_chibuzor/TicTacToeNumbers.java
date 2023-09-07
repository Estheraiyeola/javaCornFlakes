package mr_chibuzor;

import java.util.Objects;

public class TicTacToeNumbers {
    public static void main(String[] args) {
        String[][] array = new String[3][3];

        array[0] = new String[]{"X", "O", "X"};
        array[1] = new String[]{"O", "O", "X"};
        array[2] = new String[]{"O", "X", "X"};

        for (int index = 0; index < array.length; index++){
            for (int index1 = 0; index1 < array[index].length; index1++) {
                if (Objects.equals(array[index][index1], "X")){
                    System.out.print(1 + " ");
                }
                else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }

    }
}
