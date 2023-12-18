package jspiders;

public class InsufficientBalanceException extends Exception{
	private String message;
	InsufficientBalanceException(String message){
		this.message=message;
		
	}
	public String getMessage() {
		return message;
	}

}
