package entities;

public class CurrentAccount extends Account {

	private Double overdraftLimit = 0.00;
	
	public CurrentAccount() {
		super();
	}
	
	public CurrentAccount(Double overdraftLimit) {
		super();
		this.overdraftLimit = overdraftLimit;
	}
	
	public Double getOverdraftLimit() {
		return overdraftLimit;
	}
	
	@Override
	public void deposit(Double value) {
		if(getBalance() < 0 && overdraftLimit <=100) {
			if((overdraftLimit + value) > 100) {
				overdraftLimit = 100.0;
			}else {
				overdraftLimit += value;
			}
		}
		super.deposit(value);
	}

	//Sacar dinheiro: o cliente pode sacar dinheiro e, caso não tenha saldo
	//suficiente, usar seu cheque especial.
	//Cheque Especial - R$ 200,00
	//R$ 100 - R$ 120,00
	//R$ 100 - R$ 80,00
	//R$ 100 - R$ 320,00
	
	@Override
	public void setWithdrow(Double value) {
		double limite = getBalance() - value;
		if( (limite + overdraftLimit) >= 0 ) {
			super.setWithdrow(value);
			if(limite < 0) {
				overdraftLimit -= Math.abs(limite);
			}
		}else{
			System.out.println("--------------------------------");
			System.out.println("|     Insufficient balance     |");
			System.out.println("--------------------------------");
		}
	}
	
	//Depositar cheques: o cliente pode depositar cheques. Um cheque tem
	//um valor, um banco emissor e uma data de pagamento.
	public void	depositChecks(Check check) {
		deposit(check.getValue());
	}
	
	public void overdraftBalance() {
		System.out.println("[The value of your overdraft="+overdraftLimit+"]");
	}
}
