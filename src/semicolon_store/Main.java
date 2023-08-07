package semicolon_store;
import semicolon_store.Cashier;

public class Main {
    public static void main(String[] args) {
        Cashier cashier = new Cashier();
        cashier.enterName();
        cashier.collectCashiersName();
        cashier.amountOfDiscount();
        cashier.priceOfEachItem();
        cashier.calculateSubTotal();
        cashier.vATCalculator();
        cashier.discountCalculator();
        cashier.billTotalCalculator();
    }
}
