package VongLapFOR;

public class ForCoBan {
    public static void main(String[] args) {

        //Khai bao vong lap FOR

//        for (int i = 0; i <= 10; i+=2){
//            System.out.println("Selenium Java:" + i);
//        }
//      //Dung de lap doan code nhat dinh, vi du Login
//        for (int i = 0; i <= 10; i+=2){
//            System.out.println("Navigate to url...");
//            System.out.println("Enter email:");
//            System.out.println("Enter password:");
//            System.out.println("Click Login button");
//            System.out.println("Verify alert message success display");
//        }

        //Duyet Mang hoac Array List de kiem tra tung phan tu trong mang

        //[2,5,6,8,9,24,0]
        //["Dashboard", "Customer", "Project",...]

        //Khai bao mang
        int mang1[] = new int[]{2,5,6,8,9,24,0};;

        //Duyet mang so ben tren
        for (int i = 0; i < mang1.length; i++){
            System.out.println(mang1[i]);
        }
    }
}


