package tests;

import org.junit.jupiter.api.Test;
import pages.SelenideMainPage;
import pages.SelenideWikiPage;
import pages.SelenideWikiSoftAssertionsPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GithubTest extends BaseTest {

    @Test
    public void githubTest() {

        String articleName = "SoftAssertions", // Название раздела в боковом меню
                headText = "JUnit5";           // Текст для поиска в заголовке

        new SelenideMainPage()
                .openPage()
                .clickOnWikiTab();

        new SelenideWikiPage()
                .openPage()
                .expandMenu()
                .clickOnArticleInMenu(articleName);

        SelenideWikiSoftAssertionsPage softAssertionsPage = new SelenideWikiSoftAssertionsPage();
        softAssertionsPage.openPage();
        boolean isCodeExample = softAssertionsPage.findCodeExampleByHead(softAssertionsPage.getHeadWithText(headText));

        assertTrue(isCodeExample);
    }
}
