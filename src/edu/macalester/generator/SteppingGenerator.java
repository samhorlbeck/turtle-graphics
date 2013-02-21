package edu.macalester.generator;

public class SteppingGenerator implements Generator {
	
	private double start;
	private double step;
	private int counter;
	
	public SteppingGenerator(double a, double b) {
		start = a;
		step = b;
		counter = -1;
	}
	
	public double next() {
		return start + step*++counter;
	}
}
