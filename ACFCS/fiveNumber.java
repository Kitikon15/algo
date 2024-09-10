package ACFCS;


import java.util.Scanner;

public class fiveNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1=1;
        int num2=2;
        int num3=3;
        int num4=4;
        int num5=5;
        int sum=num1 + num2 + num3 + num4 + num5;
        float avg =(num1 * num2 * num3 * num4 * num5)/5;
        System.out.println("ผลรวม="+sum);
        System.out.println("ค่าเฉลี่ย="+avg);
        scanner.close();
    }
}
