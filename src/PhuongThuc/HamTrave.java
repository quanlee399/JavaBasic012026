package PhuongThuc;

public class HamTrave {

    //Khai bao ham CO tra ve gia tri de dung lai duoc

    public String getVersion() {
        String version = "1.0.0";

        return version;
    }

    public int getCategoryTotal() {
        int categoryTotal = 100;
        return categoryTotal;
    }

    public static void main(String[] args) {

        HamTrave object1 = new HamTrave();

        String version1 = object1.getVersion();
        System.out.println(version1);

        String version2 = object1.getVersion();
        System.out.println(version2);
    }
}
