
import java.util.Scanner;

public class TestOddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Enter a number: " +number );
        if (number%2==0) {
            System.out.println("The number "+number+" is Even");
        } else {
            System.out.println("The number "+number+" is Odd");
        }
        System.out.println("END");
        sc.close();
    }
}
