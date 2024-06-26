package techproed.stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import techproed.pages.GooglePage;
import techproed.utilities.Driver;

import java.util.List;

public class GoogleStepDefinition {

    GooglePage googlePage = new GooglePage();

    @When("google arama kutusunda {string} aratir")
    public void googleAramaKutusundaAratir(String str) {
        googlePage.searchBox.sendKeys(str, Keys.ENTER);
    }

    @Then("sayfa basliginin {string} icerdigini test eder")
    public void sayfaBasligininIcerdiginiTestEder(String str) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(str));
    }

    @But("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    //DATATABLE feature
    @When("kullanici verilen bilgilerle arama yapar")
    public void kullaniciVerilenBilgilerleAramaYapar(DataTable data) {
        // 1.YOL
        List<String> dataTableList = data.asList();

        for (int i = 0; i < dataTableList.size(); i++) {
            googlePage.searchBox.sendKeys(dataTableList.get(i), Keys.ENTER);
            Assert.assertTrue(Driver.getDriver().getTitle().contains(dataTableList.get(i)));
            googlePage.searchBox.clear();
        }
    }

    @When("kullanici verilen bilgilerle arama yapar ikinci yol")
    public void kullaniciVerilenBilgilerleAramaYaparIkinciYol(List<String> list) {
        // 2.YOL
        for (String w : list) {
            googlePage.searchBox.sendKeys(w, Keys.ENTER);
            Assert.assertTrue(Driver.getDriver().getTitle().contains(w));
            googlePage.searchBox.clear();
        }
    }
}