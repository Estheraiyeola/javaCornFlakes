package corn_flakes;


public class CornFlakes3 {
    public static void main(String[] args) {
        getAsterisks(10);
    }
    public static void getAsterisks(int number){
        for(int row = 0; row < number; row++){
            for (int column = 0; column <= row; column++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
