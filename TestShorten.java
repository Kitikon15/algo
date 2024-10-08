public class TestShorten {
    public static void main(String[] args) {
       
        int i = 5;
        //บวกและกำหนดค่าให้กับตัวแปรที่ตามหลัง
        i += 5;  
        System.out.println("i += 5: " + i);

        //ลบและกำหนดค่าให้กับตัวแปรที่ตามหลัง
        i -= 5;  
        System.out.println("i -= 5: " + i);

        //คูณและกำหนดค่าให้กับตัวแปรที่ตามหลัง
        i *= 5;  
        System.out.println("i *= 5: " + i);

        //หารและกำหนดค่าให้กับตัวแปรที่ตามหลัง
        i /= 5;  
        System.out.println("i /= 5: " + i);

        //หารเอาเศษและกำหนดค่าให้กับตัวแปรที่ตามหลัง
        i %= 5;  
        System.out.println("i %= 5: " + i);
    }
}
