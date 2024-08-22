import java.util.Scanner;

class Payroll{


    public static void printPayroll(Employee employee) {
        double grossPay = employee.calculateGrossPay();

        System.out.println("Payroll Details for: " + employee.getName());
        System.out.println("Gross Pay: $" + grossPay);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();


        System.out.print("Enter hourly wage: ");
        double hourlyWage = scanner.nextDouble();

        System.out.print("Enter hours worked: ");
        int hoursWorked = scanner.nextInt();

        if (hoursWorked < 0 | hourlyWage < 0) {
            System.out.println("Invalid input. Hours worked and hourly wage must be non-negative.");
        }
        else {
            Employee employee = new Employee(name, hourlyWage, hoursWorked);

            printPayroll(employee);
        }

        scanner.close();
    }
}
