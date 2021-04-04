package pageObjects;

import settings.Web_Settings;
import org.openqa.selenium.WebDriver;


public class PatternStartScreen extends Web_Settings
{
    public PatternStartScreen(WebDriver driver)
    {
        this.driver = driver;
    }

    public PatternStartScreen pressMore() {
        waitVisibleElement(more);
        click(more);
        return this;
    }

    public PatternStartScreen pressBroadcast() {
        waitVisibleElement(broadcast);
        click(broadcast);
        return this;
    }
}
