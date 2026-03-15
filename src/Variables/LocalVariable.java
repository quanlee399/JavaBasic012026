package Variables;

public class LocalVariable {

    static String name = "Kevin"; //Instance variable

    public static  int age = 29; // Static variable

    // cau truc cua mot ham
    public static void getInfo1(){
        String address = "Da Nang"; // Local variable

        System.out.println(address);
        System.out.println(name);
    }

    public static void getInfo2(){
        String address = "Ha noi";

        System.out.println(address);
        System.out.println(name);
    }

    public static void main(String[] args) {
        System.out.println(age); //Goi truc tiep
        System.out.println(LocalVariable.age); //Thong qua ten class

        //Thong qua doi tuong class thi moi goi su dung dc bien toan cuc
        LocalVariable demo = new LocalVariable();
        getInfo1();
        getInfo2();

        System.out.println(demo.name);

    }
}
