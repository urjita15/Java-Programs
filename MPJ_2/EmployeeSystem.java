import java.util.Scanner;

class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displaySalary() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class FullTimeEmployee extends Employee {

    public FullTimeEmployee(String name, double salary) {
        super(name, salary);
    }

    public void calculateSalary() {
        System.out.println("\nFull Time Employee:");
        System.out.println("Salary before hike: " + salary);
        salary = salary + (salary * 0.50);
        System.out.println("Salary after 50% hike: " + salary);
    }
}

class InternEmployee extends Employee {

    public InternEmployee(String name, double salary) {
        super(name, salary);
    }

    public void calculateSalary() {
        System.out.println("\nIntern Employee:");
        System.out.println("Salary before hike: " + salary);
        salary = salary + (salary * 0.25);
        System.out.println("Salary after 25% hike: " + salary);
    }
}

public class EmployeeSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Full Time Employee Name: ");
        String fname = sc.nextLine();
        System.out.print("Enter Full Time Employee Salary: ");
        double fsalary = sc.nextDouble();

        sc.nextLine();

        System.out.print("Enter Intern Employee Name: ");
        String iname = sc.nextLine();
        System.out.print("Enter Intern Employee Salary: ");
        double isalary = sc.nextDouble();

        FullTimeEmployee f = new FullTimeEmployee(fname, fsalary);
        InternEmployee i = new InternEmployee(iname, isalary);

        f.displaySalary();
        f.calculateSalary();

        i.displaySalary();
        i.calculateSalary();

        sc.close();
    }
}