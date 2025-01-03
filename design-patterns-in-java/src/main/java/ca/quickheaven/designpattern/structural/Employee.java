package ca.quickheaven.designpattern.structural;

public interface Employee {

    int getId();

    String getName();

    double getSalary();

    void addEmployee(Employee employee);

    void remove(Employee employee);

    Employee getChild(int i);
}
