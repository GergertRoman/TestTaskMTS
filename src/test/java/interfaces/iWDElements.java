package interfaces;

import org.openqa.selenium.By;

public interface iWDElements extends iConst
{
    //
    By broadcast = By.cssSelector("body > div.popup2.services-new__more-popup.popup2_view_default.popup2_target_anchor.popup2_autoclosable_yes.i-bem.popup2_js_inited.popup2_direction_bottom-left.popup2_visible_yes > div > ul > li:nth-child(39) > a > div.services-new__icon");
    By more = By.cssSelector("body > div.body__wrapper > div.container.rows > div.row.rows__row.rows__row_main > div > div.container.container__services.container__line > nav > div > a");

    //
    By myPurchases = By.xpath("//*[@id=\"stream-sidemenu\"]/div/section[2]/div[2]/a/div");
    By dummyPictures = By.xpath("//*[@id=\"stream-purchases__layout\"]/div/div/div/img");
    By dummyTitle = By.xpath("//*[@id=\"stream-purchases__layout\"]/div/div/div/div[1]");
    By dummySubTitle = By.xpath("//*[@id=\"stream-purchases__layout\"]/div/div/div/div[2]");

    //
    By movies = By.xpath("//*[@id=\"stream-sidemenu\"]/div/section[1]/ul/li[6]/div/a/div");
    By film = By.xpath("//*[@id=\"stream-category__feed\"]/div/div[2]/div/div[2]/div/div[2]/div[3]/div/div/div[1]/div[1]/a/div");
    By rating = By.xpath("/html/body/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/div/div[3]/div[2]/div[1]/div/div[5]/div[3]/h1/span/div/a/div[1]/div[2]/div");
    By year = By.xpath("/html/body/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/div/div[3]/div[2]/div[1]/div/div[5]/div[3]/h1/span/span/span[2]");
    By player = By.xpath("//*[@id=\"player-container0\"]/div[3]/yaplayertag/div[1]/div[1]/div/video");
    By expandButton = By.xpath("//*[@id=\"player-container0\"]/div[3]/yaplayertag/div[1]/div[2]/div/div/div/div/div[4]/div[1]/div[2]/div[3]/button[4]");

    By searchField = By.id("uniq15887768464221");
    By firstSearchFilmsName = By.xpath("//*[@id=\"stream-serp__layout\"]/div/div[2]/div[1]/div/div/div[2]/div[1]/div[1]/a");
    By firstSearchFilmsInfo = By.xpath("//*[@id=\"stream-serp__layout\"]/div/div[2]/div[1]/div/div/div[2]/div[2]/div/div");
}

interface iConst
{
    String yandex = "https://www.yandex.ru";
    String yandexEfir = "https://yandex.ru/efir";
    String dummyTitleText = "Покупок пока нет";
    String dummySubtitleText = "Покупайте и смотрите новинки";
    String filmName = "Апгрейд";
    String infoForSearchFilm = "2018 • фантастика, триллер, детектив, криминал";
}