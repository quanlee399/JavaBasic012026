package DataType;

public class DemoDataType {

    public static void main(String[] args) {

        String name = "Selenium Java";

        //Kieu du lieu chi luu SO NGUYEN
        byte number1= 0;
        short number2 = 32000;
        int number3 = 2100000000;
        long number4 = 3000000000L;

        //Kieu du lieu chi luu SO THUC
        float LaiSuatNganHang = 5.2F;
        double soPi = 3.149683; //Thuong dung trong Test Automation

        //kieu du lieu DUNG SAI
        boolean check = true;
        boolean result = false;
        String actual = "Login Success";
        String expected = "Login Success";
        boolean checkCondition = 15 > 10;

        System.out.println(number1 + number2);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number4);
        System.out.println(LaiSuatNganHang);
        System.out.println(soPi);
        System.out.println(checkCondition);
    }
}
