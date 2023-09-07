package mr_chibuzor;

public class StringA {
    public static void main(String[] args) {
        CardValidator a = new CardValidator();
        CardValidator b = new CardValidator();
        if (b.equals(a)){
            System.out.println("True");
        }
        if (a == b){
            System.out.println("True");
        }
    }
}
