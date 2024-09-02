package fahrenCel;
import java.util.Scanner;

public class salaryTax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int salary = 30000;
        int taxRate = 10;
        int salarytax =(salary*10)/100;
        System.out.println("ภาษีของเงินเดือน ="+salarytax);
        System.out.println("เงินเดือน =" +salary);
        scanner.close(); 
    }
}
