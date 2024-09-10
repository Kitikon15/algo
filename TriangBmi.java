
import java.util.Scanner;

public class TriangBmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number =sc.nextInt();
        if ( number == 1) {
        int base = sc.nextInt(); 
        int height = sc.nextInt();
        float triangle = base*height/2;
        System.out.println("Enter the base of the triangle: "+base);
        System.out.println("Enter the height of the triangle: "+height);
        System.out.println("Area of the triangle: "+triangle+"square units");
        } else if (number == 2) 
        {
        int weight = sc.nextInt();
        double height = sc.nextDouble();
        double BMI = weight / (height*height);
        System.out.println("Enter you weight in kilograms: " + weight);
        System.out.println("Enter you height in meters: " + height);
        System.out.println("You BMI for weight: " + weight + " kg and height ="+ height +" meter is: "+BMI+" bmi.");
        } else {
            System.out.println("Invalid option. Please enter either 1 or 2.");
        }
        System.out.println("ByB ByB Kub");
        sc.close();
    }
}