package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideMainPage {

    private final String RELATIVE_URL = "selenide/selenide";
    private final SelenideElement WIKI_TAB = $("#wiki-tab");

    // Открыть страницу
    public SelenideMainPage openPage() {
        open(RELATIVE_URL);

        return this;
    }

    // Клик по табу Wiki в верхнем меню
    public void clickOnWikiTab() {
        WIKI_TAB.click();
    }
}
