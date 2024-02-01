package SRP;

public class SalaryCalculation {

    int baseSalary;

    public SalaryCalculation(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double salaryCalculation() {
        return baseSalary * 1.5;
    }
}