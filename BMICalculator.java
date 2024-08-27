import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int weight = 50;
        double height = 1.64;
        double BMI = weight / (height*height);
        System.out.println("Enter you weight in kilograms: " + weight);
        System.out.println("Enter you height in meters: " + height);
        System.out.println("You BMI for weight: " + weight + " kg and height ="+ height +" meter is: "+BMI+" bmi.");
        scanner.close();
    }
}
