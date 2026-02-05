package Excercise3;
import static org.junit.Assert.*;
import org.junit.Test;

public class BankAccountTest {
    
    @Test
    public void testNewAccountHasZeroBalance() {
        BankAccount account = new BankAccount();
        assertEquals(0.0, account.getBalance(), 0.001);
    }
    
    @Test
    public void testNewAccountCanDeposit() {
        BankAccount account = new BankAccount();
        account.deposit(100.0);
        assertEquals(100.0, account.getBalance(), 0.001);       
    }

    @Test
    public void testNewAccountCanWithdraw() {
        BankAccount account = new BankAccount();
        account.deposit(100.0);
        account.withdraw(30.0);
        assertEquals(70.0, account.getBalance(), 0.001);
    }

    @Test
    public void testNewAccountCantGoIntoOverdraft() {
        BankAccount account = new BankAccount();
        account.deposit(30.0);
        double result = account.preventOverdrafts(50.0);

        assertEquals(30.0, result, 0.001);
        assertEquals(30.0, account.getBalance(), 0.001);

        result = account.preventOverdrafts(10.0);
        assertEquals(20.0, result, 0.001);
    }

}
