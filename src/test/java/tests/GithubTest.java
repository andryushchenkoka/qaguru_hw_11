package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GithubTest extends BaseTest {

    @Test
    public void githubTest() {

        // - Откройте страницу Selenide в Github
        open("selenide/selenide");
        // - Перейдите в раздел Wiki проекта
        $("#wiki-tab").click();
        // - Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        $("div[id = 'wiki-pages-box']").$(withText("more pages")).click();
        $("div[id = 'wiki-pages-box']").$(byText("SoftAssertions")).shouldBe(visible).click();
        // - Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5
        $("#user-content-3-using-junit5-extend-test-class").parent().shouldHave(text("JUnit5"));
    }
}
