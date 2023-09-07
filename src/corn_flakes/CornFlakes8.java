package corn_flakes;

public class CornFlakes8 {
    public static void main(String[] args) {
        asterisks(10);
    }
    public static void asterisks(int num){
        for (int row = 0; row < num; row++){
            for (int column = 0; column < num - row; column++){
                System.out.print("  ");
            }
            for (int column = 0; column < row + 1; column++){
                System.out.print("* ");
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int row = 0; row < num; row++){
            for (int column = 0; column <= row; column++){
                System.out.print("  ");
            }
            for (int column = 0; column < num - row; column++){
                System.out.print("* ");
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
