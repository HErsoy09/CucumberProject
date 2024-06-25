package techproed.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import techproed.pages.BlueRentalCarsPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

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
}