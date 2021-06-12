package BankAccount;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount x=new BankAccount(1000.0,900.0);
		x.withdraw(999, 1);
		x.seeTotal();
		System.out.println(x.seebankNum());
	}

}
