package ca.quickheaven.designpattern.behavioral.strategy;

/**
 * This class will ask the Strategy interface to execute the type of strategy.
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public float execute(float a, float b) {
        return strategy.calculation(a, b);
    }
}
