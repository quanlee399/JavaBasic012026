package StaticJava;

public class BienStatic {

    public String email = "admin@email.com";

    public static String password = "123456";

    public static void main(String[] args) {

        BienStatic object1 = new BienStatic();

        System.out.println(object1.email);

        System.out.println(password);

        System.out.println(ConfigData.Browser);

        System.out.println(BienStatic.password);
    }
}
