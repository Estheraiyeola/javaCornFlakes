package semicolon_store;

import java.text.SimpleDateFormat;
import java.util.*;

public class Cashier extends Product{
    private List<String> productNameList = new ArrayList<String>();
    private List<Double> productPriceList = new ArrayList<Double>();
    private List<Integer> productQuantity = new ArrayList<Integer>();
    private List<Double> priceOfProductList = new ArrayList<Double>();

    private double amountCollectedFromUser;
    private double balance;
    private String usersName;
    private String cashiersName;
    private int discount;
    private final Scanner input = new Scanner(System.in);
    public void enterProductsDetail(){
        enterNameOfProduct();
        enterQuantityOfProduct();
        enterPricePerUnit();
        hasMoreProduct();
    }

    private void hasMoreProduct() {
        System.out.println("Add more Items?");
        String response = input.next();
        if (response.equals("Yes".toLowerCase())){
            enterProductsDetail();
        }

    }
    public void collectCashiersName(){
        String cashiersName = "";
        System.out.println("What is your name?");
        this.cashiersName = cashiersName;
        cashiersName = input.nextLine();
        input.next();
    }
    public void amountOfDiscount(){
        System.out.println("How much discount will the user get?");
        discount = input.nextInt();
    }

    public void enterPricePerUnit() {
        System.out.println("How much per unit? ");
        double price = input.nextDouble();
        productPriceList.add(price);
    }

    public void enterQuantityOfProduct() {
        System.out.println("How many pieces?");
        int quantity = input.nextInt();
        productQuantity.add(quantity);
    }

    public void enterNameOfProduct() {
        System.out.println("What did the user buy? ");
        String productName = input.next();
        productNameList.add(productName);
    }

    public void enterName() {
        System.out.println("What is the customers name?");
        usersName = input.nextLine();
        enterProductsDetail();
    }
    public void priceOfEachItem(){
        for (int index = 0; index < productPriceList.size(); index++) {
            priceOfProductList.add((double) productQuantity.get(index) * productPriceList.get(index));
        }
    }
    public double calculateSubTotal(){
        double total = 0;
        for (int index = 0; index < productPriceList.size(); index++) {
            total += priceOfProductList.get(index);
        }
        return  total;
    }
    public double vATCalculator(){
        double subTotal = calculateSubTotal();
        return 0.175 * subTotal;
    }
    public double discountCalculator(){
        double subTotal = calculateSubTotal();
        return (double) discount / 100 * subTotal;
    }
    public  double billTotalCalculator(){
        double subTotal = calculateSubTotal();
        double vAT = vATCalculator();
        return subTotal - discount + vAT;
    }
    public void displayFirstReceipt(){
        constructReceipt();
        System.out.println("=".repeat(50));
        System.out.printf("\t\t\tTHIS IS NOT A RECEIPT KINDLY PAY %.2f\n", billTotalCalculator());
        System.out.println("=".repeat(50));
        collectAmountFromUser();
    }

    private void constructReceipt() {
        System.out.println("SEMICOLON STORES");
        System.out.println("MAIN BRANCH");
        System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO, YABA, LAGOS.");
        System.out.println("TEL: 03293828343");
        System.out.print("Date: ");
        System.out.print( new SimpleDateFormat("yyyy/MM/dd HH:mm:ss\n").format(Calendar.getInstance().getTime()) );
        System.out.printf("Cashier: %s\n", cashiersName);
        System.out.printf("Customer Name: %s\n", usersName);
        System.out.println("=".repeat(50));
        System.out.print("\t\tITEM");
        System.out.print("\tQTY");
        System.out.print("\tPRICE");
        System.out.print("\t\tTOTAL(NGN)\n");
        System.out.println("-".repeat(50));
        for (int index = 0; index < productNameList.size(); index++) {
            System.out.printf("\t\t%s",productNameList.get(index));
            System.out.printf("\t%d",productQuantity.get(index));
            System.out.printf("\t%.2f\t",productPriceList.get(index));
            System.out.printf("\t%.2f",priceOfProductList.get(index));
            System.out.println();
        }
        System.out.println();
        System.out.println("-".repeat(50));
        System.out.printf("%25s\t%.2f\n","Sub Total:", calculateSubTotal());
        System.out.printf("%25s\t%.2f\n","Discount:", discountCalculator());
        System.out.printf("%25s\t%.2f\n","VAT @ 17.50:", vATCalculator());
        System.out.println("=".repeat(50));
        System.out.printf("%25s\t%.2f\n","Bill Total", billTotalCalculator());

    }

    public void displaySecondReceipt(){
        constructReceipt();
        System.out.printf("%25s\t%.2f\n","Amount Paid:", amountCollectedFromUser);
        System.out.printf("%25s\t%.2f\n","Balance:", balance);
        System.out.println("=".repeat(50));
        System.out.println("\t\t\tTHANK YOU FOR YOUR PATRONAGE");
        System.out.println("=".repeat(50));
    }

    private double collectAmountFromUser() {
        System.out.println("How much did the customer give to you?");
        double amountCollectedFromUser = input.nextInt();
        this.amountCollectedFromUser = amountCollectedFromUser;
        return balanceCalculator(amountCollectedFromUser);
    }

    private double balanceCalculator(double amountCollectedFromUser) {
        double balance = amountCollectedFromUser - billTotalCalculator();
        this.balance = balance;
        return balance;
    }

    private String getCashiersName() {
        return cashiersName;
    }
}