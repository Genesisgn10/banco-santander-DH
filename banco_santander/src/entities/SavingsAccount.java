package entities;

public class SavingsAccount extends Account {

	private Double interestRate;
	
	public SavingsAccount() {
		super();
	}
	
	public SavingsAccount(Double interestRate) {
		super();
		this.interestRate = interestRate;
	}

	@Override
	public void setWithdrow(Double value) {
		double limite = getBalance() - value;
		if(limite >= 0) {
			super.setWithdrow(value);
		}else{
			System.out.println("--------------------------------");
			System.out.println("|     Insufficient balance     |");
			System.out.println("--------------------------------");
		}
	}

	public void collectInterest() {
		double value = getBalance() * this.interestRate;
		super.deposit(value);
	}

	@Override
	public String toString() {
		return "SavingsAccount [interestRate=" + interestRate + ", getBalance()=" + getBalance() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
