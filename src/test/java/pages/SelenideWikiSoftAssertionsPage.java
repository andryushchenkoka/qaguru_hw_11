package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class SelenideWikiSoftAssertionsPage {

    private final String RELATIVE_URL = "selenide/selenide/wiki/SoftAssertions";
    private final ElementsCollection HEADS_IN_TEXT = $$(".markdown-body h4");

    // Открыть страницу
    public void openPage() {
        open(RELATIVE_URL);
    }

    // Найти подходящий заголовок в статье
    public SelenideElement getHeadWithText(String substring) {
        return HEADS_IN_TEXT.findBy(partialText(substring));
    }

    // Является ли блок ниже примером кода (содержать класс highlight)
    // Если под переданным заголовком есть блок с классом highlight, это блок с примером кода
    public boolean findCodeExampleByHead(SelenideElement element) {
        return element.sibling(0).getAttribute("class").contains("highlight");
    }
}
