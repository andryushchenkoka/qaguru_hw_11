package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class GithubTest extends BaseTest {

    @Test
    @DisplayName("На странице SoftAssertions есть пример кода для JUnit5")
    public void githubTest() {

        step("Открыть страницу Selenide в Github", () -> {
            open("selenide/selenide");
        });

        step("Перейти в раздел Wiki", () -> {
            $("#wiki-tab").click();
        });

        step("В боковом меню есть раздел SoftAssertions", () -> {
            $("div[id = 'wiki-pages-box']").$(withText("more pages")).click();
            $("div[id = 'wiki-pages-box']").$(byText("SoftAssertions")).shouldBe(visible).click();
        });

        step("На странице SoftAssertions есть пример кода для JUnit5", () -> {
            $("#user-content-3-using-junit5-extend-test-class").parent().shouldHave(text("JUnit5"));
        });
    }
}
