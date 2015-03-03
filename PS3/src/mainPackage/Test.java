package mainPackage;

public class Test {

	public static void main(String[] args) {
		Account myAccount = new Account(1122, 20000);
		myAccount.setAnnualInterestRate(4.5);

		try {
			System.out.println("Withdrawing $2500...");
			myAccount.withdraw(2500);
			System.out.println("Withdrawing $25000...");
			myAccount.withdraw(25000);

		} catch (InsufficientFundsException e) {
			System.out.println("Transaction invalid: "
					+ "insufficient funds. you need $" + e.getAmount());
			e.printStackTrace();
		}

		System.out.println("Depositing $3000...");
		myAccount.deposit(3000);

		System.out.println(myAccount.toString());
	}

}
