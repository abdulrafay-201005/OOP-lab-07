// Task 2a: Base class Employee
public class Employee {
    // Method to calculate base salary
    public double calculateSalary() {
        return 30000.0;  // base salary
    }
}
// Task 2b: Manager subclass
public class Manager extends Employee {
    @Override
    public double calculateSalary() {
        double base = super.calculateSalary(); 
        double bonus = 15000.0;                   
        return base + bonus;                      
    }
}

// Task 2b: Worker subclass
public class Worker extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public Worker(int hoursWorked, double hourlyRate) {
        this.hoursWorked = hoursWorked;
        this.hourlyRate  = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        double base = super.calculateSalary();    // 30,000
        double overtimePay = hoursWorked * hourlyRate;
        return base + overtimePay;               
    }
}
// Task 2c: Main class to test polymorphism
public class Main {
    public static void main(String[] args) {
        Employee  emp  = new Employee();
        Employee  mgr  = new Manager();             
        Worker    wrk  = new Worker(50, 100.0);      

        // Calling calculateSalary() on each instance
        System.out.println("Employee Salary: " + emp.calculateSalary());
        System.out.println("Manager Salary:  " + mgr.calculateSalary());
        System.out.println("Worker Salary:   " + wrk.calculateSalary());
    }
}