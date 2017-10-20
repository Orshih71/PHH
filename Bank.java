package lab2;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Dios
 *
 *
 */
public class Bank {
	/** bank name */
	private String name;
	/** customers list */
	private List<Customer> customers;

	/*
	 * Constructor function with bank name and customers
	 */
	Bank(){
		customers = new ArrayList<Customer>();
		name = "unknown";
	}
	Bank(String name){
		customers = new ArrayList<Customer>();
		this.name = name;
	}
	Bank(String name, Customer cus){
		customers = new ArrayList<Customer>();
		customers.add(cus);
		this.name = name;
	}
	public void addCustomer(Customer cus) {
		customers.add(cus);
	}
	/**
	 * @param cus you can find your current customer by cus number
	 * @return found customer or null
	 */
	public Customer getCustomer(int cus) {
		for(Customer i: customers) {
			if(i.isEqual(cus)) {
				return i;
			}
		}
		return null;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Customer> getCustomers() {
		return customers;
	}
	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	@Override
	public String toString() {
		String str = "";
		for(Customer cus: customers) {
			str += cus.toString();
		}
		return "Name: " + name + ", Customers[" + str + "]";
		
	}
}
