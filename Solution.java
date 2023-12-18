package jspiders;
import java.util.Scanner;
	

public class Solution {
	public static void main(String[] args) {
		Bank b=new BankImpl(5000);
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("1.deposit\n2.withdraw\n3.check balance\n4.exit");
			System.out.println("enter the choice");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("enter the amount to be deposit: ");
				int amountToDeposit=sc.nextInt();
				b.deposit(amountToDeposit);//bank.deposit(sc.nextInt());
				break;
				
			case 2:
				System.out.println("enter the amount to be withdrawn: ");
				int amountToWithdraw=sc.nextInt();
				b.withdraw(amountToWithdraw);//bank.withdraw(sc.nextInt());
				break;
				
			case 3:
				System.out.println(b.getBalance());
				break;
				
			case 4:
				System.out.println("FAILED");
				System.exit(0);
				
				default:
					System.out.println(b.displayErrorMesssage());
					}//end of switch statement
			System.out.println("------------");//after switch
		}
		
	}

}
