package edu.macalester.generator;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciGeneratorTest {
	
	@Test
	public void startsAtOneOnteTest() {
		FibonacciGenerator fibo = new FibonacciGenerator();
		assertEquals(1.0, fibo.next(), 0.0);
		assertEquals(1.0, fibo.next(), 0.0);
	}
	
	@Test
	public void followsPattern() {
		FibonacciGenerator fibo = new FibonacciGenerator();
		assertEquals(1.0, fibo.next(), 0.0);
		assertEquals(1.0, fibo.next(), 0.0);
		assertEquals(2.0, fibo.next(), 0.0);
		assertEquals(3.0, fibo.next(), 0.0);
		assertEquals(5.0, fibo.next(), 0.0);
	}
}
