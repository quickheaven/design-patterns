package ca.quickheaven.designpattern.creational.singleton;

/**
 * The Singleton Method Design Pattern ensures a class has only one instance and provides global access point to it.
 * It is ideal for scenario's requiring centralized control, like managing database connections or configurations settings.
 */
public final class Singleton {

    private static Singleton instance;

    private Singleton() {

    }

    public static Singleton getInstance() {
        System.out.println("getInstance");
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void doSomething() {
        System.out.println("doSomething");
    }

    public static void main(String[] args) {
        Singleton.getInstance().doSomething();
    }
}
