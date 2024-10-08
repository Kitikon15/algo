public class Testlncrement {
    public static void main(String[] args) {
        // การลดตัวแปร counter ลงหนึ่ง สามารถดำเนินการได้หลายวิธี ดังนี้
        // 1.counter = counter-1; หรือ
        // 2.counter--; หรือ
        // 3.--counter;
        int a = 5;
        int result1 = 6;
        int result2 = 5;
        int sum = a + result1 + result2;
        System.out.println("ผลบวก : " + sum);
        int differnce = a - result1 - result2;
        System.out.println("ผลลบ : " + differnce);
        int multiply = a * result1 * result2;
        System.out.println("ผลคูณ : " + multiply);
        int div = a / result1 / result2;
        System.out.println("ผลหาร : " + div);
        int mod = a % result1 % result2;
        System.out.println("เศษที่เหลือ : " + mod);

    }
}
