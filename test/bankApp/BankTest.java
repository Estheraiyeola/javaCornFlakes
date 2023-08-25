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
        activity.register("Esther", "Aiyeola", "pin");
        assertEquals(new Account("1", "Esther Aiyeola", "pin").getAccount(), activity.findAccount("1").getAccount());
        activity.register("Temitope", "Aiyeola", "pin");
        assertEquals(new Account("2", "Temitope Aiyeola", "pin").getAccount(), activity.findAccount("2").getAccount());
    }
    @Test
    public void testThatBankCanPrintAllItsAccounts(){
        activity.register("Esther", "Aiyeola", "pin");
        activity.register("Bola", "Aiyeola", "pin");
        String expected = null;
        assertEquals(null, activity.printListOfAccounts());
    }
}
