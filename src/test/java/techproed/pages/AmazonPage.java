package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class AmazonPage {

    public AmazonPage() {
        PageFactory.initElements(Driver.getDriver(), this);
        //Bu class'taki öğeleri WebDriver ile eşleştirir ve bu sayede Class'taki WebElement'lere erişmek için @Find gibi PageFactory yardımcı notasyonları kullanılabilir hale gelir.
    }

    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchBox;

    @FindBy(id = "nav-bb-search")
    public WebElement searchBox1;

/*     @FindBy(xpath = "//a[text()='Try different image']")
    public WebElement amazonCaptcha;

   public void handleCaptcha() {
        try {
            amazonCaptcha.click();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        //ReusableMethods.click(amazonCaptcha); //Metot bizde yok
    }
 */
}