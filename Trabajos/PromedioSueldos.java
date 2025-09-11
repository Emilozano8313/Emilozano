//Clase 11/06/2024
import java.util.List;
import java.util.ArrayList;

class Worker {
    private int id;
    private String name;
    private double salary;

    public Worker(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
}
public class PromedioSueldos {
    public static void main(String[] args) {
        List<Worker> workers = new ArrayList<>();
        workers.add(new Worker(1, "Empleado Emi", 900));
        workers.add(new Worker(2, "Empleado Diego", 700));
        workers.add(new Worker(3, "Empleado Juan", 1400));
        workers.add(new Worker(4, "Empleado Ana", 1500));
        workers.add(new Worker(5, "Empleado Eduardo", 500));
        workers.add(new Worker(6, "Empleado Kevin", 1700));
        double total = 0;
        for (Worker w : workers) {
            total += w.getSalary();
        }
        double promedio = total / workers.size();
        System.out.println("El sueldo promedio es: " + promedio);
        for (Worker w : workers) {
            if (w.getSalary() < 1000) {
                System.out.println("Empleado con sueldo menor a 1000: " + w.getName() + " con sueldo: " + w.getSalary());
            } else if (w.getSalary() >= 1000) {
                System.out.println("Empleado con sueldo mayor a 1000: " + w.getName() + " con sueldo: " + w.getSalary());
            }
        }
        System.out.println("Removiendo empleados con sueldo menor a 1000");
        workers.removeIf(w -> w.getSalary() < 1000);
        System.out.println("Lista de empleados despues de la purga:");
        for (Worker w : workers) {
            System.out.println("Empleado: " + w.getName() + " con sueldo: " + w.getSalary());
        }
    }
}
    