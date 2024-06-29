package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author joaovictorcmd
 * @date 2024 Jun 28
 */
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many employees will be registered?");
        int numberOfEmployees = sc.nextInt();

        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < numberOfEmployees; i++) {

            System.out.printf("Employee #%d:\n", (i+1));
            System.out.println("ID:");
            Integer id = sc.nextInt();

            while (hasId(employees, id)) {
                System.out.println("ID already taken. Try again:");
                id = sc.nextInt();
            }

            System.out.println("Name:");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Salary:");
            Double salary = sc.nextDouble();

            Employee employee = new Employee(id, name, salary);

            employees.add(employee);
        }

        System.out.println("Enter the employee id that will have salary increase:");
        int searchId = sc.nextInt();

        // Buscar na lista (employees) o primeiro employee onde o ID é igual ao searchId
        Employee employee = employees.stream().filter(x -> x.getId() == searchId).findFirst().orElse(null);

        if (employee == null) {
            System.out.println("This ID does not exist!");
        } else {
            System.out.println("Enter the percentage:");
            double percent = sc.nextDouble();
            employee.increaseSalary(percent);
        }

        System.out.println();
        System.out.println("List of Employees:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        sc.close();
    }

    public static boolean hasId(List<Employee> list, int id) {
        // Buscar em uma lista do tipo Employee, o primeiro employee onde o ID é igual ao id informado no parâmetro
        Employee employee = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

        return employee != null;
    }
}
