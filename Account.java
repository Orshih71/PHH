package lab2;
/**
 * @author Dios
 *
 *
 */
public class Account {
	/** amount of balance*/
	private int balance;
	/** account number */
	private int accountNumber;
	Account(){
		accountNumber = -1;
		balance = 0;
	}
	/*
	 * Constructor function with account number and balance
	 */
	Account(int accountNumber, int balance){
		this.balance = balance;
		this.accountNumber = accountNumber;
	}
	/**
	 * deposit function is for increase balance
	 * @param de is increasing value
	 */
	public void deposit(int de) {
		balance += de;
	}
	
	public boolean isEqual(int acc) {
		return accountNumber == acc;
	}
	/**
	 * @param acc
	 * @return function is return true, when current accounts validate.
	 * If not return false
	 */
	/**
	 * withdraw function is for decrease balance
	 * @param wi decreasing value
	 */
	public void withdraw(int wi) {
		balance -= wi;
	}
	/*
	 * getBalance function will return account balance
	 */
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	/*
	 * getAccountNumber function will return Account Number
	 */
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	@Override
	public String toString() {
		return "Balance: " + balance + ", " + accountNumber;
		
	}
}
