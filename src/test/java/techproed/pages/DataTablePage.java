package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class DataTablePage {

    public DataTablePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = ".dt-button.buttons-create")
    public WebElement newButton;

    @FindBy(id = "DTE_Field_first_name")
    public WebElement firstName; //Keys.TAB ile devam ettik, aşağıdaki locate'lere gerek kalmadı

/*    @FindBy(id = "DTE_Field_last_name")
    public WebElement lastName;

    @FindBy(id = "DTE_Field_position")
    public WebElement position;

    @FindBy(id = "DTE_Field_office")
    public WebElement office;

    @FindBy(id = "DTE_Field_extn")
    public WebElement extension;

    @FindBy(id = "DTE_Field_start_date")
    public WebElement startdate;

    @FindBy(id = "DTE_Field_salary")
    public WebElement salary;
*/

    @FindBy(xpath = "//button[.='Create']")
    public WebElement createButton;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchBox;

    @FindBy(xpath = "//table//tr[1]//td[2]")
    public WebElement firstCell;
}