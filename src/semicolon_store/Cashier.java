package semicolon_store;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cashier extends Product{
    private List<String> productNameList = new ArrayList<String>();
    private List<Double> productPriceList = new ArrayList<Double>();
    private List<Integer> productQuantity = new ArrayList<Integer>();
    private List<Double> priceOfProductList = new ArrayList<Double>();

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
        System.out.println("What is your name?");
        input.next();
        cashiersName = input.nextLine();
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
        System.out.println(priceOfProductList);
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
    public double collectPaymentFromTheCustomer(){
        System.out.println("How much did the customer give to you? ");
        return input.nextInt();
    }
    public double balanceCalculator(){
        double totalBill = billTotalCalculator();
        double customerPayment = collectPaymentFromTheCustomer();
        return  customerPayment - totalBill;
    }
    public void displayFirstReceipt(){

    }
}
