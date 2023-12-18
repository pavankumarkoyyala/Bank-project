package jspiders;

public class BankImpl implements Bank{
	int balance;
	BankImpl(int balance){
		this.balance=balance;
	}
	public void deposit(int amt) {
		System.out.println("Depositing rs. "+amt);
		balance=balance+amt;
		System.out.println("\n amount deposit successfully\n");
	}
	public void withdraw(int amt) {
		if(amt<=balance) {
			System.out.println("withdrawing rs. "+amt);
			balance=balance-amt;
			System.out.println("\n amount withdraw successfully");
		}
		else {
			//invoke an exception and handle it using try and catch block
			//InsufficientBalanceException
			try {
				throw new InsufficientBalanceException("\ninsufficient balance\n");

			}
			catch(InsufficientBalanceException ibe) {
				System.out.println(ibe.getMessage());
			}
		}

	}
	public int getBalance() {
		return balance;
	}
	public String displayErrorMessage() {
		return "\ninvalid choice,kindly enter valid choice\n";
	}
	public String displayErrorMesssage() {
		return null;
	}
}
