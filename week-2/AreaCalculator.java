import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height =3;
        int base =2;
        int side =5;
        float triangle = 2 / base*height;
        float square = side*side;
        System.out.println("Enter the base of the triangle: "+base);
        System.out.println("Enter the height of the triangle: "+height);
        System.out.println("Area of the triangle: "+triangle+"square units"); 
        System.out.println("--------------------------------------------");
        System.out.println("Enter the lenght of the square: "+side);
        System.out.println("Enter the width of the square: "+side);
        System.out.println("Area of the square: "+square +"square units");
        scanner.close();
    }
}
