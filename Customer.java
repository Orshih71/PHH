package lab2;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Dios
 *
 */
public class Customer {
	/** Name of customer */
	private String name;
	/** Customers Number */
	private int customerNumber;
	/** pin code */
	private int pin;
	/** Accounts list */
	private List<Account> accounts;
	
	Customer(){
		name = "unknown";
		customerNumber = -1;
		pin = -1;
		accounts = new ArrayList<Account>();
	}
	/*
	 * Constructor function with name, customerNumber and pin code
	 */
	Customer(String name, int num, int pin){
		this.name = name;
		this.customerNumber = num;
		this.pin = pin;
		accounts = new ArrayList<Account>();
	}
	
	/**
	 * getAccount function will return current account from account list
	 * @param acc you can find your current account by acc number
	 * @return current Account
	 */
	public Account getAccount(int acc) {
		for(Account i: accounts) {
			if(i.isEqual(acc))
			{
				return i;
			}
		}
		return null;
	}
	/*
	 * isEqual function will return true, when current customer is yours.
	 * If not return false
	 */
	public boolean isEqual(int cus) {
		return customerNumber == cus;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public List<Account> getAccounts() {
		return accounts;
	}
	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
	
	@Override
	public String toString() {
		String i = "";
		for(Account cus: accounts) {
			i += cus.toString();
		}
		return "Name: " + name + ", CustomerNumber: " + customerNumber + ", Pin: " + pin+ ",Accounts[" + i + "]";
		
	}
}
