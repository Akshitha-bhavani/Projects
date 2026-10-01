public class Main {
    static class Employee {
        protected int employeeId;
        protected String name;
        protected double basicSalary;
        Employee(int employeeId, String name, double basicSalary) {
            this.employeeId = employeeId;
            this.name = name;
            this.basicSalary = basicSalary;
        }
        double calculateSalary() {
            return basicSalary;
        }
        void displayDetails() {
            System.out.println("Employee ID: " + employeeId);
            System.out.println("Name: " + name);
            System.out.println("Salary: " + calculateSalary());
        }
    }
    static class PermanentEmployee extends Employee {
        private double allowance;
        private double deduction;
        PermanentEmployee(int employeeId, String name, double basicSalary, double allowance, double                 deduction) {
            super(employeeId, name, basicSalary);
            this.allowance = allowance;
            this.deduction = deduction;
        }
        @Override
        double calculateSalary() {
            return basicSalary + allowance - deduction;
        }
    }
    static class ContractEmployee extends Employee {
        private double deduction;

        ContractEmployee(int employeeId, String name, double basicSalary, double deduction) {
            super(employeeId, name, basicSalary);
            this.deduction = deduction;
        }
        @Override
        double calculateSalary() {
            return basicSalary - deduction;
        }
    }
    static class PartTimeEmployee extends Employee {
        private double hourlyRate;
        private int hoursWorked;
        PartTimeEmployee(int employeeId, String name, double hourlyRate, int hoursWorked) {
            super(employeeId, name, 0);
            this.hourlyRate = hourlyRate;
            this.hoursWorked = hoursWorked;
        }
        @Override
        double calculateSalary() {
            return hourlyRate * hoursWorked;
        }
    }
    public static void main(String[] args) {
        Employee emp1 = new PermanentEmployee(101, "Rahul", 40000, 5000, 3000);
        Employee emp2 = new ContractEmployee(102, "Priya", 35000, 2000);
        Employee emp3 = new PartTimeEmployee(103, "Arun", 500, 60);
        System.out.println("=================================");
        System.out.println("     EMPLOYEE PAYROLL DETAILS");
        System.out.println("=================================");
        emp1.displayDetails();
        System.out.println();
        emp2.displayDetails();
        System.out.println();
        emp3.displayDetails();
        System.out.println();
        System.out.println("=================================");  } }
