
public class Employee {
    private String name;
    private double hourlyWage;
    private int hoursWorked;

    public Employee(String name, double hourlyWage, int hoursWorked) {
        this.name = name;
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    public String getName() {
        return name;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public double calculateGrossPay() {
        double regularHours = 0;
        double overtimeHours = 0;

        if (hoursWorked > 40) {
            regularHours = 40;
            overtimeHours = hoursWorked - 40;
        } else {
            regularHours = hoursWorked;
        }
        double regularPay = regularHours * hourlyWage;
        double overtimePay = overtimeHours * hourlyWage * 1.5;

        return regularPay + overtimePay;

    }
}



