package ACFCS;


import java.util.Scanner;

public class circleArea {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int radius = 5;
        double circleArea = 3.14159*(radius*radius);
        System.out.println("Enter radius="+radius);
        System.out.println("Area of circle that has radius ="+radius +"meters is " +circleArea+ "square meters");
        scanner.close();
    }
}