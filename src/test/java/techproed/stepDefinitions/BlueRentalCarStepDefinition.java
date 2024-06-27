package techproed.stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.apache.poi.ss.formula.ptg.AttrPtg;
import org.openqa.selenium.Keys;
import techproed.pages.BlueRentalCarsPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ExcelReader;
import techproed.utilities.ReusableMethods;

import java.util.List;

public class BlueRentalCarStepDefinition {

    BlueRentalCarsPage blueRentalCarsPage = new BlueRentalCarsPage();
    
    @Given("kullanici blueRentalCar sayfasina gider")
    public void kullaniciBlueRentalCarSayfasinaGider() {

        Driver.getDriver().get(ConfigReader.getProperty("blueRentalCarsUrl"));
    }

    @When("login butonuna tiklar")
    public void loginButonunaTiklar() {

        blueRentalCarsPage.loginFirst.click();
    }

    @And("email ve password bilgileri ile login olur")
    public void emailVePasswordBilgileriIleLoginOlur() {

        blueRentalCarsPage.email.sendKeys(ConfigReader.getProperty("blueRentalCarsEmail"));
        blueRentalCarsPage.password.sendKeys(ConfigReader.getProperty("blueRentalCarsPassword"));
        blueRentalCarsPage.loginButton.submit();
    }

//Parametreli
    @And("{string} ve {string} bilgileri ile login olur")
    public void veBilgileriIleLoginOlur(String email, String password) {
        blueRentalCarsPage.email.sendKeys(email);
        blueRentalCarsPage.password.sendKeys(password);
        blueRentalCarsPage.loginButton.submit();
    }

    @And("blueRentalCar login oldugunu dogrular")
    public void bluerentalcarLoginOldugunuDogrular() {
        blueRentalCarsPage.loginVerify.isEnabled();
    }

    //US010
    @And("verilen kullanici bilgileri ile login olur")
    public void verilenKullaniciBilgileriIleLoginOlur(DataTable dataTable) {

        List< List<String> > emailPassword = dataTable.asLists();
        System.out.println("emailPassword = " + emailPassword);
        // emailPassword = [[email, password], [sam.walker@bluerentalcars.com, sami], [john_doe@gmail.com, johndoe], [johnson@bluerentalcars.com, johnson]]

        for (int i = 1; i < emailPassword.size(); i++) {
            String email = emailPassword.get(i).get(0);
            String password = emailPassword.get(i).get(1);

            blueRentalCarsPage.email.sendKeys(email);
            blueRentalCarsPage.password.sendKeys(password, Keys.ENTER);

            ReusableMethods.wait(2);

            Driver.getDriver().navigate().back();
        }
    }

    //US010 2.YOL
    @And("verilen kullanici bilgileri ile login olur ikinci yol")
    public void verilenKullaniciBilgileriIleLoginOlurIkinciYol(DataTable dataTable) {

        for (int i = 1; i < dataTable.asLists().size(); i++) {
            String email = dataTable.row(i).get(0);
            String password = dataTable.row(i).get(1);

            blueRentalCarsPage.email.sendKeys(email);
            blueRentalCarsPage.password.sendKeys(password, Keys.ENTER);

            ReusableMethods.wait(2);

            Driver.getDriver().navigate().back();
        }
    }

    //US012
    @And("exceldeki {string} sayfasindaki kullanici bilgileri ile login olur")
    public void exceldekiSayfasindakiKullaniciBilgileriIleLoginOlur(String sheetName) {

        String path = "src/test/resources/adminTestData.xlsx";
        ExcelReader excelReader = new ExcelReader(path, sheetName);

        for (int i = 1; i <= excelReader.rowCount(); i++) {
            String email = excelReader.getCellData(i, 0);
            String password = excelReader.getCellData(i, 1);

            blueRentalCarsPage.email.sendKeys(email);
            blueRentalCarsPage.password.sendKeys(password, Keys.ENTER);
            ReusableMethods.wait(2);

            Driver.getDriver().navigate().back();
            ReusableMethods.wait(2);
        }
    }
}