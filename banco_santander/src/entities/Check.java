package entities;

import java.util.Date;

public class Check {
	
	private Double value;
	private String bank;
	private Date paymentDate;
	
	public Check() {
		super();
	}

	public Check(Double value, String bank, Date paymentDate) {
		super();
		this.value = value;
		this.bank = bank;
		this.paymentDate = paymentDate;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	
	

}
