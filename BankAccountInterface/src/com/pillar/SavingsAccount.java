package com.pillar;

public class SavingsAccount extends BankAccount {

	public void applyInterest() {
		double interest = this.balance() * this.interestRate();
		this.deposit(interest);
	}

	protected double interestRate() {
		return 0.01;
	}

}
