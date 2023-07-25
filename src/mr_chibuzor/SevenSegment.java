package mr_chibuzor;

public class SevenSegment {
    private final  static String[][] array = new String[5][4];
    private int segmentA;
    private int segmentB;
    private int segmentC;
    private int segmentD;
    private int segmentE;
    private int segmentF;
    private int segmentG;
    private int segmentH;
    private String result = "";


    public String getDisplay(){
        if (segmentH == 49) {
            for (int index = 0; index < array.length; index++) {
                for (int index1 = 0; index1 < array[index].length; index1++) {

                    array[index][index1] = " ";
                    result += array[index][index1];
                    if (segmentA == 49) {
                        array[0] = new String[]{"#", "#", "#", "#"};
                    }
                    if (segmentB == 49) {
                        array[1][3] = "#";
                    }
                    if (segmentC == 49) {
                        array[3][3] = "#";
                    }
                    if (segmentD == 49) {
                        array[4] = new String[]{"#", "#", "#", "#"};
                    }
                    if (segmentE == 49) {
                        array[3][0] = "#";
                    }
                    if (segmentF == 49) {
                        array[0][0] = "#";
                        array[1][0] = "#";
                    }
                    if (segmentG == 49) {
                        array[2] = new String[]{"#", "#", "#", "#"};
                    }
                    if (segmentB == 49 && segmentC == 49){
                        array[0][3] = "#";
                        array[1][3] = "#";
                        array[2][3] = "#";
                        array[3][3] = "#";
                        array[4][3] = "#";
                    }
                    if (segmentE == 49 && segmentF == 49){
                        array[0][0] = "#";
                        array[1][0] = "#";
                        array[2][0] = "#";
                        array[3][0] = "#";
                        array[4][0] = "#";
                    }
                    else System.out.print(" ");



                    result += array[index][index1];
                }
                result += "\n";

            }
        }
        else  {
            System.out.println("Invalid input");
        }
        return result;
    }
    public void setDisplay(String userInput){
        if (userInput.length() > 0 && userInput.length() <= 8) {
            this.segmentA = userInput.charAt(0);
            this.segmentB = userInput.charAt(1);
            this.segmentC = userInput.charAt(2);
            this.segmentD = userInput.charAt(3);
            this.segmentE = userInput.charAt(4);
            this.segmentF = userInput.charAt(5);
            this.segmentG = userInput.charAt(6);
            this.segmentH = userInput.charAt(7);

        }
    }
}
