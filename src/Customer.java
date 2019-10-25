import java.util.ArrayList;
import java.util.List;

public class Customer {
	private double balance;
	private String name;
	public Customer(double balance, String name) {
		super();
		this.balance = balance;
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
