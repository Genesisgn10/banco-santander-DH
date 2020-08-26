package entities;

public class Client {
	
	private Integer numberAccount;
	private String surname;
	private String numberRG;
	private String numberCPF;
	private Account account;
	
	public Client() {
		
	}

	public Client(Integer numberAccount, String surname, String numberRG, String numberCPF, Account account) {
		this.numberAccount = numberAccount;
		this.surname = surname;
		this.numberRG = numberRG;
		this.numberCPF = numberCPF;
		this.account = account;
	}

	public Integer getNumberAccount() {
		return numberAccount;
	}

	public void setNumberAccount(Integer numberAccount) {
		this.numberAccount = numberAccount;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getNumberRG() {
		return numberRG;
	}

	public void setNumberRG(String numberRG) {
		this.numberRG = numberRG;
	}

	public String getNumberCPF() {
		return numberCPF;
	}

	public void setNumberCPF(String numberCPF) {
		this.numberCPF = numberCPF;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "Client [numberAccount=" + numberAccount + ", surname=" + surname + ", numberRG=" + numberRG
				+ ", numberCPF=" + numberCPF + ", account=" + account + "]";
	}
}
