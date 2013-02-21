package edu.macalester.cs124;

import java.awt.Color;

import edu.macalester.generator.FibonacciGenerator;
import edu.macalester.generator.Generator;
import edu.macalester.generator.PrimeGenerator;
import edu.macalester.generator.SteppingGenerator;
import edu.macalester.turtle.Turtle;
import edu.macalester.turtle.TurtleProgram;

public class Spiral extends TurtleProgram {
    public void run() {
    	spiral(Color.MAGENTA, new PrimeGenerator(2));
    	//spiral(Color.BLUE, new FibonacciGenerator());
    	spiral(Color.YELLOW, new SteppingGenerator(2.0, 5.0));
    	Color col = new Color(255, 255, 255);
    }
    
    public void spiral(Color col, Generator gen) {
    	//PrimeGenerator prime = new PrimeGenerator(2);
    	setTurtleSpeedFactor(0);
        
        Turtle turtle = new Turtle(getWidth() / 2, getHeight() / 2);
        Turtle follower[] = new Turtle[4];
        for(int i = 0; i < 4; i++) {
        	follower[i] = new Turtle(getWidth() / 2, getHeight() / 2);
        	add(follower[i]);
        	follower[i].setStepSize(1);
        }
        add(turtle);
        turtle.setColor(col);
        turtle.setStepSize(1);
        
        
        int step = 0;
        for(int i = 0; turtleIsNearScreen(turtle); i++) {
            turtle.forward(step);
            turtle.left(90);
            follower[i % 4].moveToPoint(turtle.getX(), turtle.getY());
            step = (int)gen.next();
        }
        remove(turtle);
        
        println("Done!");
    }

    private boolean turtleIsNearScreen(Turtle turtle) {
        double margin = Math.max(getWidth(), getHeight()) / 2;
        return turtle.getX() > -margin
            && turtle.getY() > -margin
            && turtle.getX() < getWidth()  + margin
            && turtle.getY() < getHeight() + margin;
    }
}