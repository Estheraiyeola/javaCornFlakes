package bankApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AccountTest {
    private Account activity;
    @BeforeEach
    public void setActivity(){
        activity = new Account("account number", "firstName lastName", "1234");
    }
    @Test
    public void testThatDepositWorks(){
        activity.deposit(1_000);
        assertEquals(1_000, activity.checkBalance("1234"));
        activity.deposit(5_000);
        assertEquals(6_000, activity.checkBalance("1234"));
    }
    @Test
    public void testThatWithdrawWorks(){
        activity.deposit(1_000);
        assertEquals(1_000, activity.checkBalance("1234"));
        activity.deposit(5_000);
        assertEquals(6_000, activity.checkBalance("1234"));
        activity.withdraw(3_000, "1234");
        assertEquals(3_000, activity.checkBalance("1234"));
    }
    @Test
    public void testThatIfICheckBalanceWithAnIncorrectPinAccountShouldThrowException(){
        activity.deposit(2_000);
        assertEquals(2_000, activity.checkBalance("1234"));
        activity.withdraw(1_000, "1234");
        assertThrows(IllegalArgumentException.class, ()-> {activity.checkBalance("12");});
    }
    @Test
    public void testThatPinIsANumber(){
        activity.deposit(2_000);
        assertThrows(IllegalArgumentException.class, ()-> {activity.checkBalance("abcd");});
    }
    @Test
    public void testThatAmountToWithdrawOrDepositCannotBeNegative(){
        assertThrows(IllegalArgumentException.class, ()-> {activity.deposit(-2_000);});
        assertThrows(IllegalArgumentException.class, ()-> {activity.withdraw(-1_000, "1234");});
    }
    @Test
    public void testThatWhenPinIsUpdated_TheOldPinCannotBeUsedAgain(){
        activity.deposit(2_000);
        activity.updatePin("5678");
        assertThrows(IllegalArgumentException.class, ()-> {activity.withdraw(1_000, "1234");});
    }
    @Test
    public void testThatAmountCannotBeAnAlphabet(){
        assertThrows(IllegalArgumentException.class, ()-> {activity.deposit(Integer.parseInt("abcd"));});
    }
}
