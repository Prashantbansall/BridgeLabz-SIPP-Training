package javaMethods;
import java.util.Scanner;

public class BMICalculator {
	
	public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100;
            data[i][2] = weight / (heightM * heightM);
        }
    }

    public static String[] getBMIStatuses(double[][] data) {
        String[] statuses = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi <= 18.4) {
                statuses[i] = "Underweight";
            } else if (bmi <= 24.9) {
                statuses[i] = "Normal";
            } else if (bmi <= 39.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }
        return statuses;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][3];
        for (int i = 0; i < 10; i++) {
            data[i][0] = scanner.nextDouble();
            data[i][1] = scanner.nextDouble();
        }

        calculateBMI(data);
        String[] statuses = getBMIStatuses(data);

        for (int i = 0; i < data.length; i++) {
            System.out.println("Person " + (i + 1) + ": Weight = " + data[i][0] + " kg, Height = " + data[i][1] + " cm, BMI = " + data[i][2] + ", Status = " + statuses[i]);
        }
	}

}
