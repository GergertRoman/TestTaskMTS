package interfaces;

import org.openqa.selenium.By;

public interface iWDInterface extends iWDElements {

    void waitClickableElement(By by);

    void waitVisibleElement(By by);

    void click(By by);

    void sendKeys(By by, String str);

    void messageConsole(String str);

}

