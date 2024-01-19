package ca.quickheaven.designpattern.behavioral.strategy;

/**
 * Strategy Pattern
 * A Strategy Pattern says that "defines a family of functionality, encapsulate each one, and make them interchangeable".
 * The Strategy Pattern is also known as Policy.
 * <p>
 * Benefits:
 * It provides a substitute to subclassing.
 * It defines each behavior within its own class, eliminating the need for conditional statements.
 * It makes it easier to extend and incorporate new behavior without changing the application.
 * <p>
 * Usage:
 * When the multiple classes differ only in their behaviors.e.g. Servlet API.
 * It is used when you need different variations of an algorithm.
 */
public class StrategyPatternDemo {

    public static void main(String[] args) {
        Context add = new Context(new Addition());
        System.out.println("Addition = " + add.execute(1, 1));

        Context sub = new Context(new Subtraction());
        System.out.println("Subtraction = " + sub.execute(2, 2));

        Context mult = new Context(new Multiplication());
        System.out.println("Multiplication = " + mult.execute(3, 3));
    }
}
