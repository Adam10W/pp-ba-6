package company.abstracts;
import company.interfaces.Employable;

public abstract class Employee implements Employable {
    private String name;
    private double salary;
    private int id;
    private String hireDate;
    private String position;

    public Employee(String name, double salary, int id, String hireDate, String position) {
        this.name = name;
        this.salary = salary;
        this.id = id;
        this.hireDate = hireDate;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public String getHireDate() {
        return hireDate;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public void work() {
        System.out.println("Pracuje");
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object e) {
        
        if (e == null || getClass() != e.getClass()) {
            return false;
        }

        if (this == e) {
            return true;
        }

        Employee other = (Employee) e;
        return id == other.id;
    }
}
