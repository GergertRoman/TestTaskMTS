package interfaces;

import settings.Set_Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WDFunctions extends Set_Driver implements iWDInterface {

    public void waitClickableElement(By by) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public void waitVisibleElement(By by) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public void click(By by) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(by));
        driver.findElement(by).click();
    }

    public void sendKeys(By by, String str) {
        driver.findElement(by).clear();
        driver.findElement(by).sendKeys(str);
    }

    public String getText(By by) {
        return driver.findElement(by).getText();
    }

    public void messageConsole(String str) {
        System.out.println(str);
    }
}
