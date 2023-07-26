package corn_flakes;


import static java.lang.System.exit;


public class CornFlakes7 {

    private static  int question;
    public static void main(String[] args) {
        CornFlakes7 activity = new CornFlakes7();
        int answer = activity.factorial(5);

        System.out.printf("The value of %d! is equal to %d", question, answer);
    }

    public int factorial(int num){
        question = num;
        int total = 1;
        if (num == 0){
            return total;
        } else if (num < 0) {
            terminate();
        }
        while (num != 0){
            total = total * num;
            num -= 1;
        }
        return total;
    }

    private static void terminate() {
        System.out.println("""
                Invalid input
                """);
        exit(0);
    }
}
