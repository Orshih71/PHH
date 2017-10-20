package lab2;

/**
 * @author Dios
 *
 *
 */
public class ATM {
	/** Bank */
	private Bank bank;
	/** state number */
	private int state;
	/** current account */
	private Account currentAccount;
	/** current customer */
	private Customer currentCustomer;
	ATM(){
		bank = new Bank();
		state = -1;
		currentAccount = new Account();
		currentCustomer = new Customer();
	}
	/*
	 * Constructor function with bank and state
	 */
	ATM(Bank bank, int state){
		this.bank = bank;
		this.state = state;
		this.currentAccount = null;
		this.currentCustomer = null;
	}
	/*
	 * Constructor function with bank, state, account and customer
	 */
	ATM(Bank bank, int state, Account acc, Customer cus){
		this.bank = bank;
		this.state = state;
		this.currentAccount = acc;
		this.currentCustomer = cus;
	}
	public void withDraw(int c) {
		currentAccount.withdraw(c);
	}
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public Account getCurrentAccount() {
		return currentAccount;
	}
	public void setCurrentAccount(Account currentAccount) {
		this.currentAccount = currentAccount;
	}
	public Customer getCurrentCustomer() {
		return currentCustomer;
	}
	public void setCurrentCustomer(Customer currentCustomer) {
		this.currentCustomer = currentCustomer;
	}
	@Override
	public String toString() {
		return "Bank: " + bank + ", " + "State:" + state + ", " + "currentAccount: " +currentAccount +
				", currentCustomer: " +currentCustomer;
		
	}
	
	
}
