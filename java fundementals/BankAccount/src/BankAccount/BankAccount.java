package BankAccount;
import java.util.Random;

public class BankAccount {
private String account_number;
private double checking_balance;
private double savings_balance;
private static int num=0;
private static double total_money;

public BankAccount( double checking_balance, double savings_balance) {
	this.account_number = random();
	this.checking_balance = checking_balance;
	this.savings_balance = savings_balance;
	num++;
}

private String random() {
	Random rand=new Random();
	String bankNum="";
	for (int i =0;i<10;i++) {
		Integer x=rand.nextInt(10);
		bankNum+=x.toString();
	}
	return bankNum;
}

public double getChecking_balance() {
	return checking_balance;
}


public double getSavings_balance() {
	return savings_balance;
}
public void depositMoney(double ammount,int check) {
	if (check==1) {
		checking_balance+=ammount;
	}
	else if(check==2) {
		savings_balance+=ammount;
	}
	total_money++;
}
public void withdraw(double ammount,int num) {
	if (num==1) {
		if(checking_balance>ammount) {
			checking_balance-=ammount;
		}
		else {
			System.out.println("insufficient funds.");
		}
	}
	if(num==2) {
		if(savings_balance>ammount) {
			savings_balance-=ammount;
		}
		else{
			System.out.println("insuffiecient funds");
		}
	}
}
public void seeTotal() {
	System.out.println("checking_balance :"+checking_balance+"savings_balance :"+savings_balance);
	
}
public String seebankNum() {
	return account_number;
}

}
