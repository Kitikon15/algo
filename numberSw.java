import java.util.Scanner;

public class numberSw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1 : ");
        int number1 = sc.nextInt();
        System.out.print("Enter Number 2 : ");
        int number2 = sc.nextInt();
        int num3;
        System.out.println("Number1 is ="+number1+"and Number2: "+number2);
        System.out.println("Swapping");
        num3 = number1;
        number1 = number2;
        number2 = num3;
        System.out.println("Number1 is ="+number1+"and Number2: "+number2);
        sc.close();
    }
}
