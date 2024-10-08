import java.util.Scanner;
public class NoteChange_1
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to pay: ");
            int AmountDue = sc.nextInt();
            int Change = 1000 - AmountDue;
        System.out.println("Change is :" +Change +"Baht");
            int FiveHundredBaht = Change/500;
                Change = Change%500;
            int HundredBaht = Change/100;
                Change = Change%100;
            int FiftyBaht = Change/50;
                Change = Change%50;
            int TwentyBaht = Change/20;
                Change = Change%20;
            int TenCoin = Change/10;
                Change = Change%10;
            int FiveCoin = Change/5;
                Change = Change%5;
            int TwoCoin = Change/2;
                Change = Change%2;
        System.out.println("five-hundred note:" +FiveHundredBaht + "note(s)");
        System.out.println("hundred note:" +HundredBaht + "note(s)");
        System.out.println("fifty note:" +FiftyBaht + "note(s)");
        System.out.println("twenty note:" +TwentyBaht + "note(s)");
        System.out.println("Ten coin:" +TenCoin + "coin(s)");
        System.out.println("five coin:" +FiveCoin + "coin(s)");
        System.out.println("two coin:" +TwoCoin + "coin(s)");
        sc.close();
    }
    
}