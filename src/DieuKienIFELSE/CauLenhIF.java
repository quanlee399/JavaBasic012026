package DieuKienIFELSE;

public class CauLenhIF {

    public void createBrowser(String browser){

        String browserSystem = System.getProperty("browser");

        //nvm clean test -Dbrowser=edge
        //nvm clean test -Dbrowser=firefox
        //mvn clean test - Dbrowser=safari

        if (browserSystem != null) {
            browser = browserSystem;
        }
        System.out.println(browser);
    }

    public static void main(String[] args) {

        String actualCustomerName = "Caroline"; //Tu automation lay duoc
        int CustomerID = 123;

        if (actualCustomerName.equals("Nga 01") && CustomerID == 123) {
            System.out.println("Test case Add New Customer passed. 1");
        }else {
            System.out.println("Test case Add New Customer failed.");
        }

        if (CustomerID == 123) {
            System.out.println("Test case Add New Customer passed. 2");
        }
    }
}
