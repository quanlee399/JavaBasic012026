package ToanTu;

import javax.lang.model.element.NestingKind;
import javax.sound.midi.MidiFileFormat;

public class ToanTuLogic {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 30;

//        System.out.println((a > b) && (b <c));

        //Toan tu AND &&
        int age = 20;
        boolean hasID = true;
        String address = "Ha Noi";

        if (age >=25 && hasID == true && address.equals("Ha Noi")) {
            System.out.println("Duoc phep vao");
        }

        //Toan tu HOAC ||
        boolean isAdmin = false;
        boolean isManager = true;

        if (isAdmin || isManager) {
            System.out.println("Co quyen truy cap");
        }

//        String alertMessage = "Category has been inserted successfully";
//        String alertMessageActual = "Dung Selenium de lay";
//        String categoryName = "Category01";

//        if (alertMessageActual.equals(alertMessage)) && categoryName.equals("Category01")){
//            System.out.println("Add new category successfully");
//        }

        if (!(a > 20)){
            System.out.println("Duoc xet di NVQS");
        }

        int number1, number2;
        number1 = number2 = 5;

        System.out.println(number1 + number2);
    }
}
