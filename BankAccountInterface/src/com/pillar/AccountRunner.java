package com.pillar;

import java.io.PrintStream;

public class AccountRunner {
	
	private static PrintStream out = System.out;

	public static void main(String[] args) {
		testBankAccount(new SavingsAccount());
		testBankAccount(new HighYieldAccount());
		testBankAccount(new CheckingAccount());
		testInvestmentAccount(new InvestmentAccount());
	}

	private static void testBankAccount(BankAccount account) {
		out.println(account.getClass().getName());
		account.deposit(500);
		account.applyInterest();
		out.println(account.balance());
		account.deposit(500);
		account.applyInterest();
		out.println(account.balance());
	}
	private static void testInvestmentAccount(InvestmentAccount account) {
		out.println(account.getClass().getName());
		account.buy(500, "APPL");
		out.println(account.balance());
		account.sell(500, "MSFT");
		out.println(account.balance());
	}

}
