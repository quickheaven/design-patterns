package ca.quickheaven.designpattern.structural;

public class Accountant implements Employee {

    private int id;
    private String name;
    private double salary;

    public Accountant(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void addEmployee(Employee employee) {
        //
    }

    @Override
    public void remove(Employee employee) {
        //
    }

    @Override
    public Employee getChild(int i) {
        //
        return null;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("id:").append(id);
        sb.append(", name:'").append(name).append('\'');
        sb.append(", salary:").append(salary);
        sb.append(", type:").append(this.getClass().getSimpleName());
        sb.append('}');
        return sb.toString();
    }
}
