package jspiders;

public interface Bank {
	void deposit(int amt);
	void withdraw(int amt);
	int getBalance();
	String displayErrorMesssage();
	

}
//all the methods in interface are automatically public and abstract
