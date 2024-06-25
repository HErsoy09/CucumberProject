package techproed.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import techproed.pages.AmazonPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class AmazonStepDefinition {

    AmazonPage amazonPage = new AmazonPage();

    @Given("kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }
    @When("arama kutusunda iphone aratir")
    public void arama_kutusunda_iphone_aratir() {
        if (amazonPage.searchBox.isDisplayed()) {
            amazonPage.searchBox.sendKeys("iphone");
            amazonPage.searchBox.submit();
        } else if (amazonPage.searchBox1.isDisplayed()) {
            amazonPage.searchBox1.sendKeys("iphone");
            amazonPage.searchBox1.submit();
        }
    }
    @When("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }

    @When("arama kutusunda samsung aratir")
    public void aramaKutusundaSamsungAratir() {
        if (amazonPage.searchBox.isDisplayed()) {
            amazonPage.searchBox.sendKeys("samsung");
            amazonPage.searchBox.submit();
        } else if (amazonPage.searchBox1.isDisplayed()) {
            amazonPage.searchBox1.sendKeys("samsung");
            amazonPage.searchBox1.submit();
        }
    }

    @When("arama kutusunda nokia aratir")
    public void aramaKutusundaNokiaAratir() {
        if (amazonPage.searchBox.isDisplayed()) {
            amazonPage.searchBox.sendKeys("nokia");
            amazonPage.searchBox.submit();
        } else if (amazonPage.searchBox1.isDisplayed()) {
            amazonPage.searchBox1.sendKeys("nokia");
            amazonPage.searchBox1.submit();
        }
    }

//Dynamic (Parameters)

    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String url) {
        Driver.getDriver().get(url);
    }

    @When("arama kutusunda {string} aratir")
    public void aramaKutusundaAratir(String str) {
        if (amazonPage.searchBox.isDisplayed()) {
            amazonPage.searchBox.sendKeys(str);
            amazonPage.searchBox.submit();
        } else if (amazonPage.searchBox1.isDisplayed()) {
            amazonPage.searchBox1.sendKeys(str);
            amazonPage.searchBox1.submit();
        }
    }
}