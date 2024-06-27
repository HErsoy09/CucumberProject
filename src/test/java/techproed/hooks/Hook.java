package techproed.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import techproed.utilities.Driver;

public class Hook {

    @Before
    public void setUp() throws Exception {
        System.out.println("Hook class'taki @Before metodu tum senaryolardan once calistirilir.");
    }

    @After
    public void tearDown(Scenario scenario) throws Exception {
        System.out.println("Hook class'taki @After metodu tum senaryolardan sonra calistirilir.");

        if (scenario.isFailed()) {
            TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
            scenario.attach(ts.getScreenshotAs(OutputType.BYTES),
                    "image/png",
                    "scenario" + scenario.getName()
            );
        };
    }

    @Before("@ford")
    public void setUp2() throws Exception {
        System.out.println("Sadece @ford tag'i olan senaryolardan once calistirilir.");
    }

    @After("@volvo")
    public void tearDown2() throws Exception {
        System.out.println("Sadece @volvo tag'i olan senaryolardan sonra calistirilir.");
    }
}