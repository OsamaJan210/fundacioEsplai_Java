import poo1.BankAccount;
import poo1.Contact;
import poo1.Persona;
import poo1.Task;

import java.util.ArrayList;
import java.util.List;

public class POO1 {
    public static void main(String[] args) {
//        Persona p1 = new Persona("Ana", 25, "ana@example.com");
//        Persona p2 = new Persona("Luis", 17, "luis.example.com"); // correo inválido
//        Persona p3 = new Persona("Marta", 30, "marta@example.com");
//
//
//        System.out.println(p1);
//        System.out.println(p2);
//        System.out.println(p3);
//
//        p2.setEdad(18);
//        p2.setCorreo("luis@correo.com");
//
//        System.out.println("\nDespués de actualizar a Luis:");
//        System.out.println(p2);
//
//        System.out.println("===================\n");
//        System.out.println("Lista de Tareas\n");
//        List<Task> tasks = new ArrayList<>();
//
//
//        tasks.add(new Task("Buy groceries", "Milk, bread, eggs"));
//        tasks.add(new Task("Finish homework", "Math exercises"));
//        tasks.add(new Task("Workout", "30 minutes of cardio"));
//
//
//        tasks.get(1).markAsCompleted();
//        tasks.get(2).markAsCompleted();
//
//
//        System.out.println("All Tasks:");
//        for (Task task : tasks) {
//            System.out.println(task);
//        }
//
//        // List only pending tasks
//        System.out.println("\nPending Tasks:");
//        for (Task task : tasks) {
//            if (task.isPending()) {
//                System.out.println(task);
//            }
//        }
//
//        // Count completed tasks
//        long completedCount = tasks.stream().filter(Task::isCompleted).count();
//        System.out.println("\nCompleted Tasks Count: " + completedCount);

//        System.out.println("===================\n");
//        System.out.println("Cajero Básico\n");
//        BankAccount.bankSimulation();

        System.out.println("===================");
        System.out.println("Gestor de Contactos\n");
        Contact.gestordeContactos();

    }

}
