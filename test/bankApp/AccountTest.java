package bankApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AccountTest {
    private Account activity;
    @BeforeEach
    public void setActivity(){
        activity = new Account("account number", "firstName lastName", "pin");
    }
    @Test
    public void testThatDepositWorks(){
        activity.deposit(1_000);
        assertEquals(1_000, activity.checkBalance("pin"));
        activity.deposit(5_000);
        assertEquals(6_000, activity.checkBalance("pin"));
    }
    @Test
    public void testThatWithdrawWorks(){
        activity.deposit(1_000);
        assertEquals(1_000, activity.checkBalance("pin"));
        activity.deposit(5_000);
        assertEquals(6_000, activity.checkBalance("pin"));
        activity.withdraw(3_000, "pin");
        assertEquals(3_000, activity.checkBalance("pin"));
    }
    @Test
    public void testThatWithdrawDoesNotTakePlaceWithALowBalance(){
        activity.deposit(2_000);
        assertEquals(2_000, activity.checkBalance("pin"));
        activity.withdraw(1_000, "pin");
        assertThrows(IllegalArgumentException.class, ()-> {activity.checkBalance("pin");throw new IllegalArgumentException ("pin is not correct");});
    }
}
