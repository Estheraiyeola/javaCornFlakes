package corn_flakes;

public class CornFlakes4 {
    public static void main(String[] args) {
        getAsterisks(10);
    }
    public static void getAsterisks(int number){
        int row;
        int column;
        for (row= 0; row < number; row++){
            for (column = (number - row); column >= 0; column--){
                System.out.print(" ");
            }
            for (column = 0; column <= row; column++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
