package com.pillartechnology.fizzbuzz;

public class FizzBuzz {
	
	private String[] names;
	private int[] numbers;
	
	public FizzBuzz() {
		names = new String[] { "fizz", "buzz" };
		numbers = new int[] { 3, 5 };
	}
	
	public FizzBuzz(String[] names, int[] numbers) {
		this.names = names;
		this.numbers = numbers;		
	}
	
	public String[] getNames() {
		return names;
	}

	public void setNames(String[] names) {
		this.names = names;
	}

	public int[] getNumbers() {
		return numbers;
	}

	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}

	public String drinkUp(int number) {
		
		boolean numberFound = false;
		
		String response = "";
		for (int i = 0; i < this.names.length; i++) {
			if (number % this.numbers[i] == 0) {
				response += this.names[i];
				numberFound = true;
			}
		}
		
		if (!numberFound) {
			response += String.valueOf(number);
		}
		
		return response;		
		
	}

}
