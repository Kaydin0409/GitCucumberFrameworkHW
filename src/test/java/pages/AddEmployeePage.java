package pages;

import org.apache.commons.math3.analysis.function.Add;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class AddEmployeePage extends CommonMethods {
    @FindBy(id="menu_pim_viewPimModule")
    public WebElement pim;

    @FindBy(id="menu_pim_addEmployee")
    public WebElement addEmpLink;

    @FindBy(id="firstName")
    public WebElement empFirstName;

    @FindBy(id="lastName")
    public WebElement empLastName;

    @FindBy(id="btnSave")
    public WebElement saveButton;

    public AddEmployeePage(){
        PageFactory.initElements(driver,this);
    }
}
