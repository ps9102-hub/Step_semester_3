import java.util.Random;

public class BMICalculator {

    public static String getBmiStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25.0) return "Normal";
        else if (bmi < 30.0) return "Overweight";
        else return "Obese";
    }

    public static void printWellnessReport(double[] heights, double[] weights) {
        System.out.printf("%-8s | %-12s | %-12s | %-8s | %-12s\n", "Person", "Height (m)", "Weight (kg)", "BMI", "Status");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < heights.length; i++) {
            double bmi = weights[i] / (heights[i] * heights[i]);
            String status = getBmiStatus(bmi);
            System.out.printf("Person %-2d | %-12.2f | %-12.2f | %-8.2f | %-12s\n", (i + 1), heights[i], weights[i], bmi, status);
        }
    }

    public static void main(String[] args) {
        int numPeople = 10;
        double[] heights = new double[numPeople];
        double[] weights = new double[numPeople];
        Random random = new Random();

        for (int i = 0; i < numPeople; i++) {
            heights[i] = 1.50 + (1.90 - 1.50) * random.nextDouble();
            weights[i] = 45.0 + (100.0 - 45.0) * random.nextDouble();
        }

        printWellnessReport(heights, weights);
    }
}
