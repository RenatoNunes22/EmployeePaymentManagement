import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of employees: ");
    int n = sc.nextInt();
    ArrayList<Employee> employees = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      System.out.println("Employee #" + (i + 1) + " data:");
      System.out.print("Outsourced (y/n)? ");
      char outsourced = sc.next().charAt(0);
      System.out.print("Name: ");
      sc.nextLine();
      String name = sc.nextLine();
      System.out.print("Hours: ");
      int hours = sc.nextInt();
      System.out.print("Value per hour: ");
      double valuePerHour = sc.nextDouble();
      if (outsourced == 'y') {
        System.out.print("Additional charge: ");
        double additionalCharge = sc.nextDouble();
        Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
        employees.add(emp);
      } else {
        Employee emp = new Employee(name, hours, valuePerHour);
        employees.add(emp);
      }
    }

    System.out.println();
    System.out.println("PAYMENTS:");
    for (Employee employee : employees) {
      System.out.println(employee.getName() + " - $ " + String.format("%.2f", employee.payment()));
    }
  }
}
