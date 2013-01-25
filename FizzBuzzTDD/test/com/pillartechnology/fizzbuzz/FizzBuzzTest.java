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
	public void itReturns1WhenHandedA1() {
		assertEquals("1", fizzbuzz.drinkUp(1));
	}
	
	@Test
	public void itReturns2WhenHandedA2() {
		assertEquals("2", fizzbuzz.drinkUp(2));
	}
	
	@Test
	public void itReturnsFizzWhenHandedA3() {
		assertEquals("fizz", fizzbuzz.drinkUp(3));
	}
	
	@Test
	public void itReturnsBuzzWhenHandedA5() {
		assertEquals("buzz", fizzbuzz.drinkUp(5));
	}

	@Test
	public void itReturnsFizzForMultiplesOf3() {
		assertEquals("fizz", fizzbuzz.drinkUp(6));
	}
	
	@Test
	public void itReturnsBuzzForMultiplesOf5() {
		assertEquals("buzz", fizzbuzz.drinkUp(10));
	}
	
	@Test
	public void itReturnsFizzBuzzForMultiplesOf3And5() {
		assertEquals("fizzbuzz", fizzbuzz.drinkUp(15));
	}
	
}
