package com.arracos.vendingmachine;

import static org.junit.Assert.*;

import org.junit.Test;

public class CoinTest {

	@Test
	public void itReturnsValidDime() {
		Coin coin = new Coin();
		assertEquals(0.1f, coin.setCoin("dime"), 0);
	}
	
	@Test
	public void itReturnsValidNickel() {
		Coin coin = new Coin();
		assertEquals(0.05f, coin.setCoin("nickel"), 0);
	}
	
	@Test
	public void itReturnsZero(){
		Coin coin = new Coin();
		assertEquals(0f, coin.setCoin("something"), 0);
	}
	
	@Test
	public void itReturnsQuarterOnNew() {
		Coin coin = new Coin("quarter");
		assertEquals(0.25f, coin.getValue(), 0);
	}
	
	@Test
	public void itReturnsDimeOnNew() {
		Coin coin = new Coin("dime");
		assertEquals(0.1f, coin.getValue(), 0);
	}
	
	@Test
	public void itReturnsNickelOnNew() {
		Coin coin = new Coin("nickel");
		assertEquals(0.05f, coin.getValue(), 0);
	}
	
	@Test
	public void itReturnsZeroOnNew() {
		Coin coin = new Coin("something");
		assertEquals(0f, coin.getValue(), 0);
	}
	
	@Test
	public void itReturnsValidOnQuarter() {
		Coin coin = new Coin("quarter");
		assertEquals(true, coin.isValid());
	}
	
	@Test
	public void itReturnsInValidOnBadr() {
		Coin coin = new Coin("bad");
		assertEquals(false, coin.isValid());
	}

}
