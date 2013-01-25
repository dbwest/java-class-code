package com.pillartechnology.fizzbuzz;

public class FizzBuzz {

	public String drinkUp(int number) {

		if (isMultipleOfThree(number) && isMultipleOfFive(number)) {
			return "fizzbuzz";
		}

		if (isMultipleOfThree(number)) {
			return "fizz";
		}

		if (isMultipleOfFive(number)) {
			return "buzz";
		}

		return String.valueOf(number);
	}

	private boolean isMultipleOfFive(int number) {
		return isMultipleOf(number, 5);
	}

	private boolean isMultipleOfThree(int number) {
		return isMultipleOf(number, 3);
	}
	
	private boolean isMultipleOf(int number, int base) {
		return number % base == 0;		
	}

}
