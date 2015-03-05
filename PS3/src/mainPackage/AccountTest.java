package mainPackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AccountTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void ut_testAccountBalance() {
		Account myAccount = new Account(1122, 20000);
		myAccount.setAnnualInterestRate(4.5);
		myAccount.deposit(3000);
		
		// expected values
		double expectedBalance = 23000;
		double expectedRate = 4.5;
		double expectedId = 1122;
		
		assertTrue(expectedBalance == myAccount.getBalance());
		assertTrue(expectedId == myAccount.getId());
		assertTrue(expectedRate == myAccount.getAnnualInterestRate());
	}
	
	@Test
	public void ut_testAccountWithdraw() throws InsufficientFundsException {
		Account myAccount = new Account(1122, 20000);
		myAccount.setAnnualInterestRate(4.5);
		myAccount.withdraw(2500);
		double expectedBalance = 17500;
		
		assertTrue(expectedBalance == myAccount.getBalance());		
	}
	
	@Test(expected=InsufficientFundsException.class)
	public void ut_testWithdrawException() throws InsufficientFundsException {
		Account myAccount = new Account(1122, 20000);
		myAccount.setAnnualInterestRate(4.5);
			myAccount.withdraw(25000);
			
	}
	
}
