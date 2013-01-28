package com.pillar;

import java.io.PrintStream;

public class BankAccountRunner {
	
	private static PrintStream out = System.out;

	public static void main(String[] args) {
		testAccount(new SavingsAccount());
		testAccount(new HighYieldAccount());
		testAccount(new CheckingAccount());
	}

	private static void testAccount(BankAccount account) {
		out.println(account.getClass().getName());
		account.deposit(500);
		account.applyInterest();
		out.println(account.balance());
		account.deposit(500);
		account.applyInterest();
		out.println(account.balance());
	}

}
