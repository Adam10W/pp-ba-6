import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Worker worker0 = new Worker("Andrzej", 4900, 0, "11-12-2022", "Sprzedawca");
        Worker worker1 = new Worker("Krystyna", 3500, 1, "30-06-2019", "Konsultant");
        Worker worker2 = new Worker("Bożena", 7300, 2, "09-02-2021", "Office");
        Worker worker3 = new Worker("Michał", 3400, 3, "23-01-2020", "Sprzedawca");

        Manager manager = new Manager("Adam", 14500, 5, "10-08-2018", "Manager");

        List<Employee> employees = new ArrayList<>();
        employees.add(worker0);
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(manager);

        for (Employee employee : employees) {
            System.out.println("/// " + employee.getName() + " (ID: " + employee.getId() + ", Position: " + employee.getPosition() + ", Hire date: " + employee.getHireDate() + ", Salary: " + employee.getSalary() + ")");
            employee.work();
        }
    }
}
