import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Worker worker0 = new Worker("Andrzej", 4900, 0, "11-12-2022", "Sprzedawca");
        Worker worker1 = new Worker("Krystyna", 3500, 2, "30-06-2019", "Konsultant");
        Worker worker2 = new Worker("Bożena", 7300, 2, "09-02-2021", "Office");

        Manager manager = new Manager("Adam", 14500, 5, "10-08-2018", "Manager");

        System.out.println(worker0.getName() + " has code: " + worker0.hashCode());
        System.out.println(worker1.getName() + " has code: " + worker1.hashCode());
        System.out.println(worker2.getName() + " has code: " + worker2.hashCode());
        System.out.println(manager.getName() + " has code: " + manager.hashCode());

        for (Employee employee : List.of(worker0, worker1, worker2, manager)) {
            if (worker2.equals(employee)) {
                System.out.println(worker2.getName() + " is equal to " + employee.getName());
            }
        }
    }
}
