package dds.patterndesign.observer;

import org.junit.Before;
import org.junit.Test;

public class BankAccountTest {

	BankAccount bankAccount = new BankAccount();
	
	BankExpense bankExpense1;
	BankExpense bankExpense2;
	BankExpense bankExpense3;

	@Before
	public void setUp() {
		this.bankExpense1 = new BankExpense("commission", 0.11d);
		this.bankExpense2 = new BankExpense("expense", 0.22d);
		this.bankExpense3 = new BankExpense("compensation", 0.33d);

		this.bankAccount.addObserver(bankExpense1);
		this.bankAccount.addObserver(bankExpense2);
		this.bankAccount.addObserver(bankExpense3);
		
	}
	
	@Test
	public void sdsdsdsd() {
		bankAccount.addAmount(1000d);
		
        System.out.println(this.bankExpense1.toString());
        System.out.println(this.bankExpense2.toString());
        System.out.println(this.bankExpense3.toString());
        
	}

}
