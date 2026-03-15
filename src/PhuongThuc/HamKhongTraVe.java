package PhuongThuc;

public class HamKhongTraVe {

    //Khai bao ham ko tra ve gia tri de dung lai

    //Ctrl + /
    //Ctrl + Alt + L

    public void Showinfo() {
        String name = "Lan";
        String address = "Dak Lak";
        System.out.println(name);
        System.out.println(address);
    }

    public void displayVersion() {
        String version = "1.0.0";
        System.out.println(version);
    }

    public static void main(String[] args) {
        HamKhongTraVe object1 = new HamKhongTraVe();

        object1.Showinfo();
        object1.displayVersion();
    }
}
