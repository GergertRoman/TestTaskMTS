package pageObjects;

import org.openqa.selenium.WebDriver;
import settings.Web_Settings;

import static org.testng.Assert.assertEquals;


public class PatternEfirScreen extends Web_Settings
{
    public PatternEfirScreen(WebDriver driver)
    {
        this.driver = driver;
    }

    public PatternEfirScreen openYandexEfir() {
        driver.get(yandexEfir);
        return this;
    }

    public PatternEfirScreen pressMyPurchases() {
        waitVisibleElement(myPurchases);
        click(myPurchases);
        return this;
    }

    public PatternEfirScreen checkDummy() {
        waitVisibleElement(dummyPictures);
        waitVisibleElement(dummyTitle);
        waitVisibleElement(dummySubTitle);
        assertEquals(getText(dummyTitle), dummyTitleText);
        assertEquals(getText(dummySubTitle), dummySubtitleText);
        return this;
    }

    public PatternEfirScreen checkInfoSearchFilm() {
        waitVisibleElement(firstSearchFilmsName);
        waitVisibleElement(firstSearchFilmsInfo);
        assertEquals(getText(firstSearchFilmsName), filmName);
        assertEquals(getText(firstSearchFilmsInfo), infoForSearchFilm);
        return this;
    }

    public PatternEfirScreen pressMovies() {
        waitVisibleElement(movies);
        click(movies);
        return this;
    }

    public PatternEfirScreen pressFilm() {
        waitVisibleElement(film);
        click(film);
        return this;
    }

    public PatternEfirScreen checkFilmRating() {
        waitVisibleElement(rating);
        return this;
    }

    public PatternEfirScreen checkFilmYear() {
        waitVisibleElement(year);
        return this;
    }

    public PatternEfirScreen pressExpendButton() {
        driver.findElement(expandButton).click();
        return this;
    }

    public PatternEfirScreen insertTextInSearchField(String searchFilm) {
       insertText(searchField, searchFilm);
        return this;
    }

    public PatternEfirScreen pressSearchButton() {
        driver.findElement(expandButton).click();
        return this;
    }
}
