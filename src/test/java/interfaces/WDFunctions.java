package interfaces;

import org.openqa.selenium.Keys;
import settings.Set_Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

public class WDFunctions extends Set_Driver implements iWDInterface {

    public void waitClickableElement(By by) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public void switchHandler(Set<String> oldHandles, Set<String> newHandles) {
        for (String handle : newHandles) {
            if (!oldHandles.contains(handle)) {
                driver.switchTo().window(handle);
            }
        }
    }

    public void waitVisibleElement(By by) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public void click(By by) {
        waitClickableElement(by);
        driver.findElement(by).click();
    }

    public void insertText(By by, String str) {
        driver.findElement(by).clear();
        driver.findElement(by).sendKeys(str);
    }

    public void pressEnter(By by) {
        driver.findElement(by).sendKeys(Keys.RETURN);
    }


    public String getText(By by) {
        return driver.findElement(by).getText();
    }

    public void messageConsole(String str) {
        System.out.println(str);
    }
}
