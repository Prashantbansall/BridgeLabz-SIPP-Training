package javaMethods;
import java.util.Arrays;

public class RandomStats {
	
	public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = (int)(Math.random() * 9000) + 1000;
        }
        return numbers;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;
        for (int number : numbers) {
            sum += number;
            min = Math.min(min, number);
            max = Math.max(max, number);
        }
        double average = (double) sum / numbers.length;
        return new double[]{average, min, max};
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] randomNumbers = generate4DigitRandomArray(5);
        System.out.println("Random Numbers: " + Arrays.toString(randomNumbers));
        double[] result = findAverageMinMax(randomNumbers);
        System.out.println("Average: " + result[0]);
        System.out.println("Minimum: " + result[1]);
        System.out.println("Maximum: " + result[2]);
	}

}
