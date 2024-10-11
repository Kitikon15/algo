import java.util.Scanner;

public class BMR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your sex (m or f): ");
        char sex = sc.next().charAt(0);
        System.out.print("Enter your weight (kg): ");
        int weight = sc.nextInt();
        System.out.print("Enter your height (cm): ");
        int height = sc.nextInt();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        double BMRM,BMRF;
        if (sex =='m') {
            BMRM = 66 + (13.7 * weight) + (5 * height) - (6.8 * age);
            System.out.println("BMR your is: "+ BMRM);
        } else {
            BMRF = 655 + (9.6 * weight) + (1.8 * height) - (4.7 * age);
            System.out.println("BMR your is: "+ BMRF);
        } 
        sc.close();
    }
}
