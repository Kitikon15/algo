
import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number =sc.nextInt();
        if(number == 1)
        {
        double Midterm = sc.nextDouble(); 
        double Final = sc.nextDouble();
        double Score = Midterm+Final;
        System.out.println("Enter your midterm score: "+Midterm);
        System.out.println("Enter your final score: "+Final);
        System.out.println("Your total score is: "+Score+" . The rusult is Fail!!");
        } else if (number == 2)
        {
        double Midterm = sc.nextDouble();
        double Final = sc.nextDouble();
        double Score = Midterm+Final;
        System.out.println("Enter your midterm score: "+Midterm);
        System.out.println("Enter your final score "+Final);
        System.out.println("Your total score is: "+Score+" . The rusult is Pass!!");
        } else {
            System.out.println(" 1 or 2.");
        }
        System.out.println("ByB Na kub");
        sc.close();
    }
}