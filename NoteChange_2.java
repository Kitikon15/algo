import java.util.Scanner;

public class NoteChange_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the product price: ");
        int price = sc.nextInt();
        System.out.print("Enter purchase amount: ");
        int sum = sc.nextInt();
        int totalPrice = price * sum;
        int change = 1000 - totalPrice;
        System.out.println("Total price: " + totalPrice);
        if (change > 0) {
            System.out.println("Change is : "+ change + "Baht");
            int fiveHundredBaht = change / 500;
            change = change % 500;
            System.out.println("Five-hundred note: " + fiveHundredBaht + " note(s)");  
            int hundredBaht = change / 100;
            change = change % 100;
            System.out.println("Hundred note: " + hundredBaht + " note(s)");
            int fiftyBaht = change / 50;
            change = change % 50;
            System.out.println("Fifty note: " + fiftyBaht + " note(s)");
            int twentyBaht = change / 20;
            change = change % 20;
            System.out.println("Twenty note: " + twentyBaht + " note(s)");
            int tenCoin = change / 10;
            change = change % 10;
            System.out.println("Ten coin: " + tenCoin + " coin(s)");
            int fiveCoin = change / 5;
            change = change % 5;
            System.out.println("Five coin: " + fiveCoin + " coin(s)");
            int twoCoin = change / 2;
            change = change % 2;
            System.out.println("Two coin: " + twoCoin + " coin(s)");
        } else {
            System.out.println("Not enough money!");
        }
        sc.close();
    }
}


