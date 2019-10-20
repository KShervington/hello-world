package SavingsAccount;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Application {

    private static SavingsAccount saver1 = new SavingsAccount(2000.00);
    private static SavingsAccount saver2 = new SavingsAccount(3000.00);

        @Before
        public void setUp () throws Exception {
            SavingsAccount.setAnnualInterestRate(0.04);
        }

        @Test
        public void calculateMonthlyInterest () {

            assertEquals(6.67, saver1.calculateMonthlyInterest(), 0.1);
            System.out.printf("Saver1 balance: %.2f\n", saver1.getSavingsBalance());
            assertEquals(10.0, saver2.calculateMonthlyInterest(), 0.1);
            System.out.printf("Saver2 balance: %.2f\n", saver2.getSavingsBalance());

        }

    }
