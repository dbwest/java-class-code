package com.pillar;

public class CheckingAccount extends BankAccount {

	public void applyInterest() {
		if (this.balance() >= 1000.00) {
			double interest = this.balance() * this.interestRate();
			this.deposit(interest);
		}
	}

	protected double interestRate() {
		return 0.02;
	}

}
