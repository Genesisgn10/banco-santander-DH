package entities;

public abstract class Account {
	
	private Double balance = 0.00;
	
	public Account() {
		
	}
	
	public Account(Double balance) {
		this.balance = balance;
	}
	
	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public void deposit(Double value) {
		balance = balance + value;
	}
	
	public void setWithdrow(Double value) {
		balance -= value;
	}
	
	public void checkBalance() {
		System.out.println("[The your balance="+balance+"]");
	}
	
}
