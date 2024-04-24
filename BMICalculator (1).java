import java.util.InputMismatchException;
import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isMetric;
        double height = 0;
        double weight = 0;
        
        try {
            System.out.println("Select the measurement system: (1) Metric system (2) Imperial system");
            int choice = scanner.nextInt();

            if (choice != 1 && choice != 2) {
                throw new IllegalArgumentException("Invalid choice. Please enter 1 or 2.");
            }
            isMetric = (choice == 1);

            System.out.println("Enter your height (" + (isMetric ? "cm" : "inches") + "): ");
            height = scanner.nextDouble();

            System.out.println("Enter your weight (" + (isMetric ? "kg" : "pounds") + "): ");
            weight = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
            return;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }

        double bmi = calculateBMI(weight, height, isMetric);
        String classification = classifyBMI(bmi);
        System.out.println("Your BMI is: " + bmi);
        System.out.println("Your classification is: " + classification);
    }

    private static double calculateBMI(double weight, double height, boolean isMetric) {
        if (isMetric) {
            // BMI = weight (kg) / (height (m) * height (m))
            height = height / 100; // converting height from cm to m
            return weight / (height * height);
        } else {
            // BMI = weight (lbs) / (height (in) * height (in)) * 703
            return (weight / (height * height)) * 703;
        }
    }

    private static String classifyBMI(double bmi) {
        if (bmi < 18.5) {
            return "Underweight like steph Curry";
        } else if (bmi < 25) {
            return "Healthy like lebum James";
        } else if (bmi < 30) {
            return "Overweight like Leo Messi";
        } else if (bmi < 35) {
            return "Obese like Jean";
        } else {
            return "Extremely Obese Like teacher Braulios pocket"; /////* porque es millionario//*
        }
    }
}
