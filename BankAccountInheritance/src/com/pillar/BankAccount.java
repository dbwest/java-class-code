package com.pillar;

public abstract class BankAccount {
	
	private double balance = 0.00;

	public void deposit(double amount) {
		this.balance += amount;
	}

	public void withdraw(double amount) {
		this.balance -= amount;
	}

	public double balance() {
		return this.balance;
	}
	
	public abstract void applyInterest();

	protected abstract double interestRate(); 
}
