package edu.macalester.generator;

import static org.junit.Assert.*;

import org.junit.Test;
//import edu.macalester.generator.SteppingGenerator;

public class SteppingGeneratorTest {
	
	@Test
	public void generatorStartsAtStep() {
		SteppingGenerator stepper = new SteppingGenerator(5.0, 2.0);
		assertEquals(5.0, stepper.next(), 0.0);
	}
	
	@Test
	public void generatorFollowsPattern() {
		SteppingGenerator stepper = new SteppingGenerator(5.0, 2.0);
		assertEquals(5.0, stepper.next(), 0.0);
		assertEquals(7.0, stepper.next(), 0.0);
		assertEquals(9.0, stepper.next(), 0.0);
		assertEquals(11.0, stepper.next(), 0.0);
	}
}
