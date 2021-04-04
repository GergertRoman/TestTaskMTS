
import org.testng.annotations.Test;
import pageObjects.PatternEfirScreen;
import pageObjects.PatternStartScreen;
import settings.Web_Settings;
import java.util.Set;

public class TestTaskMTS extends Web_Settings {

    PatternStartScreen objStartScreen;
    PatternEfirScreen objEfirScreen;

    @Test
    public void testMTS() throws InterruptedException {
        objStartScreen = new PatternStartScreen(driver);
        objEfirScreen = new PatternEfirScreen(driver);

        messageConsole("Start test");

        Set<String> oldHandles = driver.getWindowHandles();
        objStartScreen.pressMore();
        objStartScreen.pressBroadcast();
        Set<String> newHandles = driver.getWindowHandles();
        switchHandler(oldHandles, newHandles);
        objEfirScreen.pressMyPurchases();
        objEfirScreen.CheckDummy();
        objEfirScreen.pressMovies();
        objEfirScreen.pressFilm();
        Thread.sleep(1500);

        // Как посмотреть ответ от сервера в вэб автоматизации с таким не сталкивался
        objEfirScreen.checkFilmRating();
        objEfirScreen.checkFilmYear();

        // Однажды эта кнопка сработала))
        objEfirScreen.pressExpendButton();


        // Пытался при помощи JS управлять плеером - не вышло)
        /*JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].click();", driver.findElement(expandButton));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].play();", driver.findElement(player));*/
        messageConsole("End test");
    }

    private void switchHandler(Set<String> oldHandles, Set<String> newHandles) {
        for (String handle : newHandles) {
            if (!oldHandles.contains(handle)) {
                driver.switchTo().window(handle);
            }
        }
    }
}
