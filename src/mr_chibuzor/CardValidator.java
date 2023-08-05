package mr_chibuzor;


import static java.lang.System.exit;


public class CardValidator {
    private String cardNumber;
    private int length;
    boolean isValid;
    boolean validLength;
    private int[] cardNumberArray = new int[length];
    private String cardType = "";

    private void setLength(String cardNumber){
        length = cardNumber.length();
    }
    public int getLength() {
        return length;
    }
    public void creditCardCollector(String cardNumber) {
        this.cardNumber = cardNumber;
        validLength = cardNumber.length() >= 13 && cardNumber.length() <= 16;
        processesCardNumber(cardNumber);
    }

    private void processesCardNumber(String cardNumber) {
        if (validLength) {
            checksForTypeOfCard();
            setLength(cardNumber);
            convertingStringToAnIntArray();
            validatorAlgorithm();
            validityChecker();
            displayInformation();
        }
        else System.out.println("Invalid length");
    }

    public void checksForTypeOfCard(){
        if (cardNumber.startsWith("4")){
            cardType= "Visa Card";
        }
        else if (cardNumber.startsWith("5")){
            cardType = "MasterCard";
        }
        else if (cardNumber.startsWith("37")){
            cardType = "American Express Card";
        }
        else if (cardNumber.startsWith("6")){
            cardType = "Discover Cards";
        }
        else {
            System.out.println("Invalid card type");
            exit(0);
        }
    }

    public void convertingStringToAnIntArray() {
        String[] strArr = cardNumber.split("");
        cardNumberArray = new int[strArr.length];
        for (int index = 0; index < strArr.length; index++) {
            cardNumberArray[index] = Integer.parseInt(strArr[index]);
        }
    }
    public void displayInformation(){
        System.out.printf("Credit Card Type: %s\n", cardType);
        System.out.printf("Credit Card Number: %s\n", cardNumber);
        System.out.printf("Credit Card Digit Length: %d\n", length);
        System.out.printf("Credit Card Validity: %s\n", validityChecker());
    }
    public String validityChecker(){
        String output = "";
        if (isValid) output = "Valid";
        if(!isValid) output = "Invalid";
        return output;
    }
    public void validatorAlgorithm(){
        int evenCounter = 0;
        int oddCounter = 0;
        int sum;
        for (int index = 0; index < cardNumberArray.length; index++) {
            evenCounter = getEvenCounter(evenCounter, index);
            oddCounter = getOddCounter(oddCounter, index);
        }
        sum = evenCounter + oddCounter;
        isValid = sum % 10 == 0;
    }
    private int getOddCounter(int oddCounter, int index) {
        if (index % 2 == 1){
            oddCounter += cardNumberArray[index];
        }
        return oddCounter;
    }

    private int getEvenCounter(int evenCounter, int index) {
        if (index % 2 == 0){
            int number = cardNumberArray[index] * 2;
            if(number > 9){
                int firstNumber = number / 10;
                int secondNumber = number % 10;
                number = firstNumber + secondNumber;
            }
            evenCounter += number;
        }
        return evenCounter;
    }


}

