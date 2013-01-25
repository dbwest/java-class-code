package com.pillartechnology.fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {
	
	private FizzBuzz fizzbuzz;

	@Before
	public void setup() {
		fizzbuzz = new FizzBuzz();		
	}

	@Test
	public void itReturnsANumber() {
		assertEquals("1", fizzbuzz.drinkUp(1));
	}
	
	@Test
	public void itReturnsFizzWhenGivenThree() {
		assertEquals("fizz", fizzbuzz.drinkUp(3));
	}

}
