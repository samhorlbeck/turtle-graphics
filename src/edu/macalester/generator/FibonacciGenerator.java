package edu.macalester.generator;

public class FibonacciGenerator {
	private double a;
	private double b;
	
	public FibonacciGenerator() {
		a = 0;
		b = 1;
	}
	
	public double next() {
		double nextNum = a + b;
		a = b;
		b = nextNum;
		return b;
	}
}
