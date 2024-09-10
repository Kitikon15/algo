
import java.util.Scanner;

public class TwoWayDecision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("จำนวน : ");
        int number = sc.nextInt();

        if (number>0) {
            System.out.println("จำนวนเต็มบวก");
        } else {
            System.out.println("ไม่ใช่จำนวนเต็มบวก");
        }
        System.out.println(" ByB ByB ");
        sc.close();
    }
}
