package interfaces;

import org.openqa.selenium.By;

public interface iWDInterface extends iWDElements {

    void waitClickableElement(By by);

    void waitVisibleElement(By by);

    void click(By by);

    void insertText(By by, String str);

    void pressEnter(By by);

    void messageConsole(String str);

}

