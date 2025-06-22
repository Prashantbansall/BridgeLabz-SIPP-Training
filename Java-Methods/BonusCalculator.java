package javaMethods;
import java.util.Arrays;

public class BonusCalculator {

    public static double[][] generateEmployeeData(int count) {
        double[][] data = new double[count][2];
        for (int i = 0; i < count; i++) {
            data[i][0] = Math.round((Math.random() * 40000 + 10000)); // 5-digit salary
            data[i][1] = Math.round(Math.random() * 10); // years of service
        }
        return data;
    }

    public static double[][] calculateBonusAndNewSalary(double[][] employeeData) {
        double[][] updatedData = new double[employeeData.length][2];
        for (int i = 0; i < employeeData.length; i++) {
            double salary = employeeData[i][0];
            double years = employeeData[i][1];
            double bonus = years > 5 ? salary * 0.05 : salary * 0.02;
            double newSalary = salary + bonus;
            updatedData[i][0] = newSalary;
            updatedData[i][1] = bonus;
        }
        return updatedData;
    }

    public static void displaySalaryReport(double[][] original, double[][] updated) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("Emp\tOldSalary\tYears\tNewSalary\tBonus");
        for (int i = 0; i < original.length; i++) {
            double oldSalary = original[i][0];
            double years = original[i][1];
            double newSalary = updated[i][0];
            double bonus = updated[i][1];

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.println((i + 1) + "\t" + oldSalary + "\t\t" + (int) years + "\t" + newSalary + "\t\t" + bonus);
        }

        System.out.println("Total\t" + totalOldSalary + "\t\t\t" + totalNewSalary + "\t\t" + totalBonus);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][] employeeData = generateEmployeeData(10);
        double[][] updatedData = calculateBonusAndNewSalary(employeeData);
        displaySalaryReport(employeeData, updatedData);
	}

}
