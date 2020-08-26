package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import entities.Check;
import entities.Client;
import entities.CurrentAccount;
import entities.SavingsAccount;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		CurrentAccount account1 = new CurrentAccount(100.00);
		SavingsAccount account2 = new SavingsAccount(10.00);
		
		Client client1 = new Client(842245, "Silva", "306.407.012-64", "48.509.422-8", account1);
		Client client2 = new Client(102030, "Marques", "39.076.092-4", "559.574.526-61", account2);
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
		Date data = formato.parse("23/11/2015");
		
		Check check = new Check(100.0, "Santander", data);
		
		//		account1.deposit(100.0);
		//		account1.setWithdrow(150.0);
		//		account1.deposit(30.0);
		//		//account1.depositChecks(check);
		//		System.out.println(account1.getBalance());
		//		System.out.println(account1.getOverdraftLimit());
		
	}
}
