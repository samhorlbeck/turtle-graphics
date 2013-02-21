package edu.macalester.cs124;

import java.awt.Color;

import edu.macalester.generator.FibonacciGenerator;
import edu.macalester.turtle.Turtle;
import edu.macalester.turtle.TurtleProgram;

public class TurtleExercise extends TurtleProgram {
    public void run() {
        setTurtleSpeedFactor(10);
        
        Turtle sally = new Turtle(200, 500, Color.MAGENTA);
        add(sally);
        
        Turtle fred = new Turtle(100, 200, Color.GREEN);
        this.add(fred);
        
        sally.forward(2);
        sally.left(90);
        fred.forward(2.5);
        sally.forward(3);
        sally.left(45);
        sally.setColor(Color.BLUE);
        fred.backward(0.5);
        fred.right(120);
        sally.forward(Math.sqrt(8));
        sally.left(90);
        fred.forward(2.5);
        sally.forward(Math.sqrt(8));
        sally.setColor(Color.MAGENTA);
        fred.backward(0.5);
        sally.left(45);
        sally.forward(3);
        fred.right(120);
        fred.forward(2.5);
        fred.penUp();
        fred.forward(1);
        fred.penDown();
        sally.left(90);
        sally.forward(2);
        FibonacciGenerator fibo = new FibonacciGenerator();
        for(int i = 0; i < 100; i++) {
        	System.out.println(fibo.next());
        }
    }
}
