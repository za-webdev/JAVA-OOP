package bankaccount;

import java.util.Random;

public class BankAccount {
	
	protected static Integer numberOfAccounts=0;
	protected static Double totalMoney=0.0;
	protected static Random rand= new Random();
	
	 private String accountNumber;
	 private Double checkingsBalance;
	 private Double savingsBalance;
	 
	 public BankAccount(){
		 this.checkingsBalance=0.0;
		 this.savingsBalance=0.0;
		 this.setAccountNumber(this.generateAccount());
		 numberOfAccounts ++;
	 }
	 
	 
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Double getCheckingsBalance() {
		return checkingsBalance;
	}
	public void setCheckingsBalance(Double checkingBalance) {
		this.checkingsBalance = checkingBalance;
	}
	public Double getSavingsBalance() {
		return savingsBalance;
	}
	public void setSavingsBalance(Double savingBalance) {
		this.savingsBalance = savingBalance;
	}
	
	private String generateAccount() {
		Long number;
		number= 10000000000L + ((long)rand.nextInt(900000000)*100) + rand.nextInt(100);
		return number.toString();
	}
	
	public void depositToCheckings(Integer money) {
		this.setCheckingsBalance(this.getCheckingsBalance()+money);
		totalMoney+=money;		
	}
	
	public void depositToSavings(Integer money) {
		this.setSavingsBalance(this.getSavingsBalance()+money);
		totalMoney+=money;
		
	}
	
	public void displayCheckings() {
		System.out.println("You have $"+this.getCheckingsBalance() +" dollars in your checkings ");
	}
	
	public void displaySavings() {
		System.out.println("You have $"+this.getSavingsBalance() +" dollars in your savings ");
	}
	
	public void withdrawCheckings(Integer money) {
		if( this.getCheckingsBalance()  <= money) {
			System.out.println("You donot have enough money");
		}
		else {
		this.setCheckingsBalance(this.getCheckingsBalance()-money);
		}
		totalMoney-=money;	
	}
	
	public void withdrawSavings(Integer money) {
		if( this.getSavingsBalance()  <= money) {
			System.out.println("You donot have enough money");
		}
		else {
		this.setSavingsBalance(this.getSavingsBalance()-money);
		}
		totalMoney-=money;	
	}

	
	public  static Double showTotalMoney() {
		return totalMoney;
	}
	
	
	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount();
		BankAccount acc2 =new BankAccount ();
		acc2.depositToCheckings(10);
		acc2.withdrawCheckings(5);
		acc2.withdrawSavings(5);
		acc2.displayCheckings();
		System.out.println("Total money in the Bank $"+BankAccount.showTotalMoney()+" dollars");
	}
}
	 

