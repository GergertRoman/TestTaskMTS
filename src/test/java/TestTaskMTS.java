
import org.testng.annotations.Test;
import pageObjects.PatternEfirScreen;
import pageObjects.PatternStartScreen;
import settings.Web_Settings;

import java.util.Set;

public class TestTaskMTS extends Web_Settings {

    PatternStartScreen objStartScreen;
    PatternEfirScreen objEfirScreen;

    @Test
    public void checkDummy(){
        objStartScreen = new PatternStartScreen(driver);
        objEfirScreen = new PatternEfirScreen(driver);

        messageConsole("Start test checkDummy");

        objStartScreen.openYandex();
        Set<String> oldHandles = driver.getWindowHandles();
        objStartScreen.pressMore();
        objStartScreen.pressBroadcast();
        Set<String> newHandles = driver.getWindowHandles();
        switchHandler(oldHandles, newHandles);
        objEfirScreen.pressMyPurchases();
        objEfirScreen.checkDummy();

        messageConsole("End test checkDummy");
    }

    @Test
    public void checkFilmRating() throws InterruptedException {
        objEfirScreen = new PatternEfirScreen(driver);

        messageConsole("Start test checkFilmRating");
        objEfirScreen.openYandexEfir();

        objEfirScreen.pressMovies();
        objEfirScreen.pressFilm();
        Thread.sleep(3000);

        // Как посмотреть ответ от сервера в вэб автоматизации с таким не сталкивался
        objEfirScreen.checkFilmRating();
        objEfirScreen.checkFilmYear();

        messageConsole("End test checkFilmRating");
    }

    @Test
    public void checkFilmPlaying() throws InterruptedException {
        objEfirScreen = new PatternEfirScreen(driver);

        messageConsole("Start test checkFilmRating");
        objEfirScreen.openYandexEfir();

        objEfirScreen.pressMovies();
        objEfirScreen.pressFilm();
        Thread.sleep(1500);

        objEfirScreen.pressExpendButton();

        // Пытался при помощи JS управлять плеером - не вышло)
        /*JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].play();", driver.findElement(player));*/

        messageConsole("End test checkFilmRating");
    }

    @Test
    public void checkSearchFilm() throws InterruptedException {
        objEfirScreen = new PatternEfirScreen(driver);

        messageConsole("Start test checkSearchFilm");
        objEfirScreen.openYandexEfir();

        objEfirScreen.insertTextInSearchField(filmName);
        Thread.sleep(1000);
        pressEnter(searchField);
        objEfirScreen.checkInfoSearchFilm();

        messageConsole("End test checkSearchFilm");
    }
}
