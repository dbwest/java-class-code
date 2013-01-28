package com.pillar;

public abstract class BankAccount implements Account {

	private double balance = 0.00;
	
	public double balance() {
		return this.balance;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}

	public void withdraw(double amount) {
		this.balance -= amount;
	}
	
	public abstract void applyInterest();

	protected abstract double interestRate(); 
}
