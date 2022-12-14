package pages;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class SelenideWikiPage {

    private final String RELATIVE_URL = "selenide/selenide/wiki";
    private final ElementsCollection PAGES_MENU = $$("#wiki-pages-box ul li");

    public SelenideWikiPage openPage() {
        // Открыть страницу
        open(RELATIVE_URL);

        return this;
    }

    public SelenideWikiPage expandMenu() {
        // Развернуть боковое меню
        $(withText("more pages")).click();

        return this;
    }

    public void clickOnArticleInMenu(String articleName) {
        PAGES_MENU.findBy(text(articleName)).click();
    }
}
