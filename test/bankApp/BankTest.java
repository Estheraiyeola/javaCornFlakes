package bankApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {
    private Bank activity;
    @BeforeEach
    public void setActivity(){
        activity = new Bank("bankName");
    }
    @Test
    public void testThatBankCanRegisterCustomers(){
        activity.register("Esther", "Aiyeola", "1234");
        assertEquals(new Account("1", "Esther Aiyeola", "1234").getAccount(), activity.findAccount("1").getAccount());
        activity.register("Temitope", "Aiyeola", "1234");
        assertEquals(new Account("2", "Temitope Aiyeola", "1234").getAccount(), activity.findAccount("2").getAccount());
    }
    @Test
    public void testThatDepositMoneyWorks(){
        activity.register("Esther", "Aiyeola", "1234");
        assertEquals(new Account("1", "Esther Aiyeola", "1234").getAccount(), activity.findAccount("1").getAccount());
        activity.deposit(1000, "1");
        assertEquals(1000, activity.checkBalance("1", "1234"));
    }
    @Test
    public void testThatWithdrawMoneyWorks(){
        activity.register("Esther", "Aiyeola", "1234");
        assertEquals(new Account("1", "Esther Aiyeola", "1234").getAccount(), activity.findAccount("1").getAccount());
        activity.deposit(1000, "1");
        assertEquals(1000, activity.checkBalance("1", "1234"));
        activity.withdraw(500, "1", "1234");
        assertEquals(500, activity.checkBalance("1", "1234"));
    }
    @Test
    public void testThatBankCanTransferAccountsFromAnAccountToAnotherAccount(){
        activity.register("Esther", "Aiyeola", "1234");
        assertEquals(new Account("1", "Esther Aiyeola", "1234").getAccount(), activity.findAccount("1").getAccount());
        activity.deposit(1000, "1");
        assertEquals(1000, activity.checkBalance("1", "1234"));
        activity.register("Temitope", "Aiyeola", "1234");
        assertEquals(new Account("2", "Temitope Aiyeola", "1234").getAccount(), activity.findAccount("2").getAccount());
        activity.transfer(500, "1", "2","1234");
        assertEquals(500, activity.checkBalance("1", "1234"));
        assertEquals(500, activity.checkBalance("2", "1234"));
    }
}
