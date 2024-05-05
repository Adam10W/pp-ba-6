import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {
        Worker worker0 = new Worker("Andrzej", 4900, 0);
        Worker worker1 = new Worker("Krystyna", 3500, 1);
        Worker worker2 = new Worker("Bożena", 7300, 2);
        Worker worker3 = new Worker("Michał", 3400, 3);

        Manager manager = new Manager("Adam", 14500, 5);

        System.out.println("Salary for worker0: " + worker0.getSalary());
        worker0.work();

        System.out.println("Salary for worker1: " + worker1.getSalary());
        worker1.work();

        System.out.println("Salary for worker2: " + worker2.getSalary());
        worker2.work();

        System.out.println("Salary for worker3: " + worker3.getSalary());
        worker3.work();

        System.out.println("Salary for manager: " + manager.getSalary());
        manager.work();
    }
}
