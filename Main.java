package lab2;

/**
 * @author Dios
 *
 *
 */
public class Main {
	public static void main(String[]args) {
		Account account = new Account(1000, 7777);
		Customer customer = new Customer("Bat-Orshih", 71, 4444);
		customer.getAccounts().add(account);
		Bank bank = new Bank("Khaan");
		bank.addCustomer(customer);
		ATM atm = new ATM(bank, 0,account, customer);
		System.out.print(atm);
	}
}
