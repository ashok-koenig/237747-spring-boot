package stream_demo;

import java.util.List;

class Employee{
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class EmployeeExample {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
          new Employee("John", 12345),
          new Employee("Peter", 34456),
          new Employee("Smith", 45677),
          new Employee("Bob", 67899)
        );

        System.out.println("List of All Employees: "+ employees);
        // Filter and print employees getting more than 40,000
        employees.stream().filter(emp-> emp.salary > 40000).forEach(System.out::println);
    }

}
