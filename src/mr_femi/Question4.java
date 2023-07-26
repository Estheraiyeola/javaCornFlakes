package mr_femi;


public class Question4 {
    public String reverseNumber(int number){
        String numbers = number + " ";
        String newString = "";
        char temp;
        for (int index = 0; index < numbers.length(); index++) {
            temp = numbers.charAt(index);
            newString = temp + newString;
        }
        System.out.print(newString);
        return newString;
    }
}
