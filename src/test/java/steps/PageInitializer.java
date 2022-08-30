package steps;

import pages.AddEmployeePage;
import pages.LoginPage;

public class PageInitializer {

    public static LoginPage login;

    public static AddEmployeePage addEmp;

    public static void initializePageObjects(){
        login=new LoginPage();
        addEmp=new AddEmployeePage();
    }


}
