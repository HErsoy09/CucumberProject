package techproed.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import techproed.pages.DataTablePage;

public class DataTableStepDefinition {

    DataTablePage dataTablePage = new DataTablePage();

    @When("sayfadaki tabloda new butonuna basar")
    public void sayfadakiTablodaNewButonunaBasar() {
        dataTablePage.newButton.click();
    }

    @And("verilen bilgileri girer {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void verilenBilgileriGirer(String firstName, String lastName, String position, String office, String extension, String startdate, String salary) {
        dataTablePage.firstName.sendKeys(firstName,
                Keys.TAB, lastName,
                Keys.TAB, position,
                Keys.TAB, office,
                Keys.TAB, extension,
                Keys.TAB, startdate,
                Keys.TAB, salary
        );
    }

    @And("create butonuna basar")
    public void createButonunaBasar() {
        dataTablePage.createButton.click();
    }

    @And("search bolumune {string} bilgisini girer")
    public void searchBolumuneBilgisiniGirer(String seachBox) {
        dataTablePage.searchBox.sendKeys(seachBox);
    }

    @Then("{string} ile basarili bir kayit yapildigini dogrular")
    public void ileBasariliBirKayitYapildiginiDogrular(String firstName) {
        Assert.assertTrue(dataTablePage.firstCell.getText().contains(firstName));
    }
}