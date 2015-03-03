package mainPackage;

import java.util.Date;

public class Account {
	
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;

	/**
	 * A no-arg constructor for a default account
	 */
	public Account() {
		
		this.dateCreated = new java.util.Date();

	}

	/**
	 * Constructor for an account
	 * 
	 * @param id
	 * @param balance
	 */
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		this.dateCreated = new java.util.Date();
	}

	/**
	 * id accessor
	 * 
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * id mutator
	 * 
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * balance accessor
	 * 
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * balance mutator
	 * 
	 * @param balance
	 *            the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	/**
	 * Interest Rate accessor
	 * 
	 * @return the annualInterestRate
	 */
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	/**
	 * Interest Rate mutator
	 * 
	 * @param annualInterestRate
	 *            the annualInterestRate to set
	 */
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	/**
	 * date accessor
	 * 
	 * @return the dateCreated
	 */
	public Date getDateCreated() {
		return dateCreated;
	}

	/**
	 * Calculates the monthly interest rate
	 * 
	 * @return monthlyInterestRate the monthly interest rate
	 */
	public double getMonthlyInterestRate() {
		return (this.annualInterestRate) / 12;
	}
	/**
	 * Subtracts the given amount from the balance of the account.
	 * Throws a custom exception if the balance is insufficient.
	 * @param amount
	 * @throws InsufficientFundsException
	 */
	public void withdraw(double amount) throws InsufficientFundsException {

		if (balance >= amount) {
			balance -= amount;
		} else {
			double deficit = amount - balance;
			throw new InsufficientFundsException(deficit);
		}
	}
	/**
	 * Adds the given amount to the balance of the account.
	 * @param amount
	 */
	public void deposit(double amount) {
		balance += amount;
	}

	/**
	 * Returns the account information in String form 
	 * @return String
	 */
		
	public String toString() {
		return "Account [id= " + id + ", balance= $" + balance
				+ ", annualInterestRate= " + annualInterestRate
				+ "% , dateCreated= " + dateCreated + "]";
	}
	
	

}


