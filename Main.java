import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Worker worker0 = new Worker("Andrzej", 4900, 0, "11-12-2022", "Sprzedawca");
        Worker worker1 = new Worker("Krystyna", 3500, 2, "30-06-2019", "Konsultant");
        Worker worker2 = new Worker("Bożena", 7300, 2, "09-02-2021", "Office");
        Worker worker3 = new Worker("Henia", 4300, 5, "02-02-2021", "Kierowca");
        Worker worker4 = new Worker("Ania", 3300, 6, "11-12-2020", "Staż");

        Manager manager0 = new Manager("Adam", 14500, 9, "10-08-2018", "Manager");
        Manager manager1 = new Manager("Magda", 11500, 8, "22-07-2017", "Junior-Manager");

 List<Employee> employees = new ArrayList<>();
        employees.add(worker0);
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(manager0);
        employees.add(manager1);

        double salaryAllEmployees = employees.stream().mapToDouble(Employee::getSalary).sum();
        System.out.println("Zarobki wszystkich: " + salaryAllEmployees);

        double salaryAllManagers = employees.stream()
                .filter(employee -> employee instanceof Manager)
                .mapToDouble(Employee::getSalary)
                .sum();
        System.out.println("Zarobki managerow: " + salaryAllManagers);

        double salaryAllWorkers = employees.stream()
                .filter(employee -> employee instanceof Worker)
                .mapToDouble(Employee::getSalary)
                .sum();
        System.out.println("Zarobki pracowników: " + salaryAllWorkers);    
    }
}
