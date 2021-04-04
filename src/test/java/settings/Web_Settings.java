package settings;


import interfaces.WDFunctions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public abstract class Web_Settings extends WDFunctions {

    @BeforeMethod
    public void setUp()  {

        // Установки драйвера
        ChromeDriverService service = new ChromeDriverService.Builder().usingAnyFreePort().build();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(service, options);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.get("https://www.yandex.ru");
    }

    @AfterMethod
    public void close_All()
    {
        driver.quit();
    }
}

