package ques4;

public abstract class Account {
	public Account(double interestrate, double amount) {
		this.interestrate = interestrate;
		this.amount = amount;	
		
		
	}
	private double interestrate;
	private double amount;
	
	public double getInterestrate() {
		return interestrate;
	}
	public void setInterestrate(double interestrate) {
		this.interestrate = interestrate;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
		
	}
	public void print() {};
	
	
	@Override
	public String toString() {
		return "Account [interestrate=" + interestrate + " amount=" + amount + "]";
	}
	public abstract double calculateinterest();

}