package ca.quickheaven.designpattern.structural;

/**
 * Composite Pattern
 *
 * A Composite Pattern says that just "allow clients to operate in generic manner on objects that may or may not
 * represent a hierarchy of objects.
 */
public class CompositePatternDemo {

    public static void main(String[] args) {
        Employee cashier1 = new Cashier(1, "Chase", 1000.0);
        Employee cashier2 = new Cashier(2, "Marshall", 1000.0);
        Employee accountant = new Accountant(3, "Rocky", 2000.0);
        Employee manager = new BankManager(0, "Rider", 5000.0);

        manager.addEmployee(cashier1);
        manager.addEmployee(cashier2);
        manager.addEmployee(accountant);

        System.out.println(manager);
    }
}
